/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquareTest {
    Shape shape = new Square(3);
    
    @Test
    public void testGetPerimeter() {
        assertEquals("Test for getPerimeter: ", 12, shape.getPerimeter(), 0);
    }
    
    @Test
    public void testGetArea() {
        assertEquals("Test for getArea(): ", 9, shape.getArea(), 0);
    }
}