# PSY System

> Grade 3 School Project.
> Client appointment and follow-up system for psychologist

## Create the db user

CREATE USER psy_admin IDENTIFIED BY admin;
GRANT CONNECT TO psy_admin;
GRANT CREATE SESSION TO psy_admin;
GRANT UNLIMITED TABLESPACE TO psy_admin;
