package com.doerit.util;

public enum State {
	
	ACTIVE((byte)1), DELETED((byte)0), MST_SETTING((byte)5), PERMONENTLY_DELETED((byte)9), PENDING((byte)2), REJECTED((byte)3),RESUBMITTED((byte)4),COMPLETED((byte)6),REWORKED((byte)7);
	
	private byte databaseValue = 0;
	
	State(byte dbValue) {
		this.databaseValue = dbValue;
	}

	public byte getDatabaseValue() {
		return databaseValue;
	}

	public void setDatabaseValue(byte databaseValue) {
		this.databaseValue = databaseValue;
	}

	
}
