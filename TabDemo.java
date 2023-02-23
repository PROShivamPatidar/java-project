import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
class TabDemo extends JPanel implements ActionListener
{
    JTabbedPane tab1;	
	InsertDemo ins;
	SearchDemo src;
	ShowallDemo sa;
	PhysicsDemo pd;
	JButton b1;
	TabDemo(FDemo f)
    {
		setLayout(new BorderLayout());
		tab1=new JTabbedPane(); 
		ins=new InsertDemo();
		src=new SearchDemo();
		sa=new  ShowallDemo();
		pd=new  PhysicsDemo();
		tab1.addTab("insert",ins);
		add(tab1);
		tab1.addTab("search",src);
		tab1.addTab("showall",sa);
		tab1.addTab("phyics",pd);
	
		
		// b1=new JButton("my menu page");
		// add(b1);
		// b1.addActionListener(f);

	}
    public void actionPerformed(ActionEvent e)
    {
        
    }
}
class InsertDemo extends JPanel implements ActionListener   
{
	JLabel u1,u2,u3,u4,u5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1;
	InsertDemo()
	{
		setLayout(null);
		u1=new JLabel("Enter RNO");
		u1.setBounds(50,50,120,35);
		add(u1);
		t1=new JTextField();
		t1.setBounds(180,50,150,30);
		add(t1);
		
		u2=new JLabel("Enter name");
		u2.setBounds(50,100,120,35);
		add(u2);
		t2=new JTextField();
		t2.setBounds(180,100,150,30);
		add(t2);
		
		u3=new JLabel("Enter phy");
		u3.setBounds(50,150,120,35);
		add(u3);
		t3=new JTextField();
		t3.setBounds(180,150,150,30);
		add(t3);		

		u4=new JLabel("Enter che");
		u4.setBounds(50,200,120,35);
		add(u4);	    
		t4=new JTextField();
		t4.setBounds(180,200,150,30);
		add(t4);
       
   	    u5=new JLabel("Enter maths");
		u5.setBounds(50,250,120,35);
		add(u5);	    
		t5=new JTextField();
		t5.setBounds(180,250,150,30);
		add(t5);
		
        b1=new JButton("insert");
		b1.setBounds(100,320,85,35);
		add(b1);
		b1.addActionListener(this);
	}
    public void actionPerformed(ActionEvent e)
    {
        String s1=t1.getText();
        String s2=t2.getText();
        String s3=t3.getText();
        String s4=t4.getText();
        String s5=t5.getText();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql:///shivamdb","root","9550");
            Statement st=con.createStatement();
            st.executeUpdate("insert into inmark value('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");
            JOptionPane.showMessageDialog(null,"Data inserted");
            con.close();
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
        }
        catch(Exception e1)
        {
            System.out.println(e1);
        }
    }
}
class SearchDemo extends JPanel implements ActionListener
{
	JLabel u1,u2,u3,u4,u5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1;
	SearchDemo()
	{
		setLayout(null);
		u1=new JLabel("Enter RNO");
		u1.setBounds(50,50,120,35);
		add(u1);
		t1=new JTextField();
		t1.setBounds(180,50,150,30);
		add(t1);
		
        u2=new JLabel("NAME");
		u2.setBounds(50,100,200,35);
		add(u2);
        t2=new JTextField();
		t2.setBounds(180,100,150,30);
		add(t2);
        
        u3=new JLabel("PHY");
		u3.setBounds(50,150,200,35);
		add(u3);
		t3=new JTextField();
		t3.setBounds(180,150,150,30);
		add(t3);
        
        
        u4=new JLabel("CHE");
		u4.setBounds(50,200,200,35);
		add(u4);
		t4=new JTextField();
		t4.setBounds(180,200,150,30);
		add(t4);
        
        
        u5=new JLabel("MTHS");
		u5.setBounds(50,250,200,35);
		add(u5);
		t5=new JTextField();
		t5.setBounds(180,250,150,30);
		add(t5);
		
        b1=new JButton("search");
		b1.setBounds(150,300,85,35);
		add(b1);
		b1.addActionListener(this);
	}
    public void actionPerformed(ActionEvent e)
    {
        String s1=t1.getText();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql:///shivamdb","root","9550");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from inmark where ROLL='"+s1+"'");
            if(rs.next())
            {
                t2.setText(rs.getString(2));
                t3.setText(rs.getString(3));
                t4.setText(rs.getString(4));    
                t5.setText(rs.getString(5));    
            }
            else
            {
                JOptionPane.showMessageDialog(null,"invalid roll no");
                // t2.setText("");
                // t2.setText("");
                // t2.setText("");
                // t2.setText("");
                // t2.setText("");
            }
        }
        catch(Exception e1)
        {
            System.out.println(e1);
        }
    }
}
/*
class ShowallDemo extends JPanel
{
	JLabel u1;
	JTextField t1;
	JButton b1;
    ShowallDemo()
	{
		setLayout(null);
		u1=new JLabel("Enter RNO");
		u1.setBounds(50,50,120,35);
		add(u1);
		t1=new JTextField();
		t1.setBounds(180,50,150,30);
		add(t1);
		
        b1=new JButton("show all");
		b1.setBounds(100,320,85,35);
		add(b1);
		//b1.addActionListener(f);
	}
}
class PhysicsDemo extends JPanel
{
	JLabel u1;
	JTextField t1;
	JButton b1;
    PhysicsDemo()
	{
		setLayout(null);
		u1=new JLabel("Student name ");
		u1.setBounds(50,50,120,35);
		add(u1);
		t1=new JTextField();
		t1.setBounds(180,50,150,30);
		add(t1);
		
        b1=new JButton("physics");
		b1.setBounds(100,320,85,35);
		add(b1);
		//b1.addActionListener(f);
	}
}
*/