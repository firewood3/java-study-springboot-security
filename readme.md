# 간단 스프링 시큐리티
## 로그인 정보
id : hsj

pw : password

## ddl
```sql
create table member
(
    id        int auto_increment
        primary key,
    username  varchar(255) null,
    password  varchar(500) null,
    user_type varchar(255) null
);
```

## DCL
```sql
INSERT INTO csev.member (id, username, password, user_type) VALUES (1, 'hsj', '$2a$10$AAS5tk9COnI1gTFx.hGU2urYUReo6AMeZ7ucfk3b1I0qUZgorpd.S', 'ROLE_user');
```