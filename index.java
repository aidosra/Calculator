package calc;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class index extends JFrame{
	
	int a;
	int b;
	char c;
	calc obj = new calc();
	JLabel l;
	JTextField tf;
	index(){
		setSize(400,400);//super(400,400);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		ImageIcon img = new ImageIcon("1.jpg");
		l = new JLabel(img);
		l.setLocation(0,0);
		l.setSize(400,400);
		
		JTextField tf = new JTextField();
		tf.setBounds(50, 50, 300, 50);
		tf.setBackground(Color.LIGHT_GRAY);
		tf.setHorizontalAlignment(tf.RIGHT);
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b10 = new JButton("C");
		JButton b11 = new JButton("0");
		JButton b12 = new JButton("AC");
		b1.setBounds(50, 110, 50, 50);
		b2.setBounds(110, 110, 50, 50);
		b3.setBounds(170, 110, 50, 50);
		b4.setBounds(50, 170, 50, 50);
		b5.setBounds(110, 170, 50, 50);
		b6.setBounds(170, 170, 50, 50);
		b7.setBounds(50, 230, 50, 50);
		b8.setBounds(110, 230, 50, 50);
		b9.setBounds(170, 230, 50, 50);
		b10.setBounds(50, 290, 50, 50);
		b11.setBounds(110, 290, 50, 50);
		b12.setBounds(170, 290, 50, 50);
		
		
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton kobeitu = new JButton("*");
		JButton bolu = new JButton("/");
		JButton sqr = new JButton("x^2");
		JButton sqrt = new JButton("√");
		JButton perc = new JButton("%");
		JButton equal = new JButton("=");
		
		plus.setBounds(230, 110, 55, 30);
		minus.setBounds(230, 150, 55, 30);
		kobeitu.setBounds(230, 190, 55, 30 );
		bolu.setBounds(230, 230, 55, 30);
		sqr.setBounds(230, 270, 55, 30);
		equal.setBounds(230, 310, 55, 30);
		sqrt.setBounds(290, 110, 55, 30);
		perc.setBounds(290, 150, 55, 30);
				
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"1");
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"2");
			}
		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"3");
			}
		});
		b4.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"4");
			}
		});
		b5.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"5");
			}
		});
		b6.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"6");
			}
		});
		b7.addActionListener(new ActionListener() {	

			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"7");
			}
		});
		b8.addActionListener(new ActionListener() {	

			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"8");
			}
		});
		b9.addActionListener(new ActionListener() {	

			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"9");
			}
		});
		b10.addActionListener(new ActionListener() {	

			@Override
			public void actionPerformed(ActionEvent e) {
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = '0';
			}
		});
		b11.addActionListener(new ActionListener() {	

			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"0");
			}
		});
		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = '+';
			}
		});
		minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = '-';
			}
		});
		kobeitu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = '*';
			}
		});
		bolu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = '/';
			}
		});
		sqr.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = 's';
			}
		});
		sqrt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				a = Integer.parseInt(tf.getText());
				tf.setText(""+Math.sqrt(a));
				
				c = 'q';
			}
		});
		perc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = 'e';
			}
		});
		equal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(c=='+' || c=='-' || c=='*' || c=='/' ||c=='e') {
				b = Integer.parseInt(tf.getText());
				if(c=='+')
					tf.setText((int)obj.plus(a, b)+"");
				if(c=='-')
					tf.setText((int)obj.minus(a, b)+"");
				if(c=='*')
					tf.setText((int)obj.kobeitu(a, b)+"");
				if(c=='/')
					tf.setText((int)obj.bolu(a, b)+"");
				if(c=='e')
					tf.setText((double)obj.perc(a, b)+"");
				c=' ';
				a=0;
				b=0;
				}	
				
				if(c=='s')
					tf.setText((double)obj.sqr(a)+"");
				if(c=='q')
					tf.setText((double)obj.sqrt(a)+"");
				
				c=' ';
				a=0;
				b=0;
				}
				});
		b12.addActionListener(new ActionListener() {	

			@Override
			public void actionPerformed(ActionEvent e) {
				a = Integer.parseInt(tf.getText());
				b = Integer.parseInt(tf.getText());
				tf.setText("");
				c = ' ';
			}
		});
		add(l);
		add(tf);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(plus);
		add(minus);
		add(equal);
		add(kobeitu);
		add(bolu);
		add(sqr);
		add(sqrt);
		add(perc);
		add(b12);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new index();
	}

}
