/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileAccessing;

import java.util.ArrayList;
import java.util.Objects;

import shape.Circle;
import shape.Shape;

/**
 *
 * @author Luyuan
 */
public class Picture {
    protected ArrayList<Shape> picture;
    
    public Picture(ArrayList<Shape> shapes){
        this.picture = shapes;
    }
    
    interface Total{
        double sum(ArrayList<Shape> shape);
    }
    
    Total getTotalArea = picutre ->{
        double totalArea = 0;
        for(Shape d : picutre)
            totalArea += d.getArea();
        return totalArea;
    };
    
    Total getTotalPerimeter = picutre ->{
        double totalPerimeter = 0;
        for(Shape d : picutre)
            totalPerimeter += d.getPerimeter();
        return totalPerimeter;
    };

    public double getTotalArea(){
        return getTotalArea.sum(picture);
    }
    
    public double getTotalPerimeter(){
        return getTotalPerimeter.sum(picture);
    }
    
    @Override
    public String toString(){
        return "Total Area: " + getTotalArea() + "\nTotal Perimeter: " + getTotalPerimeter();
    }
    
    @SuppressWarnings("unchecked")
	@Override
    public Object clone() throws CloneNotSupportedException {
        Picture clone = (Picture)super.clone();
        clone.picture = (ArrayList<Shape>)picture.clone();
        return clone;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) 
            return true;
        if (!(o instanceof Circle)) 
            return false;
        Picture p = (Picture) o;
        for(int i = 0; i < p.picture.size(); i++)
            if(!picture.get(i).equals(p.picture.get(i)))
                return false;
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.picture);
        hash = 53 * hash + Objects.hashCode(this.getTotalArea);
        hash = 53 * hash + Objects.hashCode(this.getTotalPerimeter);
        return hash;
    }
    
    double getMinArea(){
        double minArea = picture.get(0).getArea();
        for(Shape s: picture){
            if(minArea > s.getArea())
                minArea = s.getArea();
        }
        return minArea;
    }
    
    double getMaxPerimeter(){
        double maxPerimeter = 0;
        for(Shape s: picture){
            if(maxPerimeter < s.getPerimeter())
                maxPerimeter = s.getPerimeter();
        }
        return maxPerimeter;
    }
}
