package main;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.css.RGBColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingMain extends JFrame {
	
	private int count = 0;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingMain frame = new SwingMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SwingMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		contentPane.setBackground(new Color(85, 121, 4));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Megaman gif logic.
		JLabel megamanLabel = new JLabel("");
		megamanLabel.setBounds(70, 128, 700, 700);
		megamanLabel.setIcon(new ImageIcon(SwingMain.class.getResource("/resources/megaman.gif")));
		contentPane.add(megamanLabel);
		megamanLabel.setVisible(false);
		
		// Megaman second gif logic.
		JLabel secondMegamanLabel = new JLabel("");
		secondMegamanLabel.setBounds(150, 188, 480, 342);
		secondMegamanLabel.setIcon(new ImageIcon(SwingMain.class.getResource("/resources/ZJF3.gif")));
		contentPane.add(secondMegamanLabel);
		secondMegamanLabel.setVisible(false);
		
		JButton btnNewButton = new JButton("COUNT");
		
		btnNewButton.addActionListener(new ActionListener() {
		
		 @Override
		    public void actionPerformed(ActionEvent e) {
		        incrementCount(e); 
		        megamanVisibility();
		    }
		    
		    public void incrementCount(ActionEvent e) {
		        count++;
		        textField.setText(count + "");
		    }
		    
		    public void megamanVisibility() {
		       
		        if (count % 2 == 0) {
		            megamanLabel.setVisible(true);
		            secondMegamanLabel.setVisible(false);
		        } else {
		            megamanLabel.setVisible(false);
		            secondMegamanLabel.setVisible(true);
		        }
		    }
		});
		
		btnNewButton.setBounds(358, 87, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Counter:");
		lblNewLabel.setBounds(280, 56, 61, 16);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setBounds(346, 51, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
			
		
	}

}
