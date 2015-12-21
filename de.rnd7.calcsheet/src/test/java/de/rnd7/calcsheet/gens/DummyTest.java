package de.rnd7.calcsheet.gens;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Rectangle;
import java.io.IOException;

import org.junit.Test;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class DummyTest {
	@Test
	public void testName() throws Exception {
		// Create a document and add a page to it
		PDDocument document = new PDDocument();
		PDPage page = new PDPage();
		document.addPage( page );

		// Create a new font object selecting one of the PDF base fonts
		PDFont font = PDType1Font.COURIER;

		// Start a new content stream which will "hold" the to be created content
		PDPageContentStream contentStream = new PDPageContentStream(document, page);

		// Define a text content stream using the selected font, moving the cursor and drawing the text "Hello World"
		contentStream.beginText();
		contentStream.setFont( font, 14 );
		contentStream.newLineAtOffset( 100, 700 );
		contentStream.showText( "15 + 8 =" );
		contentStream.endText();
		contentStream.setStrokingColor(Color.GRAY);
		contentStream.setLineWidth(1);
		contentStream.moveTo(100, 690);
		contentStream.lineTo(500, 690);
		contentStream.stroke();
		
		int startX = 20;
		int startY = 30;
		int width = 40;
		int height = 50;
		Color color = Color.BLUE;
		// Draw a blue filled rectangle
//		drawRect(contentStream, color, new java.awt.Rectangle(startX, startY, width, height), false);
		
		// Make sure that the content stream is closed:
		contentStream.close();

		// Save the results and ensure that the document is properly closed:
		document.save( "Hello World.pdf");
		document.close();
	}
	
//	void drawRect(PDPageContentStream content, Color color, Rectangle rect, boolean fill) throws IOException {
//	    content.addRect(rect.x, rect.y, rect.width, rect.height);
//	    if (fill) {
//	        content.setNonStrokingColor(color);
//	        content.fill();
//	    } else {
//	        content.setStrokingColor(color);
//	        content.stroke();
//	    }
//	}
}
