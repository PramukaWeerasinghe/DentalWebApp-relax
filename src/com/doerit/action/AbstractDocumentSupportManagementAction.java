package com.doerit.action;

import java.io.File;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.model.Document;
import com.doerit.model.DocumentWithBLOBs;
import com.doerit.service.DocumentService;

public abstract class AbstractDocumentSupportManagementAction extends AbstractManagementAction {

	@Autowired
	protected DocumentService documentService;
	
	private static final long serialVersionUID = 1L;
	protected DocumentWithBLOBs document;
	protected List<Document> documentList;
	protected String documentId;
	protected String referenceId;
	protected String typeId;
	protected InputStream inputStream;
	
	private File upload;
    private String uploadContentType;
    private String uploadFileName;
	
	public List<DocumentWithBLOBs> documents;
	
	public String save() {
		documentService.save(getDocument());
		return SUCCESS;
	}
	
	public DocumentWithBLOBs getDocument() {
		return document;
	}

	public void setDocument(DocumentWithBLOBs document) {
		this.document = document;
	}

	public List<Document> getDocumentList() {
		return documentList;
	}

	public void setDocumentList(List<Document> documentList) {
		this.documentList = documentList;
	}
	
	public String deleteDocument() {
		return SUCCESS;
	}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getReferenceId() {
		return this.referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public List<DocumentWithBLOBs> getDocuments() {
		return documents;
	}

	public void setDocuments(List<DocumentWithBLOBs> documents) {
		this.documents = documents;
	}
	
	public InputStream getInputStream() {
	    return inputStream;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

}
