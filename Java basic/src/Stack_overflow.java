public class Stack_overflow {
    public static void sayHi(){
        System.out.println("Hi");
        sayHi();
    }

    public static void main(String[] args) {
        sayHi();
    }
}
