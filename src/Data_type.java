public class Data_type {
    static void primitive(){
        int a = 1;
        int b = a;
        a = 2;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }

    static void reference(){
        int [] arr1 = {10,20,30};
        int [] arr2 = arr1;
        arr2[0] = 40;
        for (int i = 0; i<3;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for (int i = 0; i<3;i++){
            System.out.print(arr2[i]+" ");
        }
    };


    public static void main(String[] args) {
        primitive();
        reference();

    }
}
