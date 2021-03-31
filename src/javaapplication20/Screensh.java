/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.TimerTask;
import javax.imageio.ImageIO;

/**
 *
 * @author ali
 */
public class Screensh extends TimerTask{
        private int width;
    private int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    
    
    public Rectangle Cpture(){
      Rectangle rect = new Rectangle(0, 0, getWidth(), getHeight());
      return rect;
    }
    
    public Rectangle Cpture(Toolkit t){
        Toolkit T = Toolkit.getDefaultToolkit();
        Rectangle rect = new Rectangle(T.getScreenSize());
        return rect;
    }
    
    public boolean ScreenSht(BufferedImage I, File f) throws IOException{
        boolean status= ImageIO.write(I, "png", f);
        return  status;
        
    }

    @Override
    public String toString() {
        return "Screen resolution"+ getWidth()+"*"+getHeight();
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
