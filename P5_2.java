class Box{
    double l , b , h; 
    public Box(double l , double b , double h){
        this.l = l ;
        this.b = b; 
        this.h = h;

    }

    public void volume (){
        double volume = l * b * h;
        System.out.println(volume);
    }


}

public class P5_2 {
    public static void main(String[] args) {

        Box b = new Box(14.2, 1.2, 10.2);
        b.volume();
        
    }
}
