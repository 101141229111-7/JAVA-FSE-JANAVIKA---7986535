SET SERVEROUTPUT ON;

-- Step 1: Create table
CREATE TABLE employees (
   id NUMBER,
   name VARCHAR2(50)
);

-- Step 2: Create trigger
CREATE OR REPLACE TRIGGER before_insert_emp
BEFORE INSERT ON employees
FOR EACH ROW
BEGIN
   DBMS_OUTPUT.PUT_LINE('Before inserting a new employee');
END;
/

-- Step 3: Insert data (this fires the trigger)
BEGIN
   INSERT INTO employees VALUES (1, 'John');
END;
/