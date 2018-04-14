create table ROYALDIARY_FARMER_ADDRESS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    STATE varchar(255) not null,
    DISTRICT varchar(255),
    FARMER_ID_ID varchar(36),
    --
    primary key (ID)
);
