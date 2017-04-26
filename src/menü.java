import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.PaintEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class menü extends JFrame{
	private JPanel contentPane;
	public menü(){
		setTitle("İLK11");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane=new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lbl1=new JLabel("Taktiği Seçiniz");
		lbl1.setBounds(250, 0, 200, 50);
		contentPane.add(lbl1);
		JButton basla=new JButton("Başla");
		basla.setBounds(255,300,80, 20);
		contentPane.add(basla);
		ButtonGroup bG=new ButtonGroup();
		JRadioButton ilktaktik = new JRadioButton("4-4-2");
		ilktaktik.setBounds(250, 50,80, 50);
	    JRadioButton ikincitaktik = new JRadioButton("4-3-3");
	    ikincitaktik.setBounds(250, 85, 80, 50);
	    JRadioButton ucuncutaktik= new JRadioButton("3-5-2");
	    ucuncutaktik.setBounds(250, 120, 80, 50);
	    JRadioButton dorduncutaktik=new JRadioButton("5-3-2");
	    dorduncutaktik.setBounds(250, 151, 80, 50);
	    bG.add(ilktaktik);
	    bG.add(ikincitaktik);
	    bG.add(ucuncutaktik);
	    bG.add(dorduncutaktik);   
	    this.add(ilktaktik);
	    this.add(ikincitaktik);
	    this.add(ucuncutaktik);
	    this.add(dorduncutaktik);
	    ilktaktik.setSelected(true);
		this.setSize(600,400);
		this.setVisible(true);

		basla.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(ucuncutaktik.isSelected()){
					saha s=new saha();
					s.setVisible(true);
				}else if (ikincitaktik.isSelected()) {
					saha1 s1=new saha1();
					s1.setVisible(true);
					
				}
				
			}
		});
	}
	
	public static void main(String[] args) {
		menü m=new menü();
		m.setVisible(true);

	}

}
