create table LofService_ItemFound (
	itemFoundId LONG not null primary key,
	userId LONG,
	FoundDate DATE null,
	FoundLocation VARCHAR(75) null,
	FoundCompany VARCHAR(75) null,
	FoundColor VARCHAR(75) null,
	FoundSize VARCHAR(75) null,
	FoundType VARCHAR(75) null,
	FoundStatus VARCHAR(75) null,
	FoundDesc VARCHAR(500) null,
	LostItem LONG,
	mimeType VARCHAR(75) null,
	blobData BLOB
);

create table LofService_ItemLost (
	itemLostId LONG not null primary key,
	userId LONG,
	LostDate DATE null,
	LostLocation VARCHAR(75) null,
	LostCompany VARCHAR(75) null,
	LostColor VARCHAR(75) null,
	LostSize VARCHAR(75) null,
	LostType VARCHAR(75) null,
	LostStatus VARCHAR(75) null,
	LostDesc VARCHAR(500) null,
	mimeType VARCHAR(75) null,
	blobData BLOB
);

create table LofService_ItemVerification (
	itemVerificationId LONG not null primary key,
	VerifyDesc VARCHAR(500) null,
	Image1 BLOB,
	Image2 BLOB,
	LostItemid LONG,
	FoundItemid LONG,
	UserId LONG,
	VerifyStatus VARCHAR(75) null
);

create table LofService_SearchRes (
	searchResId LONG not null primary key,
	userId LONG,
	itemid LONG,
	location VARCHAR(75) null,
	color VARCHAR(75) null,
	size_ VARCHAR(75) null,
	desc_ VARCHAR(500) null,
	count INTEGER,
	Status VARCHAR(75) null,
	Date DATE null,
	Company VARCHAR(75) null
);

create table LofService_UserMaster (
	userMasterId LONG not null primary key,
	userName VARCHAR(75) null,
	userEmail VARCHAR(75) null,
	userPass VARCHAR(75) null,
	userAddress VARCHAR(75) null,
	userPhoneno INTEGER,
	userType VARCHAR(75) null,
	userOrganization VARCHAR(75) null
);