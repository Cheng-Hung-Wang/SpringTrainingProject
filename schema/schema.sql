SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS department;




/* Create Tables */

CREATE TABLE department
(
	-- 部門編號
	id int NOT NULL AUTO_INCREMENT COMMENT '部門編號',
	-- 部門名稱
	name varchar(30) NOT NULL COMMENT '部門名稱',
	-- 部門主管
	supervisor_id int NOT NULL COMMENT '部門主管',
	PRIMARY KEY (id)
);


CREATE TABLE employee
(
	-- 員工編號
	id int NOT NULL AUTO_INCREMENT COMMENT '員工編號',
	-- 員工名字
	first_name varchar(30) NOT NULL COMMENT '員工名字',
	-- 員工姓氐
	last_name varchar(30) NOT NULL COMMENT '員工姓氐',
	-- 手機號碼
	phone varchar(30) NOT NULL COMMENT '手機號碼',
	-- 到職日
	start_time datetime NOT NULL COMMENT '到職日',
	leave_time datetime,
	-- 員工職等
	level tinyint NOT NULL COMMENT '員工職等',
	level_name varchar(30) NOT NULL,
	-- 主管編號
	supervisor_id int NOT NULL COMMENT '主管編號',
	-- 部門編號
	department_id int NOT NULL COMMENT '部門編號',
	PRIMARY KEY (id)
);



/* Create Foreign Keys */

ALTER TABLE employee
	ADD FOREIGN KEY (department_id)
	REFERENCES department (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE employee
	ADD FOREIGN KEY (supervisor_id)
	REFERENCES employee (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



