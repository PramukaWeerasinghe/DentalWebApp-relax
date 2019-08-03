DROP TABLE IF EXISTS tbl_document;

CREATE TABLE tbl_document (
	ID CHAR(32) NOT NULL PRIMARY KEY,
	DOCUMENT_CATEGORY CHAR(32) NOT NULL,
	ENTITY_NAME CHAR(32) NOT NULL,
	ENTITY_ID CHAR(32) NOT NULL,
	DOCUEMENT_DESCRIPTION CHAR(255),
	FILE_NAME CHAR(255) NOT NULL,
	CONTENT_TYPE CHAR(255) NOT NULL,
	CONTENT LONGBLOB NOT NULL,
	REMARK TEXT,
	SORT_ORDER INT(4) DEFAULT 1,
	STATE TINYINT(2) DEFAULT '0',
	INSERT_USER_ID CHAR(32) DEFAULT NULL,
	INSERT_DATETIME DATETIME DEFAULT NULL,
	UPDATE_USER_ID CHAR(32) DEFAULT NULL,
	UPDATE_DATETIME DATETIME DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;