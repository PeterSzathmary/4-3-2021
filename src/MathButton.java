import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathButton extends JButton implements ActionListener
{
    JLabel mathOperationLabel;
    ResultField resultField;
    IntegerInput firstNumber;
    IntegerInput secondNumber;

    public MathButton(JLabel mathOperationLabel, ResultField resultField, IntegerInput firstNumber, IntegerInput secondNumber)
    {
        this.mathOperationLabel = mathOperationLabel;
        this.resultField = resultField;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (getText().equals("="))
        {
            double result;
            if (this.firstNumber.getText().length() > 0 && this.secondNumber.getText().length() > 0)
                switch (this.mathOperationLabel.getText())
                {
                    case "+" -> {
                        result = Integer.parseInt(this.firstNumber.getText()) + Integer.parseInt(this.secondNumber.getText());
                        this.resultField.setText(String.valueOf(result));
                    }
                    case "-" -> {
                        result = Integer.parseInt(this.firstNumber.getText()) - Integer.parseInt(this.secondNumber.getText());
                        this.resultField.setText(String.valueOf(result));
                    }
                    case "/" -> {
                        result = Double.parseDouble(this.firstNumber.getText()) / Double.parseDouble(this.secondNumber.getText());
                        this.resultField.setText(String.valueOf(result));
                    }
                    case "*" -> {
                        result = Integer.parseInt(this.firstNumber.getText()) * Integer.parseInt(this.secondNumber.getText());
                        this.resultField.setText(String.valueOf(result));
                    }
                    default -> this.resultField.setText("No Math Operation");
                }
            else if (this.firstNumber.getText().equals("") || this.firstNumber.getText().equals(""))
                this.resultField.setText("Choose Numbers");
        }
        // display + - / * according to with button was pressed
        else
        {
            this.mathOperationLabel.setText(getText());
        }
    }
}
