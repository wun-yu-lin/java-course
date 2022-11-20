import java.security.PublicKey;

public class Methods {
    public void sayHello(){
        System.out.println("Hello!");
    }
    //parameter list (formal parameter)
    public int multiply(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Methods m = new Methods();
        System.out.println(m.multiply(2,3));
        m.sayHello();
    }
}
