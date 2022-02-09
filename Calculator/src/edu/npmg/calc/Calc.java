package edu.npmg.calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calc {
	
	static String res = "";
	
	static void arithmetics(String text1, String text2, char signs) {
		
		double number1=0;
		char sign = '+';
		boolean fractional = false;
		int flag=1;
		for(int i = 0; i < text1.length(); i++) {
			char ch = text1.charAt(i);
			
			if(ch>47 && ch<58 && !fractional) {
				String cha = ch + "";
				number1 = (number1 * 10) + Double.parseDouble(cha);
			}
			
			else if(ch>47 && ch<58 && fractional) {
				String cha = ch + "";
				flag *= 10;
				number1 += (Double.parseDouble(cha)/flag);
			}
			else if(ch==46) {
				fractional = true;
			}
			else {
				sign = ch;
			}
		}
		
		flag = 1;
		fractional = false;
		double number2=0;
		char sign2 = signs;
		
		for(int i = 0; i < text2.length()-1; i++) {
			char ch = text2.charAt(i);
			String cha = ch + "";
				if(!fractional) {
					if(ch!=46)
						number2 = (number2 * 10) + Double.parseDouble(cha);
					else {
						fractional = true;
					}
				}
				else {
					flag *= 10;
					number2 += (Double.parseDouble(cha)/flag);
				}
		}
		
		double result = 0;
		if(sign==43)
			result = number1 + number2;
		else if(sign==45)
			result = number1 - number2;
		else if(sign==42)
			result = number1 * number2;
		else {
			result = number1 / number2;
		}
		
		res = "" + result + sign2;
		
		if(result == 0.9999999999999998)
			result = 1;
		if(result%1 != 0)
			res = "" + result;
		else {
			res = "" + result;
			
				res = res.substring(0, res.length()-2);
				res += sign2;
			
		}
		
	}
	
	//s
	//t
	//a
	//r
	//t
	//.
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame("GUI App");
		window.setBounds(200, 200, 500, 750);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setLayout(null);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(130, 300, 50, 50);
		window.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(180, 300, 50, 50);
		window.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(230, 300, 50, 50);
		window.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(130, 250, 50, 50);
		window.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(180, 250, 50, 50);
		window.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(230, 250, 50, 50);
		window.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(130, 200, 50, 50);
		window.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(180, 200, 50, 50);
		window.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(230, 200, 50, 50);
		window.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(180, 350, 50, 50);
		window.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setBounds(130, 350, 50, 50);
		window.add(btnDot);
		
		JButton btnCalculate = new JButton("=");
		btnCalculate.setBounds(230, 350, 50, 50);
		window.add(btnCalculate);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(280, 350, 50, 50);
		window.add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(280, 300, 50, 50);
		window.add(btnMinus);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.setBounds(280, 250, 50, 50);
		window.add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setBounds(280, 200, 50, 50);
		window.add(btnDivide);
		
		JButton btnDel = new JButton("Delete");
		btnDel.setBounds(230, 150, 100, 50);
		window.add(btnDel);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(130, 150, 100, 50);
		window.add(btnClear);
		
		JTextField txtEntry = new JTextField();
		txtEntry.setBounds(130, 100, 200, 50);
		window.add(txtEntry);
		
		JLabel lblEntry = new JLabel();
		lblEntry.setBounds(230, 75, 100, 25);
		window.add(lblEntry);
		lblEntry.setText(null);
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtEntry.setText(txtEntry.getText() + btn1.getText());
			}
			
		});
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtEntry.setText(txtEntry.getText() + btn2.getText());
			}
			
		});
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtEntry.setText(txtEntry.getText() + btn3.getText());
			}
			
		});
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtEntry.setText(txtEntry.getText() + btn4.getText());
			}
			
		});
		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtEntry.setText(txtEntry.getText() + btn5.getText());
			}
			
		});
		btn6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtEntry.setText(txtEntry.getText() + btn6.getText());
			}
			
		});
		btn7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtEntry.setText(txtEntry.getText() + btn7.getText());
			}
			
		});
		btn8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtEntry.setText(txtEntry.getText() + btn8.getText());
			}
			
		});
		btn9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtEntry.setText(txtEntry.getText() + btn9.getText());
			}
			
		});
		
		btn0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//if(!txtEntry.getText().isEmpty())
					txtEntry.setText(txtEntry.getText() + btn0.getText());
			}
			
		});
		
		btnClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtEntry.setText("");
				lblEntry.setText(null);
			}
			
		});
		
		btnDel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(txtEntry.getText().isEmpty() && lblEntry.getText()!=null) {
					txtEntry.setText(lblEntry.getText());
					lblEntry.setText(null);
				}
				
				String text = txtEntry.getText();
				if(text.length()>0)
					text = text.substring(0, text.length()-1);
				txtEntry.setText(text);
				
				
			}
			
		});
		
		btnDot.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String text = txtEntry.getText();
				if(!text.contains(".") && !text.isEmpty()) {
					if(txtEntry.getText().length()>0) {
						char last = txtEntry.getText().charAt(txtEntry.getText().length()-1);
						String l = "" + last;
						if(txtEntry.getText().length() == 1 && l.equals("0")) {
							txtEntry.setText(txtEntry.getText() + btnDot.getText());
						}
						else if(!l.equals(btnPlus.getText()) && !l.equals(btnMinus.getText()) && !l.equals(btnMultiply.getText()) && !l.equals(btnDivide.getText())){
							txtEntry.setText(txtEntry.getText() + btnDot.getText());						
						}
						
						
					}
					
				}
			}
			
		});
		
		
		
		btnPlus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtEntry.getText().length()>0) {
					char last = txtEntry.getText().charAt(txtEntry.getText().length()-1);
					String l = "" + last;
					if(!l.equals(btnPlus.getText()) && !l.equals(btnMinus.getText()) && !l.equals(btnMultiply.getText()) && !l.equals(btnDivide.getText()) && !l.equals(btnDot.getText())){
						txtEntry.setText(txtEntry.getText() + btnPlus.getText());
					}
				}
				else {
					txtEntry.setText(txtEntry.getText() + btnPlus.getText());
				}
				
				
				if(lblEntry.getText()==null) {
					lblEntry.setText(txtEntry.getText());
					txtEntry.setText("");
				}
				
				else {
					String text1 = lblEntry.getText();
					
					
					
					String text2 = txtEntry.getText();
					
					arithmetics(text1, text2, btnPlus.getText().charAt(0));
					
					lblEntry.setText(res);
					//System.out.println(res);
					txtEntry.setText("");
				}
				
			}
			
		});
		
		btnMinus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(txtEntry.getText().length()>0) {
					char last = txtEntry.getText().charAt(txtEntry.getText().length()-1);
					String l = "" + last;
					if(!l.equals(btnPlus.getText()) && !l.equals(btnMinus.getText()) && !l.equals(btnMultiply.getText()) && !l.equals(btnDivide.getText()) && !l.equals(btnDot.getText())){
						txtEntry.setText(txtEntry.getText() + btnMinus.getText());
					}
				}
				else {
					txtEntry.setText(txtEntry.getText() + btnMinus.getText());
				}
				
				if(lblEntry.getText()==null) {
					lblEntry.setText(txtEntry.getText());
					txtEntry.setText("");
				}
				
				else {
					String text1 = lblEntry.getText();
					
					String text2 = txtEntry.getText();
					
					arithmetics(text1, text2, btnMinus.getText().charAt(0));
					
					lblEntry.setText(res);

					txtEntry.setText("");
					
				}
				
			}
			
		});
		
		btnMultiply.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtEntry.getText().length()>0) {
					char last = txtEntry.getText().charAt(txtEntry.getText().length()-1);
					String l = "" + last;
					if(!l.equals(btnPlus.getText()) && !l.equals(btnMinus.getText()) && !l.equals(btnMultiply.getText()) && !l.equals(btnDivide.getText()) && !l.equals(btnDot.getText())){
						txtEntry.setText(txtEntry.getText() + btnMultiply.getText());
					}
				}
				
				if(lblEntry.getText()==null) {
					lblEntry.setText(txtEntry.getText());
					txtEntry.setText("");
				}
				
				else {
					String text1 = lblEntry.getText();
					
					String text2 = txtEntry.getText();
					
					arithmetics(text1, text2, btnMultiply.getText().charAt(0));
					
					lblEntry.setText(res);

					txtEntry.setText("");
				}
			}
			
		});
		
		btnDivide.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtEntry.getText().length()>0) {
					char last = txtEntry.getText().charAt(txtEntry.getText().length()-1);
					String l = "" + last;
					if(!l.equals(btnPlus.getText()) && !l.equals(btnMinus.getText()) && !l.equals(btnMultiply.getText()) && !l.equals(btnDivide.getText()) && !l.equals(btnDot.getText())){
						txtEntry.setText(txtEntry.getText() + btnDivide.getText());
					}
				}
				
				if(lblEntry.getText()==null) {
					lblEntry.setText(txtEntry.getText());
					txtEntry.setText("");
				}
				
				else {
					String text1 = lblEntry.getText();
					
					String text2 = txtEntry.getText();
					
					arithmetics(text1, text2, btnDivide.getText().charAt(0));
					
					lblEntry.setText(res);

					txtEntry.setText("");
				}
			}
			
		});
		
		btnCalculate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(lblEntry.getText()!=null && !txtEntry.getText().isEmpty()) {
					String text = lblEntry.getText();
					double number1=0;
					char sign='+';
					int flag = 1;
					boolean fractional = false;
					for(int i = 0; i < text.length(); i++) {
						char ch = text.charAt(i);
						if(ch>47 && ch<58 && !fractional) {
							String cha = ch + "";
							number1 = (number1 * 10) + Double.parseDouble(cha);
						}
						else if(ch>47 && ch<58 && fractional) {
							String cha = ch + "";
							flag *= 10;
							number1 += (Double.parseDouble(cha)/flag);
						}
						else if(ch==46) {
							fractional = true;
						}
						else {
							sign = ch;
						}
					}
					
					double number2=0;
					flag = 1;
					fractional = false;
					
					text = txtEntry.getText();
					for(int i = 0; i < text.length(); i++) {
						char ch = text.charAt(i);
						String cha = ch + "";
						if(!fractional) {
							if(ch!=46)
								number2 = (number2 * 10) + Double.parseDouble(cha);
							else {
								fractional = true;
							}
						}
						else {
							flag *= 10;
							number2 += (Double.parseDouble(cha)/flag);
						}
					}
					
					double result = 0;
					if(sign==43)
						result = number1 + number2;
					else if(sign==45)
						result = number1 - number2;
					else if(sign==42)
						result = number1 * number2;
					else {
						result = number1 / number2;
					}
					String res;
					if(result == 0.9999999999999998)
						result = 1;
					if(result%1 != 0)
						res = "" + result;
					else {
						res = "" + result;
						
							res = res.substring(0, res.length()-2);
						
					}
					
					txtEntry.setText(res);
					lblEntry.setText(null);
				}
				
				
				
			}
			
		});
		
		window.repaint();
	}
	
}
