import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SW_Menu{
    private static JComboBox<String> comboBox1;
    private JPanel salam2;
    private static ArrayList<String> swName;

    public static void main(String[] args) {
        JFrame frame = new JFrame("SW_Menu");
        frame.setContentPane(new SW_Menu().salam2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        try {
            File swFile = new File("C:\\Users\\nirav\\Desktop\\Code\\School-Work\\dataSet\\characters.csv");
            Scanner fileInp = new Scanner(swFile);
            fileInp.nextLine();
            while (fileInp.hasNext()) {
                StringTokenizer breaker = new StringTokenizer(fileInp.nextLine(), ",");

                String temp = breaker.nextToken();
                breaker.nextToken();
                breaker.nextToken();
                breaker.nextToken();
                breaker.nextToken();
                breaker.nextToken();
                breaker.nextToken();
                breaker.nextToken();
                breaker.nextToken();
                breaker.nextToken();

                swName.add(temp);

                comboBox1.setModel(null);
            }
            fileInp.close();
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist on this computer");
        }
    }
}
