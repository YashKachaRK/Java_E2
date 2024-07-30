
class Shape{
	//Square
	double area (double side){
		return side * side ; 
	}
	//Rectangle 
	double area(double length , double width){
		return length * width ; 
	}
	// Circle
	 double area(double radius, boolean isCircle) {
        if (isCircle) {
            return Math.PI * radius * radius;
        } else {
            throw new IllegalArgumentException("Invalid parameters for circle area calculation.");
        }
    }
}

public class P4_2{
	
	public static void main(String[] arg){
		
		Shape shape = new Shape ();
		
		double squareSide = 5.0;
        System.out.println("Area of the square: " + shape.area(squareSide));
		
		double l = 10.0;
		double w = 4.03;
		System.out.println("Area of the Rectengle: "+shape.area(l,w));
		
		double r = 3.2;
		System.out.println("Area of Circle: "+shape.area(r,true));
	}
}