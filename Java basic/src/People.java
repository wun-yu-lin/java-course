public class People {
    protected String name;
    protected int age;
    protected String address;
    protected String email;
    protected double weight;

    //default constructor
    public People(){
        //default setting
        this.name = "wunyu";
        this.age = 26;
        this.address = "Taichung";
        this.email = "123@gmail.com";
        this.weight = 60;

    }

    public People(String name, int age, String address, String email, double weight){
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.weight = weight;
    }
    public void hello(){
        System.out.println("Hello");
    }
}
