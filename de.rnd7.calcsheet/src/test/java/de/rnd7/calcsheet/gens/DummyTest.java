package de.rnd7.calcsheet.gens;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.File;

public class DummyTest {
    @Test
    public void testName() throws Exception {
        // Create a document and add a page to it
        PDDocument document = new PDDocument();
        PDPage page = new PDPage();
        document.addPage(page);

        // Create a new font object selecting one of the PDF base fonts
        PDFont font = PDType1Font.COURIER;

        // Start a new content stream which will "hold" the to be created content
        PDPageContentStream contentStream = new PDPageContentStream(document, page);

        // Define a text content stream using the selected font, moving the cursor and drawing the text "Hello World"
        contentStream.beginText();
        contentStream.setFont(font, 14);
        contentStream.newLineAtOffset(100, 700);
        contentStream.showText("15 + 8 =");
        contentStream.endText();
        contentStream.setStrokingColor(Color.GRAY);
        contentStream.setLineWidth(1);
        contentStream.moveTo(100, 690);
        contentStream.lineTo(500, 690);
        contentStream.stroke();

        // Make sure that the content stream is closed:
        contentStream.close();

        // Save the results and ensure that the document is properly closed:
        document.save(new File("Hello World.pdf"));
        document.close();
    }
}
