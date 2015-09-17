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
public class Parallelogram implements Shape{
    double l;
    double w;
    double h;
    
    public Parallelogram(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    @Override
    public double getPerimeter() {
        return 2 * (l + w);
    }

    @Override
    public double getArea() {
        return l * h;
    }
    
    @Override
    public String toString(){
        return "The area of the parallelogram is " + getArea() + " square centimetre," +
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
        if (!(o instanceof Parallelogram)) 
            return false;
        Parallelogram parallelogram = (Parallelogram) o;

        if (l != parallelogram.l) 
            return false;
        if (w != parallelogram.w) 
            return false;
        if (h != parallelogram.h) 
            return false;
        
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.l) ^ (Double.doubleToLongBits(this.l) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.w) ^ (Double.doubleToLongBits(this.w) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.h) ^ (Double.doubleToLongBits(this.h) >>> 32));
        return hash;
    }
}
