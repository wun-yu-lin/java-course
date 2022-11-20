public class Student extends People{
    public Student(){
        //no super keyword ==> follow student default constructor setting
    }
    public Student(String name, int age, String address, String email, double weight) {
        super(name, age, address, email, weight);
    }
}
