import java.awt.Color;
import javax.swing.*;


public class Main {

    static int value1 = 11; // class variable
    static int value2 = 0; // class variable
    static String operator = ""; // class variable

    public static void main(String[] args) {

//        int b = 0; // method variable
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.pink);
        frame.setBounds(900, 900, 900, 900);
        frame.setVisible(true);

        String[] optionsA = {"0","9", "8", "7", "6", "5", "4", "3", "2", "1" };
        var selection1 = JOptionPane.showOptionDialog(null, "Select number 1!", "Calculator",
                JOptionPane.INFORMATION_MESSAGE, 3, null, optionsA, optionsA[0]);


        if (selection1 == 0) {
            value1 = 0;
            System.out.println("You set a to: 0");
        }
        if (selection1 == 1) {
            value1 = 9;
            System.out.println("You set a to: 9");
        }
        if (selection1 == 2) {
            value1 = 8;
            System.out.println("You set a to: 8");
        }
        if (selection1 == 3) {
            value1 = 7;
            System.out.println("You set a to: 7");
        }
        if (selection1 == 4) {
            value1 = 6;
            System.out.println("You set a to: 6");
        }
        if (selection1 == 5) {
            value1 = 5;
            System.out.println("You set a to: 5");
        }
        if (selection1 == 6) {
            value1 = 4;
            System.out.println("You set a to: 4");
        }
        if (selection1 == 7) {
            value1 = 3;
            System.out.println("You set a to: 3");
        }
        if (selection1 == 8) {
            value1 = 2;
            System.out.println("You set a to: 2");
        }
        if (selection1 == 1) {
            value1 = 9;
            System.out.println("You set a to: " + value1);
        }


        String[] operatorsC = {"/", "x", "-", "+"};
        var selection2 = JOptionPane.showOptionDialog(null, "Select one:", "Calculator",
                JOptionPane.INFORMATION_MESSAGE, 3, null, operatorsC, operatorsC[0]);

        if (selection2 == 0) {
            operator = "/";
            System.out.println("You set operator to '/'");
        }
        if (selection2 == 1) {

            operator = "x";
            System.out.println("You set operator to 'x'");
        }
        if (selection2 == 2) {
            operator = "-";
            System.out.println("You set operator to '-'");
        }
        if (selection2 == 3) {

            operator = "+";
            System.out.println("You set operator to '+'");

        }


        String[] optionsB = {"0", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
        var selection3 = JOptionPane.showOptionDialog(null, "Select number!", "Calculator",
                JOptionPane.INFORMATION_MESSAGE, 3, null, optionsB, optionsB[0]);


        if (selection3 == 0) {
            value2 = 0;
            System.out.println("You set a to: " + value2);
        }
        if (selection3 == 1) {
            value2 = 9;
            System.out.println("You set a to: " + value2);
        }
        if (selection3 == 2) {
            value2 = 8;
            System.out.println("You set a to: " + value2);
        }
        if (selection3 == 3) {
            value2 = 7;
            System.out.println("You set a to: " + value2);
        }
        if (selection3 == 4) {
            value2 = 6;
            System.out.println("You set a to: " + value2);
        }
        if (selection3 == 5) {
            value2 = 5;
            System.out.println("You set a to: " + value2);
        }
        if (selection3 == 6) {
            value2 = 4;
            System.out.println("You set a to: " + value2);
        }
        if (selection3 == 7) {
            value2 = 3;
            System.out.println("You set a to: " + value2);
        }
        if (selection3 == 8) {
            value2 = 2;
            System.out.println("You set a to: " + value2);
        }

        if (selection1 == 9) {
            value2 = 1;
            System.out.println("You set a to: " + value2);
        }

//        System.out.println(calculator(value1, value2, operator));
        JOptionPane.showMessageDialog (null, "The result = " + (calculator(value1, value2, operator)));;
    }

    public static double calculator(int a, int b, String operator)
    {


        if ("+".equals(operator)) {
            System.out.println("You are adding");
            return a + b;
        }
        if ("-".equals(operator)) {
            System.out.println("You are subtracting");
            return a - b;
        }

        if ("*".equals(operator)) {
            System.out.println("You are multiplying");
            return a * b;
        }
        if ("/".equals(operator)) {
            System.out.println("You are dividing");
            return a / b;
        }

        return 0;
    }


}
