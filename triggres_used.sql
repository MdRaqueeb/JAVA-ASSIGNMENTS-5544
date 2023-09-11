-- Trigger to insert order detials and order items
create trigger order_details on payment
for insert
as
begin
    declare @cust_id int;
    declare @total_amount money;
    declare @order_id int;

	declare @temp_table table(id int identity(1,1),book_id int, quantity int);

	

    select @cust_id= cust_id , @total_amount = total_amount from inserted;
    insert into orders values(@cust_id,@total_amount,getdate());

 
	
    select @order_id = order_id from orders;

 

    insert into order_item select @order_id,@cust_id, book_id, quantity,price from cart where cust_id = @cust_id;

	-- updating inventory
	insert into @temp_table(book_id,quantity) select book_id,quantity from cart where cust_id = @cust_id;
	declare @total_rows int;
	declare @counter int;
	set @counter = 1;

	select @total_rows = count(*) from cart where cust_id = @cust_id;
	
	declare @temo_bid int;
	declare @temp_qua int;
	while(@counter <= @total_rows)
	begin
		select @temo_bid = book_id,@temp_qua = quantity from @temp_table where id = @counter;
		
		update inventory set quantity = (select quantity from inventory where book_id = @temo_bid) - @temp_qua where book_id = @temo_bid;
		set @counter = @counter + 1;
	end

	delete from cart where cust_id = @cust_id;

 end

drop trigger order_details
----------------------------------------------------------------------------
-- book to inventory trigger
create trigger insert_into_inventry on book
for insert 
as
begin
    insert into inventory select book_id,10 from inserted;
end
