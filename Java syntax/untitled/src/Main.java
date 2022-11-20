public class Main {
    public static void main(String[] args) {
        ThrowException t1 = new ThrowException(10);
        try{
            t1.setRadius(-5);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            System.out.println("IllegalArgumentException");
        }
    }
}