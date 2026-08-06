import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Simple calculator with a Swing UI.
 */
public class Calculator extends JFrame {

    private JTextField display;
    private double firstNumber = 0;
    private String operator = "";
    private boolean startNewNumber = true;

    /**
     * Constructor sets up the calculator window and buttons.
     */
    public Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField("0");
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));

        String[] buttons = {
            "C", "±", "%", "/",
            "7", "8", "9", "*",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "0", ".", "=", ""
        };

        for (String text : buttons) {
            if (text.isEmpty()) {
                buttonPanel.add(new JLabel(""));
                continue;
            }
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    /**
     * Handles button click events for the calculator.
     */
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            switch (command) {
                case "C":
                    display.setText("0");
                    firstNumber = 0;
                    operator = "";
                    startNewNumber = true;
                    break;
                case "=":
                    calculate();
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    firstNumber = Double.parseDouble(display.getText());
                    operator = command;
                    startNewNumber = true;
                    break;
                case "±":
                    display.setText(String.valueOf(-Double.parseDouble(display.getText())));
                    break;
                case "%":
                    display.setText(String.valueOf(Double.parseDouble(display.getText()) / 100));
                    break;
                default:
                    if (startNewNumber) {
                        display.setText(command);
                        startNewNumber = false;
                    } else {
                        display.setText(display.getText() + command);
                    }
            }
        }
    }

    /**
     * Performs the calculation based on the stored operator.
     */
    private void calculate() {
        double secondNumber = Double.parseDouble(display.getText());
        double result = 0;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber == 0) {
                    display.setText("Error");
                    startNewNumber = true;
                    return;
                }
                result = firstNumber / secondNumber;
                break;
        }

        display.setText(String.valueOf(result));
        startNewNumber = true;
    }

    /**
     * Main method - entry point, launches the calculator window.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
}
