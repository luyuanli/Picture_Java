/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Luyuan
 */
import org.junit.runner.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

public class RunShapeTests {

    public static void main(String[] args) {
        //the circle test results
        Result result = JUnitCore.runClasses(CircleTest.class);
        System.out.println("The CIRCLE Test Results ");
        for (Failure failure : result.getFailures()) {
            System.out.println(failure);
        }
        if (result.wasSuccessful()) {
            System.out.println("Tests finished successfully !\n");
        }
        
        //the circle test results
        result = JUnitCore.runClasses(SquareTest.class);
        System.out.println("The SQUARE Test Results ");
        for (Failure failure : result.getFailures()) {
            System.out.println(failure);
        }
        if (result.wasSuccessful()) {
            System.out.println("Tests finished successfully !\n");
        }
        
        //the rectangle test results
        result = JUnitCore.runClasses(RectangleTest.class);
        System.out.println("The RECTANGLE Test Results ");
        for (Failure failure : result.getFailures()) {
            System.out.println(failure);
        }
        if (result.wasSuccessful()) {
            System.out.println("Tests finished successfully !\n");
        }
        
        //the Parallelogram test results
        result = JUnitCore.runClasses(ParallelogramTest.class);
        System.out.println("The PAEALLELOGRAM Test Results ");
        for (Failure failure : result.getFailures()) {
            System.out.println(failure);
        }
        if (result.wasSuccessful()) {
            System.out.println("Tests finished successfully !\n");
        }
        
        //the Triangle test results
        result = JUnitCore.runClasses(TriangleTest.class);
        System.out.println("The TRIANGLE Test Results ");
        for (Failure failure : result.getFailures()) {
            System.out.println(failure);
        }
        if (result.wasSuccessful()) {
            System.out.println("Tests finished successfully !\n");
        }
    }
}

