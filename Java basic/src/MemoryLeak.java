public class MemoryLeak {


    public static void main(String[] args) {
        People p1 = new People("emma", 26, "Taichung", "123@gmail.com", 30);
        People p2 = new People("wunyu", 26, "Taichung", "123@gmail.com", 20);

        p1 = p2;
        System.out.println(p1.name);
        System.out.println(p1);
        System.out.println(p2.name);
        p1 = new People("emma", 26, "Taichung", "123@gmail.com", 30);
        System.out.println(p1.name);
        System.out.println(p1);
    }


}
