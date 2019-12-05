Create the db user :

CREATE USER psy_admin IDENTIFIED BY admin;
GRANT CONNECT TO psy_admin;
GRANT CREATE SESSION TO psy_admin;
GRANT UNLIMITED TABLESPACE TO psy_admin;
