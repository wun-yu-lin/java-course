public class Constructor_circle {
    public double  radius;

    // Constructor_circle constructor for init property value of this class
    //can not have any return type
    public Constructor_circle(){
        //init
        System.out.println("constructor circle class have new instantiation");
        radius = 0.5; //setting default radius value
    }

    public Constructor_circle(double newRadius){
        //init
        System.out.println("constructor circle class have new instantiation");
        radius = newRadius;
    }

}
