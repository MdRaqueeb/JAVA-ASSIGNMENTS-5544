-- inserting procedures
-- Insert Author
CREATE PROCEDURE insertAuthor
    @author_name varchar(30),
    @dob date 
AS
BEGIN
    -- Insert statements for procedure here
       INSERT INTO author VALUES
              (@author_name, @dob)
END


drop procedure insertAuthor
exec insertAuthor 'author1','1999-07-17';
--------------------------------------------------------------------------------------
-- Insert publisher
CREATE PROCEDURE insertPublisher
    @publisher_name varchar(30),
    @country varchar(30)
AS
BEGIN
    -- Insert statements for procedure here
       INSERT INTO publisher VALUES
              (@publisher_name, @country)
END


drop procedure insertPublisher
exec insertpublisher 'publisher1','India';
---------------------------------------------------------------------------------------
-- Insert book
CREATE PROCEDURE InsertBook  
    @author_id int,
    @publisher_id int,
    @title varchar(30),
    @category varchar(30),
    @price money,
    @publication_date date
AS
BEGIN
    -- Insert statements for procedure here
       INSERT INTO book VALUES
              (@author_id ,    @publisher_id ,    @title ,@category ,    @price,    @publication_date )
END


exec InsertBook 1,1,'title1','cat1',300,'2002-02-02';
----------------------------------------------------------------------------

----------------------------------------------------------------------------
-- Insert customer
CREATE PROCEDURE insertCustomer
    @cust_name varchar(20),
    @email varchar(30),
    @password varchar(30),
    @gender char,
    @mobile_no bigint,
    @dob date,
    @house_no int,
    @street_name varchar(30),
    @city varchar(30),
    @state varchar(30),
    @zip int,
    @country varchar(30)
AS
BEGIN
    -- Insert statements for procedure here
       INSERT INTO customer VALUES
              (@cust_name,@email,@password,@gender,@mobile_no,@dob,@house_no,@street_name,@city,@state,@zip,@country)
END

 

exec insertCustomer 'bhanu','bhanu@gmail.com','bhanuA123','M',8765555676,'2004-04-04',123,'MG Street','VZM','AP',535002,'India'

 

----------------------------------------------------------------------------
-- Insert cart
alter PROCEDURE insertCart
    @cust_id int ,
    @book_id int ,
    @quantity int 
AS
BEGIN
    declare @price money;
	declare @inv_quantity int;

    select @price = price * @quantity from book where book_id = @book_id; 
	select @inv_quantity = quantity from inventory where book_id = @book_id;
	if(@quantity <= @inv_quantity)
	begin
		INSERT INTO cart(cust_id,book_id,quantity,price) VALUES 
			( @cust_id, @book_id, @quantity,@price)
	end
	else
		print 'No stock'
END

drop procedure insertCart

 
 -- cust_id ,book_id,quantity
 exec insertCart 9,2,9
exec insertCart 1,1,2
exec insertCart 1,2,1
exec insertCart 4,5,5
exec insertCart 2,1,1
exec insertCart 3,4,3
exec insertCart 6,2,2
exec insertCart 7,1,20