import java.util.ArrayList;

public class ConcurrentException {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i<30; i++){
            arr.add(i);
        }
        for (int k: arr){
            if (k==15){
                arr.add(k);
            }
        }
    }
}
