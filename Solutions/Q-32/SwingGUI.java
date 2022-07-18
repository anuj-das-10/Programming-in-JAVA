import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SwingGUI extends JFrame implements ActionListener {
	JTextField t1, t2;
	JLabel lb1, lb2, lb3;
	JButton sum_btn, sub_btn, mul_btn, div_btn;

	public SwingGUI() {
		super("BASIC CALCULATOR");
		lb1 = new JLabel("Enter First Number:  ");
		lb1.setBounds(90,20,150,30);
		add(lb1);

		t1 = new JTextField(30);
		t1.setBounds(90,50,150,30);
		add(t1);
		
		lb2 = new JLabel("Enter Second Number:  ");
		lb2.setBounds(90,80,150,30);
		add(lb2);

		t2 = new JTextField(30);
		t2.setBounds(90,110,150,30);
		add(t2);

		lb3 = new JLabel("Result:  ");
		lb3.setBounds(90,160,250,30);
		add(lb3);


		sum_btn = new JButton(" + ");
		sum_btn.setBounds(90,200,50,30);
		add(sum_btn);
		sum_btn.addActionListener(this);

		sub_btn = new JButton(" - ");
		sub_btn.setBounds(160,200,50,30);
		add(sub_btn);
		sub_btn.addActionListener(this);

		mul_btn = new JButton(" * ");
		mul_btn.setBounds(230,200,50,30);
		add(mul_btn);
		mul_btn.addActionListener(this);

		div_btn = new JButton(" / ");
		div_btn.setBounds(300,200,50,30);
		add(div_btn);
		div_btn.addActionListener(this);

		setLayout(null);
		setSize(600,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
	if(e.getSource().equals(sum_btn)) {
		int  a = Integer.parseInt(t1.getText());
		int  b = Integer.parseInt(t2.getText());
		int sum = a + b;
		lb3.setText("Result:  "+a+" + "+b+" = "+String.valueOf(sum));
	}

	else if(e.getSource().equals(sub_btn)) {
		int  a = Integer.parseInt(t1.getText());
		int  b = Integer.parseInt(t2.getText());
		int sub = a - b;
		lb3.setText("Result:  "+a+" - "+b+" = "+String.valueOf(sub));
	}

		else if(e.getSource().equals(mul_btn)) {
		int  a = Integer.parseInt(t1.getText());
		int  b = Integer.parseInt(t2.getText());
		int mul = a * b;
		lb3.setText("Result:  "+a+" * "+b+" = "+String.valueOf(mul));
	}

		else if(e.getSource().equals(div_btn)) {
		int  a = Integer.parseInt(t1.getText());
		int  b = Integer.parseInt(t2.getText());
		double div = a / (b*1.0);
		lb3.setText("Result:  "+a+" / "+b+" = "+String.valueOf(div));
	}
}

	public static void main(String[] args) {
		SwingGUI gui = new SwingGUI();
	}
}