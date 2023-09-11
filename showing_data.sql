-- selecting procedures
-- select author
create procedure showAuthor
as
begin 
    select * from author
end

exec showAuthor
------------------------------------------------------------------
-- select publisher
create procedure showPublisher
as
begin 
    select * from publisher
end

exec showPublisher
------------------------------------------------------------------
-- select book
create procedure showBook
as
begin 
    select * from book
end

exec showBook
------------------------------------------------------------------
-- select inventory
create procedure showInventory
as
begin 
    select * from inventory
end

exec showInventory
------------------------------------------------------------------
-- select customer
create procedure showCustomer
as
begin 
    select * from customer
end

exec showCustomer
------------------------------------------------------------------
-- select cart
create procedure showCart @cust_id int, @coupon varchar(20)
as
begin 
    declare @sum money;  
    declare @dis_amount money;
    select * from cart where cust_id = @cust_id;
    select @sum = sum(price) from cart where cust_id = @cust_id;
	
	select @dis_amount = dis_amount from coupon where coupon_code like @coupon;

	if( @dis_amount is  null)
        set @dis_amount = 0;

	set @sum = @sum - @dis_amount;
    declare @amount_after_tax money;
    set @amount_after_tax = @sum*(0.05) + @sum;

    print 'Cart value : ' + convert(varchar,@sum);
    print 'Discount : ' + convert(varchar,@dis_amount);
    print '      Additional 5% tax';
    print 'Order Total : ' + convert(varchar,@amount_after_tax)
end

drop procedure showCart

exec showCart 9,'coupon12'

------------------------------------------------------------------