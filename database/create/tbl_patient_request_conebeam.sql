CREATE TABLE `tbl_patient_request_conebeam` (
  `ID` char(32) COLLATE utf8_unicode_ci NOT NULL,
  `PATIENT_ID` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  
  `URGENT` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `PREVIOUS_XRAY_INFO` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  
  `CLINICAL_NOTE` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,  
  `CONSULTANT_NAME` char(128) COLLATE utf8_unicode_ci DEFAULT NULL,  
  `HOSPITAL_NAME` char(128) COLLATE utf8_unicode_ci DEFAULT NULL,  
  `CONSULTANT_SIGN` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,  
  `DATE_REQUESTED` datetime DEFAULT NULL,  
  `DATE_APPOINTMENT` datetime DEFAULT NULL,  
  `CD_GIVEN` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  
  `PROPERTY_VALUE` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `COMMENT` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `STATUS` tinyint(2) DEFAULT '1',
  `SORT_ORDER` int(4) DEFAULT '1',
  `INSERT_USER_ID` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `UPDATE_USER_ID` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `INSERT_DATETIME` datetime DEFAULT NULL,
  `UPDATE_DATETIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
