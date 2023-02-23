import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class FDemo extends JFrame implements ActionListener
{
    JButton b1,b3,b4;
    JPDemo jp1;
     CardLayout card;
     Container cn= getContentPane();
     FDemo()
{
    card=new CardLayout();
    setLayout(card);
    b1=new JButton("click...11");
    add("A",b1);
    jp1=new JPDemo();
    add("B",jp1);
    b3=new JButton("click....333");
    add("C",b3);
    b4=new JButton("click..444");
    add("D",b4);
    b1.addActionListener(this);
    jp1.b1.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
    card.next(cn);
}
class Demo23
{
    public static void main(String ar[])
    {
        FDemo f=new FDemo();
        f.setVisible(true);
        f.setBounds(100,100,500,500);
    }
}
}