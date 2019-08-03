package com.doerit.util;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;

public class Header_Footer_PDF extends PdfPageEventHelper {

    public void onStartPage(PdfWriter writer, Document document) {
    	
        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase(""), 30, 800, 0); //top left header
        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase(""), 550, 800, 0);	//top right , serial
 
    }

    public void onEndPage(PdfWriter writer, Document document) {

    	ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_LEFT, new Phrase("Copyright © Faculty of Dental Sciences"), 30, 30, 0); //http://www.xxxx-your_example.com/
        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("page " + document.getPageNumber()), 550, 30, 0);
    }



}