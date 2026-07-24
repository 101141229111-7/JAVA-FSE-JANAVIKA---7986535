SET SERVEROUTPUT ON;

DECLARE
   num NUMBER := 10;
   result NUMBER;
BEGIN
   result := num / 0;  -- This will cause an error
EXCEPTION
   WHEN ZERO_DIVIDE THEN
      DBMS_OUTPUT.PUT_LINE('Error: Cannot divide by zero');
END;
/