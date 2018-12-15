import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

class IpAddressFinder extends JFrame implements ActionListener
{
	JLabel website,ipadd,dev;
	JTextField tf1,tf2;
	JButton getip,close;
	Font f1,f2,f3,f4;
	String web;
	
	IpAddressFinder()
	{
		f1=new Font("", Font.BOLD, 15);
		f2=new Font("", Font.BOLD, 18);
		f3=new Font("", Font.BOLD, 25);
		f4=new Font("Serif", Font.ITALIC, 14);

		website=new JLabel("Website Name");
		website.setBounds(90,40,150,35);
		website.setFont(f1);
		website.setForeground(Color.blue);
		add(website);

		tf1=new JTextField();
		tf1.setBounds(220,45,250,30);
		tf1.setFont(f1);
		tf1.setForeground(Color.blue);
		add(tf1);
		
		getip=new JButton("Get Ip");
		getip.setForeground(Color.green);
		getip.setBackground(Color.white);
		getip.setBounds(500,45,90,30);
		getip.setFont(f1);
		add(getip);
		getip.addActionListener(this);

		close=new JButton("Close");
		close.setForeground(Color.red);
		close.setBackground(Color.white);
		close.setBounds(500,230,90,30);
		close.setFont(f1);
		add(close);
		close.addActionListener(this);

		ipadd=new JLabel("IP address ..");
		ipadd.setBounds(300,95,150,35);
		ipadd.setFont(f2);
		ipadd.setForeground(Color.red);
		add(ipadd);

		tf2=new JTextField();
		tf2.setBounds(195,140,300,65);
		tf2.setFont(f3);
		tf2.setForeground(Color.red);
		add(tf2);


		dev=new JLabel("Developed by Lokesh Chandra");
		dev.setBounds(510,280,180,40);
		dev.setFont(f4);
		add(dev);
		
		Container c=this.getContentPane();
		c.setBackground(Color.white);
		setSize(720,360);
		setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
	}

		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==getip)
			{
				web=tf1.getText();
				try
				{
					InetAddress ip=InetAddress.getByName(web);
					tf2.setText(ip.getHostAddress());
				}
				catch (Exception e1)
				{
					e1.printStackTrace();
				}
			}
			if(e.getSource()==close)
			{
				dispose();
			}
		
		}
	
	public static void main(String[] args) 
	{
		new IpAddressFinder();
		System.setProperty("sun.net.spi.nameservice.nameservers", "<http://edcguest:edcguest@172.31.52.54:3128/>");
		System.setProperty("sun.net.spi.nameservice.provider.1", "dns,sun");
	}
}
