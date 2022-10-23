public class Static_method {
    public static int add(int a, int b){
        return a+b;
    }

    public static void main(String args[]){
        //static method 可以直接讀取同class中的static methods
        System.out.println(add(10,20));
    }
}
