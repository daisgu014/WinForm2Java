import javax.swing.*;
import java.awt.*;

public class Bai2 {
    public static void Calculator(){
        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 300);
        frame.setLayout(null);
        JLabel num1Label = new JLabel("Num 1:");
        num1Label.setBounds(10,50,200,30);
        JTextField num1Field = new JTextField(30);
        num1Field.setBounds(150,50,200,30);
        JLabel num2Label = new JLabel("Num 2:");
        num2Label.setBounds(10,80,200,30);
        JTextField num2Field = new JTextField(30);
        num2Field.setBounds(150,80,200,30);
        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(10,110,100,30);
        JTextField resultField = new JTextField("",30);
        resultField.setEnabled(false);
        resultField.setDisabledTextColor(Color.BLACK);
        resultField.setBounds(150,110,200,30);
        JButton addButton = new JButton("+");
        addButton.setBounds(80,200,50,40);
        JButton subtractButton = new JButton("-");
        subtractButton.setBounds(140,200,50,40);
        JButton multiplyButton = new JButton("*");
        multiplyButton.setBounds(200,200,50,40);
        JButton divideButton = new JButton("/");
        divideButton.setBounds(260,200,50,40);
        frame.add(num1Label);
        frame.add(num1Field);
        frame.add(num2Label);
        frame.add(num2Field);
        frame.add(resultLabel);
        frame.add(resultField);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(divideButton);
        addButton.addActionListener(e -> {
            try {
                // get the numbers from the JTextFields
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 + num2;
                resultField.setText(Double.toString(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Giá trị không hợp lệ! Vui lòng nhập số khác. ");
            }
        });

        subtractButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 - num2;
                resultField.setText(Double.toString(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Giá trị không hợp lệ! Vui lòng nhập số khác.");
            }
        });

        multiplyButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 * num2;
                resultField.setText(Double.toString(result));
            } catch (NumberFormatException ex) {JOptionPane.showMessageDialog(frame, "Giá trị không hợp lệ! Vui lòng nhập số khác.");
            }
        });

        divideButton.addActionListener(e -> {
            try {
                // get the numbers from the JTextFields
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());

                if (num2 == 0) {
                    throw new ArithmeticException("Không thể chia cho 0, vui lòng nhập số khác");
                }
                double result = num1 / num2;
                resultField.setText(Double.toString(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Giá trị không hợp lệ! Vui lòng nhập số khác");
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(frame, "Không thể chia cho 0, vui lòng nhập số khác");
            }
        });

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        Calculator();
    }
}
