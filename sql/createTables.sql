-- Employee table with manager as foreign key
CREATE TABLE Employee (
    empId VARCHAR2(5) PRIMARY KEY,
    name VARCHAR2(50),
    managerId VARCHAR2(5),
    mobile VARCHAR2(10),
    address VARCHAR2(60),
    city VARCHAR2(20),
    FOREIGN KEY (managerId) REFERENCES Employee(empId)
);

-- Payroll table for employee salaries
CREATE TABLE Payroll (
    payrollId VARCHAR2(5) PRIMARY KEY,
    empId VARCHAR2(5),
    startingDate DATE,
    endingDate DATE,
    paidDate DATE,
    grossSal FLOAT,
    deduction FLOAT,
    netSal FLOAT,
    FOREIGN KEY (empId) REFERENCES Employee(empId)
);

-- Leave table for employee leave requests
CREATE TABLE Leave (
    leaveId VARCHAR2(5) PRIMARY KEY,
    empId VARCHAR2(5),
    managerId VARCHAR2(5),
    status VARCHAR2(3),
    leaveDate DATE,
    numberDays INT,
    FOREIGN KEY (empId) REFERENCES Employee(empId),
    FOREIGN KEY (managerId) REFERENCES Employee(empId)
);

-- POS terminals
CREATE TABLE Pos (
    posId VARCHAR2(5) PRIMARY KEY,
    branch VARCHAR2(5)
);

-- Customers (some orders may not have a customer)
CREATE TABLE Customer (
    customerId VARCHAR2(10) PRIMARY KEY,
    name VARCHAR2(25),
    contact VARCHAR2(10),
    email VARCHAR2(25)
);

-- Product catalog
CREATE TABLE Product (
    productId VARCHAR2(10) PRIMARY KEY,
    category VARCHAR2(10),
    name VARCHAR2(20),
    unitPrice FLOAT,
    brand VARCHAR2(20)
);

-- Orders: the main transaction entity
CREATE TABLE Orders (
    orderId VARCHAR2(10) PRIMARY KEY,
    posId VARCHAR2(5),
    empId VARCHAR2(10),
    customerId VARCHAR2(10), -- Can be NULL for anonymous orders
    orderDate DATE,
    total FLOAT,
    FOREIGN KEY (posId) REFERENCES Pos(posId),
    FOREIGN KEY (empId) REFERENCES Employee(empId),
    FOREIGN KEY (customerId) REFERENCES Customer(customerId)
);

-- OrderItem: line items per order
CREATE TABLE OrderItem (
    orderItemId VARCHAR2(10) PRIMARY KEY,
    orderId VARCHAR2(10),
    productId VARCHAR2(10),
    quantity FLOAT,
    subtotal FLOAT,
    FOREIGN KEY (orderId) REFERENCES Orders(orderId),
    FOREIGN KEY (productId) REFERENCES Product(productId)
);
