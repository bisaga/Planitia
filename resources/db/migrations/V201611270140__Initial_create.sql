/**
 * Author:  igorb
 * Created: Nov 27, 2016
 */

create table user_info (
    id serial not null,
    external_id text not null,
    user_name text not null,
    is_active boolean,
    email text,
    created_on timestamp with time zone,
    created_by text not null,
    modified_on timestamp with time zone,
    modified_by text,
    constraint user_pk primary key (id)
);

create table task (
    id serial not null,
    code text not null,
    summary text not null,
    story integer, 
    description text,
    assigned_by integer,
    assignee integer,
    created_on timestamp with time zone,
    created_by text not null,
    modified_on timestamp with time zone,
    modified_by text,
    constraint task_pk primary key (id)
);

create table task_link (
    id serial not null,
    task_id integer not null,
    subtask_id integer not null,
    constraint task_link_pk primary key (id)
);

create table story (
    id serial not null,
    code text not null,
    summary text not null,
    description text,
    author integer,
    reporter integer,
    epic integer, 
    created_on timestamp with time zone,
    created_by text not null,
    modified_on timestamp with time zone,
    modified_by text,
    constraint story_pk primary key (id)
);

create table epic (
    id serial not null,
    code text not null,
    summary text not null,
    description text,
    created_on timestamp with time zone,
    created_by text not null,
    modified_on timestamp with time zone,
    modified_by text,
    constraint epic_pk primary key (id)
);
