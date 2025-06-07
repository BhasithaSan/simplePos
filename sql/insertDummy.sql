-- Employees
INSERT INTO Employee(empId, name, managerId, mobile, address, city) VALUES ('E001', 'Alice Smith', NULL, '0711234567', '123 Main St', 'Colombo');
INSERT INTO Employee(empId, name, managerId, mobile, address, city) VALUES ('E002', 'Bob Johnson', 'E001', '0712345678', '456 Oak Ave', 'Kandy');
INSERT INTO Employee(empId, name, managerId, mobile, address, city) VALUES ('E003', 'Charlie Brown', 'E001', '0713456789', '789 Pine Rd', 'Galle');
INSERT INTO Employee(empId, name, managerId, mobile, address, city) 
VALUES ('E004', 'David Wilson', 'E002', '0714567890', '321 Elm St', 'Negombo');

INSERT INTO Employee(empId, name, managerId, mobile, address, city) 
VALUES ('E005', 'Emma Davis', 'E002', '0715678901', '654 Maple Ave', 'Jaffna');

INSERT INTO Employee(empId, name, managerId, mobile, address, city) 
VALUES ('E006', 'Frank Miller', 'E003', '0716789012', '987 Cedar Ln', 'Matara');

INSERT INTO Employee(empId, name, managerId, mobile, address, city) 
VALUES ('E007', 'Grace Taylor', 'E003', '0717890123', '159 Birch Blvd', 'Trincomalee');

INSERT INTO Employee(empId, name, managerId, mobile, address, city) 
VALUES ('E008', 'Henry White', 'E001', '0718901234', '753 Oak Dr', 'Anuradhapura');


-- Payroll
INSERT INTO Payroll VALUES ('PR001', 'E001', TO_DATE('2024-05-01', 'YYYY-MM-DD'), TO_DATE('2024-05-31', 'YYYY-MM-DD'), TO_DATE('2024-06-01', 'YYYY-MM-DD'), 100000, 5000, 95000);
INSERT INTO Payroll VALUES ('PR002', 'E002', TO_DATE('2024-05-01', 'YYYY-MM-DD'), TO_DATE('2024-05-31', 'YYYY-MM-DD'), TO_DATE('2024-06-01', 'YYYY-MM-DD'), 85000, 4000, 81000);
INSERT INTO Payroll VALUES ('PR003', 'E001', TO_DATE('2024-06-01', 'YYYY-MM-DD'), TO_DATE('2024-05-31', 'YYYY-MM-DD'), TO_DATE('2024-07-01', 'YYYY-MM-DD'), 100000, 5000, 95000);
INSERT INTO Payroll VALUES ('PR004', 'E002', TO_DATE('2024-06-01', 'YYYY-MM-DD'), TO_DATE('2024-05-31', 'YYYY-MM-DD'), TO_DATE('2024-07-01', 'YYYY-MM-DD'), 85000, 4000, 81000);
INSERT INTO Payroll VALUES ('PR005', 'E001', TO_DATE('2024-07-01', 'YYYY-MM-DD'), TO_DATE('2024-05-31', 'YYYY-MM-DD'), TO_DATE('2024-08-01', 'YYYY-MM-DD'), 100000, 5000, 95000);
INSERT INTO Payroll VALUES ('PR006', 'E002', TO_DATE('2024-07-01', 'YYYY-MM-DD'), TO_DATE('2024-05-31', 'YYYY-MM-DD'), TO_DATE('2024-08-01', 'YYYY-MM-DD'), 85000, 4000, 81000);

-- Leave
INSERT INTO Leave VALUES ('L001', 'E001', 'E005', 'PEN', TO_DATE('2024-05-10', 'YYYY-MM-DD'), 2);
INSERT INTO Leave VALUES ('L002', 'E002', 'E005', 'APP', TO_DATE('2024-05-15', 'YYYY-MM-DD'), 1);

-- POS
INSERT INTO Pos VALUES ('POS1', 'BR01');
INSERT INTO Pos VALUES ('POS2', 'BR02');

-- Customer
INSERT INTO Customer VALUES ('C001', 'John Doe', '0711234567', 'john@example.com');
INSERT INTO Customer VALUES ('C002', 'Jane Smith', '0722345678', 'jane@example.com');
INSERT INTO Customer VALUES ('C003', 'Mike Brown', '0733456789', 'mike@example.com');

-- Product
INSERT INTO Product VALUES ('P001', 'ELEC', 'Laptop', 75000, 'HP');
INSERT INTO Product VALUES ('P002', 'ELEC', 'Phone', 50000, 'Samsung');
INSERT INTO Product VALUES ('P003', 'FOOD', 'Chocolate', 150, 'Nestle');
INSERT INTO Product VALUES ('P004', 'CLOTH', 'T-Shirt', 1200, 'Nike');
INSERT INTO Product VALUES ('P005', 'ELEC', 'Headphones', 3500, 'Sony');

-- Orders
INSERT INTO Orders VALUES ('O001', 'POS1', 'E001', 'C001', TO_DATE('2024-05-20', 'YYYY-MM-DD'), 75500);
INSERT INTO Orders VALUES ('O002', 'POS2', 'E002', NULL, TO_DATE('2024-05-21', 'YYYY-MM-DD'), 3500);
INSERT INTO Orders VALUES ('O003', 'POS1', 'E001', 'C003', TO_DATE('2024-05-22', 'YYYY-MM-DD'), 5150);

--Insert into OrderItem
INSERT INTO OrderItem VALUES ( 'O001', 'P001', 1, 75000);
INSERT INTO OrderItem VALUES ( 'O001', 'P003', 1, 150);
INSERT INTO OrderItem VALUES ( 'O002', 'P005', 1, 3500);
INSERT INTO OrderItem VALUES ( 'O003', 'P002', 1, 5000);
INSERT INTO OrderItem VALUES ( 'O003', 'P003', 1, 150);
