public class Person {

    private String name;
    private Enum homeland;
    public Person(String name, Enum homeland){
        this.name = name;
        this.homeland = homeland;
    }

    public static void main(String[] args) {
        Person p = new Person("wunyu", Enum.AMERICAN); //使用列舉
    }
}
