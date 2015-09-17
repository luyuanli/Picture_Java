/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileAccessing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Luyuan
 */
public class FileAcceessingTest {  
    Picture picture = FileAccessing.getShapes("App_Data\\ShapeData.txt");

    @Test
    public void testGetMinArea() {
        assertEquals("Test for getMinArea(): ", 6, picture.getMinArea(), 0.00);
    }

    @Test
    public void testGetMaxPerimeter() {
        assertEquals("Test for getMaxPerimeter(): ", 31.42, picture.getMaxPerimeter(), 0.005);
    }
}
