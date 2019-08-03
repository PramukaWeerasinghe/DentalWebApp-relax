CREATE TABLE `tbl_patient_request_biopsy` (
  `ID` char(32) COLLATE utf8_unicode_ci NOT NULL,
  `PATIENT_SERIAL_NUMBER` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DATE_OF_SURGERY` datetime COLLATE utf8_unicode_ci DEFAULT NULL,
  `CLINIC` char(128) COLLATE utf8_unicode_ci DEFAULT NULL,  
  `CLINICIAN` char(128) COLLATE utf8_unicode_ci DEFAULT NULL,  
  `TYPE_OF_BIOPSY` char(128) COLLATE utf8_unicode_ci DEFAULT NULL,  
  `SITE_OF_BIOPSY` char(128) COLLATE utf8_unicode_ci DEFAULT NULL, 

  
  `PREVIOUS_BIOPSY_DIAGNOSIS` char(128) COLLATE utf8_unicode_ci DEFAULT NULL,   
  `PREVIOUS_BIOPSY_PATH_NUMBER` char(128) COLLATE utf8_unicode_ci DEFAULT NULL,   
  `PREVIOUS_BIOPSY_TYPE` char(128) COLLATE utf8_unicode_ci DEFAULT NULL,   
  `PREVIOUS_BIOPSY_SITE` char(128) COLLATE utf8_unicode_ci DEFAULT NULL,   

  
  `DURATION` char(128) COLLATE utf8_unicode_ci DEFAULT NULL,   
  `SITE_OF_LESSION` char(128) COLLATE utf8_unicode_ci DEFAULT NULL,   
  `TYPE_OF_LESSION` char(128) COLLATE utf8_unicode_ci DEFAULT NULL,    
  `SIZE_OF_LESSION` char(128) COLLATE utf8_unicode_ci DEFAULT NULL,   
  `COLOR_OF_LESSION` char(128) COLLATE utf8_unicode_ci DEFAULT NULL,    
  `SHAPE_OF_LESSION` char(128) COLLATE utf8_unicode_ci DEFAULT NULL,   
  `CONSISTENCY_OF_LESSION` char(128) COLLATE utf8_unicode_ci DEFAULT NULL,    

  `CLINICAL_IMPRESSION` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,    
  `RADIOLOGICAL_FINDING` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,   
  
   
  `COMMENT` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `STATUS` tinyint(2) DEFAULT '1',
  `SORT_ORDER` int(4) DEFAULT '1',
  `INSERT_USER_ID` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `UPDATE_USER_ID` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `INSERT_DATETIME` datetime DEFAULT NULL,
  `UPDATE_DATETIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
