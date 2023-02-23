import javax.swing.*;
import java.awt.*;   
class AboutDemo extends JPanel
{
	
	JButton b1;
		
	AboutDemo(FDemo f)
	{
		JLabel a = new JLabel();
		a.setText("shivam patidar");
		add(a);
		b1=new JButton("back");
		add(b1);
		//setTitle("about us ");
		b1.addActionListener(f);
	}
}