import javax.swing.*;
import java.util.Scanner;
import java.io.File;

public class SWGUI {
    private JButton nextButton;
    private JButton previousButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JPanel salam;

    public static void main(String[] args) {
        JFrame frame = new JFrame("SWGUI");
        frame.setContentPane(new SWGUI().salam);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public SWCharOutput(){
        File swFile = new File(); // TODO
        Scanner FileInp = new Scanner(swFile); // TODO
    }

}




