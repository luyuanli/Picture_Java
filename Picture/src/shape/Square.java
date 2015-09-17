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
public class Square implements Shape, Cloneable{
    double l;
    
    public Square(double l){
        this.l = l;
    }
    
    @Override
    public double getPerimeter(){
        return 4 * l; 
    }
    
    @Override
    public double getArea(){
        return l * l;
    }
    
    @Override
    public String toString(){
        return "The area of the square is " + getArea() + " square centimetre," +
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
        if (!(o instanceof Square)) 
            return false;
        Square square = (Square) o;

        if (l != square.l) 
            return false;
        
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.l) ^ (Double.doubleToLongBits(this.l) >>> 32));
        return hash;
    }
}