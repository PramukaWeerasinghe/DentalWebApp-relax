package com.doerit.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {
	
public static byte[] getFileContent(File uploadDocument) {
		
		if(uploadDocument != null) {
			Path path = Paths.get(uploadDocument.getAbsolutePath());
			byte[] data = new byte[0];
			
			try {
				data = Files.readAllBytes(path);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			return data;
		}
		
		return new byte[0];
	}
}
