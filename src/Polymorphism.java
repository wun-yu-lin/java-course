import java.util.ArrayList;

public class Polymorphism {
    public static void main(String[] args) {

        //polymorphism 多型，能夠declare parent class People 變數，將變數裝在 subclass中做使用
        People s1 = new Student("wunyu", 25, "tachung","123@gmail",50);
        People s2 = new Student("jili", 25, "tachung","123@gmail",50);
        People s3 = new Student("gulu", 25, "tachung","123@gmail",50);

        ArrayList<People> people = new ArrayList<>();
        people.add(s1);
        people.add(s2);
        people.add(s3);
        for (int i = 0; i<people.size();i++){
            System.out.println(people.get(i).name);
        }

    }


}
