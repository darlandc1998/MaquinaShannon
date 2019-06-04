package utils;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public final class UtilPDF {

    public static String[] readLines(String path) throws IOException {
        
        try (PDDocument document = PDDocument.load(new File(path))) {

            document.getClass();

            if (!document.isEncrypted()) {
                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                stripper.setSortByPosition(true);

                PDFTextStripper tStripper = new PDFTextStripper();

                String pdfFileInText = tStripper.getText(document);

                return pdfFileInText.split("\\r?\\n");

            }
        }
        
        return null;
    }

}
