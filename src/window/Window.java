package window;
 
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Window extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//ImageIcon i = new ImageIcon("F:/eclipse-workspace/HappyWindMan/picture/yasuo.jpg");
	ImageIcon i,qi,wi,ei,ri;
	JButton q,w,e,r,d,f,beidong;
	JLabel showText,l;
	Box box;
	JPanel com,pan,pan2;
	
	
	Window() {
		setLayout(new FlowLayout());
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 600, 450);
        validate();
        pack();
	}
	
	void init() {
		l = new JLabel();
		i = new ImageIcon("F:/eclipse-workspace/HappyWindMan/picture/yasuo.jpg");
		l.setIcon(i);
		pan = new JPanel();
		pan.add(l);
        q = new JButton();
        qi = new ImageIcon("F:/eclipse-workspace/HappyWindMan/picture/q.jpeg");
        q.setIcon(qi);
        q.setBounds(100, 100, qi.getIconWidth(), qi.getIconHeight());
        w = new JButton();
        wi = new ImageIcon("F:/eclipse-workspace/HappyWindMan/picture/w.jpeg");
        w.setIcon(wi);
        e = new JButton();
        ei = new ImageIcon("F:/eclipse-workspace/HappyWindMan/picture/e.jpeg");
        Image image = ei.getImage(); 
        Image smallImage = image.getScaledInstance(64,64,Image.SCALE_FAST);
        ImageIcon smallIcon = new ImageIcon(smallImage);
        e.setIcon(smallIcon);
        r = new JButton();
        ri = new ImageIcon("F:/eclipse-workspace/HappyWindMan/picture/r.jpeg");
        r.setIcon(ri);
        showText = new JLabel();
        showText.setText("������磬��������");
        showText.setFont(new Font("����", Font.PLAIN, 23));
        
        q.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		showText.setText("����������������������");
        	}
        });
        w.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		showText.setText("��Լ���ɣ���");
        	}
        });
        e.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		showText.setText("���в�e���Ա�!");
        	}
        });
        r.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		showText.setText("ʹ�ﰡ��ʹ!");
        	}
        });
        
        com = new JPanel();
        com.add(q);
        com.add(w);
        com.add(e);
        com.add(r);
        pan2 = new JPanel();
        pan2.add(showText);
        
        box = Box.createVerticalBox();
        box.add(pan);
        Box.createVerticalStrut(100);
        box.add(com);
        Box.createVerticalStrut(100);
        box.add(pan2);
        add(box);
	}
}
