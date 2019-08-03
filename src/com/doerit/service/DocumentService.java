package com.doerit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doerit.dao.DocumentMapper;
import com.doerit.model.Document;
import com.doerit.model.DocumentWithBLOBs;
import com.doerit.util.State;

@Service
public class DocumentService {

	@Autowired
	private DocumentMapper documentMapper;

	public void save(DocumentWithBLOBs document) {
		try{
			documentMapper.insertSelective(document);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public DocumentWithBLOBs findById(String imageId) {
		return documentMapper.selectById(imageId);
	}
	
	public int update(DocumentWithBLOBs document) {
		return documentMapper.updateByPrimaryKeySelective(document);
	}

	public DocumentWithBLOBs viewById(String id) {
		return documentMapper.findById(id, State.ACTIVE.getDatabaseValue());
	}
	
	public Document viewDocumentById(String id) {
		return documentMapper.findById(id, State.ACTIVE.getDatabaseValue());
	}

	public DocumentWithBLOBs viewByIdAndState(String id, byte state) {
		return documentMapper.findById(id, State.DELETED.getDatabaseValue());
	}
	
	public DocumentWithBLOBs viewByEntityIdAndCategory(String entityId, String category) {
		return documentMapper.findByEntityIdAndCategory(entityId, category, State.ACTIVE.getDatabaseValue());
	}

}
