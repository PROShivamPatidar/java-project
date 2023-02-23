import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
class FDemo extends JFrame implements ActionListener
{
	CardLayout card;
	Container cn=getContentPane();
	HomeDemo hm;
	LoginDemo lg;
	RegisDemo regis;	
	AboutDemo abt;
	MenuDemo md;
	TabDemo td;
	FDemo()
	{
		card=new CardLayout();
		setLayout(card);
		setTitle("home page");
		hm=new HomeDemo(this);
		lg=new LoginDemo(this);
		regis=new RegisDemo(this);
		abt=new AboutDemo(this);
		md=new MenuDemo(this);
		td=new TabDemo(this);
		add("home",hm);
		add("login",lg);
		add("regis",regis);
		add("about",abt);
		add("Menu",md);
		add("tab",td);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==hm.b1)
		{
			card.show(cn,"login");
		}
			if(e.getSource()==lg.b2 || e.getSource()==regis.b2 || e.getSource()==abt.b1)
		{ 
			card.show(cn,"home");
		}
			if(e.getSource()==hm.b2)
		{
			card.show(cn,"regis");
		}
		if(e.getSource()==hm.b3)
		{
			card.show(cn,"about");
		}
		if(e.getSource()==md.b1)
		{
			card.show(cn,"tab");
		}
				
		if(e.getSource()==lg.b1)
		{
			String s1=lg.t1.getText();
			String s2=lg.t2.getText();
         try
         {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql:///shivamdb","root","9550");
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select * from login where uname='"+s1+"'and upass='"+s2+"'");
            if(rs.next())
			{
			card.show(cn,"Menu");
			}
			else
			{
			JOptionPane.showMessageDialog(null,"invalid username and password");
			}
            con.close();            
         }
         catch(Exception e1)
         {
          System.out.println(e1);   
         }
	    }
    }
}
class Demo30
{
	public static void main(String args[])
	{
        FDemo f=new FDemo();
        f.setVisible(true);
        f.setBounds(200,100,500,500);	
        f.setBounds(200,100,500,500);	
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);		
	}
}














