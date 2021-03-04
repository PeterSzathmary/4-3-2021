import java.awt.event.KeyEvent;

public class IntegerInput extends Input
{

    public IntegerInput()
    {
        super();
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
        if (!((int) e.getKeyChar() >= 48 && (int) e.getKeyChar() <= 57 && e.getKeyCode() != KeyEvent.VK_BACK_SPACE))
            e.consume();
    }
}
