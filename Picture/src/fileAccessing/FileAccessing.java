/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileAccessing;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import shape.*;

/**
 *
 * @author Luyuan
 */
public class FileAccessing {
    public static Picture getShapes(String filePath) {
        String l;
        Scanner s;
        ArrayList<Shape> shapes = new ArrayList<>();

        try (LineNumberReader r = new LineNumberReader(new FileReader(filePath))) {
            while ((l = r.readLine()) != null) {
                int lineNumber = r.getLineNumber();
                s = new Scanner(l);
                s.useDelimiter(",\\s*");

                while (s.hasNext()) {
                    String shapeName = s.next();
                    ArrayList<Double> properties = new ArrayList<>();
                    while (s.hasNextDouble()) {
                        properties.add(s.nextDouble());
                    }
                    shapes.add(parseShapeData(shapeName, properties, lineNumber));
                }
                s.close();
            }
            
            if(shapes.isEmpty()){
                System.out.println("No shape have been imported.");
                System.exit(1);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File: " + filePath + " does not exist");
            System.exit(0);
        } catch(IOException e){
            e.printStackTrace();
        }
        
        return new Picture(shapes);
    }

    private static Shape parseShapeData(String shapeName, ArrayList<Double> properties, int lineNumber) {
        Shape shape = null;

        switch (shapeName) {
            case "triangle":
                if (properties.size() == 3) {
                    shape = new Triangle(properties.get(0), properties.get(1), properties.get(2));
                }
                break;
            case "square":
                if (properties.size() == 1) {
                    shape = new Square(properties.get(0));
                }
                break;
            case "circle":
                if (properties.size() == 1) {
                    shape = new Circle(properties.get(0));
                }
                break;
            case "rectangle":
                if (properties.size() == 2) {
                    shape = new Rectangle(properties.get(0), properties.get(1));
                }
                break;     
            case "parallelogram":
                if (properties.size() == 3) {
                    shape = new Parallelogram(properties.get(0), properties.get(1), properties.get(2));
                }
                break;  
            default:
                System.out.print("Line " + lineNumber + ": There is no shape called " + shapeName + " existed.\n");
                System.exit(1);
            
        }
        
        if(shape == null){
            System.out.println("Line " + lineNumber + ": The arguments for " + shapeName + " are incorrent.\n");
            System.exit(1);
        }
        return shape;
    }
}
