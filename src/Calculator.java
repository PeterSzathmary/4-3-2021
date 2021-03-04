import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

public class Calculator
{
    Window window;
    JPanel jPanel;
    IntegerInput firstNumber;
    IntegerInput secondNumber;
    JLabel mathOperationLabel;

    MathButton[] mathButtons;

    ResultField resultField;

    JButton clearButton;

    public Calculator()
    {
        char[] mathOperations = {'+', '-', '/', '*', '='};

        ///////////////////////////////////////////////////////////

        window = new Window();
        jPanel = new JPanel();

        firstNumber = new IntegerInput();
        secondNumber = new IntegerInput();

        mathOperationLabel = new JLabel("");
        mathOperationLabel.setFont(new Font("Courier New", Font.BOLD, 20));
        mathOperationLabel.setSize(40, 20);

        mathButtons = new MathButton[mathOperations.length];

        resultField = new ResultField();

        for (int i = 0; i < mathButtons.length; i++)
        {
            mathButtons[i] = new MathButton(mathOperationLabel, resultField, firstNumber, secondNumber);
            mathButtons[i].setFont(new Font("Courier New", Font.BOLD, 20));
            mathButtons[i].setText(String.valueOf(mathOperations[i]));
        }

        clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Courier New", Font.BOLD, 20));
        clearButton.addActionListener(e -> {
            firstNumber.setText("");
            secondNumber.setText("");
            resultField.setText("");
        });

        ///////////////////////////////////////////////////////////

        jPanel.add(firstNumber);
        jPanel.add(mathOperationLabel);
        jPanel.add(secondNumber);

        for (JButton mathButton : mathButtons)
        {
            jPanel.add(mathButton);
        }

        jPanel.add(resultField);

        jPanel.add(clearButton);

        window.add(jPanel);
        window.setVisible(true);
    }
}
