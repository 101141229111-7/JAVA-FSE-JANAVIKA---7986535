SET SERVEROUTPUT ON;

CREATE OR REPLACE FUNCTION get_square(num NUMBER)
RETURN NUMBER
IS
BEGIN
   RETURN num * num;
END;
/

DECLARE
   result NUMBER;
BEGIN
   result := get_square(5);
   DBMS_OUTPUT.PUT_LINE('Square is: ' || result);
END;
/