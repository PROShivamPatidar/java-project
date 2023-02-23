import javax.swing.*;
class HomeDemo extends JPanel
{
	JButton b1,b2,b3;
	HomeDemo(FDemo f)
	{
		b1=new JButton("login");
		add(b1);
		b2=new JButton("registration");
		add(b2);
	    b3=new JButton("about");
		add(b3);
		b1.addActionListener(f);
		b2.addActionListener(f);
		b3.addActionListener(f);
	}
}