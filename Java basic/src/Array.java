import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        //array 不可調整array長度，需要修改就要建立新的array
        String[] arr = {"A","B","C"};
        System.out.println(arr[0]);

        String[] arr1 = new String[10];
        arr1[0] = "wunyu"; //填入數值
        System.out.println(arr1[0]);

        //create 2D array
        int[][] my2Darray = new int[10][10]; //建立10*10的array



        //arrayList 可以調整array的長度
        ArrayList<String> arrlist = new ArrayList<>();
        arrlist.add("wunyu");
        arrlist.add("emma");
        System.out.println(arrlist.size());
        System.out.println(arrlist.get(1));
        //Common methods add(), get(), size(), Collections.sort()

        //對arrayList排序
        Collections.sort(arrlist);
        System.out.println(arrlist);
    }
}
