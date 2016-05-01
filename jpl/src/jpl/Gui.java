package jpl;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Gui {

	private JFrame frame;
	private JTextField textField;
    private prolog1 prolog1;
    JTextArea textArea;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Gui() {
		initialize();
		prolog1 = new prolog1();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Java Application with Prolog");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(14, 25, 391, 217);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Command");
		lblNewLabel.setBounds(8, 16, 63, 19);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setText("likes(X, Y)");
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyCode() == KeyEvent.VK_ENTER){
					//inference(); //removed by cclin on 2016/04/18
				}
			}
		});
		
		textField.setBounds(84, 13, 159, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnGo = new JButton("Go!");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			   //inference(); //removed by cclin on 2016/04/18
				String input=textField.getText();
				
				String txt=prolog1.link()+"\n";
				
				txt +=prolog1.run(input);
				textArea.setText("msg : "+txt+"\n");
			}
		});
		btnGo.setBounds(258, 9, 70, 27);
		panel.add(btnGo);
		
		textArea = new JTextArea();
		textArea.setBounds(87, 75, 241, 132);
		panel.add(textArea);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(8, 51, 52, 19);
		panel.add(lblResult);
	}
	/* //removed by cclin on 2016/04/18
	void inference(){
		prolog1.pro();
	     String result = prolog1.drive(textField.getText());
	     textArea.setText(result);     
	}
	*/
}
