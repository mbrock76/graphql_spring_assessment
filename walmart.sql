drop table if exists walmart."students" cascade;
drop table if exists walmart."courses" cascade;

create table walmart."students" (
	"student_id" serial primary key,
	"first_name" text not null,
	"last_name" text not null,
	"email" text not null,
	"age" integer not null,
	"dob" date not null
);

create table walmart."courses" (
	"course_id" serial primary key,
	"student_id" integer not null references walmart."students"(student_id),
	"desc" text not null,
	"start" date not null,
	"finish" date not null
);


insert into walmart."students" ("first_name", "last_name", "email", "age", "dob") values
('jimmy', 'john', 'jjohn@gmail.com', 22, '2000-01-01'),
('shirley', 'whirley', 'swhirley@gmail.com', 33, '1989-01-01'),
('vedi', 'reddy', 'vreddy@gmail.com', 44, '1977-08-29');

INSERT INTO walmart."courses" ("student_id", "desc", "start", "finish") VALUES
(1, 'english', '2022-06-01', '2022-09-01'),
(2, 'basket-weaving', '2022-06-01', '2022-09-01'),
(3, 'police tactics', '2022-06-01', '2022-06-01');