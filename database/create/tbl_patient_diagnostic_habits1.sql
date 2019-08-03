CREATE TABLE `tbl_patient_diagnostic_habits1` (
  `ID` char(32) NOT NULL,
  `PATIENT_ID` char(32) DEFAULT NULL,
  
  `BETEL_QUID_INGREDIENTS_BETEL` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `BETEL_QUID_INGREDIENTS_LIME` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `BETEL_QUID_INGREDIENTS_TOBACCO` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `BETEL_QUID_INGREDIENTS_ARECA_PRODUCTS` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `BETEL_QUID_INGREDIENTS_ARECANUT` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `BETEL_QUID_INGREDIENTS_TOBACCO_PRODUCTS` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `BETEL_QUID_INGREDIENTS_OTHER` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `BETEL_QUID_FREQUENCY` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `BETEL_QUID_DURATION` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `SMOKING` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `SMOKING_CIGARETTES` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `SMOKING_CIGARETTES_DURATION` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `SMOKING_CIGARETTES_FREQUENCY` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `SMOKING_CIGAR` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `SMOKING_CIGAR_DURATION` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `SMOKING_CIGAR_FREQUENCY` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `SMOKING_BEEDI` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `SMOKING_BEEDI_DURATION` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `SMOKING_BEEDI_FREQUENCY` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `SMOKING_PIPE` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `SMOKING_PIPE_DURATION` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `SMOKING_PIPE_FREQUENCY` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `SMOKING_ROLLUP` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `SMOKING_ROLLUP_DURATION` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `SMOKING_ROLLUP_FREQUENCY` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  
  
  
  
  `COMMENT` text CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `STATUS` tinyint(4) DEFAULT '0',
  `SORT_ORDER` int(6) DEFAULT '1',
  `INSERT_USER_ID` char(32) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `INSERT_DATETIME` datetime DEFAULT NULL,
  `UPDATE_USER_ID` char(32) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `UPDATE_DATETIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
