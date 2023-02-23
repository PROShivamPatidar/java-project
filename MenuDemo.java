import javax.swing.*;
class MenuDemo extends JPanel
{
	JButton b1;
	MenuDemo(FDemo f)
	{
		
		b1=new JButton("my menu");
		add(b1);
		b1.addActionListener(f);

	}
}
