alter table ROYALDIARY_FARMER_ADDRESS add constraint FK_ROYALDIARY_FARMER_ADDRESS_FARMER foreign key (FARMER_ID) references ROYALDIARY_FARMER(ID);
create index IDX_ROYALDIARY_FARMER_ADDRESS_FARMER on ROYALDIARY_FARMER_ADDRESS (FARMER_ID);