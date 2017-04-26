import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class saha2 extends JFrame implements ActionListener{
	int baslangıcX,baslangıcX1,baslangıcX2,baslangıcX3,baslangıcX4,baslangıcX5,baslangıcX6,baslangıcX7,baslangıcX8,baslangıcX9,baslangıcX10;
	int baslangıcY,baslangıcY1,baslangıcY2,baslangıcY3,baslangıcY4,baslangıcY5,baslangıcY6,baslangıcY7,baslangıcY8,baslangıcY9,baslangıcY10;
	Timer tm=new Timer(10,this);
	int bitisX,bitisY;
	JPanel panel;
	Container con;
	int moveSpeed=4;
	public saha2(){
		setTitle("İLK 11");
		con=getContentPane();
		con.setLayout(null);
		ImageIcon image=new ImageIcon("img/index.jpeg");
		setSize(600,400);
		panel=new JPanel(){
			public void paintComponent(Graphics g){
				super.paintComponents(g);
				Image ımage=new ImageIcon("img/index.jpeg").getImage();
				Image ımage1=new ImageIcon("img/n.jpg").getImage();
				Image ımage2=new ImageIcon("img/n.jpg").getImage();
				Image ımage3=new ImageIcon("img/n.jpg").getImage();
				Image ımage4=new ImageIcon("img/n.jpg").getImage();
				Image ımage5=new ImageIcon("img/n.jpg").getImage();
				Image ımage6=new ImageIcon("img/n.jpg").getImage();
				Image ımage7=new ImageIcon("img/n.jpg").getImage();
				Image ımage8=new ImageIcon("img/n.jpg").getImage();
				Image ımage9=new ImageIcon("img/n.jpg").getImage();
				Image ımage10=new ImageIcon("img/n.jpg").getImage();
				Image ımage11=new ImageIcon("img/n.jpg").getImage();
				g.drawImage(ımage,0, 0,bitisX,bitisY,null);
				g.drawImage(ımage1,baslangıcX,baslangıcY,50, 50, null); //kaleci
				g.drawImage(ımage2, baslangıcX1, baslangıcY1, 50, 50,null);//stoper
				g.drawImage(ımage3, baslangıcX2, baslangıcY2, 50, 50,null);//sağbek
				g.drawImage(ımage4, baslangıcX3,baslangıcY3, 50, 50,null);//solbek
				g.drawImage(ımage5, baslangıcX4,baslangıcY4, 50, 50,null);//ortasaha
				g.drawImage(ımage6,baslangıcX5,baslangıcY5, 50, 50,null);//sol_açık
				g.drawImage(ımage7, baslangıcX6, baslangıcY6, 50, 50,null);//ortasaha
				g.drawImage(ımage8, baslangıcX7, baslangıcY7, 50, 50,null);//ortasaha
				g.drawImage(ımage9, baslangıcX8, baslangıcY8, 50, 50,null);//sağ_açık
				g.drawImage(ımage10,baslangıcX9, baslangıcY9, 50, 50,null);//forvet
				g.drawImage(ımage11, baslangıcX10, baslangıcY10, 50, 50,null);//forvet
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
	public void actionPerformed(ActionEvent e) {
		if(baslangıcX<=20)
			baslangıcX+=moveSpeed;
		if(baslangıcY<=175)
			baslangıcY+=moveSpeed;
		if(baslangıcX1<=120)
			baslangıcX1+=moveSpeed;
		if(baslangıcY1<=35)
			baslangıcY1+=moveSpeed;
		if(baslangıcX2<=100)
			baslangıcX2+=moveSpeed;
		if(baslangıcY2<=120)
			baslangıcY2+=moveSpeed;
		if(baslangıcX3<=100)
			baslangıcX3+=moveSpeed;
		if(baslangıcY3<=220)
			baslangıcY3+=moveSpeed;
		if(baslangıcX4<=120)
			baslangıcX4+=moveSpeed;
		if(baslangıcY4<=315)
			baslangıcY4+=moveSpeed;
		if(baslangıcX5<=300)
			baslangıcX5+=moveSpeed;
		if(baslangıcY5<=35)
			baslangıcY5+=moveSpeed;
		if(baslangıcX6<=250)
			baslangıcX6+=moveSpeed;
		if(baslangıcY6<=120)
			baslangıcY6+=moveSpeed;
		if(baslangıcX7<=250)
			baslangıcX7+=moveSpeed;
		if(baslangıcY7<=220)
			baslangıcY7+=moveSpeed;
		if(baslangıcX8<=300)
			baslangıcX8+=moveSpeed;
		if(baslangıcY8<=315)
			baslangıcY8+=moveSpeed;
		if(baslangıcX9<=450)
			baslangıcX9+=moveSpeed;
		if(baslangıcY9<=120)
			baslangıcY9+=moveSpeed;
		if(baslangıcX10<=450)
			baslangıcX10+=moveSpeed;
		if(baslangıcY10<=220)
			baslangıcY10+=moveSpeed;
		repaint();
	}
}
