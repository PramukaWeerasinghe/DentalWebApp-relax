package com.doerit.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
 
public class PdfpatientRequestXrayTest {
 
    /** The resulting PDF file. */
    public static final String RESULT
        = "c:/temp/second_table1.pdf";
 
    /**
     * Main method.
     * @param    args    no arguments needed
     * @throws DocumentException 
     * @throws IOException
     */
    public static void main(String[] args)
        throws IOException, DocumentException {
        new PdfpatientRequestXrayTest().createPdf(RESULT);
    }
 

    public void createPdf(String filename)
        throws IOException, DocumentException {
    	// step 1
        Document document = new Document();
        // step 2
        PdfWriter.getInstance(document, new FileOutputStream(filename));
        // step 3
        document.open();
        // step 4
        prepareTables(document);
       
        // step 5
        document.close();
    }
    
    private static void prepareTables(Document document) throws DocumentException, IOException {
    	 LineSeparator ls = new LineSeparator();
         ls.setLineColor(new BaseColor(200, 200, 200));
         
         document.add(ls);
         Paragraph gap = new Paragraph();
         gap.setSpacingBefore(5);
         document.add(gap);
         
         document.add(createPrimaryInformationTable());
         
         document.add(gap);
         document.add(new Chunk(ls));
        
         
         document.add(createXrayInformationTable());
         document.add(new Chunk(ls));         
    }
 
    public static PdfPTable createXrayInformationTable() throws DocumentException, IOException {
        PdfPTable table = new PdfPTable(5);
        table.setWidths(new float[]{0.5f, 2, 2, 1, 2});
        table.getDefaultCell().setBorder(0);
        
        table.addCell(""); //offset
        table.addCell(createCellValue("Clinical history:", PdfFont.Level2Header));
        table.addCell(createCellValue("#Clinical", PdfFont.Level2Value));
        table.addCell("");
        table.addCell("");
        
        table.addCell(""); //offset
        table.addCell(createCellValue("IOPA:", PdfFont.Level2Header));
        table.addCell(createCellValue("#iopa", PdfFont.Level2Value));
        table.addCell("");
        table.addCell("");
        
        table.addCell(""); //offset
        table.addCell(createCellValue("Bitewing:", PdfFont.Level2Header));
        table.addCell(createCellValue("#Bitewing", PdfFont.Level2Value));
        table.addCell("");
        table.addCell("");

        table.addCell(""); //offset
        table.addCell(createCellValue("Occlusal views:", PdfFont.Level2Header));
        table.addCell(createCellValue("#Occlusal views", PdfFont.Level2Value));
        table.addCell("");
        table.addCell("");
        
        table.addCell(""); //offset
        table.addCell(createCellValue("OPG:", PdfFont.Level2Header));
        table.addCell(createCellValue("#opg", PdfFont.Level2Value));
        table.addCell("");
        table.addCell("");

        table.addCell(""); //offset
        table.addCell(createCellValue("Sialogram:", PdfFont.Level2Header));
        table.addCell(createCellValue("#sialogram", PdfFont.Level2Value));
        table.addCell("");
        table.addCell("");
        
        table.addCell(""); //offset
        table.addCell(createCellValue("Cephalogram:", PdfFont.Level2Header));
        table.addCell(createCellValue("#Cephalogram", PdfFont.Level2Value));
        table.addCell("");
        table.addCell("");

        table.addCell(""); //offset
        table.addCell(createCellValue("TMJ views", PdfFont.Level2Header));
        table.addCell(createCellValue("#tmj", PdfFont.Level2Value));
        table.addCell("");
        table.addCell("");
        
        table.addCell(""); //offset
        table.addCell(createCellValue("OM view", PdfFont.Level2Header));
        table.addCell(createCellValue("#tmj", PdfFont.Level2Value));
        table.addCell("");
        table.addCell("");
  
        table.addCell(""); //offset
        table.addCell(createCellValue("Mandibular views", PdfFont.Level2Header));
        table.addCell(createCellValue("#man", PdfFont.Level2Value));
        table.addCell("");
        table.addCell("");
  
        table.addCell(""); //offset
        table.addCell(createCellValue("Skull views", PdfFont.Level2Header));
        table.addCell(createCellValue("#skull", PdfFont.Level2Value));
        table.addCell("");
        table.addCell("");

        table.addCell(""); //offset
        table.addCell(createCellValue("Reverse towns", PdfFont.Level2Header));
        table.addCell(createCellValue("#revt", PdfFont.Level2Value));
        table.addCell("");
        table.addCell("");
        
        table.addCell(""); //offset
        table.addCell(createCellValue("Chest x-ray", PdfFont.Level2Header));
        table.addCell(createCellValue("#chest", PdfFont.Level2Value));
        table.addCell("");
        table.addCell("");
        
        table.addCell(""); //offset
        table.addCell(createCellValue("C – spine / neck", PdfFont.Level2Header));
        table.addCell(createCellValue("#csp", PdfFont.Level2Value));
        table.addCell("");
        table.addCell("");

        table.addCell(""); //offset
        table.addCell(createCellValue("CBCT", PdfFont.Level2Header));
        table.addCell(createCellValue("#cbct", PdfFont.Level2Value));
        table.addCell("");
        table.addCell("");

        table.addCell(""); //offset
        table.addCell(createCellValue("USS", PdfFont.Level2Header));
        table.addCell(createCellValue("#uss", PdfFont.Level2Value));
        table.addCell("");
        table.addCell("");
        
        table.addCell(""); //offset
        table.addCell(createCellValue("Department", PdfFont.Level2Header));
        table.addCell(createCellValue("#dept", PdfFont.Level2Value));
        table.addCell("");
        table.addCell("");

        
        table.addCell(""); //offset
        table.addCell(createCellValue("Requested officer", PdfFont.Level2Header));
        table.addCell(createCellValue("#req", PdfFont.Level2Value));
        table.addCell("");
        table.addCell(""); 
 
        
        /*        
        1. Iopa – needs to specify the tooth
        2. Bitewing – need to specify the tooth
        3. Occlusal views - description
        4. Opg – description
        5. Sialogram
        6. Cephalogram
        7. Tmj views
        8. Om view of the skull
        9. Mandibular views – description
        10. Skull views – description
        11. Reverse towns
        12. Chest x-ray – description
        13. C – spine / neck - description
        14. Cbct – form to be filled
        15. Uss - description   */   
        
        
        return table;
	}


	public static PdfPTable createPrimaryInformationTable() throws DocumentException, IOException {
    	
        PdfPTable table = new PdfPTable(5);
        table.setWidths(new float[]{0.5f, 2, 2, 1, 2});
        table.getDefaultCell().setBorder(0);
        
        PdfPCell cell = createCellValue("Personal Data:", PdfFont.Level1Header);
        cell.setColspan(5);
        table.addCell(cell);
        
        table.addCell(""); //offset
        table.addCell(createCellValue("Serial Number:", PdfFont.Level2Header));
        PdfPCell serialCell = createCellValue("#name", PdfFont.Level2Value);
        serialCell.setColspan(3);
        table.addCell(serialCell);
        
        table.addCell(""); //offset
        table.addCell(createCellValue("Patient Name:", PdfFont.Level2Header));
        PdfPCell nameCell = createCellValue("#name", PdfFont.Level2Value);
        nameCell.setColspan(3);
        table.addCell(nameCell);
        
        table.addCell(""); //offset
        table.addCell(createCellValue("NIC Number:", PdfFont.Level2Header));
        table.addCell(createCellValue("#nic", PdfFont.Level2Value));
        BufferedImage bufferedImage = BarCodeImageUtility.createBarCode("17072222", 40f);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        		
        ImageIO.write(bufferedImage, "png", baos);
        Image iTextImage = Image.getInstance(baos.toByteArray());
        
        PdfPCell imageCell = new PdfPCell(iTextImage);
        imageCell.setBorder(0);
        imageCell.setRowspan(4);
        imageCell.setColspan(2);
        table.addCell(imageCell);
        
        table.addCell(""); //offset
        table.addCell(createCellValue("Date of Birth:", PdfFont.Level2Header));
        table.addCell(createCellValue("#dob", PdfFont.Level2Value));
        
        table.addCell(""); //offset
        table.addCell(createCellValue("Sex:", PdfFont.Level2Header));
        table.addCell(createCellValue("#sex", PdfFont.Level2Value));
        
        table.addCell(""); //offset
        table.addCell(createCellValue("Ethnicity:", PdfFont.Level2Header));
        table.addCell(createCellValue("#ethnicity", PdfFont.Level2Value));
        
        return table;
    }
    
 public static PdfPTable createLocationInformationTable() throws DocumentException, IOException {
    	
        PdfPTable table = new PdfPTable(5);
        table.setWidths(new float[]{0.5f, 2, 2, 1, 2});
        table.getDefaultCell().setBorder(0);
        
        table.addCell(""); //offset
        table.addCell(createCellValue("District:", PdfFont.Level2Header));
        table.addCell(createCellValue("#district", PdfFont.Level2Value));
        table.addCell("");
        table.addCell("");
        
        table.addCell(""); //offset
        table.addCell(createCellValue("Province:", PdfFont.Level2Header));
        table.addCell(createCellValue("#province", PdfFont.Level2Value));
        table.addCell("");
        table.addCell("");
        
        table.addCell(""); //offset
        table.addCell(createCellValue("Nationality", PdfFont.Level2Header));
        table.addCell(createCellValue("#nationality", PdfFont.Level2Value));
        table.addCell("");
        table.addCell("");
        
        return table;
        
 }
 
 public static PdfPTable createContactInformationTable() throws DocumentException, IOException {
 	
     PdfPTable table = new PdfPTable(5);
     table.setWidths(new float[]{0.5f, 2, 2, 1, 2});
     table.getDefaultCell().setBorder(0);
     
     table.addCell(""); //offset
     table.addCell(createCellValue("Phone Number;", PdfFont.Level2Header));
     table.addCell(createCellValue("#mobile", PdfFont.Level2Value));
     table.addCell("");
     table.addCell("");
     
     table.addCell(""); //offset
     table.addCell(createCellValue("Email", PdfFont.Level2Header));
     PdfPCell emailCell = createCellValue("#email", PdfFont.Level2Value);
     emailCell.setColspan(2);
     table.addCell(emailCell);
     table.addCell("");
     
     table.addCell(""); //offset
     table.addCell(createCellValue("Address", PdfFont.Level2Header));
     PdfPCell addressCell = createCellValue("#address", PdfFont.Level2Value);
     addressCell.setColspan(3);
     table.addCell(addressCell);
    
     
     return table;
     
}
    
    private static PdfPCell createCellValue(String label, Font font) {
    	PdfPCell pdfPCell = new PdfPCell(new Phrase(16, label, font));
    	pdfPCell.setBorder(0);
    	
    	return pdfPCell;
    }
}