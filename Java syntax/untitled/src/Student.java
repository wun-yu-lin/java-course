public class Student {
    private int age, gpa;
    private String major, name;

    public Student SetAge(int age){
        this.age = age;
        return this;
    }
    public Student SetGpa(int gpa){
        this.gpa = gpa;
        return this;
    }
    public Student SetMajor(String major){
        this.major = major;
        return this;
    }
    public Student SetName(String name){
        this.name =name;
        return this;

    }

    public static void main(String[] args) {
        Student s = new Student();
        s.SetAge(20).SetGpa(20).SetName("wunyu").SetMajor("CS");
    }
}
