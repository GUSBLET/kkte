-- create table if not exists news
-- (
--     id                bigserial,
--     title             varchar(200),
--     short_description varchar(500),
--     content           text,
--     create_time_at    time without time zone not null,
--     create_date_at    date                   not null,
--     primary key (id)
-- );
--
-- create unique index index_for_table_news on news (id, title);
--
-- -- create table if not exists lecture_schedule(
-- --                                                id                bigserial,
-- --                                                title             varchar(100),
-- -- );

create table if not exists week_count
(
    id    smallserial primary key,
    value varchar(30)
);

create table if not exists lecture_replacement_date
(
    id               bigserial primary key,
    replacement_date date unique,
    week_count_id    smallint references week_count (id)
);

create table if not exists lecture_replacement
(
    id                          bigserial primary key,
    lesson_number               smallint,
    class                       varchar(20) not null,
    current_lecture             varchar(50) not null,
    current_teacher_lecture     varchar(50) not null,
    replacement_lecture         varchar(50) not null,
    replacement_teacher_lecture varchar(50) not null,
    lecture_replacement_date_id bigint references lecture_replacement_date (id)
);


