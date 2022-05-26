drop table if exists board_tbl;

create table board_tbl(
bno int auto_increment primary key,
title varchar(300) not null,
content text not null,
writer varchar(50) not null,
regDate timestamp default current_timestamp,
updateDate timestamp default current_timestamp
);

select * from board_tbl;

insert into board_tbl(title,content,writer) 
values 
('게시물 제목1','배가 고픔니다','거시기1'),
('게시물 제목2','배가 고픔니다','거시기2'),
('게시물 제목3','배가 고픔니다','거시기3'),
('게시물 제목4','배가 고픔니다','거시기4');