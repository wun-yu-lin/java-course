import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

        private static final DecimalFormat DF = new DecimalFormat("0.00");
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("please input your weight(kg):");
            double weight = scanner.nextDouble();
            System.out.print("please input your height(m):");
            double height = scanner.nextDouble();


            double bmi_value = Double.parseDouble(DF.format(weight/(height*height)) );
            System.out.println("you BMI is:"+ (bmi_value));
        }
    }