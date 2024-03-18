CREATE SCHEMA IF NOT EXISTS EMP_DEPT;

DROP TABLE IF EXISTS EMP_DEPT.DEPT;

CREATE TABLE EMP_DEPT.DEPT (
                      DEPTNO INTEGER,
                      DNAME VARCHAR(30),
                      LOC VARCHAR(30),
                      PRIMARY KEY (DEPTNO)
);

INSERT INTO EMP_DEPT.DEPT (DEPTNO, DNAME, LOC) VALUES
                                          (10, 'ACCOUNTING_H2', 'NEW YORK'),
                                          (20, 'RESEARCH_H2', 'DALLAS'),
                                          (30, 'SALES_H2', 'CHICAGO'),
                                          (40, 'OPERATIONS_H2', 'BOSTON');