import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public MapInterface(){
        Map<String, Integer> icomeMap = new HashMap<>();
        icomeMap.put("wunyu",3000);
        icomeMap.put("emma",3000);
        icomeMap.put("jili",3000);
        for(Map.Entry<String, Integer> entry:icomeMap.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
        //Lambda expression
        icomeMap.forEach((name, income)->{
            System.out.println(name+","+income);
        });
    }

    public static void main(String[] args) {
        new MapInterface();
    }
}
