SET SERVEROUTPUT ON;

-- Step 1: Package Specification
CREATE OR REPLACE PACKAGE emp_package AS
   PROCEDURE add_employee(e_id NUMBER, e_name VARCHAR2);
   FUNCTION get_employee_count RETURN NUMBER;
END emp_package;
/

-- Step 2: Package Body
CREATE OR REPLACE PACKAGE BODY emp_package AS

   total_employees NUMBER := 0;

   PROCEDURE add_employee(e_id NUMBER, e_name VARCHAR2) IS
   BEGIN
      total_employees := total_employees + 1;
      DBMS_OUTPUT.PUT_LINE('Employee Added: ' || e_name);
   END;

   FUNCTION get_employee_count RETURN NUMBER IS
   BEGIN
      RETURN total_employees;
   END;

END emp_package;
/

-- Step 3: Call Package
BEGIN
   emp_package.add_employee(1, 'John');
   emp_package.add_employee(2, 'Alice');

   DBMS_OUTPUT.PUT_LINE('Total Employees: ' || emp_package.get_employee_count);
END;
/