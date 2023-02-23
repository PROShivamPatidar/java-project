import javax.swing.*;
import java.awt.event.*;
class JPDemo extends JPanel 
{
    JTextField tx1,tx2;
    JButton b1;
    JPDemo()
    {
        tx1=new JTextField(10);
        add(tx1);
        tx2=new JTextField(10);
        add(tx2);
        b1=new JButton("login..");
        add(b1);
    }
}