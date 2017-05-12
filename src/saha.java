import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.sql.Time;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class saha extends JFrame implements ActionListener{
	int baslangıcX,baslangıcX1,baslangıcX2,baslangıcX3,baslangıcX4,baslangıcX5,baslangıcX6,baslangıcX7,baslangıcX8,baslangıcX9,baslangıcX10;
	int baslangıcY,baslangıcY1,baslangıcY2,baslangıcY3,baslangıcY4,baslangıcY5,baslangıcY6,baslangıcY7,baslangıcY8,baslangıcY9,baslangıcY10;
	Timer tm=new Timer(10,this);
	int bitisX,bitisY;
	JPanel panel;
	Container con;
	int moveSpeed=4;
	player p=new player();
	public saha(){
		setTitle("İLK 11");
		con=getContentPane();
		con.setLayout(null);
		ImageIcon image=new ImageIcon("img/xx.jpeg");
		setSize(600,400);
		player p=new player();
		panel=new JPanel(){
			public void paintComponent(Graphics g){
				super.paintComponents(g);
				Image ımage=new ImageIcon("img/xx.jpeg").getImage();
				Image ımage1=new ImageIcon("formalar/galatasaray.png").getImage();
				Image ımage2=new ImageIcon("formalar/galatasaray.png").getImage();
				Image ımage3=new ImageIcon("formalar/galatasaray.png").getImage();
				Image ımage4=new ImageIcon("formalar/beşiktaş.png").getImage();
				Image ımage5=new ImageIcon("formalar/beşiktaş.png").getImage();
				Image ımage6=new ImageIcon("formalar/galatasaray.png").getImage();
				Image ımage7=new ImageIcon("formalar/beşiktaş.png").getImage();
				Image ımage8=new ImageIcon("formalar/galatasaray.png").getImage();
				Image ımage9=new ImageIcon("formalar/beşiktaş.png").getImage();
				Image ımage10=new ImageIcon("formalar/galatasaray.png").getImage();
				Image ımage11=new ImageIcon("formalar/beşiktaş.png").getImage();
				g.drawImage(ımage,0, 0,bitisX,bitisY,null);
				g.drawImage(ımage1,baslangıcX,baslangıcY,60, 50, null); //kaleci
				g.drawImage(ımage2, baslangıcX1, baslangıcY1, 60, 50,null);//stoper
				g.drawImage(ımage3, baslangıcX2, baslangıcY2, 60, 50,null);//sağbek
				g.drawImage(ımage4, baslangıcX3,baslangıcY3, 60, 50,null);//solbek
				g.drawImage(ımage5, baslangıcX4,baslangıcY4, 60, 50,null);//ortasaha
				g.drawImage(ımage6,baslangıcX5,baslangıcY5, 60, 50,null);//sol_açık
				g.drawImage(ımage7, baslangıcX6, baslangıcY6, 60, 50,null);//ortasaha
				g.drawImage(ımage8, baslangıcX7, baslangıcY7, 60, 50,null);//ortasaha
				g.drawImage(ımage9, baslangıcX8, baslangıcY8, 60, 50,null);//sağ_açık
				g.drawImage(ımage10,baslangıcX9, baslangıcY9, 60, 50,null);//forvet
				g.drawImage(ımage11, baslangıcX10, baslangıcY10, 60, 50,null);//forvet
				g.drawString(p.getAdsoyad(), baslangıcX, baslangıcY);
				g.drawString(p.getAdsoyad(), baslangıcX1,baslangıcY1);
				g.drawString(p.getAdsoyad(), baslangıcX2, baslangıcY2);
				g.drawString(p.getAdsoyad(), baslangıcX3,baslangıcY3);
				g.drawString(p.getAdsoyad(), baslangıcX4, baslangıcY4);
				g.drawString(p.getAdsoyad(), baslangıcX5, baslangıcY5);
				g.drawString(p.getAdsoyad(), baslangıcX6, baslangıcY6);
				g.drawString(p.getAdsoyad(), baslangıcX7, baslangıcY7);
				g.drawString(p.getAdsoyad(), baslangıcX8, baslangıcY8);
				g.drawString(p.getAdsoyad(), baslangıcX9, baslangıcY9);
				g.drawString(p.getAdsoyad(), baslangıcX10, baslangıcY10);
				tm.start();
				bitisX=getSize().width;
				bitisY=getSize().height;
			
			}
			
		};
		con.add(panel);
		panel.setBounds(0, 0,600,400);
		GridBagLayout layout = new GridBagLayout(); 
        JPanel panelContent = new JPanel(layout); 
        panel.add(panelContent);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 600, 400));
        setResizable(false); 
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
       
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(baslangıcX<=20)
			baslangıcX+=moveSpeed;
		if(baslangıcY<=175)
			baslangıcY+=moveSpeed;
		if(baslangıcX1<=100)
			baslangıcX1+=moveSpeed;
		if(baslangıcY1<=175)
			baslangıcY1+=moveSpeed;
		if(baslangıcX2<=100)
			baslangıcX2+=moveSpeed;
		if(baslangıcY2<=275)
			baslangıcY2+=moveSpeed;
		if(baslangıcX3<=100)
			baslangıcX3+=moveSpeed;
		if(baslangıcY3<=75)
			baslangıcY3+=moveSpeed;
		if(baslangıcX4<=250)
			baslangıcX4+=moveSpeed;
		if(baslangıcY4<=105)
			baslangıcY4+=moveSpeed;
		if(baslangıcX5<=280)
			baslangıcX5+=moveSpeed;
		if(baslangıcY5<=35)
			baslangıcY5+=moveSpeed;
		if(baslangıcX6<=250)
			baslangıcX6+=moveSpeed;
		if(baslangıcY6<=175)
			baslangıcY6+=moveSpeed;
		if(baslangıcX7<=250)
			baslangıcX7+=moveSpeed;
		if(baslangıcY7<=255)
			baslangıcY7+=moveSpeed;
		if(baslangıcX8<=280)
			baslangıcX8+=moveSpeed;
		if(baslangıcY8<=335)
			baslangıcY8+=moveSpeed;
		if(baslangıcX9<=425)
			baslangıcX9+=moveSpeed;
		if(baslangıcY9<=105)
			baslangıcY9+=moveSpeed;
		if(baslangıcX10<=425)
			baslangıcX10+=moveSpeed;
		if(baslangıcY10<=235)
			baslangıcY10+=moveSpeed;
		repaint();
		
	}


}
