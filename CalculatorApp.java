// cd "Calculator App"
// javac CalculatorApp.java
// java CalculatorApp

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApp extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton btnClearAll, btnPercent, btnSqrt, btnSin, btnCos, btnTan;
    private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private JButton btnAdd, btnSub, btnMul, btnDiv, btnEqual, btnDecimal;
    private double num1 = 0, num2 = 0, result = 0;
    private char operator = ' ';
    private boolean decimal = false;
    
    public CalculatorApp() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        
        textField = new JTextField();
        textField.setEditable(false);
        
        btnClearAll = new JButton("C");
        btnClearAll.setActionCommand("ClearAll");
        btnClearAll.addActionListener(this);
        
        btnPercent = new JButton("%");
        btnPercent.setActionCommand("Percent");
        btnPercent.addActionListener(this);
        
        btnSqrt = new JButton("sqrt");
        btnSqrt.setActionCommand("Sqrt");
        btnSqrt.addActionListener(this);
        
        btnSin = new JButton("sin");
        btnSin.setActionCommand("Sin");
        btnSin.addActionListener(this);
        
        btnCos = new JButton("cos");
        btnCos.setActionCommand("Cos");
        btnCos.addActionListener(this);
        
        btnTan = new JButton("tan");
        btnTan.setActionCommand("Tan");
        btnTan.addActionListener(this);
        
        btn0 = new JButton("0");
        btn0.setActionCommand("0");
        btn0.addActionListener(this);
        
        btn1 = new JButton("1");
        btn1.setActionCommand("1");
        btn1.addActionListener(this);
        
        btn2 = new JButton("2");
        btn2.setActionCommand("2");
        btn2.addActionListener(this);
        
        btn3 = new JButton("3");
        btn3.setActionCommand("3");
        btn3.addActionListener(this);
        
        btn4 = new JButton("4");
        btn4.setActionCommand("4");
        btn4.addActionListener(this);
        
        btn5 = new JButton("5");
        btn5.setActionCommand("5");
        btn5.addActionListener(this);
        
        btn6 = new JButton("6");
        btn6.setActionCommand("6");
        btn6.addActionListener(this);
        
        btn7 = new JButton("7");
        btn7.setActionCommand("7");
        btn7.addActionListener(this);
        
        btn8 = new JButton("8");
        btn8.setActionCommand("8");
        btn8.addActionListener(this);
        
        btn9 = new JButton("9");
        btn9.setActionCommand("9");
        btn9.addActionListener(this);
        
        btnDecimal = new JButton(".");
        btnDecimal.setActionCommand(".");
        btnDecimal.addActionListener(this);
        
        btnAdd = new JButton("+");
        btnAdd.setActionCommand("+");
        btnAdd.addActionListener(this);
        
        btnSub = new JButton("-");
        btnSub.setActionCommand("-");
        btnSub.addActionListener(this);
        
        btnMul = new JButton("*");
        btnMul.setActionCommand("*");
        btnMul.addActionListener(this);
        
        btnDiv = new JButton("/");
        btnDiv.setActionCommand("/");
        btnDiv.addActionListener(this);
        
        btnEqual = new JButton("=");
        btnEqual.setActionCommand("=");
        btnEqual.addActionListener(this);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));
        panel.add(btnClearAll);
        panel.add(btnPercent);
        panel.add(btnSqrt);
        panel.add(btnSin);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(btnDiv);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btnMul);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btnSub);
        panel.add(btn0);
        panel.add(btnDecimal);
        panel.add(btnEqual);
        panel.add(btnAdd);
        
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(textField, BorderLayout.NORTH);
        contentPane.add(panel, BorderLayout.CENTER);

        JPanel mainPanel = (JPanel) getContentPane();
        mainPanel.setBackground(new Color(0xADD8E6));

    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("ClearAll")) {
            textField.setText("");
            num1 = 0;
            num2 = 0;
            result = 0;
            operator = ' ';
            decimal = false;
        } else if (command.equals("Percent")) {
            num1 = Double.parseDouble(textField.getText());
            result = num1 / 100;
            textField.setText(Double.toString(result));
            num1 = result;
            decimal = false;
        } else if (command.equals("Sqrt")) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.sqrt(num1);
            textField.setText(Double.toString(result));
            num1 = result;
            decimal = false;
        } else if (command.equals("Sin")) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.sin(num1);
            textField.setText(Double.toString(result));
            num1 = result;
            decimal = false;
        } else if (command.equals("Cos")) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.cos(num1);
            textField.setText(Double.toString(result));
            num1 = result;
            decimal = false;
        } else if (command.equals("Tan")) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.tan(num1);
            textField.setText(Double.toString(result));
            num1 = result;
            decimal = false;
        } else if (command.equals("0")) {
            if (!textField.getText().equals("0")) {
                textField.setText(textField.getText() + "0");
            }
        } else if (command.equals("1")) {
            if (textField.getText().equals("0")) {
                textField.setText("1");
            } else {
                textField.setText(textField.getText() + "1");
            }
        } else if (command.equals("2")) {
            if (textField.getText().equals("0")) {
                textField.setText("2");
            } else {
                textField.setText(textField.getText() + "2");
            }
        } else if (command.equals("3")) {
            if (textField.getText().equals("0")) {
                textField.setText("3");
            } else {
                textField.setText(textField.getText() + "3");
            }
        } else if (command.equals("4")) {
            if (textField.getText().equals("0")) {
                textField.setText("4");
            } else {
                textField.setText(textField.getText() + "4");
            }
        } else if (command.equals("5")) {
            if (textField.getText().equals("0")) {
                textField.setText("5");
            } else {
                textField.setText(textField.getText() + "5");
            }
        } else if (command.equals("6")) {
            if (textField.getText().equals("0")) {
                textField.setText("6");
            } else {
                textField.setText(textField.getText() + "6");
            }
        } else if (command.equals("7")) {
            if (textField.getText().equals("0")) {
                textField.setText("7");
            } else {
                textField.setText(textField.getText() + "7");
            }
        } else if (command.equals("8")) {
            if (textField.getText().equals("0")) {
                textField.setText("8");
            } else {
                textField.setText(textField.getText() + "8");
            }
        } else if (command.equals("9")) {
            if (textField.getText().equals("0")) {
                textField.setText("9");
            } else {
                textField.setText(textField.getText() + "9");
            }
        } else if (command.equals(".")) {
            if (!decimal) {
                textField.setText(textField.getText() + ".");
                decimal = true;
            }
        } else if (command.equals("+")) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
            decimal = false;
        } else if (command.equals("-")) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
            decimal = false;
        } else if (command.equals("*")) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
            decimal = false;
        } else if (command.equals("/")) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
            decimal = false;
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    textField.setText(Double.toString(result));
                    num1 = result;
                    decimal = false;
                    break;
                case '-':
                    result = num1 - num2;
                    textField.setText(Double.toString(result));
                    num1 = result;
                    decimal = false;
                    break;
                case '*':
                    result = num1 * num2;
                    textField.setText(Double.toString(result));
                    num1 = result;
                    decimal = false;
                    break;
                case '/':
                    if (num2 == 0) {
                        textField.setText("Error");
                    } else {
                        result = num1 / num2;
                        textField.setText(Double.toString(result));
                        num1 = result;
                        decimal = false;
                    }
                    break;
            }
        }
    }

    public static void main(String[] args) {
        CalculatorApp app = new CalculatorApp();
        app.setVisible(true);
    }
}