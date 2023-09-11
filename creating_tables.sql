-- Creating tables
-- Table 1
create table Author(
    author_id int identity(1,1) primary key,
    author_name varchar(30) not null,
    dob date not null
    ) 

	--Inserting into Author 
insert into Author values
    ('author1',GETDATE()),
	('author2',GETDATE()),
	('author3',GETDATE()),
	('author4',GETDATE())

-- Table 2
-- CReating Publisher table
create table Publisher(
    publisher_id int identity(1,1) primary key,
    publisher_name varchar(30) not null,
    country varchar(30) not null
    )

--Inserting into publisher
insert into Publisher values
    ('publisher1','india'),
	('publisher2','india'),
	('publisher3','india'),
    ('publisher4','india')

 
-- Table 3
create table Book(
	book_id int identity(1,1) primary key,
    author_id int foreign key references author(author_id) on DELETE CASCADE,
    publisher_id int foreign key references publisher(publisher_id) on DELETE CASCADE,
	title varchar(30) not null,
    category varchar(30) not null,
    price money not null,
    publication_date date not null,
    )

--Inserting into Book
insert into Book(author_id,publisher_id,title,category,price,publication_date) values 
    (1,1,'title1','cat1',300,getdate()),
    (2,2,'title2','cat2',300,getdate()),
    (3,3,'title3','cat3',300,getdate()),
    (1,2,'title4','cat1',300,getdate()),
    (1,3,'title5','cat1',300,getdate())

	
-- Table 4
-- Creating table iNventory
create table Inventory(
    inventory_id int identity(1,1) primary key,
    book_id int foreign key references book(book_id) on DELETE CASCADE,
    quantity int not null
    )
	   

-- Table 5
-- Creating customer
create table Customer(
    cust_id int identity(1,1) primary key,
    cust_name varchar(20) not null,
    email varchar(30) unique not null,
    password varchar(30) not null check(len(password)>7),
    gender char,
    mobile_no bigint check(mobile_no >= 7777777777 and mobile_no <= 9999999999)not null unique,
    dob date,
    house_no int,
    street_name varchar(30),
    city varchar(30),
    state varchar(30),
    zip int,
    country varchar(30)
    )

--Inserting into Customer
insert into customer values
    ('kiran','kiran@gmail.com','kiran1234','M',8328319281,getdate(),123,'MG Street','VZM','AP',535002,'India'),
    ('raju','raju@gmail.com','raju1234','M',8328229991,getdate(),123,'MG Street','VZM','AP',535002,'India'),
    ('ramesh','ramesh@gmail.com','ramesh123','M',8328229281,getdate(),123,'MG Street','VZM','AP',535002,'India'),
    ('himansu','himansu@gmail.com','himansu123','M',8328559281,getdate(),123,'MG Street','VZM','AP',535002,'India')
 
-- Table 6
-- Creating Cart
create table Cart(
    cart_id int identity(1,1) primary key,
    cust_id int foreign key references customer(cust_id) on DELETE CASCADE,
    book_id int foreign key references book(book_id) on DELETE CASCADE,
    quantity int not null,
    price money not null
    )

--Inserting into cart	
insert into cart values
    (1,1,2),
    (1,2,1),
    (2,3,1),
    (3,4,3),
    (1,4,2)


-- Table 7
-- Creating Payment
create table Payment(
    payment_id int identity(1,1) primary key,
    cust_id int foreign key references customer(cust_id) on DELETE CASCADE,
    transaction_no timestamp,
    cart_value money not null,
    discount money not null,
    tax money not null,
    total_amount money not null,
    payment_date datetime not null
    )
 
 -- Table 8
 -- Creating table Coupon
 create table coupon(
    coupon_id int identity(1,1),
    coupon_code varchar(20) not null unique,
    dis_amount money
    )
 
 -- Inserting values into coupon
insert into coupon values
    ('coupon1',50),
    ('coupon2',70),
    ('coupon3',100)

 
-- Table 9
-- Creating orders table
create table Orders(
    order_id int identity(1,1) primary key,
    cust_id int foreign key references customer(cust_id) on DELETE CASCADE,
    total_amount money not null,
    order_date datetime not null
    )


--Table 10
-- Creating table order_item
create table Order_Item(
    order_Item_Id int identity(1,1) primary key,
    order_id int foreign key references orders(order_id) on DELETE CASCADE,
    cust_id int foreign key references customer(cust_id),
    book_id int foreign key references book(book_id) on DELETE CASCADE,
    quantity int not null,
    amount money not null
    );