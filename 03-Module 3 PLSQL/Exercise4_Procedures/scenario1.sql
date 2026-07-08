SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE greet_user IS
BEGIN
   DBMS_OUTPUT.PUT_LINE('Hello! Welcome to PL/SQL Procedures.');
END;
/

BEGIN
   greet_user;
END;
/