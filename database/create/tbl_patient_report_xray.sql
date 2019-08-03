CREATE TABLE `tbl_patient_report_xray` (
  `ID` char(32) COLLATE utf8_unicode_ci NOT NULL,
  `PATIENT_ID` char(32) COLLATE utf8_unicode_ci NOT NULL,
  `XRAY_NUMBER` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `REPORT_DATE` char(255) DEFAULT NULL,
  `VERIFIED_BY` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,  
  `NOTE` text COLLATE utf8_unicode_ci DEFAULT NULL,
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
  KEY `tbl_patient_report_xray_ibfk_1` (`PATIENT_ID`),
  CONSTRAINT `tbl_patient_report_xray_ibfk_1` FOREIGN KEY (`PATIENT_ID`) REFERENCES `tbl_patient` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8
COLLATE=utf8_unicode_ci;