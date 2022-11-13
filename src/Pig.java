public class Pig extends Animal{
    public Pig(){
        super("Pig");
    }
    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}
