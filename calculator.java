package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class calculator implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea textarea = new JTextArea(2,10);
	
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button0 = new JButton();
	JButton buttonadd = new JButton();
	JButton buttonsub = new JButton();
	JButton buttonmul = new JButton();
	JButton buttondiv = new JButton();
	JButton buttonclear = new JButton();
	JButton buttondot = new JButton();
	JButton buttonequal = new JButton();
	
	double number1, number2, result;
	int addc =0, mulc =0, divc=0, subc=0;
	
	public calculator(){
		frame.setSize(340,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("calculator");
		
		frame.add(panel);
		panel.setBackground(Color.white);
		Border border = BorderFactory.createLineBorder(Color.DARK_GRAY,4);
		panel.setBorder(border);
		
		panel.add(textarea);
		textarea.setBackground(Color.BLACK);
		Border tborder = BorderFactory.createLineBorder(Color.BLUE,3);
		textarea.setBorder(tborder);
		Font font = new Font("arial", Font.BOLD, 33);
		textarea.setFont(font);
		textarea.setForeground(Color.WHITE);
		textarea.setPreferredSize(new Dimension(2,10));
		textarea.setLineWrap(true);
		
		button1.setPreferredSize(new Dimension(100,42));
		button1.setIcon(new ImageIcon("//Users//user//Documents//workspace//calculator//11.jpg"));

		button2.setPreferredSize(new Dimension(100,42));
		button2.setIcon(new ImageIcon("//Users//user//Documents//workspace//calculator//22.jpg"));
		
		button3.setPreferredSize(new Dimension(100,42));
		button3.setIcon(new ImageIcon("//Users//user//Documents//workspace//calculator//33.jpg"));
		
		button4.setPreferredSize(new Dimension(100,42));
		button4.setIcon(new ImageIcon("//Users//user//Documents//workspace//calculator//44.jpg"));
		
		button5.setPreferredSize(new Dimension(100,42));
		button5.setIcon(new ImageIcon("//Users//user//Documents//workspace//calculator//55.jpg"));
		
		button6.setPreferredSize(new Dimension(100,42));
		button6.setIcon(new ImageIcon("//Users//user//Documents//workspace//calculator//66.jpg"));
		
		button7.setPreferredSize(new Dimension(100,42));
		button7.setIcon(new ImageIcon("//Users//user//Documents//workspace//calculator//77.jpg"));
		
		button8.setPreferredSize(new Dimension(100,42));
		button8.setIcon(new ImageIcon("//Users//user//Documents//workspace//calculator//88.jpg"));
		
		button9.setPreferredSize(new Dimension(100,42));
		button9.setIcon(new ImageIcon("//Users//user//Documents//workspace//calculator//99.jpg"));
		
		button0.setPreferredSize(new Dimension(100,42));
		button0.setIcon(new ImageIcon("//Users//user//Documents//workspace//calculator//00.jpg"));
		
		buttondot.setPreferredSize(new Dimension(100,42));
		buttondot.setIcon(new ImageIcon("//Users//user//Documents//workspace//calculator//dot.jpg"));
		
		buttonsub.setPreferredSize(new Dimension(100,43));
		buttonsub.setIcon(new ImageIcon("//Users//user//Documents//workspace//calculator//-.jpg"));
		
		buttonmul.setPreferredSize(new Dimension(100,42));
		buttonmul.setIcon(new ImageIcon("//Users//user//Documents//workspace//calculator//x.jpg"));
		
		buttondiv.setPreferredSize(new Dimension(100,42));
		buttondiv.setIcon(new ImageIcon("//Users//user//Documents//workspace//calculator//div.jpg"));
		
		buttonadd.setPreferredSize(new Dimension(100,42));
		buttonadd.setIcon(new ImageIcon("//Users//user//Documents//workspace//calculator//+.jpg"));
		
		buttonequal.setPreferredSize(new Dimension(200,35));
		buttonequal.setIcon(new ImageIcon("//Users//user//Documents//workspace//calculator//=.jpg"));
		
		buttonclear.setPreferredSize(new Dimension(100,35));
		buttonclear.setIcon(new ImageIcon("//Users//user//Documents//workspace//calculator//c.jpg"));

		
		
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
		panel.add(buttondot);
		panel.add(buttonsub);
		panel.add(buttonmul);
		panel.add(buttondiv);
		panel.add(buttonadd);
		panel.add(buttonequal);
		panel.add(buttonclear);


		
		button1.addActionListener(this);
		
		button2.addActionListener(this);
		
		button3.addActionListener(this);
		
		button4.addActionListener(this);
		
		button5.addActionListener(this);
		
		button6.addActionListener(this);
		
		button7.addActionListener(this);
		
		button8.addActionListener(this);
		
		button9.addActionListener(this);
		
		button0.addActionListener(this);
		
		buttonadd.addActionListener(this);
		buttondot.addActionListener(this);
		buttonsub.addActionListener(this);
		buttonmul.addActionListener(this);
		buttondiv.addActionListener(this);
		buttonclear.addActionListener(this);
		buttonequal.addActionListener(this);
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		
		if(source == buttonclear){
			number1=0.0;
			number2=0.0;
			textarea.setText("");
		}
		
		if(source == button1){
			textarea.append("1");
		}
		if(source == button2){
			textarea.append("2");
		}
		if(source == button3){
			textarea.append("3");
		}
		if(source == button4){
			textarea.append("4");
		}
		if(source == button5){
			textarea.append("5");
		}
		if(source == button6){
			textarea.append("6");
		}
		if(source == button7){
			textarea.append("7");
		}
		if(source == button8){
			textarea.append("8");
		}
		if(source == button9){
			textarea.append("9");
		}
		if(source == button0){
			textarea.append("0");
		}
		if(source == buttondot){
			textarea.append(".");
		}

		
		
		if(source == buttonadd){
			number1 = number_reader();
			textarea.setText("");
			addc=1;
			divc=0;
			mulc=0;
			subc=0;
		}
		
		if(source == buttondiv){
			number1 = number_reader();
			textarea.setText("");
			addc=0;
			divc=1;
			mulc=0;
			subc=0;
		}
		
		if(source == buttonsub){
			number1 = number_reader();
			textarea.setText("");
			addc=0;
			divc=0;
			mulc=0;
			subc=1;
		}
		
		if(source == buttonmul){
			number1 = number_reader();
			textarea.setText("");
			addc=0;
			divc=0;
			mulc=1;
			subc=0;
		}
		
		if(source == buttonequal){
			number2 = number_reader();
			
			if(addc >0){
				result =number1+number2;
				textarea.setText(Double.toString(result));
			}
			
			if(subc >0){
				result =number1-number2;
				textarea.setText(Double.toString(result));
			}
			
			if(mulc >0){
				result =number1*number2;
				textarea.setText(Double.toString(result));
			}
			
			if(divc >0){
				result =number1/number2;
				textarea.setText(Double.toString(result));
			}
		}

		}
	
	   public double number_reader(){
			double num1;
			String s;
			s = textarea.getText();
			num1 = Double.valueOf(s);
		    return num1;
	}

}

