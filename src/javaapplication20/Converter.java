/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import com.idrsolutions.image.JDeli;
import com.idrsolutions.image.pdf.PdfEncoder;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author ali
 */
public class Converter {
    public void pdfConverter(File a, File b) throws IOException, Exception{
        BufferedImage B = JDeli.read(a);
        PdfEncoder Enc = new PdfEncoder();
        Enc.write(B, b);
    }
}
