
public class Main {
    public static void main(String[] args) {
        Student s = new Student(); //default setting
        s.hello();
        System.out.println(s.weight);
        Student s2 = new Student("wunyu",25,"taichung", "123@gmail.com",30);
        System.out.println(s2.weight);
    }

    }