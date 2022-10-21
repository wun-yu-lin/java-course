public class Method_overloading {
    public void Main(){}
    public void addition(int a){
        System.out.println(a);
    }
    public void addition(String a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        Method_overloading m = new Method_overloading();
        //method overload by different parameter
        m.addition(1);
        m.addition("hello");
    }
}
