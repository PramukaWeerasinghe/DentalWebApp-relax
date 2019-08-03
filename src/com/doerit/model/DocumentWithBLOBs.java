package com.doerit.model;

public class DocumentWithBLOBs extends Document {
    
    private byte[] content;
    private String remark;
 //   private long filesizeInMB;

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
    
    public int getContentLength() {
    	if(content != null) {
    		return this.content.length;
    	} else{
    		return 0;
    	}
    }

/*	public long getFilesizeInMB() {
		
		long size = content.length;
		return size/(1024*1024);
	}

	public void setFilesizeInMB(long filesizeInMB) {
		this.filesizeInMB = filesizeInMB;
	}*/
}