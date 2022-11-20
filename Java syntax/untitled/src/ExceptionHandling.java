import javax.swing.*;

public class ExceptionHandling {
    int age;
    String ageString;
    public ExceptionHandling(){
        ageString = JOptionPane.showInputDialog("How old are you?");
        try {
            age = Integer.parseInt(ageString);
            if (age <= 18){
                System.out.println("你未成年");
            }else {
                System.out.println("你成年了");
            }
        } catch (NumberFormatException e){
            e.printStackTrace(); //取得程式的error msg
            System.out.println("請輸入數字，不要是英文字");
        }

    }

    public static void main(String[] args) {
        new ExceptionHandling();
    }
}
