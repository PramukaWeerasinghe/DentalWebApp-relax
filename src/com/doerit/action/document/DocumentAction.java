package com.doerit.action.document;

import java.io.ByteArrayInputStream;
import org.springframework.beans.factory.annotation.Autowired;
import com.doerit.action.AbstractDocumentSupportManagementAction;
import com.doerit.service.DocumentService;
import com.doerit.util.DocumentCategory;

public class DocumentAction extends AbstractDocumentSupportManagementAction {

	private static final long serialVersionUID = 1L;
	public String DOWNLOAD_RESULT = "download";

	private String entityId;

	@Autowired private DocumentService documentService;

	public String download() {

		inputStream = new ByteArrayInputStream(document.getContent());
		return SUCCESS;
	}

	public String downloadPathologyReport() {
		this.document = documentService.viewByEntityIdAndCategory(entityId, DocumentCategory.PATHOLOGY.getDatabaseValue());
		
		if (document != null && document.getContent() != null) {
			
			return download();
		} else {
			return INPUT;
		}
	}
	
	public String downloadXrayReport() {
		this.document = documentService.viewByEntityIdAndCategory(entityId, DocumentCategory.X_RAY.getDatabaseValue());
		
		if (document != null && document.getContent() != null) {
			return download();
		} else {
			return INPUT;
		}
		
	}

	public String getEntityId() {
		return entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

}
