CREATE TABLE USER_INFO (
    ID INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    NAME VARCHAR(255) NOT NULL,
    PASSWORD VARCHAR(255) NOT NULL,
    EMAIL VARCHAR(255) NOT NULL
);
INSERT INTO USER_INFO ( EMAIL, NAME, PASSWORD) VALUES ( 'd@g','deepak','d')