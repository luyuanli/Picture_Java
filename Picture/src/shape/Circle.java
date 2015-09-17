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

public class Circle implements Shape, Cloneable{
    double r;
    
    public Circle(double r){
        this.r = r;
    }
    
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * r; 
    }
    
    @Override
    public double getArea(){
        return Math.PI * r * r;
    }
    
    @Override
    public String toString(){
        return "The area of the cirlce is " + getArea() + " square centimetre," +
               " and its perimeter is " + getPerimeter() + " centimeter.\n";
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) 
            return true;
        if (!(o instanceof Circle)) 
            return false;
        Circle circle = (Circle) o;

        if (r != circle.r) 
            return false;
        
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.r) ^ (Double.doubleToLongBits(this.r) >>> 32));
        return hash;
    }
}