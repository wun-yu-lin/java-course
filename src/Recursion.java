public class Recursion {
    public static void sayHi(int i){
        if (i == 0){return;}
        //此區程式碼在recursion時被執行
        System.out.println("Hi we are enter sayHi:" + i);

        sayHi(i-1);
        //此程式碼在recursion時，不會被執行，會形成call stack的結構，當recursion結束時，會從call stack中取出methods執行
        System.out.println("Hi we finish running sayHi:" + i);
    }

    public static void main(String[] args) {
        int i = 10;
        sayHi(10);

    }

}
