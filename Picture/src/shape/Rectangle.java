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
public class Rectangle implements Shape{
    double l;
    double w;
    
    public Rectangle(double l, double w){
        this.l = l;
        this.w = w;
    }

    @Override
    public double getPerimeter() {
        return 2 * (l + w);
    }

    @Override
    public double getArea() {
        return l * w;
    }
        
    @Override
    public String toString(){
        return "The area of the rectangle is " + getArea() + " square centimetre," +
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
        if (!(o instanceof Rectangle)) 
            return false;
        Rectangle rectangle = (Rectangle) o;

        if (l != rectangle.l) 
            return false;
        if (w != rectangle.w) 
            return false;
        
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.l) ^ (Double.doubleToLongBits(this.l) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.w) ^ (Double.doubleToLongBits(this.w) >>> 32));
        return hash;
    }
}
