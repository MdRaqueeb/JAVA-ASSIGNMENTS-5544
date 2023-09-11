-- Show books by title
CREATE PROCEDURE Show_Books_By_Title @title varchar(30)
AS
    declare @count int;
    declare @bookId int;
    select @bookId = book_id from book where title = @title;
    SELECT @count = quantity FROM inventory where book_id = @bookId;
    if(@count > 0)
        select * from book where title = @title;
    else
        print 'Book not found'


EXEC Show_Books_By_Title @title = 'title1';
-------------------------------------------------------------
-- Show Book by Category
CREATE PROCEDURE Show_Books_By_Category @category varchar(30)
AS
    declare @count int;
    declare @bookId int;
    select @bookId = book_id from book where category = @category;
    SELECT @count = quantity FROM inventory where book_id = @bookId;
    if(@count > 0)
        select * from book where category = @category and book_id in (select book_id from inventory where quantity > 0);
    else
        print 'Book not found'

 

EXEC Show_Books_By_Category @category = 'Fiction';


drop procedure Show_Books_By_Category
------------------------------------------------
-- Show Book by Author
CREATE PROCEDURE Show_Books_By_Author @author_name varchar(30)
AS
    declare @authorId int;
    select @authorId = author_id from author where author_name = @author_name;
    declare @count int;
    declare @bookId int;
    select @bookId = book_id from book where author_id = @authorId;
    SELECT @count = quantity FROM inventory where book_id = @bookId;
    if(@count > 0)
        select * from book where author_id = @authorId and book_id in (select book_id from inventory where quantity > 0);
    else
        print 'Book not found'

EXEC Show_Books_By_Author @author_name = 'author1';
drop procedure Show_Books_By_Author
----------------------------------------------------------------------------
-- make payment
alter procedure makePayment @email varchar(30),@password varchar(20),@amount money ,@coupon varchar(20)
as
    declare @cust_id int;
    select @cust_id = cust_id from customer where email = @email and password = @password;

    if(@cust_id is not null)
    begin
        declare @sum money;  
        declare @dis_amount money;
        --select * from cart;
		select @sum = sum(price) from cart where cust_id = @cust_id;

		select @dis_amount = dis_amount from coupon where coupon_code like @coupon;

		if( @dis_amount is  null)
            begin
                set @dis_amount = 0;
            end

			set @sum = @sum - @dis_amount;
            declare @amount_after_tax money;
            set @amount_after_tax = @sum*(0.05) + @sum;

			print @amount_after_tax
			--print @amount
            if(@amount = @amount_after_tax)
            begin
                print 'payment success';
                insert into Payment(cust_id,cart_value, discount,tax,total_amount,payment_date)  values(@cust_id,@sum + @dis_amount,@dis_amount,@sum*(0.05),@amount_after_tax,GETDATE());  
            end
            else
                print 'invalid amount'

	end
    else 
        print 'invalid user or emali'

exec makePayment 'bhanu@gmail.com', 'bhanuA123',2835.00,'coupon12'

drop procedure makePayment
 ----------------------------------------------------------------------------
 -- view order history
create procedure order_history @cust_id int
as
    select order_item.order_id, order_item.cust_id, order_item.book_id, order_item.quantity, order_item.amount, orders.order_date from order_item inner join orders on orders.order_id = order_item.order_id where orders.cust_id = @cust_id;

exec order_history 1
-----------------------------------------------------------------------
-- popular book 
create procedure popular_books
as
	select book_id,sum(quantity) as total_purcahse, sum(amount) as total_spent from order_item group by book_id order by total_purcahse desc

exec popular_books
-----------------------------------------------------------------------------------------------
-- Sales report
create procedure sales_report_analisis
as
	declare @temp_table table(id int identity(1,1),book_id int,quantity int, total_amount money)
	insert into @temp_table(book_id ,quantity , total_amount ) select book.book_id, order_item.quantity ,order_item.amount from order_item full outer join book on order_item.book_id = book.book_id
	select book_id, sum(quantity) as sold_copies,sum(total_amount) as revenue_gen from @temp_table group by book_id 

exec sales_report_analisis
------------------------------------------------------------------------------------------------
-- customer report
create procedure customer_rep
as
	select cust_id,sum(quantity) as no_of_book_purchased,sum(amount) as total_amount_spent from order_item group by cust_id

exec customer_rep
-----------------------------------------------













-------------- trigger for reduce
/*create trigger remove_book_from_inventory on  order_item
for insert
as
begin
    declare @quantity int;
    declare @book_id  int;
    select @book_id = book_id,@quantity = quantity from inserted;
    print 'remove trigger'
    update inventory set quantity = @quantity where book_id = @book_id;
end
drop trigger remove_book_from_inventory*/
------------------------------------


 
 -- continue

 

 

 

 

 

 

 