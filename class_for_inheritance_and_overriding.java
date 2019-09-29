/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherit_and_override;

/**
 *
 * @author Carla Jane Mabutol
 * BSIT 2101
 */
public class class_for_inheritance_and_overriding {
   
    static class Rectangle2{
        
        public int l, w, area;
        public Rectangle2(int l, int w){
            this.l=l;
            this.w=w;
        }
        public int getLength(){
            return l;
        }
        public int getWidth(){
            return w;
        }
        public int getArea(){
            area=l*w;   //area of rectangle in 2D
            return area;
        }        
    }
    //end of parent class Rectangle2
    
    static class Box extends Rectangle2{
        private int h;
        
        public  Box(int l, int w, int h){
            super(l,w);    // super class constructor of Rectangle2 Class
            this.h=h;
        }
        public int getHeight(){
            return h;
        }
        public int getArea(){
            area=2*l*w+2*w*h+2*l*h;     //surface area of the box in 3D
            return area;
        }
        public String toString(){
            return " [Box: length = " +l+ " width = " +w+ " height = " +h+ "]\n" ;
        }
        public boolean equals(Object obj){  //overriding equals() method
            if (this==obj) 
                return true;
            if (obj==null)
                return false;
            if (this.getClass() !=obj.getClass())
                return false;
            
            Box other = (Box)obj;
            
            if(this.l!=other.l)     //condition to test equality of length or l 
                return false;
            if(this.h!=other.h)     //condition to test equality of height or h 
                return false;
            if(this.w!=other.w)     //condition to test equality of width or w 
                return false;
            if(this.area!=other.area)       //condition to test equality of area or surface area of the Box 
                return false;
            return true;
        }      
    }
    // end of sub class Box
    
    static class Triangle2{
        
        public double base, height, area;
        
        public double getBase(){
            return base;
        }
        public double getheight(){
            return height;
        }
        public double getArea(){
            area=(base*height)/2;     //area of triangle
            return area;
        }
        
    }
    // end of parent class Triangle2
    
   static class IsoscelesRight extends Triangle2{
        private double equalside;
        private double notequalside;
        
        public IsoscelesRight(double equalsize){        
            this.height=equalsize;      //the tow equal side of the isosceles right triangle is the base and height
            this.base=equalsize;
            this.equalside=equalsize;
        }
        
        public double getEqualSide(){
            return equalside;          
        }
        public double getNotEqualSide(){
            notequalside=equalside*Math.sqrt(2.0);      //formula in getting the 3rd side of the isosceles right triangle
            return notequalside;
        }
        public String toString(){
            return " [IsoscelesRight: equal_size = " +equalside+ ", not_equal_size = " + getNotEqualSide() + "] ";
        }
        public boolean equals(Object obj){
            if (this==obj) 
                return true;
            if (obj==null)
                return false;
            if (this.getClass() !=obj.getClass())
                return false;
            
            IsoscelesRight other = (IsoscelesRight)obj;
            
            if(this.getEqualSide()!=other.getEqualSide())
                //condition to test equality of the equal side
                
                return false;
            
            return true;
        }        
    }
   // end of sub class IsoscelesRight
   
    public static void main(String[] args){
        
        System.out.print("Box a: ");
        Box myRect =new Box(2,3,4);
        System.out.print(myRect.toString());
        System.out.print("Box a has a surface area: ");
        System.out.println(myRect.getArea());
        
        System.out.print("Box b: ");
        Box myRect2 =new Box(4,7,4);
        System.out.print(myRect2.toString());
        System.out.print("Box b has a surface area: ");
        System.out.println(myRect2.getArea());
        
        System.out.print("Check if Box a and Box b are equal? ");
        System.out.println(myRect.equals(myRect2));
        
        System.out.print("IsoscelesRight c: ");
        IsoscelesRight myTri = new IsoscelesRight(3);
        System.out.println(myTri.toString());
        System.out.print("IsoscelesRight c area: ");
        System.out.println(myTri.getArea());
        
        System.out.print("IsoscelesRight d: ");
        IsoscelesRight myTri2 = new IsoscelesRight(3);
        System.out.println(myTri2.toString());
        System.out.print("IsoscelesRight d area: ");
        System.out.println(myTri2.getArea());
        
        System.out.print("Check if IsoscelesRight c and IsoscelesRight d are equal? ");
        System.out.println(myTri.equals(myTri2));
        
    }
}
