-- begin ROYALDIARY_FARMER
create table ROYALDIARY_FARMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    LAST_NAME varchar(255),
    TOTAL_COWS integer,
    MILK_PRODUCTION double precision,
    AVERAGE_QUALITY_OF_MILK double precision,
    USERNAME varchar(255),
    FIRTST_NAME varchar(255),
    --
    primary key (ID)
)^
-- end ROYALDIARY_FARMER

-- begin ROYALDIARY_FARMER_ADDRESS
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
    FARMER_ID varchar(36),
    --
    primary key (ID)
)^
-- end ROYALDIARY_FARMER_ADDRESS
