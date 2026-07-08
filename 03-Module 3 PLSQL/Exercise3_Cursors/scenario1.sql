SET SERVEROUTPUT ON;

DECLARE
   CURSOR emp_cursor IS
      SELECT name FROM employees;

   emp_name employees.name%TYPE;
BEGIN
   OPEN emp_cursor;
   LOOP
      FETCH emp_cursor INTO emp_name;
      EXIT WHEN emp_cursor%NOTFOUND;
      DBMS_OUTPUT.PUT_LINE('Employee Name: ' || emp_name);
   END LOOP;
   CLOSE emp_cursor;
END;
/