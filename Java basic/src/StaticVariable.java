public class StaticVariable {
    public static double PI=3.14;
    public double radius ;
    public StaticVariable(){
        this(1.0);
    }
    public StaticVariable(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return StaticVariable.PI* Math.pow(this.radius,2);
    }
}
