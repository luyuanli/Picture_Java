/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileAccessing;

import org.junit.runner.*;
import org.junit.runner.notification.Failure;

/**
 *
 * @author Luyuan
 */
public class RunFileAccessing {

    public static void main(String[] args) {
        Result result1 = JUnitCore.runClasses(FileAcceessingTest.class);
        System.out.print("The File Accessing Test Results \n");
        for (Failure failure : result1.getFailures()) {
            System.out.println(failure);
        }
        if (result1.wasSuccessful()) {
            System.out.println("Tests finished successfully !");
        }
    }
}
