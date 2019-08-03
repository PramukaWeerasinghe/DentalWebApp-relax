CREATE TABLE `tbl_patient_request_hbi` (
  `ID` char(32) COLLATE utf8_unicode_ci NOT NULL,
  `PATIENT_ID` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CLINICAL_HISTORY` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,   
  `TYPE_OF_TEST` char(128) COLLATE utf8_unicode_ci DEFAULT NULL, 
  `TYPE_OF_TEST_OTHER` char(128) COLLATE utf8_unicode_ci DEFAULT NULL, 
  
  `COMMENT` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `STATUS` tinyint(2) DEFAULT '1',
  `SORT_ORDER` int(4) DEFAULT '1',
  `INSERT_USER_ID` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `UPDATE_USER_ID` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `INSERT_DATETIME` datetime DEFAULT NULL,
  `UPDATE_DATETIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
