/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  igorb
 * Created: Nov 27, 2016
 */

create table book (
    id serial not null,
    title text not null,

    constraint book_pk primary key (id)
);
