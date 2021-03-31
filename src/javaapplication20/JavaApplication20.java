/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Clock;
import java.time.Instant;
import java.util.Scanner;
import java.util.Timer;
/**
 *
 * @author ali
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     * @throws java.awt.AWTException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws AWTException, IOException, Exception {
        
        WindowsScreen MyWin= new WindowsScreen();
  
    }
}
        


    /*
            Toolkit T = Toolkit.getDefaultToolkit();
            Rectangle rect = new Rectangle(T.getScreenSize());
            BufferedImage Img = Rob.createScreenCapture(rect);
            File input = new File("screen-capture.png");
            boolean status = ImageIO.write(Img, "png", input);
            File output = new File("test.pdf");
            BufferedImage B = JDeli.read(input);
            PdfEncoder Enc = new PdfEncoder();
            Enc.write(B, output);
     */
