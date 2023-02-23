import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
class RegisDemo extends JPanel implements ActionListener
{
	JTextField t1;
	JPasswordField t2;
	//JNameField t3;
	JButton b1,b2;
	RegisDemo(FDemo f)
	{
	    t1=new JTextField(10);
		add(t1);	    
		t2=new JPasswordField(10);
		add(t2);
		b1=new JButton("Registration");
		add(b1);
		b2=new JButton("back");
		add(b2);
		//setTitle("registration  page");
		b1.addActionListener(this);
		b2.addActionListener(f);
	}
    public void actionPerformed(ActionEvent e)
    {
        String s1=t1.getText();
        String s2=t2.getText();
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql:///shivamdb","root","9550");
          Statement st=con.createStatement();
          st.executeUpdate("insert into login value('"+s1+"','"+s2+"')");
          JOptionPane.showMessageDialog(b1,"Data Inserted","insert page",JOptionPane.INFORMATION_MESSAGE);
            // t1.getText("");
            // t2.getText("");
        }
        catch(Exception e1)
        {
            System.out.println(e1);
        }
    }
}