package java_project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Main {

	 static JTextField textField1 = new JTextField("Input Here");
	 static JButton button = new JButton("Start");
	 static JButton button2 = new JButton("Quit");
	 static JButton b1 = new JButton("Check me");
	 static JButton b2 = new JButton("Give Up");
	 static JButton ba = new JButton("Try Again");
	 static JButton bb = new JButton("Reset");
	 static JButton bd = new JButton("Play Again");
	 
	    static int noofguesses1 = 1;
	 
	 	static int guess = 10;
		static int noofguesses = 1;
		static int i = 0;
		static int z = 0;
		
		static int guesses[] = new int[guess];
	 
	public static void main(String[] args) {

		 JFrame frame = new JFrame("Number Guessing Game");
		  frame.setVisible(true);
		  frame.setSize(700,500);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  final Font normal = new Font("Serif", Font.BOLD, 20);
		  Font myFont = new Font("Serif", Font.BOLD, 25);
		  JLabel label = new JLabel("*****NUMBER GUESSING GAME*****");
		  label.setFont(myFont);
		  final JLabel label2 = new JLabel("You have 10 chances to guess the number");
		  label2.setFont(normal);
		  JLabel label3 = new JLabel("Go ahead and click start to begin...");
		  label3.setFont(normal);
		  JPanel panel = new JPanel();
		  JPanel panel2 = new JPanel();
		  JPanel panel3 = new JPanel();
		  JPanel panel4 = new JPanel();
		  
		  GridLayout myLayout = new GridLayout(4,1); 
		  frame.setLayout(myLayout);
		 		  frame.add(panel);
		  frame.add(panel2);
		  frame.add(panel3);
		  frame.add(panel4);
		  
		  panel.add(label);
		  panel2.add(label2);
		  panel3.add(label3);
		  
		  
		 
		  panel4.add(button);
		  button.setBackground(Color.GREEN);
		  button.setForeground(Color.WHITE);
		  button.setSize(100, 50);
	
		  panel4.add(button2);
		  button2.setBackground(Color.RED);
		  button2.setForeground(Color.WHITE);
		  button2.setSize(100, 50);
		 
		  final int answer1 = (int)(Math.random()*100+1);
		  final int answer=(int)(Math.random()*100+1);
	
	button.addActionListener(new ActionListener() {        
		  public void actionPerformed (ActionEvent e) {     
		    JFrame frame2 = new JFrame("Good Luck!! You'll need it :)");
		    frame2.setVisible(true);
		    frame2.setSize(700,500);
		   
		    JLabel label4 = new JLabel("Guess a number between 0 and 100");
		    label4.setFont(normal);
		    Font myFont1 = new Font("Serif", Font.BOLD, 17);
		    label4.setFont(myFont1);
		    JPanel p = new JPanel();
		    JPanel p2 = new JPanel();
		    JPanel p3 = new JPanel();
		    GridLayout myLayout = new GridLayout(3,1);
		    frame2.setLayout(myLayout);
		    frame2.add(p);
		    frame2.add(p2);
		    frame2.add(p3);
		    p.add(label4);  
		    textField1.setEditable(true);
		    p2.add(textField1);
		    p3.add(b1);
		    b1.setBackground(Color.GRAY);
			  b1.setForeground(Color.WHITE);
		    p3.add(b2);
		    b2.setBackground(Color.RED);
			  b2.setForeground(Color.WHITE);
		    
		  }}
	);

	
	
	button2.addActionListener(new ActionListener() {         
		  public void actionPerformed (ActionEvent e) {     
			  System.exit(0);
		  }
	}
		);

 
		b1.addActionListener(new ActionListener() {        
			  public void actionPerformed (ActionEvent e) {   
				  
				String s = textField1.getText();
				  JFrame frame3 = new JFrame("Results:)");
				    frame3.setVisible(true);
				    frame3.setSize(700,500);
				    
			
				   
					s= textField1.getText();
					  guesses[i] = Integer.parseInt(s);
				 
					if(i<9) {
					    if(guesses[i] <=0 || guesses[i] > 100) {
					    		JLabel label5 = new JLabel("Your guess is invalid");
					    		Font myFont1 = new Font("Serif", Font.BOLD, 17);
					    		label5.setFont(myFont1);
					    		JPanel pnl1 = new JPanel();
					    		JPanel pnl2 = new JPanel();
					    		GridLayout myLayout2 = new GridLayout(2,1);
					    		frame3.setLayout(myLayout2);
					    		frame3.add(pnl1);
					    		frame3.add(pnl2);
					    		pnl1.add(label5);  
					    		pnl2.add(ba);
					    		ba.setBackground(Color.GRAY);
					  		  ba.setForeground(Color.WHITE);
					    		pnl2.add(bb);
					    		bb.setBackground(Color.GREEN);
					  		  bb.setForeground(Color.WHITE);
					    		pnl2.add(button2);
					    		button2.setBackground(Color.RED);
								  button2.setForeground(Color.WHITE);
					    	}
					    else if (guesses[i] == answer) {
					    	JLabel label5 = new JLabel("Correct! You got the answer ;) ");
					    	Font myFont1 = new Font("Serif", Font.BOLD, 17);
				    		label5.setFont(myFont1);
					    	JLabel label6 = new JLabel(" Guess number "+ noofguesses++);
				    		JPanel pnl1 = new JPanel();
				    		JPanel pnl2 = new JPanel();
				    		JPanel pnl3 = new JPanel();
				    		GridLayout myLayout2 = new GridLayout(3,1);
				    		frame3.setLayout(myLayout2);
				    		frame3.add(pnl1);
				    		frame3.add(pnl2);
				    		frame3.add(pnl3);
				    		pnl1.add(label5);  
				    		pnl2.add(label6);
				    		pnl3.add(bd);
				    		bd.setBackground(Color.GREEN);
					  		  bd.setForeground(Color.WHITE);
				    		pnl3.add(button2);
				    		button2.setBackground(Color.RED);
							  button2.setForeground(Color.WHITE);
							  if (i == 0) {
								  GridLayout gl = new GridLayout(4,1);
								  frame3.setLayout(gl);
								  JPanel pnl4 = new JPanel();
						  			JLabel label7 = new JLabel("You Guessed "+ guesses[i]);
						  			frame3.add(pnl4);
						  			pnl4.add(label7);
						  			
						  		}
						  		else if(i == 1) {
						  		  GridLayout gl1 = new GridLayout(5,1);
								  frame3.setLayout(gl1);
								  JPanel pnl4 = new JPanel();
								  JPanel pnl5 = new JPanel();
						  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-1]);
						  			JLabel label8 = new JLabel("You Guessed "+ guesses[i]);
						  			frame3.add(pnl4);
						  			frame3.add(pnl5);
						  			pnl4.add(label7);
						  			pnl5.add(label8);
						  		}
						  		else if(i == 2) {
						  			GridLayout gl2 = new GridLayout(6,1);
						  		  frame3.setLayout(gl2);
								  JPanel pnl4 = new JPanel();
								  JPanel pnl5 = new JPanel();
								  JPanel pnl6 = new JPanel();
						  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-2]);
						  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-1]);
						  			JLabel label9 = new JLabel("You Guessed "+ guesses[i]);
						  			frame3.add(pnl4);
						  			frame3.add(pnl5);
						  			frame3.add(pnl6);
						  			pnl4.add(label7);
						  			pnl5.add(label8);
						  			pnl6.add(label9);
						  		}
						  		else if(i == 3) {
						  			GridLayout gl3 = new GridLayout(7,1);
							  		  frame3.setLayout(gl3);
									  JPanel pnl4 = new JPanel();
									  JPanel pnl5 = new JPanel();
									  JPanel pnl6 = new JPanel();
									  JPanel pnl7 = new JPanel();
							  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-3]);
							  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-2]);
							  			JLabel label9 = new JLabel("You Guessed "+ guesses[i-1]);
							  			JLabel label10 = new JLabel("You Guessed "+ guesses[i]);
							  			frame3.add(pnl4);
							  			frame3.add(pnl5);
							  			frame3.add(pnl6);
							  			frame3.add(pnl7);
							  			pnl4.add(label7);
							  			pnl5.add(label8);
							  			pnl6.add(label9);
							  			pnl7.add(label10);
						  		}
						  		else if(i == 4) {
						  			GridLayout gl4 = new GridLayout(8,1);
							  		  frame3.setLayout(gl4);
									  JPanel pnl4 = new JPanel();
									  JPanel pnl5 = new JPanel();
									  JPanel pnl6 = new JPanel();
									  JPanel pnl7 = new JPanel();
									  JPanel pnl8 = new JPanel();
							  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-4]);
							  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-3]);
							  			JLabel label9 = new JLabel("You Guessed "+ guesses[i-2]);
							  			JLabel label10 = new JLabel("You Guessed "+ guesses[i-1]);
							  			JLabel label11 = new JLabel("You Guessed "+ guesses[i]);
							  			frame3.add(pnl4);
							  			frame3.add(pnl5);
							  			frame3.add(pnl6);
							  			frame3.add(pnl7);
							  			frame3.add(pnl8);
							  			pnl4.add(label7);
							  			pnl5.add(label8);
							  			pnl6.add(label9);
							  			pnl7.add(label10);
							  			pnl8.add(label11);
						  		}
						  		else if(i == 5) {
						  			GridLayout gl5 = new GridLayout(9,1);
							  		  frame3.setLayout(gl5);
									  JPanel pnl4 = new JPanel();
									  JPanel pnl5 = new JPanel();
									  JPanel pnl6 = new JPanel();
									  JPanel pnl7 = new JPanel();
									  JPanel pnl8 = new JPanel();
									  JPanel pnl9 = new JPanel();
							  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-5]);
							  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-4]);
							  			JLabel label9 = new JLabel("You Guessed "+ guesses[i-3]);
							  			JLabel label10 = new JLabel("You Guessed "+ guesses[i-2]);
							  			JLabel label11 = new JLabel("You Guessed "+ guesses[i-1]);
							  			JLabel label12 = new JLabel("You Guessed "+ guesses[i]);
							  			frame3.add(pnl4);
							  			frame3.add(pnl5);
							  			frame3.add(pnl6);
							  			frame3.add(pnl7);
							  			frame3.add(pnl8);
							  			frame3.add(pnl9);
							  			pnl4.add(label7);
							  			pnl5.add(label8);
							  			pnl6.add(label9);
							  			pnl7.add(label10);
							  			pnl8.add(label11);
							  			pnl9.add(label12);
						  		}
						  		else if(i == 6) {
						  			GridLayout gl6 = new GridLayout(10,1);
							  		  frame3.setLayout(gl6);
									  JPanel pnl4 = new JPanel();
									  JPanel pnl5 = new JPanel();
									  JPanel pnl6 = new JPanel();
									  JPanel pnl7 = new JPanel();
									  JPanel pnl8 = new JPanel();
									  JPanel pnl9 = new JPanel();
									  JPanel pnl10 = new JPanel();
							  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-6]);
							  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-5]);
							  			JLabel label9 = new JLabel("You Guessed "+ guesses[i-4]);
							  			JLabel label10 = new JLabel("You Guessed "+ guesses[i-3]);
							  			JLabel label11 = new JLabel("You Guessed "+ guesses[i-2]);
							  			JLabel label12 = new JLabel("You Guessed "+ guesses[i-1]);
							  			JLabel label13 = new JLabel("You Guessed "+ guesses[i]);
							  			frame3.add(pnl4);
							  			frame3.add(pnl5);
							  			frame3.add(pnl6);
							  			frame3.add(pnl7);
							  			frame3.add(pnl8);
							  			frame3.add(pnl9);
							  			frame3.add(pnl10);
							  			pnl4.add(label7);
							  			pnl5.add(label8);
							  			pnl6.add(label9);
							  			pnl7.add(label10);
							  			pnl8.add(label11);
							  			pnl9.add(label12);
							  			pnl10.add(label13);
						  		}
						  		else if(i == 7) {
						  			GridLayout gl7 = new GridLayout(11,1);
							  		  frame3.setLayout(gl7);
									  JPanel pnl4 = new JPanel();
									  JPanel pnl5 = new JPanel();
									  JPanel pnl6 = new JPanel();
									  JPanel pnl7 = new JPanel();
									  JPanel pnl8 = new JPanel();
									  JPanel pnl9 = new JPanel();
									  JPanel pnl10 = new JPanel();
									  JPanel pnl11 = new JPanel();
							  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-7]);
							  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-6]);
							  			JLabel label9 = new JLabel("You Guessed "+ guesses[i-5]);
							  			JLabel label10 = new JLabel("You Guessed "+ guesses[i-4]);
							  			JLabel label11 = new JLabel("You Guessed "+ guesses[i-3]);
							  			JLabel label12 = new JLabel("You Guessed "+ guesses[i-2]);
							  			JLabel label13 = new JLabel("You Guessed "+ guesses[i-1]);
							  			JLabel label14 = new JLabel("You Guessed "+ guesses[i]);
							  			frame3.add(pnl4);
							  			frame3.add(pnl5);
							  			frame3.add(pnl6);
							  			frame3.add(pnl7);
							  			frame3.add(pnl8);
							  			frame3.add(pnl9);
							  			frame3.add(pnl10);
							  			frame3.add(pnl11);
							  			pnl4.add(label7);
							  			pnl5.add(label8);
							  			pnl6.add(label9);
							  			pnl7.add(label10);
							  			pnl8.add(label11);
							  			pnl9.add(label12);
							  			pnl10.add(label13);
							  			pnl11.add(label14);
						  		}
						  		else if(i == 8) {
						  			GridLayout gl8 = new GridLayout(12,1);
							  		  frame3.setLayout(gl8);
									  JPanel pnl4 = new JPanel();
									  JPanel pnl5 = new JPanel();
									  JPanel pnl6 = new JPanel();
									  JPanel pnl7 = new JPanel();
									  JPanel pnl8 = new JPanel();
									  JPanel pnl9 = new JPanel();
									  JPanel pnl10 = new JPanel();
									  JPanel pnl11 = new JPanel();
									  JPanel pnl12 = new JPanel();
							  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-8]);
							  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-7]);
							  			JLabel label9 = new JLabel("You Guessed "+ guesses[i-6]);
							  			JLabel label10 = new JLabel("You Guessed "+ guesses[i-5]);
							  			JLabel label11 = new JLabel("You Guessed "+ guesses[i-4]);
							  			JLabel label12 = new JLabel("You Guessed "+ guesses[i-3]);
							  			JLabel label13 = new JLabel("You Guessed "+ guesses[i-2]);
							  			JLabel label14 = new JLabel("You Guessed "+ guesses[i-1]);
							  			JLabel label15 = new JLabel("You Guessed "+ guesses[i]);
							  			frame3.add(pnl4);
							  			frame3.add(pnl5);
							  			frame3.add(pnl6);
							  			frame3.add(pnl7);
							  			frame3.add(pnl8);
							  			frame3.add(pnl9);
							  			frame3.add(pnl10);
							  			frame3.add(pnl11);
							  			frame3.add(pnl12);
							  			pnl4.add(label7);
							  			pnl5.add(label8);
							  			pnl6.add(label9);
							  			pnl7.add(label10);
							  			pnl8.add(label11);
							  			pnl9.add(label12);
							  			pnl10.add(label13);
							  			pnl11.add(label14);
							  			pnl12.add(label15);
						  		}
					    	}
					    else if (guesses[i] < answer) {
					    	JLabel label5 = new JLabel("Your guess is too low, try again...");
					    	Font myFont1 = new Font("Serif", Font.BOLD, 17);
				    		label5.setFont(myFont1);
					    	JLabel label6 = new JLabel(" Guess number "+ noofguesses++);
				    		JPanel pnl1 = new JPanel();
				    		JPanel pnl2 = new JPanel();
				    		JPanel pnl3 = new JPanel();
				    		GridLayout myLayout2 = new GridLayout(3,1);
				    		frame3.setLayout(myLayout2);
				    		frame3.add(pnl1);
				    		frame3.add(pnl2);
				    		frame3.add(pnl3);
				    		pnl1.add(label5);  
				    		pnl2.add(label6);
				    		pnl3.add(ba);
				    		ba.setBackground(Color.GRAY);
							  ba.setForeground(Color.WHITE);
				    		pnl3.add(bb);
				    		bb.setBackground(Color.GREEN);
					  		  bb.setForeground(Color.WHITE);
				    		pnl3.add(button2);
				    		button2.setBackground(Color.RED);
							  button2.setForeground(Color.WHITE);
							  if (i == 0) {
								  GridLayout gl = new GridLayout(4,1);
								  frame3.setLayout(gl);
								  JPanel pnl4 = new JPanel();
						  			JLabel label7 = new JLabel("You Guessed "+ guesses[i]);
						  			frame3.add(pnl4);
						  			pnl4.add(label7);
						  			
						  		}
						  		else if(i == 1) {
						  		  GridLayout gl1 = new GridLayout(5,1);
								  frame3.setLayout(gl1);
								  JPanel pnl4 = new JPanel();
								  JPanel pnl5 = new JPanel();
						  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-1]);
						  			JLabel label8 = new JLabel("You Guessed "+ guesses[i]);
						  			frame3.add(pnl4);
						  			frame3.add(pnl5);
						  			pnl4.add(label7);
						  			pnl5.add(label8);
						  		}
						  		else if(i == 2) {
						  			GridLayout gl2 = new GridLayout(6,1);
						  		  frame3.setLayout(gl2);
								  JPanel pnl4 = new JPanel();
								  JPanel pnl5 = new JPanel();
								  JPanel pnl6 = new JPanel();
						  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-2]);
						  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-1]);
						  			JLabel label9 = new JLabel("You Guessed "+ guesses[i]);
						  			frame3.add(pnl4);
						  			frame3.add(pnl5);
						  			frame3.add(pnl6);
						  			pnl4.add(label7);
						  			pnl5.add(label8);
						  			pnl6.add(label9);
						  		}
						  		else if(i == 3) {
						  			GridLayout gl3 = new GridLayout(7,1);
							  		  frame3.setLayout(gl3);
									  JPanel pnl4 = new JPanel();
									  JPanel pnl5 = new JPanel();
									  JPanel pnl6 = new JPanel();
									  JPanel pnl7 = new JPanel();
							  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-3]);
							  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-2]);
							  			JLabel label9 = new JLabel("You Guessed "+ guesses[i-1]);
							  			JLabel label10 = new JLabel("You Guessed "+ guesses[i]);
							  			frame3.add(pnl4);
							  			frame3.add(pnl5);
							  			frame3.add(pnl6);
							  			frame3.add(pnl7);
							  			pnl4.add(label7);
							  			pnl5.add(label8);
							  			pnl6.add(label9);
							  			pnl7.add(label10);
						  		}
						  		else if(i == 4) {
						  			GridLayout gl4 = new GridLayout(8,1);
							  		  frame3.setLayout(gl4);
									  JPanel pnl4 = new JPanel();
									  JPanel pnl5 = new JPanel();
									  JPanel pnl6 = new JPanel();
									  JPanel pnl7 = new JPanel();
									  JPanel pnl8 = new JPanel();
							  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-4]);
							  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-3]);
							  			JLabel label9 = new JLabel("You Guessed "+ guesses[i-2]);
							  			JLabel label10 = new JLabel("You Guessed "+ guesses[i-1]);
							  			JLabel label11 = new JLabel("You Guessed "+ guesses[i]);
							  			frame3.add(pnl4);
							  			frame3.add(pnl5);
							  			frame3.add(pnl6);
							  			frame3.add(pnl7);
							  			frame3.add(pnl8);
							  			pnl4.add(label7);
							  			pnl5.add(label8);
							  			pnl6.add(label9);
							  			pnl7.add(label10);
							  			pnl8.add(label11);
						  		}
						  		else if(i == 5) {
						  			GridLayout gl5 = new GridLayout(9,1);
							  		  frame3.setLayout(gl5);
									  JPanel pnl4 = new JPanel();
									  JPanel pnl5 = new JPanel();
									  JPanel pnl6 = new JPanel();
									  JPanel pnl7 = new JPanel();
									  JPanel pnl8 = new JPanel();
									  JPanel pnl9 = new JPanel();
							  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-5]);
							  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-4]);
							  			JLabel label9 = new JLabel("You Guessed "+ guesses[i-3]);
							  			JLabel label10 = new JLabel("You Guessed "+ guesses[i-2]);
							  			JLabel label11 = new JLabel("You Guessed "+ guesses[i-1]);
							  			JLabel label12 = new JLabel("You Guessed "+ guesses[i]);
							  			frame3.add(pnl4);
							  			frame3.add(pnl5);
							  			frame3.add(pnl6);
							  			frame3.add(pnl7);
							  			frame3.add(pnl8);
							  			frame3.add(pnl9);
							  			pnl4.add(label7);
							  			pnl5.add(label8);
							  			pnl6.add(label9);
							  			pnl7.add(label10);
							  			pnl8.add(label11);
							  			pnl9.add(label12);
						  		}
						  		else if(i == 6) {
						  			GridLayout gl6 = new GridLayout(10,1);
							  		  frame3.setLayout(gl6);
									  JPanel pnl4 = new JPanel();
									  JPanel pnl5 = new JPanel();
									  JPanel pnl6 = new JPanel();
									  JPanel pnl7 = new JPanel();
									  JPanel pnl8 = new JPanel();
									  JPanel pnl9 = new JPanel();
									  JPanel pnl10 = new JPanel();
							  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-6]);
							  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-5]);
							  			JLabel label9 = new JLabel("You Guessed "+ guesses[i-4]);
							  			JLabel label10 = new JLabel("You Guessed "+ guesses[i-3]);
							  			JLabel label11 = new JLabel("You Guessed "+ guesses[i-2]);
							  			JLabel label12 = new JLabel("You Guessed "+ guesses[i-1]);
							  			JLabel label13 = new JLabel("You Guessed "+ guesses[i]);
							  			frame3.add(pnl4);
							  			frame3.add(pnl5);
							  			frame3.add(pnl6);
							  			frame3.add(pnl7);
							  			frame3.add(pnl8);
							  			frame3.add(pnl9);
							  			frame3.add(pnl10);
							  			pnl4.add(label7);
							  			pnl5.add(label8);
							  			pnl6.add(label9);
							  			pnl7.add(label10);
							  			pnl8.add(label11);
							  			pnl9.add(label12);
							  			pnl10.add(label13);
						  		}
						  		else if(i == 7) {
						  			GridLayout gl7 = new GridLayout(11,1);
							  		  frame3.setLayout(gl7);
									  JPanel pnl4 = new JPanel();
									  JPanel pnl5 = new JPanel();
									  JPanel pnl6 = new JPanel();
									  JPanel pnl7 = new JPanel();
									  JPanel pnl8 = new JPanel();
									  JPanel pnl9 = new JPanel();
									  JPanel pnl10 = new JPanel();
									  JPanel pnl11 = new JPanel();
							  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-7]);
							  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-6]);
							  			JLabel label9 = new JLabel("You Guessed "+ guesses[i-5]);
							  			JLabel label10 = new JLabel("You Guessed "+ guesses[i-4]);
							  			JLabel label11 = new JLabel("You Guessed "+ guesses[i-3]);
							  			JLabel label12 = new JLabel("You Guessed "+ guesses[i-2]);
							  			JLabel label13 = new JLabel("You Guessed "+ guesses[i-1]);
							  			JLabel label14 = new JLabel("You Guessed "+ guesses[i]);
							  			frame3.add(pnl4);
							  			frame3.add(pnl5);
							  			frame3.add(pnl6);
							  			frame3.add(pnl7);
							  			frame3.add(pnl8);
							  			frame3.add(pnl9);
							  			frame3.add(pnl10);
							  			frame3.add(pnl11);
							  			pnl4.add(label7);
							  			pnl5.add(label8);
							  			pnl6.add(label9);
							  			pnl7.add(label10);
							  			pnl8.add(label11);
							  			pnl9.add(label12);
							  			pnl10.add(label13);
							  			pnl11.add(label14);
						  		}
						  		else if(i == 8) {
						  			GridLayout gl8 = new GridLayout(12,1);
							  		  frame3.setLayout(gl8);
									  JPanel pnl4 = new JPanel();
									  JPanel pnl5 = new JPanel();
									  JPanel pnl6 = new JPanel();
									  JPanel pnl7 = new JPanel();
									  JPanel pnl8 = new JPanel();
									  JPanel pnl9 = new JPanel();
									  JPanel pnl10 = new JPanel();
									  JPanel pnl11 = new JPanel();
									  JPanel pnl12 = new JPanel();
							  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-8]);
							  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-7]);
							  			JLabel label9 = new JLabel("You Guessed "+ guesses[i-6]);
							  			JLabel label10 = new JLabel("You Guessed "+ guesses[i-5]);
							  			JLabel label11 = new JLabel("You Guessed "+ guesses[i-4]);
							  			JLabel label12 = new JLabel("You Guessed "+ guesses[i-3]);
							  			JLabel label13 = new JLabel("You Guessed "+ guesses[i-2]);
							  			JLabel label14 = new JLabel("You Guessed "+ guesses[i-1]);
							  			JLabel label15 = new JLabel("You Guessed "+ guesses[i]);
							  			frame3.add(pnl4);
							  			frame3.add(pnl5);
							  			frame3.add(pnl6);
							  			frame3.add(pnl7);
							  			frame3.add(pnl8);
							  			frame3.add(pnl9);
							  			frame3.add(pnl10);
							  			frame3.add(pnl11);
							  			frame3.add(pnl12);
							  			pnl4.add(label7);
							  			pnl5.add(label8);
							  			pnl6.add(label9);
							  			pnl7.add(label10);
							  			pnl8.add(label11);
							  			pnl9.add(label12);
							  			pnl10.add(label13);
							  			pnl11.add(label14);
							  			pnl12.add(label15);
						  		}
					    }
					    else if (guesses[i] > answer) {
					    	JLabel label5 = new JLabel("Your guess is too high, try again...");
					    	Font myFont1 = new Font("Serif", Font.BOLD, 17);
				    		label5.setFont(myFont1);
					    	JLabel label6 = new JLabel(" Guess number "+ noofguesses++);
				    		JPanel pnl1 = new JPanel();
				    		JPanel pnl2 = new JPanel();
				    		JPanel pnl3 = new JPanel();
				    		GridLayout myLayout2 = new GridLayout(3,1);
				    		frame3.setLayout(myLayout2);
				    		frame3.add(pnl1);
				    		frame3.add(pnl2);
				    		frame3.add(pnl3);
				    		pnl1.add(label5);  
				    		pnl2.add(label6);
				    		pnl3.add(ba);
				    		ba.setBackground(Color.GRAY);
							  ba.setForeground(Color.WHITE);
				    		pnl3.add(bb);
				    		bb.setBackground(Color.GREEN);
					  		  bb.setForeground(Color.WHITE);
				    		pnl3.add(button2);
				    		button2.setBackground(Color.RED);
							  button2.setForeground(Color.WHITE);
							  
							  if (i == 0) {
								  GridLayout gl = new GridLayout(4,1);
								  frame3.setLayout(gl);
								  JPanel pnl4 = new JPanel();
						  			JLabel label7 = new JLabel("You Guessed "+ guesses[i]);
						  			frame3.add(pnl4);
						  			pnl4.add(label7);
						  			
						  		}
						  		else if(i == 1) {
						  		  GridLayout gl1 = new GridLayout(5,1);
								  frame3.setLayout(gl1);
								  JPanel pnl4 = new JPanel();
								  JPanel pnl5 = new JPanel();
						  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-1]);
						  			JLabel label8 = new JLabel("You Guessed "+ guesses[i]);
						  			frame3.add(pnl4);
						  			frame3.add(pnl5);
						  			pnl4.add(label7);
						  			pnl5.add(label8);
						  		}
						  		else if(i == 2) {
						  			GridLayout gl2 = new GridLayout(6,1);
						  		  frame3.setLayout(gl2);
								  JPanel pnl4 = new JPanel();
								  JPanel pnl5 = new JPanel();
								  JPanel pnl6 = new JPanel();
						  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-2]);
						  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-1]);
						  			JLabel label9 = new JLabel("You Guessed "+ guesses[i]);
						  			frame3.add(pnl4);
						  			frame3.add(pnl5);
						  			frame3.add(pnl6);
						  			pnl4.add(label7);
						  			pnl5.add(label8);
						  			pnl6.add(label9);
						  		}
						  		else if(i == 3) {
						  			GridLayout gl3 = new GridLayout(7,1);
							  		  frame3.setLayout(gl3);
									  JPanel pnl4 = new JPanel();
									  JPanel pnl5 = new JPanel();
									  JPanel pnl6 = new JPanel();
									  JPanel pnl7 = new JPanel();
							  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-3]);
							  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-2]);
							  			JLabel label9 = new JLabel("You Guessed "+ guesses[i-1]);
							  			JLabel label10 = new JLabel("You Guessed "+ guesses[i]);
							  			frame3.add(pnl4);
							  			frame3.add(pnl5);
							  			frame3.add(pnl6);
							  			frame3.add(pnl7);
							  			pnl4.add(label7);
							  			pnl5.add(label8);
							  			pnl6.add(label9);
							  			pnl7.add(label10);
						  		}
						  		else if(i == 4) {
						  			GridLayout gl4 = new GridLayout(8,1);
							  		  frame3.setLayout(gl4);
									  JPanel pnl4 = new JPanel();
									  JPanel pnl5 = new JPanel();
									  JPanel pnl6 = new JPanel();
									  JPanel pnl7 = new JPanel();
									  JPanel pnl8 = new JPanel();
							  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-4]);
							  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-3]);
							  			JLabel label9 = new JLabel("You Guessed "+ guesses[i-2]);
							  			JLabel label10 = new JLabel("You Guessed "+ guesses[i-1]);
							  			JLabel label11 = new JLabel("You Guessed "+ guesses[i]);
							  			frame3.add(pnl4);
							  			frame3.add(pnl5);
							  			frame3.add(pnl6);
							  			frame3.add(pnl7);
							  			frame3.add(pnl8);
							  			pnl4.add(label7);
							  			pnl5.add(label8);
							  			pnl6.add(label9);
							  			pnl7.add(label10);
							  			pnl8.add(label11);
						  		}
						  		else if(i == 5) {
						  			GridLayout gl5 = new GridLayout(9,1);
							  		  frame3.setLayout(gl5);
									  JPanel pnl4 = new JPanel();
									  JPanel pnl5 = new JPanel();
									  JPanel pnl6 = new JPanel();
									  JPanel pnl7 = new JPanel();
									  JPanel pnl8 = new JPanel();
									  JPanel pnl9 = new JPanel();
							  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-5]);
							  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-4]);
							  			JLabel label9 = new JLabel("You Guessed "+ guesses[i-3]);
							  			JLabel label10 = new JLabel("You Guessed "+ guesses[i-2]);
							  			JLabel label11 = new JLabel("You Guessed "+ guesses[i-1]);
							  			JLabel label12 = new JLabel("You Guessed "+ guesses[i]);
							  			frame3.add(pnl4);
							  			frame3.add(pnl5);
							  			frame3.add(pnl6);
							  			frame3.add(pnl7);
							  			frame3.add(pnl8);
							  			frame3.add(pnl9);
							  			pnl4.add(label7);
							  			pnl5.add(label8);
							  			pnl6.add(label9);
							  			pnl7.add(label10);
							  			pnl8.add(label11);
							  			pnl9.add(label12);
						  		}
						  		else if(i == 6) {
						  			GridLayout gl6 = new GridLayout(10,1);
							  		  frame3.setLayout(gl6);
									  JPanel pnl4 = new JPanel();
									  JPanel pnl5 = new JPanel();
									  JPanel pnl6 = new JPanel();
									  JPanel pnl7 = new JPanel();
									  JPanel pnl8 = new JPanel();
									  JPanel pnl9 = new JPanel();
									  JPanel pnl10 = new JPanel();
							  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-6]);
							  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-5]);
							  			JLabel label9 = new JLabel("You Guessed "+ guesses[i-4]);
							  			JLabel label10 = new JLabel("You Guessed "+ guesses[i-3]);
							  			JLabel label11 = new JLabel("You Guessed "+ guesses[i-2]);
							  			JLabel label12 = new JLabel("You Guessed "+ guesses[i-1]);
							  			JLabel label13 = new JLabel("You Guessed "+ guesses[i]);
							  			frame3.add(pnl4);
							  			frame3.add(pnl5);
							  			frame3.add(pnl6);
							  			frame3.add(pnl7);
							  			frame3.add(pnl8);
							  			frame3.add(pnl9);
							  			frame3.add(pnl10);
							  			pnl4.add(label7);
							  			pnl5.add(label8);
							  			pnl6.add(label9);
							  			pnl7.add(label10);
							  			pnl8.add(label11);
							  			pnl9.add(label12);
							  			pnl10.add(label13);
						  		}
						  		else if(i == 7) {
						  			GridLayout gl7 = new GridLayout(11,1);
							  		  frame3.setLayout(gl7);
									  JPanel pnl4 = new JPanel();
									  JPanel pnl5 = new JPanel();
									  JPanel pnl6 = new JPanel();
									  JPanel pnl7 = new JPanel();
									  JPanel pnl8 = new JPanel();
									  JPanel pnl9 = new JPanel();
									  JPanel pnl10 = new JPanel();
									  JPanel pnl11 = new JPanel();
							  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-7]);
							  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-6]);
							  			JLabel label9 = new JLabel("You Guessed "+ guesses[i-5]);
							  			JLabel label10 = new JLabel("You Guessed "+ guesses[i-4]);
							  			JLabel label11 = new JLabel("You Guessed "+ guesses[i-3]);
							  			JLabel label12 = new JLabel("You Guessed "+ guesses[i-2]);
							  			JLabel label13 = new JLabel("You Guessed "+ guesses[i-1]);
							  			JLabel label14 = new JLabel("You Guessed "+ guesses[i]);
							  			frame3.add(pnl4);
							  			frame3.add(pnl5);
							  			frame3.add(pnl6);
							  			frame3.add(pnl7);
							  			frame3.add(pnl8);
							  			frame3.add(pnl9);
							  			frame3.add(pnl10);
							  			frame3.add(pnl11);
							  			pnl4.add(label7);
							  			pnl5.add(label8);
							  			pnl6.add(label9);
							  			pnl7.add(label10);
							  			pnl8.add(label11);
							  			pnl9.add(label12);
							  			pnl10.add(label13);
							  			pnl11.add(label14);
						  		}
						  		else if(i == 8) {
						  			GridLayout gl8 = new GridLayout(12,1);
							  		  frame3.setLayout(gl8);
									  JPanel pnl4 = new JPanel();
									  JPanel pnl5 = new JPanel();
									  JPanel pnl6 = new JPanel();
									  JPanel pnl7 = new JPanel();
									  JPanel pnl8 = new JPanel();
									  JPanel pnl9 = new JPanel();
									  JPanel pnl10 = new JPanel();
									  JPanel pnl11 = new JPanel();
									  JPanel pnl12 = new JPanel();
							  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-8]);
							  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-7]);
							  			JLabel label9 = new JLabel("You Guessed "+ guesses[i-6]);
							  			JLabel label10 = new JLabel("You Guessed "+ guesses[i-5]);
							  			JLabel label11 = new JLabel("You Guessed "+ guesses[i-4]);
							  			JLabel label12 = new JLabel("You Guessed "+ guesses[i-3]);
							  			JLabel label13 = new JLabel("You Guessed "+ guesses[i-2]);
							  			JLabel label14 = new JLabel("You Guessed "+ guesses[i-1]);
							  			JLabel label15 = new JLabel("You Guessed "+ guesses[i]);
							  			frame3.add(pnl4);
							  			frame3.add(pnl5);
							  			frame3.add(pnl6);
							  			frame3.add(pnl7);
							  			frame3.add(pnl8);
							  			frame3.add(pnl9);
							  			frame3.add(pnl10);
							  			frame3.add(pnl11);
							  			frame3.add(pnl12);
							  			pnl4.add(label7);
							  			pnl5.add(label8);
							  			pnl6.add(label9);
							  			pnl7.add(label10);
							  			pnl8.add(label11);
							  			pnl9.add(label12);
							  			pnl10.add(label13);
							  			pnl11.add(label14);
							  			pnl12.add(label15);
						  		}
					    }
					    
					    i++;
					     } 
					else if(i==9){
						 if(guesses[i] <=0 || guesses[i] > 100) {
					    		JLabel label5 = new JLabel("Your guess is invalid");
					    		Font myFont1 = new Font("Serif", Font.BOLD, 17);
					    		label5.setFont(myFont1);
					    		JPanel pnl1 = new JPanel();
					    		JPanel pnl2 = new JPanel();
					    		GridLayout myLayout2 = new GridLayout(2,1);
					    		frame3.setLayout(myLayout2);
					    		frame3.add(pnl1);
					    		frame3.add(pnl2);
					    		pnl1.add(label5);  
					    		pnl2.add(ba);
					    		ba.setBackground(Color.GRAY);
								  ba.setForeground(Color.WHITE);
					    		pnl2.add(bb);
					    		bb.setBackground(Color.GREEN);
						  		  bb.setForeground(Color.WHITE);
					    		pnl2.add(button2);
					    		button2.setBackground(Color.RED);
								  button2.setForeground(Color.WHITE);
					    	}
					    else if (guesses[i] == answer) {
					    	JLabel label5 = new JLabel("Correct! You got the answer ;) ");
					    	Font myFont1 = new Font("Serif", Font.BOLD, 17);
				    		label5.setFont(myFont1);
					    	JLabel label6 = new JLabel(" Guess number "+ noofguesses++);
				    		JPanel pnl1 = new JPanel();
				    		JPanel pnl2 = new JPanel();
				    		JPanel pnl3 = new JPanel();
				    		GridLayout myLayout2 = new GridLayout(3,1);
				    		frame3.setLayout(myLayout2);
				    		frame3.add(pnl1);
				    		frame3.add(pnl2);
				    		frame3.add(pnl3);
				    		pnl1.add(label5);  
				    		pnl2.add(label6);
				    		pnl3.add(bd);
				    		bd.setBackground(Color.GREEN);
					  		  bd.setForeground(Color.WHITE);
				    		pnl3.add(button2);
				    		button2.setBackground(Color.RED);
							  button2.setForeground(Color.WHITE);
							  
							  GridLayout gl9 = new GridLayout(13,1);
					  		  frame3.setLayout(gl9);
							  JPanel pnl4 = new JPanel();
							  JPanel pnl5 = new JPanel();
							  JPanel pnl6 = new JPanel();
							  JPanel pnl7 = new JPanel();
							  JPanel pnl8 = new JPanel();
							  JPanel pnl9 = new JPanel();
							  JPanel pnl10 = new JPanel();
							  JPanel pnl11 = new JPanel();
							  JPanel pnl12 = new JPanel();
							  JPanel pnl13 = new JPanel();
					  			JLabel label7 = new JLabel("You Guessed "+ guesses[i-9]);
					  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-8]);
					  			JLabel label9 = new JLabel("You Guessed "+ guesses[i-7]);
					  			JLabel label10 = new JLabel("You Guessed "+ guesses[i-6]);
					  			JLabel label11 = new JLabel("You Guessed "+ guesses[i-5]);
					  			JLabel label12 = new JLabel("You Guessed "+ guesses[i-4]);
					  			JLabel label13 = new JLabel("You Guessed "+ guesses[i-3]);
					  			JLabel label14 = new JLabel("You Guessed "+ guesses[i-2]);
					  			JLabel label15 = new JLabel("You Guessed "+ guesses[i-1]);
					  			JLabel label16 = new JLabel("You Guessed "+ guesses[i]);
					  			frame3.add(pnl4);
					  			frame3.add(pnl5);
					  			frame3.add(pnl6);
					  			frame3.add(pnl7);
					  			frame3.add(pnl8);
					  			frame3.add(pnl9);
					  			frame3.add(pnl10);
					  			frame3.add(pnl11);
					  			frame3.add(pnl12);
					  			frame3.add(pnl13);
					  			pnl4.add(label7);
					  			pnl5.add(label8);
					  			pnl6.add(label9);
					  			pnl7.add(label10);
					  			pnl8.add(label11);
					  			pnl9.add(label12);
					  			pnl10.add(label13);
					  			pnl11.add(label14);
					  			pnl12.add(label15);
					  			pnl13.add(label16);
				    		
				    	
					    	}
					    else if (guesses[i] < answer) {
					    	JLabel label5 = new JLabel("Your guess is too low...");
					    	Font myFont1 = new Font("Serif", Font.BOLD, 17);
				    		label5.setFont(myFont1);
					    	JLabel label6 = new JLabel(" Guess number "+ noofguesses++);
					    	JLabel label7 = new JLabel("You Lose :(");
				    		JPanel pnl1 = new JPanel();
				    		JPanel pnl2 = new JPanel();
				    		JPanel pnl3 = new JPanel();
				    		JPanel pnl4 = new JPanel();
				    		GridLayout myLayout2 = new GridLayout(4,1);
				    		frame3.setLayout(myLayout2);
				    		frame3.add(pnl1);
				    		frame3.add(pnl2);
				    		frame3.add(pnl3);
				    		frame3.add(pnl4);
				    		pnl1.add(label5);  
				    		pnl2.add(label6);
				    		pnl3.add(label7);    		
				    		pnl4.add(bb);
				    		bb.setBackground(Color.GREEN);
					  		  bb.setForeground(Color.WHITE);
				    		pnl4.add(button2);
				    		button2.setBackground(Color.RED);
							  button2.setForeground(Color.WHITE);
							  GridLayout gl21 = new GridLayout(13,1);
					  		  frame3.setLayout(gl21);
							  JPanel pnl5 = new JPanel();
							  JPanel pnl6 = new JPanel();
							  JPanel pnl7 = new JPanel();
							  JPanel pnl8 = new JPanel();
							  JPanel pnl9 = new JPanel();
							  JPanel pnl10 = new JPanel();
							  JPanel pnl11 = new JPanel();
							  JPanel pnl12 = new JPanel();
							  JPanel pnl13 = new JPanel();
							  JPanel pnl14 = new JPanel();
					  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-9]);
					  			JLabel label9 = new JLabel("You Guessed "+ guesses[i-8]);
					  			JLabel label10 = new JLabel("You Guessed "+ guesses[i-7]);
					  			JLabel label11 = new JLabel("You Guessed "+ guesses[i-6]);
					  			JLabel label12 = new JLabel("You Guessed "+ guesses[i-5]);
					  			JLabel label13 = new JLabel("You Guessed "+ guesses[i-4]);
					  			JLabel label14 = new JLabel("You Guessed "+ guesses[i-3]);
					  			JLabel label15 = new JLabel("You Guessed "+ guesses[i-2]);
					  			JLabel label16 = new JLabel("You Guessed "+ guesses[i-1]);
					  			JLabel label17 = new JLabel("You Guessed "+ guesses[i]);
					  			frame3.add(pnl5);
					  			frame3.add(pnl6);
					  			frame3.add(pnl7);
					  			frame3.add(pnl8);
					  			frame3.add(pnl9);
					  			frame3.add(pnl10);
					  			frame3.add(pnl11);
					  			frame3.add(pnl12);
					  			frame3.add(pnl13);
					  			frame3.add(pnl14);
					  			pnl5.add(label8);
					  			pnl6.add(label9);
					  			pnl7.add(label10);
					  			pnl8.add(label11);
					  			pnl9.add(label12);
					  			pnl10.add(label13);
					  			pnl11.add(label14);
					  			pnl12.add(label15);
					  			pnl13.add(label16);
					  			pnl14.add(label17);
					    }
					    else if (guesses[i] > answer) {
					    	JLabel label5 = new JLabel("Your guess is too high...");
					    	Font myFont1 = new Font("Serif", Font.BOLD, 17);
				    		label5.setFont(myFont1);
					    	JLabel label6 = new JLabel(" Guess number "+ noofguesses++);
					    	JLabel label7 = new JLabel("You Lose :(");
				    		JPanel pnl1 = new JPanel();
				    		JPanel pnl2 = new JPanel();
				    		JPanel pnl3 = new JPanel();
				    		JPanel pnl4 = new JPanel();
				    		GridLayout myLayoute = new GridLayout(4,1);
				    		frame3.setLayout(myLayoute);
				    		frame3.add(pnl1);
				    		frame3.add(pnl2);
				    		frame3.add(pnl3);
				    		frame3.add(pnl4);
				    		pnl1.add(label5);  
				    		pnl2.add(label6);
				    		pnl3.add(label7);
				    		pnl4.add(bb);
				    		bb.setBackground(Color.GREEN);
					  		  bb.setForeground(Color.WHITE);
				    		pnl4.add(button2);
				    		button2.setBackground(Color.RED);
							  button2.setForeground(Color.WHITE);
							  GridLayout gl21 = new GridLayout(13,1);
					  		  frame3.setLayout(gl21);
							  JPanel pnl5 = new JPanel();
							  JPanel pnl6 = new JPanel();
							  JPanel pnl7 = new JPanel();
							  JPanel pnl8 = new JPanel();
							  JPanel pnl9 = new JPanel();
							  JPanel pnl10 = new JPanel();
							  JPanel pnl11 = new JPanel();
							  JPanel pnl12 = new JPanel();
							  JPanel pnl13 = new JPanel();
							  JPanel pnl14 = new JPanel();
					  			JLabel label8 = new JLabel("You Guessed "+ guesses[i-9]);
					  			JLabel label9 = new JLabel("You Guessed "+ guesses[i-8]);
					  			JLabel label10 = new JLabel("You Guessed "+ guesses[i-7]);
					  			JLabel label11 = new JLabel("You Guessed "+ guesses[i-6]);
					  			JLabel label12 = new JLabel("You Guessed "+ guesses[i-5]);
					  			JLabel label13 = new JLabel("You Guessed "+ guesses[i-4]);
					  			JLabel label14 = new JLabel("You Guessed "+ guesses[i-3]);
					  			JLabel label15 = new JLabel("You Guessed "+ guesses[i-2]);
					  			JLabel label16 = new JLabel("You Guessed "+ guesses[i-1]);
					  			JLabel label17 = new JLabel("You Guessed "+ guesses[i]);
					  			frame3.add(pnl5);
					  			frame3.add(pnl6);
					  			frame3.add(pnl7);
					  			frame3.add(pnl8);
					  			frame3.add(pnl9);
					  			frame3.add(pnl10);
					  			frame3.add(pnl11);
					  			frame3.add(pnl12);
					  			frame3.add(pnl13);
					  			frame3.add(pnl14);
					  			pnl5.add(label8);
					  			pnl6.add(label9);
					  			pnl7.add(label10);
					  			pnl8.add(label11);
					  			pnl9.add(label12);
					  			pnl10.add(label13);
					  			pnl11.add(label14);
					  			pnl12.add(label15);
					  			pnl13.add(label16);
					  			pnl14.add(label17);
					    }
					}
		 }
	  }
		);
	
		
			  b2.addActionListener(new ActionListener() {        
				  public void actionPerformed (ActionEvent e) {     
					  System.exit(0);
				  }
			  }
			  );
			  
			  ba.addActionListener(new ActionListener() {         
				  public void actionPerformed (ActionEvent e) {     
					  JFrame frame2 = new JFrame("Good Luck!! You'll need it :)");
					    frame2.setVisible(true);
					    frame2.setSize(700,500);
					   
					    JLabel label4 = new JLabel("Guess a number between 0 and 100");
					    Font myFont1 = new Font("Serif", Font.BOLD, 17);
			    		label4.setFont(myFont1);
					    JPanel p = new JPanel();
					    JPanel p2 = new JPanel();
					    JPanel p3 = new JPanel();
					    GridLayout myLayout = new GridLayout(3,1);
					    frame2.setLayout(myLayout);
					    frame2.add(p);
					    frame2.add(p2);
					    frame2.add(p3);
					    p.add(label4);  
					    textField1.setEditable(true);
					    p2.add(textField1);
					    p3.add(b1);
					    b1.setBackground(Color.GRAY);
						  b1.setForeground(Color.WHITE);
					    p3.add(b2);
					    b2.setBackground(Color.RED);
						  b2.setForeground(Color.WHITE);
				  }
			}
				);
			  
			  bb.addActionListener(new ActionListener() {         
				  public void actionPerformed (ActionEvent e) {     
					  JFrame frame2 = new JFrame("Good Luck!! You'll need it :)");
					  Font myFont1 = new Font("Serif", Font.BOLD, 17);
			    		label2.setFont(myFont1);
					    frame2.setVisible(true);
					    frame2.setSize(700,500);
					    
					    int guess = 10;
					    JLabel label4 = new JLabel("Guess a number between 0 and 100");
			    		label4.setFont(myFont1);
					    JPanel p = new JPanel();
					    JPanel p2 = new JPanel();
					    JPanel p3 = new JPanel();
					    GridLayout myLayout = new GridLayout(3,1);
					    frame2.setLayout(myLayout);
					    frame2.add(p);
					    frame2.add(p2);
					    frame2.add(p3);
					    p.add(label4);  
					    textField1.setEditable(true);
					    p2.add(textField1);
					    p3.add(b1);
					    b1.setBackground(Color.GRAY);
						  b1.setForeground(Color.WHITE);
					    p3.add(b2);
					    b2.setBackground(Color.RED);
						  b2.setForeground(Color.WHITE);
				  }
			}
				);
			  
			  bd.addActionListener(new ActionListener() {         
				  public void actionPerformed (ActionEvent e) {     
					  JFrame frame = new JFrame("Number Guessing Game");
					  frame.setVisible(true);
					  frame.setSize(700,500);
					  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					  Font normal = new Font("Serif", Font.BOLD, 20);
					  Font myFont = new Font("Serif", Font.BOLD, 25);
					  JLabel label = new JLabel("*****NUMBER GUESSING GAME*****");
					  label.setFont(myFont);
					  JLabel label2 = new JLabel("You have 10 chances to guess the number");
					  label2.setFont(normal);
					  JLabel label3 = new JLabel("Go ahead and click start to begin...");
					  label3.setFont(normal);
					  JPanel panel = new JPanel();
					  JPanel panel2 = new JPanel();
					  JPanel panel3 = new JPanel();
					  JPanel panel4 = new JPanel();
					  
					 
					  GridLayout myLayout = new GridLayout(4,1); 
					  frame.setLayout(myLayout);
					 		  frame.add(panel);
					  frame.add(panel2);
					  frame.add(panel3);
					  frame.add(panel4);
					  
					  panel.add(label);
					  panel2.add(label2);
					  panel3.add(label3);
					  
					  
					 
					  panel4.add(button);
					  button.setBackground(Color.GREEN);
					  button.setForeground(Color.WHITE);
					  button.setSize(100, 50);
				
					  panel4.add(button2);
					  button2.setBackground(Color.RED);
					  button2.setForeground(Color.WHITE);
					  button2.setSize(100, 50);
					 
					
				
					 }
				  }
					);
				
					
						  b2.addActionListener(new ActionListener() {        
							  public void actionPerformed (ActionEvent e) {     
								  System.exit(0);
							  }
						  
						  });
				  }
		
				
}

