import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class calculator implements ActionListener {
	JFrame jf;
	
	JLabel displayLabel;
	
	JButton zeroButton, oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton,
	        sevenButton, eightButton, nineButton, plusButton, minusButton, multiplyButton,
	        divideButton, dotButton, equalButton, clearButton;
	
	boolean isOperatorClicked=false;
	
	//String oldValue, newValue=displayLabel.getText();displayLabel.getText();
	
	
	
	public calculator() {
		jf=new JFrame("CALCULATOR");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(200, 300);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30, 50, 510, 40);
		displayLabel.setBackground(Color.lightGray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		jf.add(sevenButton);	
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 45));
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		jf.add(eightButton);
		eightButton.addActionListener(this);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 45));
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		jf.add(nineButton);		
		nineButton.addActionListener(this);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 45));
		jf.add(nineButton);
		
		plusButton=new JButton("+");
		plusButton.setBounds(350, 130, 80, 80);
		jf.add(plusButton);	
		plusButton.addActionListener(this);
		plusButton.setFont(new Font("OPEN SANS", Font.PLAIN, 45));
		jf.add(plusButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30, 250, 80, 80);
		jf.add(fourButton);
		fourButton.addActionListener(this);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 45));
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130, 250, 80, 80);
		jf.add(fiveButton);		
		fiveButton.addActionListener(this);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 45));
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230, 250, 80, 80);
		jf.add(sixButton);
		sixButton.addActionListener(this);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 45));
		jf.add(sixButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(350, 250, 80, 80);
		jf.add(minusButton);	
		minusButton.addActionListener(this);
		minusButton.setFont(new Font("Sans", Font.PLAIN, 70));
		jf.add(minusButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30, 370, 80, 80);
		jf.add(oneButton);		
		oneButton.addActionListener(this);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 45));
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(130, 370, 80, 80);
		jf.add(twoButton);
		twoButton.addActionListener(this);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 45));
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(230, 370, 80, 80);
		jf.add(threeButton);
		threeButton.addActionListener(this);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 45));
		jf.add(threeButton);
		
		multiplyButton=new JButton("x");
		multiplyButton.setBounds(350, 370, 80, 80);
		jf.add(multiplyButton);	
		multiplyButton.addActionListener(this);
		multiplyButton.setFont(new Font("Sans", Font.PLAIN, 45));
		jf.add(multiplyButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(30, 480, 80, 80);
		jf.add(zeroButton);
		zeroButton.addActionListener(this);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 45));
		jf.add(zeroButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(130, 480, 80, 80);
		jf.add(dotButton);
		dotButton.addActionListener(this);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 45));
		jf.add(dotButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(230, 480, 80, 80);
		jf.add(equalButton);
		equalButton.addActionListener(this);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 45));
		jf.add(equalButton);
		
		divideButton=new JButton("/");
		divideButton.setBounds(350, 480, 80, 80);
		jf.add(divideButton);
		divideButton.addActionListener(this);
		divideButton.setFont(new Font("Arial", Font.PLAIN, 45));
		jf.add(divideButton);
		
		clearButton=new JButton("CLEAR");
		clearButton.setBounds(460, 130, 80, 430);
		jf.add(clearButton);
		clearButton.addActionListener(this);
		clearButton.setFont(new Font("Sans", Font.PLAIN, 13));
		jf.add(clearButton);
		
		
		
		
		
		
		
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== zeroButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
                isOperatorClicked=false;
			}
		}else if(e.getSource()== oneButton) {
			if(isOperatorClicked) {
				displayLabel.setText("1");
                isOperatorClicked=false;
			}
		}else if(e.getSource()== twoButton) {
			if(isOperatorClicked) {
				displayLabel.setText("2");
                isOperatorClicked=false;
			}
		}else if(e.getSource()== threeButton) {
			if(isOperatorClicked) {
				displayLabel.setText("3");
                isOperatorClicked=false;
			}
		}else if(e.getSource()== fourButton) {
			if(isOperatorClicked) {
				displayLabel.setText("4");
                isOperatorClicked=false;
			}
		}else if(e.getSource()== fiveButton) {
			if(isOperatorClicked) {
				displayLabel.setText("5");
                isOperatorClicked=false;
			}
		}else if(e.getSource()== sixButton) {
			if(isOperatorClicked) {
				displayLabel.setText("6");
                isOperatorClicked=false;
			}
		}else if(e.getSource()== sevenButton) {
			if(isOperatorClicked) {
				displayLabel.setText("7");
                isOperatorClicked=false;
			}
		}else if(e.getSource()== eightButton) {
			if(isOperatorClicked) {
				displayLabel.setText("8");
                isOperatorClicked=false;
			}
		}else if(e.getSource()== nineButton) {
			if(isOperatorClicked) {
				displayLabel.setText("9");
                isOperatorClicked=false;
			}
		}else if(e.getSource()== plusButton) {
			
			
			isOperatorClicked=true;
			//oldValue=displayLabel.getText();
			
		}else if(e.getSource()== minusButton) {
			displayLabel.setText(displayLabel.getText()+"-");
		}else if(e.getSource()== multiplyButton) {
			displayLabel.setText(displayLabel.getText()+"x");
		}else if(e.getSource()== divideButton) {
			displayLabel.setText(displayLabel.getText()+"/");
		}else if(e.getSource()== dotButton) {
			displayLabel.setText(displayLabel.getText()+".");
		}else if(e.getSource()== equalButton) {
			
			//float oldValue=Float.parseFloat(oldValue);
			//float newValue=Float.parseFloat(newValue);
			
			//float result= oldValue+newValue;
			
			//displayLabel.setText(result+"");
			
		}else if(e.getSource()== clearButton) {
			displayLabel.setText("");
		}
		
	}

}
