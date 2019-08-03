CREATE TABLE `tbl_patient_report_pathology` (
  `ID` char(32) COLLATE utf8_unicode_ci NOT NULL,
  `PATIENT_ID` char(32) COLLATE utf8_unicode_ci NOT NULL,
  `PR_NUMBER` char(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ACCESSION_NUMBER` char(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CASE_NUMBER` char(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `REPORT_DATE` datetime DEFAULT NULL,
  `VERIFIED_BY` char(128) COLLATE utf8_unicode_ci DEFAULT NULL,  
  `NOTE` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `FILE_NAME` char(128) COLLATE utf8_unicode_ci DEFAULT NULL,   
  `FILE_TYPE` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,  
  `FILE` MEDIUMBLOB, 
  
  `COMMENT` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `STATUS` tinyint(4) DEFAULT '1',
  `SORT_ORDER` int(4) DEFAULT '1',
  `INSERT_USER_ID` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `UPDATE_USER_ID` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `INSERT_DATETIME` datetime DEFAULT NULL,
  `UPDATE_DATETIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `tbl_patient_report_pathology_ibfk_1` (`PATIENT_ID`),
  CONSTRAINT `tbl_patient_report_pathology_ibfk_1` FOREIGN KEY (`PATIENT_ID`) REFERENCES `tbl_patient` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8
COLLATE=utf8_unicode_ci;