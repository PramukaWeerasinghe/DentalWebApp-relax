CREATE TABLE `tbl_patient_teeth_disorder` (
  `ID` char(32) COLLATE utf8_unicode_ci NOT NULL,
  `PATIENT_ID` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `MISSINGTEETH_ID` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `TEETH_INFO` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `TREATMENT_PLAN` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
    
  `COMMENT` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `STATUS` tinyint(4) DEFAULT '1',
  `SORT_ORDER` int(10) DEFAULT '1',
  `INSERT_USER_ID` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `UPDATE_USER_ID` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `INSERT_DATETIME` datetime DEFAULT NULL,
  `UPDATE_DATETIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
