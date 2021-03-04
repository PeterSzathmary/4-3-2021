import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public abstract class Input extends JTextField implements KeyListener
{
    Font font;

    public Input()
    {
        font = new Font("Courier New", Font.BOLD, 20);

        setColumns(10);
        setFont(font);
        setTransferHandler(null);
        setHorizontalAlignment(CENTER);
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e)
    {

    }

    @Override
    public void keyPressed(KeyEvent e)
    {

    }

    @Override
    public void keyReleased(KeyEvent e)
    {

    }
}
