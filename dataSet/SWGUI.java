import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.util.StringTokenizer;

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
    private JTextField textField10;
    private JTextField searchTextField;
    public int counter = 0;
    public ArrayList<setMaker> swChar;

    public static void main(String[] args) {
        JFrame frame = new JFrame("SWGUI");
        frame.setContentPane(new SWGUI().salam);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public SWGUI(){
        swChar = new ArrayList();
        try {
            File swFile = new File("C:\\Users\\nirav\\Desktop\\Code\\School-Work\\dataSet\\characters.csv");
            Scanner fileInp = new Scanner(swFile);
            fileInp.nextLine();
            while(fileInp.hasNext()) {
                StringTokenizer breaker = new StringTokenizer(fileInp.nextLine(), ",");

                setMaker temp = new setMaker(breaker.nextToken(),breaker.nextToken(),breaker.nextToken(),breaker.nextToken(),breaker.nextToken(),breaker.nextToken(),breaker.nextToken(),breaker.nextToken(),breaker.nextToken(),breaker.nextToken());
                temp.displayChar();
                swChar.add(temp);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File doesn't exist on this computer");
        }
        display();

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (counter==(swChar.size()-1)){
                    counter = counter;
                } else {
                    counter = counter + 1;
                }
                display();
            }
        });
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (counter==0){
                    counter = counter;
                } else {
                    counter = counter - 1;
                }
                display();
            }
        });
    }

    public void display(){
        textField1.setText(swChar.get(counter).name);
        textField2.setText(swChar.get(counter).height);
        textField3.setText(swChar.get(counter).mass);
        textField4.setText(swChar.get(counter).hairColor);
        textField5.setText(swChar.get(counter).skinColor);
        textField10.setText(swChar.get(counter).eyeColor);
        textField6.setText(swChar.get(counter).birthYear);
        textField7.setText(swChar.get(counter).gender);
        textField8.setText(swChar.get(counter).homeworld);
        textField9.setText(swChar.get(counter).species);
    }
}




