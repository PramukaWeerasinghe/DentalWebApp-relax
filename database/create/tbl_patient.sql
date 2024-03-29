CREATE TABLE `tbl_patient` (
  `ID` char(32) COLLATE utf8_unicode_ci NOT NULL,
  `SERIAL_NUMBER` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `FILE_NUMBER` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `TITLE` char(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `SURNAME` char(128) COLLATE utf8_unicode_ci DEFAULT NULL,
  `INITIALS` char(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `FIRST_NAME` char(128) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NIC` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CHILD` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DATE_OF_BIRTH` date DEFAULT NULL,
  `SEX` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ETHNICITY` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `COUNTRY` char(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MOBILE` char(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `EMAIL` char(128) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ADDRESS` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MARITAL_STATUS` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `COMMENT` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DISTRICT_ID` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `STATUS` tinyint(4) DEFAULT '1',
  `SORT_ORDER` int(10) DEFAULT '1',
  `INSERT_USER_ID` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `UPDATE_USER_ID` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `INSERT_DATETIME` datetime DEFAULT NULL,
  `UPDATE_DATETIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `SERIAL_NUMBER_UNIQUE` (`SERIAL_NUMBER`),
  KEY `DISTRICT_ID` (`DISTRICT_ID`),
  CONSTRAINT `tbl_patient_ibfk_1` FOREIGN KEY (`DISTRICT_ID`) REFERENCES `tbl_district` (`ID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
