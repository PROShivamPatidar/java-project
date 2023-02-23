import javax.swing.*;
class LoginDemo extends JPanel
{
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2;
	LoginDemo(FDemo f)
	{

	    t1=new JTextField(10);
		add(t1);	    
		t2=new JPasswordField(10);
		add(t2);
		b1=new JButton("login");
		add(b1);
		b2=new JButton("back");
		add(b2);
		//setTitle("login page");
		b1.addActionListener(f);
		b2.addActionListener(f);
	}
}