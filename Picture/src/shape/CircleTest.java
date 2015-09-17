/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import static org.junit.Assert.*;
import org.junit.Test;

public class CircleTest {
    Shape shape = new Circle(3);
    
    @Test
    public void testGetPerimeter() {
        assertEquals("Test for getPerimeter: ", 18.85, shape.getPerimeter(), 0.005);
    }
    
    @Test
    public void testGetArea() {
        assertEquals("Test for getArea(): ", 28.27, shape.getArea(), 0.005);
    }
}