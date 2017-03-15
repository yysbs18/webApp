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

create table menu
(
   menu_id              int not null auto_increment,
   menu_name            varchar(32) not null,
   menu_url             varchar(64) not null,
   menu_fid             int,
   sort                 int,
   creata_user_id       int,
   creata_time          timestamp,
   modify_user_id       int,
   modify_time          timestamp,
   flag                 bool,
   primary key (menu_id)
);

alter table menu comment '菜单表';

create table menu_permission_relation
(
   id                   int not null auto_increment,
   menu_id              int,
   permission_id        int,
   creata_user_id       int,
   creata_time          timestamp,
   modify_user_id       int,
   modify_time          timestamp,
   flag                 bool,
   primary key (id)
);

alter table menu_permission_relation comment '菜单权限关联';

create table operation
(
   operation_id         int not null auto_increment,
   operation_name       varchar(32) not null,
   operation_code       varchar(32) not null,
   intercept_prefix     varchar(64),
   operation_fid        int,
   creata_user_id       int,
   creata_time          timestamp,
   modify_user_id       int,
   modify_time          timestamp,
   flag                 bool,
   primary key (operation_id)
);

alter table operation comment '功能操作表';

create table permission
(
   permission_id        int not null auto_increment,
   permission_name      varchar(32) not null,
   permission_type      varchar(32) not null,
   creata_user_id       int,
   creata_time          timestamp,
   modify_user_id       int,
   modify_time          timestamp,
   flag                 bool,
   primary key (permission_id)
);

alter table permission comment '权限表';

create table permission_operation_relation
(
   id                   int not null auto_increment,
   permission_id        int,
   operation_id         int,
   creata_user_id       int,
   creata_time          timestamp,
   modify_user_id       int,
   modify_time          timestamp,
   flag                 bool,
   primary key (id)
);

alter table permission_operation_relation comment '权限操作关联';

create table user
(
   user_id              int not null auto_increment,
   uuid                 varchar(32) not null,
   email                varchar(64) not null,
   username             varchar(32) not null,
   password             varchar(32) not null,
   sex                  bool,
   token                varchar(32),
   creata_user_id       int,
   creata_time          timestamp,
   modify_user_id       int,
   modify_time          timestamp,
   flag                 bool,
   primary key (user_id)
);

alter table user comment '用户表';

create table user_group
(
   user_group_id        int not null auto_increment,
   user_group_name      varchar(32) not null,
   user_group_fid       int,
   creata_user_id       int,
   creata_time          timestamp,
   modify_user_id       int,
   modify_time          timestamp,
   flag                 bool,
   primary key (user_group_id)
);

alter table user_group comment '用户组';

create table user_group_user_relation
(
   id                   int not null auto_increment,
   user_group_id        int,
   user_id              int,
   creata_user_id       int,
   creata_time          timestamp,
   modify_user_id       int,
   modify_time          timestamp,
   flag                 bool,
   primary key (id)
);

alter table user_group_user_relation comment '用户组用户关联';

create table user_group_user_role_relation
(
   id                   int not null auto_increment,
   user_group_id        int,
   user_role_id         int,
   creata_user_id       int,
   creata_time          timestamp,
   modify_user_id       int,
   modify_time          timestamp,
   flag                 bool,
   primary key (id)
);

alter table user_group_user_role_relation comment '用户组角色关联';

create table user_role
(
   user_role_id         int not null auto_increment,
   user_role_name       varchar(32) not null,
   creata_user_id       int,
   creata_time          timestamp,
   modify_user_id       int,
   modify_time          timestamp,
   flag                 bool,
   primary key (user_role_id)
);

alter table user_role comment '角色表';

create table user_role_permission_ralation
(
   id                   int not null auto_increment,
   user_role_id         int,
   permission_id        int,
   creata_user_id       int,
   creata_time          timestamp,
   modify_user_id       int,
   modify_time          timestamp,
   flag                 bool,
   primary key (id)
);

alter table user_role_permission_ralation comment '角色权限关联';

create table user_role_relation
(
   id                   int not null auto_increment,
   user_id              int,
   user_role_id         int,
   creata_user_id       int,
   creata_time          timestamp,
   modify_user_id       int,
   modify_time          timestamp,
   flag                 bool,
   primary key (id)
);

alter table user_role_relation comment '用户角色关联表';

