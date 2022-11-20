import javax.swing.*;
import java.util.Locale;

public class Vaccine_program {
    public static void main(String[] args) {
      String vaccineInput = JOptionPane.showInputDialog("Please input vaccine name (containing: AZ, BNT, Moderna, Janssen):");
      vaccineInput = vaccineInput.toLowerCase();
        System.out.println(vaccineInput);

        if (vaccineInput.equals("az")){
            JOptionPane.showMessageDialog(null, "AZ\n研發國:英國、瑞典\n疫苗類型:腺病毒疫苗");
        } else if (vaccineInput.equals(("bnt"))) {
            JOptionPane.showMessageDialog(null, "bnt\n研發國:德國、美國\n疫苗類型:mRNA疫苗");
        }else{
            JOptionPane.showMessageDialog(null,"please input correct english name of vaccine.");
        }

    }
}
