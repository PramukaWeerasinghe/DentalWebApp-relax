CREATE TABLE `tbl_patient_diagnostic_dentalhistory` (
  `ID` char(32) NOT NULL,
  `PATIENT_ID` char(32) DEFAULT NULL,
  `EXTRACTION` char(255) DEFAULT NULL,
  `EXTRACTION_COMPLICATIONS` text DEFAULT NULL,
  `EXTRACTION_COMPLICATIONS_TYPE` text DEFAULT NULL,
  `ORAL_SURGERY` char(255) DEFAULT NULL,
  `PERIODONTAL_RX` char(255) DEFAULT NULL,
  `PERIODONTAL_RX_SCALING` char(255) DEFAULT NULL,
  `PERIODONTAL_RX_ROOTDEBRIMENT` char(255) DEFAULT NULL,
  `PERIODONTAL_RX_SURGICAL` char(255) DEFAULT NULL,
  `PERIODONTAL_RX_MAINTENANCE` char(255) DEFAULT NULL,
  `ORTHODONTIC_TREATMENT` char(255) DEFAULT NULL,
  `ORTHODONTIC_TREATMENT_FIXED` char(255) DEFAULT NULL,
  `ORTHODONTIC_TREATMENT_REMOVABLE` char(255) DEFAULT NULL,
  `ORTHODONTIC_TREATMENT_FUNCTIONAL` char(255) DEFAULT NULL,
  `ORTHODONTIC_TREATMENT_COMPLICATIONS` text DEFAULT NULL,
  `RESTORATIVE_RX` char(255) DEFAULT NULL,
  `RESTORATIVE_RX_ENDODONTICS` char(255) DEFAULT NULL,
  `RESTORATIVE_RX_FIXEDPROSTHESIS` char(255) DEFAULT NULL,
  `RESTORATIVE_RX_REMOVABLEPROSTHESIS` char(255) DEFAULT NULL,
  `RESTORATIVE_RX_RESTORATIONS` char(255) DEFAULT NULL,
  `RESTORATIVE_RX_COMPLICATIONS` text DEFAULT NULL,
  
  
  
  `COMMENT` text CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `STATUS` tinyint(4) DEFAULT '0',
  `SORT_ORDER` int(6) DEFAULT '1',
  `INSERT_USER_ID` char(32) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `INSERT_DATETIME` datetime DEFAULT NULL,
  `UPDATE_USER_ID` char(32) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `UPDATE_DATETIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
