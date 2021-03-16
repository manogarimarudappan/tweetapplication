create database tweetapp;

use tweetapp;

CREATE TABLE user(
us_f_name varchar(60) not null,
us_l_name varchar(60) ,
us_gender varchar(60) not null,
us_dob date null,
us_email varchar(60),
us_password varchar(60) not null,
primary key(us_email));

create table post(
id int auto_increment,
message varchar(256) not null,
us_email varchar(60),
date_of_post timestamp DEFAULT CURRENT_TIMESTAMP, 
primary key(id,us_email),
constraint user_tweet_fk foreign key (us_email)
references user (us_email) on delete cascade );


INSERT INTO user  (`us_f_name`, `us_l_name`, `us_gender`, `us_dob`, `us_email`, `us_password`)
 VALUES ('Tony', 'Stark', 'Male', '1975-11-20', 'tony@gmail.com', 'welcome1'),
 ('Steve', 'Roges', 'Male', '1940-09-01', 'steve@gmail.com', 'welcome1'),
 ('Mano', 'Gari', 'Female', '1995-10-26', 'mano@gmail.com', 'welcome1'),
 ('Elon', 'Musk', 'Female', '1963-12-19', 'elon@gmail.com', 'welcome1');
 
 
 INSERT INTO post(message,us_email)values('I am Iron man','tony@gmail.com'),('Be confident','mano@gmail.com'),('Be Happy','mano@gmail.com'),('Whatever It takes','steve@gmail.com');
