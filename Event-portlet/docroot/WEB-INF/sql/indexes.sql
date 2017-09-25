create index IX_BB271C04 on LofService_ItemFound (FoundType[$COLUMN_LENGTH:75$]);

create index IX_474689CE on LofService_ItemLost (LostStatus[$COLUMN_LENGTH:75$], userId);
create index IX_5A7DA690 on LofService_ItemLost (itemLostId);
create index IX_5666A984 on LofService_ItemLost (userId);

create index IX_770408C7 on LofService_ItemVerification (LostItemid);
create index IX_9B0F8DBA on LofService_ItemVerification (UserId, VerifyStatus[$COLUMN_LENGTH:75$]);

create index IX_20A51371 on LofService_UserMaster (userEmail[$COLUMN_LENGTH:75$], userPass[$COLUMN_LENGTH:75$]);