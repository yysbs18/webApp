/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/3/11 13:45:24                           */
/*==============================================================*/
drop table if exists menu;

drop table if exists menu_permission_relation;

drop table if exists operation;

drop table if exists permission;

drop table if exists permission_operation_relation;

drop table if exists user;

drop table if exists user_group;

drop table if exists user_group_user_relation;

drop table if exists user_group_user_role_relation;

drop table if exists user_role;

drop table if exists user_role_permission_ralation;

drop table if exists user_role_relation;

/*==============================================================*/
/* Table: menu                                                  */
/*==============================================================*/
create table menu
(
   menu_id              int not null,
   menu_name            varchar(32) not null,
   menu_url             varchar(64) not null,
   menu_fid             int,
   sort                 int,
   creata_user_id       int,
   creata_time          timestamp,
   modify_user_id       int,
   modify_time          timestamp,
   flag                 bool
);

alter table menu
   add primary key (menu_id);

/*==============================================================*/
/* Table: menu_permission_relation                              */
/*==============================================================*/
create table menu_permission_relation
(
   menu_id              int not null,
   permission_id        int not null,
   permission__id       int,
   creata_user_id       int,
   creata_time          timestamp,
   modify_user_id       int,
   modify_time          timestamp,
   flag                 bool
);

/*==============================================================*/
/* Table: operation                                             */
/*==============================================================*/
create table operation
(
   operation_id         int not null,
   operation_name       varchar(32) not null,
   operation_code       varchar(32) not null,
   intercept_prefix     varchar(64),
   operation_fid        int,
   creata_user_id       int,
   creata_time          timestamp,
   modify_user_id       int,
   modify_time          timestamp,
   flag                 bool
);

alter table operation
   add primary key (operation_id);

/*==============================================================*/
/* Table: permission                                            */
/*==============================================================*/
create table permission
(
   permission_id        int not null,
   permission_type      varchar(32) not null,
   creata_user_id       int,
   creata_time          timestamp,
   modify_user_id       int,
   modify_time          timestamp,
   flag                 bool
);

alter table permission
   add primary key (permission_id);

/*==============================================================*/
/* Table: permission_operation_relation                         */
/*==============================================================*/
create table permission_operation_relation
(
   permission_id        int not null,
   operation_id         int,
   creata_user_id       int,
   creata_time          timestamp,
   modify_user_id       int,
   modify_time          timestamp,
   flag                 bool
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   user_id              int not null,
   uuid                 varchar(32) not null,
   email                varchar(64) not null,
   username             varchar(32) not null,
   password             varchar(32) not null,
   sex                  bool,
   token                varchar(32) not null,
   creata_time          timestamp,
   modify_time          timestamp,
   flag                 bool
);

alter table user
   add primary key (user_id);

/*==============================================================*/
/* Table: user_group                                            */
/*==============================================================*/
create table user_group
(
   user_group_id        int not null,
   user_group_name      varchar(32) not null,
   user_group_fid       int,
   creata_user_id       int,
   creata_time          timestamp,
   modify_user_id       int,
   modify_time          timestamp,
   flag                 bool
);

alter table user_group
   add primary key (user_group_id);

/*==============================================================*/
/* Table: user_group_user_relation                              */
/*==============================================================*/
create table user_group_user_relation
(
   user_group_id        int not null,
   user_id              int not null,
   creata_user_id       int,
   creata_time          timestamp,
   modify_user_id       int,
   modify_time          timestamp,
   flag                 bool
);

/*==============================================================*/
/* Table: user_group_user_role_relation                         */
/*==============================================================*/
create table user_group_user_role_relation
(
   user_group_id        int not null,
   user_role_id         int not null,
   creata_time          timestamp,
   modify_time          timestamp,
   flag                 bool
);

/*==============================================================*/
/* Table: user_role                                             */
/*==============================================================*/
create table user_role
(
   user_role_id         int not null,
   user_role_name       varchar(32) not null,
   creata_time          timestamp,
   modify_time          timestamp,
   flag                 bool
);

alter table user_role
   add primary key (user_role_id);

/*==============================================================*/
/* Table: user_role_permission_ralation                         */
/*==============================================================*/
create table user_role_permission_ralation
(
   user_role_id         int not null,
   permission_id        int not null,
   creata_user_id       int,
   creata_time          timestamp,
   modify_user_id       int,
   modify_time          timestamp,
   flag                 bool
);

/*==============================================================*/
/* Table: user_role_relation                                    */
/*==============================================================*/
create table user_role_relation
(
   userid               int not null,
   user_role_id         int not null,
   creata_time          timestamp,
   modify_time          timestamp,
   flag                 bool
);

alter table menu_permission_relation add constraint fk_reference_11 foreign key (menu_id)
      references menu (menu_id) on delete restrict on update restrict;

alter table menu_permission_relation add constraint fk_reference_12 foreign key (permission_id)
      references permission (permission_id) on delete restrict on update restrict;

alter table permission_operation_relation add constraint fk_reference_10 foreign key (permission_id)
      references permission (permission_id) on delete restrict on update restrict;

alter table permission_operation_relation add constraint fk_reference_9 foreign key (operation_id)
      references operation (operation_id) on delete restrict on update restrict;

alter table user_group_user_relation add constraint fk_reference_3 foreign key (user_group_id)
      references user_group (user_group_id) on delete restrict on update restrict;

alter table user_group_user_relation add constraint fk_reference_4 foreign key (user_id)
      references user (user_id) on delete restrict on update restrict;

alter table user_group_user_role_relation add constraint fk_reference_5 foreign key (user_group_id)
      references user_group (user_group_id) on delete restrict on update restrict;

alter table user_group_user_role_relation add constraint fk_reference_6 foreign key (user_role_id)
      references user_role (user_role_id) on delete restrict on update restrict;

alter table user_role_permission_ralation add constraint fk_reference_7 foreign key (user_role_id)
      references user_role (user_role_id) on delete restrict on update restrict;

alter table user_role_permission_ralation add constraint fk_reference_8 foreign key (permission_id)
      references permission (permission_id) on delete restrict on update restrict;

alter table user_role_relation add constraint fk_reference_1 foreign key (userid)
      references user (user_id) on delete restrict on update restrict;

alter table user_role_relation add constraint fk_reference_2 foreign key (user_role_id)
      references user_role (user_role_id) on delete restrict on update restrict;

