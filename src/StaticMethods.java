public class StaticMethods {
    public int add(int x, int y){
        return x+y;
    }
    public static int addStatic(int x, int y){
        return x+y;
    }
    public static void main(String[] args) {
        //static methods 可以被 static methods 所調用
        System.out.println(addStatic(12,12));

        //other method in class need 實體化才可以使用class內methods
        StaticMethods s = new StaticMethods();
        System.out.println(s.add(12,12));
    }
}
