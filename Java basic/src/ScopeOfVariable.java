public class ScopeOfVariable {
    //fields
    private double radius;
    public ScopeOfVariable(){
        this(1.0); //defaults setting
    }
    public ScopeOfVariable(double radius){
        //radius <= variable of scope only in methods
        //this.radius <= fields
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
}
