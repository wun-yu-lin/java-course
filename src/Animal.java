public abstract class Animal {
    protected String animal;
    public Animal(String animal){
        this.animal = animal;
    }
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}
