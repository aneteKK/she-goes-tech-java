import javax.swing.*;


        public class Main {

            public static void main(String[] args) {

                String[] optionsA = {"0", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
                var selection1 = JOptionPane.showOptionDialog(null, "Select one:", "What do you want to do?",
                        JOptionPane.INFORMATION_MESSAGE, 3, null, optionsA, optionsA[0]);


                if (selection1 == 0) {
                    int a = 0;
                    System.out.println("You set a to: 0");
                }
                if (selection1 == 1) {
                    int a = 9;
                    System.out.println("You set a to: 9");
                }
                if (selection1 == 2) {
                    int a = 8;
                    System.out.println("You set a to: 8");
                }
                if (selection1 == 3) {
                    int a = 7;
                    System.out.println("You set a to: 7");
                }
                if (selection1 == 4) {
                    int a = 6;
                    System.out.println("You set a to: 6");
                }
                if (selection1 == 5) {
                    int a = 5;
                    System.out.println("You set a to: 5");
                }
                if (selection1 == 6) {
                    int a = 4;
                    System.out.println("You set a to: 4");
                }
                if (selection1 == 7) {
                    int a = 3;
                    System.out.println("You set a to: 3");
                }
                if (selection1 == 8) {
                    int a = 2;
                    System.out.println("You set a to: 2");
                }
                //if (selection1 == 9) {
                //  int a = 1;
                //System.out.println("You set a to: " a );
                //}


                String[] operatorsC = {"/", "x", "-", "+"};
                var selection2 = JOptionPane.showOptionDialog(null, "Select one:", "What do you want to do?",
                        JOptionPane.INFORMATION_MESSAGE, 3, null, operatorsC, operatorsC[0]);

                if (selection2 == 0) {
                    String operator = "/";
                    System.out.println("You set operator to '/'");
                }
                if (selection2 == 1) {
                    String operator = "x";
                    System.out.println("You set operator to 'x'");
                }
                if (selection2 == 2) {
                    String operator = "-";
                    System.out.println("You set operator to '-'");
                }
                if (selection2 == 3) {
                    String operator = "+";
                    System.out.println("You set operator to '+'");

                }


                String[] optionsB = {"0", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
                var selection3 = JOptionPane.showOptionDialog(null, "Select one:", "What do you want to do?",
                        JOptionPane.INFORMATION_MESSAGE, 3, null, optionsB, optionsB[0]);


                if (selection3 == 0) {
                    int b = 0;
                    System.out.println("You set a to: 0");
                }
                if (selection3 == 1) {
                    int b = 9;
                    System.out.println("You set a to: 9");
                }
                if (selection3 == 2) {
                    int b = 8;
                    System.out.println("You set a to: 8");
                }
                if (selection3 == 3) {
                    int b = 7;
                    System.out.println("You set a to: 7");
                }
                if (selection3 == 4) {
                    int b = 6;
                    System.out.println("You set a to: 6");
                }
                if (selection3 == 5) {
                    int b = 5;
                    System.out.println("You set a to: 5");
                }
                if (selection3 == 6) {
                    int b = 4;
                    System.out.println("You set a to: 4");
                }
                if (selection3 == 7) {
                    int b = 3;
                    System.out.println("You set a to: 3");
                }
                if (selection3 == 8) {
                    int b = 2;
                    System.out.println("You set a to: 2");
                }

                //if (selection1 == 9) {
                //  int a = 1;
                //System.out.println("You set a to: " a );
                //}

                System.out.println(calculator(optionsA,optionsB,String operatorsC ));
            }
            public static double calculator(int a, int b, String operator) {


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
                if (operator == "%") {
                    return a % b;
                }
                return 0;
            }
        }