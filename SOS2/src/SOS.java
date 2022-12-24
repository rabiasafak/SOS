import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class SOS {

	private JFrame frame;
	private JTextField sCount;
	private JTextField oCount;
	private int sCount1=0;
	private int oCount1=0;
	private String startGame="S";
	private int bt1=10;
	private int bt2=10;
	private int bt3=10;
	private int bt4=10;
	private int bt5=10;
	private int bt6=10;
	private int bt7=10;
	private int bt8=10;
	private int bt9=10;
	private int i=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SOS window = new SOS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SOS() {
		initialize();
	}

	private void choose()
	{
		if(startGame.equalsIgnoreCase("S"))
		{
			startGame="O";
		}
		else
		{
			startGame="S";
		}
	}
	private void winningGame()
	{
	//S YAPAN OYUNCUNUN HANGİ HAMLEYİ YAPARSA KAZANMIŞ OLUR
		if(bt1==1 && bt2==1 && bt3==1)
		{
			JOptionPane.showMessageDialog(frame, "Oyuncu S Kazandı","SOS",JOptionPane.INFORMATION_MESSAGE);
			sCount1++;
			sCount.setText(String.valueOf(sCount1));
		}
		else if(bt4==1 && bt5==1 && bt6==1)
		{
			JOptionPane.showMessageDialog(frame, "Oyuncu S Kazandı","SOS",JOptionPane.INFORMATION_MESSAGE);
			sCount1++;
			sCount.setText(String.valueOf(sCount1));
		}
		else if(bt7==1 && bt8==1 && bt9==1)
		{
			JOptionPane.showMessageDialog(frame, "Oyuncu S Kazandı","SOS",JOptionPane.INFORMATION_MESSAGE);
			sCount1++;
			sCount.setText(String.valueOf(sCount1));
		}
		else if(bt1==1 && bt4==1 && bt7==1)
		{
			JOptionPane.showMessageDialog(frame, "Oyuncu S Kazandı","SOS",JOptionPane.INFORMATION_MESSAGE);
			sCount1++;
			sCount.setText(String.valueOf(sCount1));
		}
		else if(bt2==1 && bt5==1 && bt8==1)
		{
			JOptionPane.showMessageDialog(frame, "Oyuncu S Kazandı","SOS",JOptionPane.INFORMATION_MESSAGE);
			sCount1++;
			sCount.setText(String.valueOf(sCount1));
		}
		else if(bt3==1 && bt6==1 && bt9==1)
		{
			JOptionPane.showMessageDialog(frame, "Oyuncu S Kazandı","SOS",JOptionPane.INFORMATION_MESSAGE);
			sCount1++;
			sCount.setText(String.valueOf(sCount1));
		}
		else if(bt1==1 && bt5==1 && bt9==1)
		{
			JOptionPane.showMessageDialog(frame, "Oyuncu S Kazandı","SOS",JOptionPane.INFORMATION_MESSAGE);
			sCount1++;
			sCount.setText(String.valueOf(sCount1));
		}
		else if(bt3==1 && bt5==1 && bt7==1)
		{
			JOptionPane.showMessageDialog(frame, "Oyuncu S Kazandı","SOS",JOptionPane.INFORMATION_MESSAGE);
			sCount1++;
			sCount.setText(String.valueOf(sCount1));
		}
		
		
		
		
		
		else if(bt1==0 && bt2==0 && bt3==0)
		{
			JOptionPane.showMessageDialog(frame, "Oyuncu O Kazandı","SOS",JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		}
		else if(bt4==0 && bt5==0 && bt6==0)
		{
			JOptionPane.showMessageDialog(frame, "Oyuncu O Kazandı","SOS",JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		}
		else 	if(bt7==0 && bt8==0 && bt9==0)
		{
			JOptionPane.showMessageDialog(frame, "Oyuncu O Kazandı","SOS",JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		}
		else if(bt1==0 && bt4==0 && bt7==0)
		{
			JOptionPane.showMessageDialog(frame, "Oyuncu O Kazandı","SOS",JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		}
		else if(bt2==0 && bt5==0 && bt8==0)
		{
			JOptionPane.showMessageDialog(frame, "Oyuncu O Kazandı","SOS",JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		}
		else if(bt3==0 && bt6==0 && bt9==0)
		{
			JOptionPane.showMessageDialog(frame, "Oyuncu O Kazandı","SOS",JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		}
		else if(bt1==0 && bt5==0 && bt9==0)
		{
			JOptionPane.showMessageDialog(frame, "Oyuncu O Kazandı","SOS",JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		}
		else if(bt3==0 && bt5==0 && bt7==0)
		{
			JOptionPane.showMessageDialog(frame, "Oyuncu O Kazandıs","SOS",JOptionPane.INFORMATION_MESSAGE);
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		}
		else if(i==9)
		{
			JOptionPane.showMessageDialog(frame, "Kazanan Yok","SOS",JOptionPane.INFORMATION_MESSAGE);
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3)); // lineborder panellerime kenarlarına kalınlık ekledim
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 3, 3));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.PINK, 4, true));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton buton1 = new JButton("");
		buton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buton1.setText(startGame);
				if(startGame.equalsIgnoreCase("S"))
				{
					buton1.setForeground(Color.MAGENTA);
					bt1=1;
					i++;
					
				}
				else 
				{
					buton1.setForeground(Color.BLUE);
					bt1=0;
					i++;
				}
				choose();
				winningGame();
				
			}
		});
		buton1.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_1.add(buton1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.PINK, 4, true));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton buton2 = new JButton("");
		buton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buton2.setText(startGame);
				if(startGame.equalsIgnoreCase("S"))
				{
					buton2.setForeground(Color.MAGENTA);
					bt2=1;
					i++;
				}
				else 
				{
					buton2.setForeground(Color.BLUE);
					bt2=0;
					i++;
				}
				choose();
				winningGame();
			}
		});
		buton2.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_2.add(buton2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.PINK, 4, true));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton buton3 = new JButton("");
		buton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buton3.setText(startGame);
				if(startGame.equalsIgnoreCase("S"))
				{
					buton3.setForeground(Color.MAGENTA);
					bt3=1;
					i++;
				}
				else 
				{
					buton3.setForeground(Color.BLUE);
					bt3=0;
					i++;
				}
				choose();
				winningGame();
			}
		});
		buton3.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_3.add(buton3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.PINK, 4, true));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Player S");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_4.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.PINK, 4, true));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		sCount = new JTextField();
		sCount.setBackground(new Color(102, 205, 170));
		sCount.setFont(new Font("Times New Roman", Font.BOLD, 50));
		sCount.setHorizontalAlignment(SwingConstants.CENTER);
		sCount.setText("0");
		panel_5.add(sCount, BorderLayout.CENTER);
		sCount.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(Color.PINK, 4, true));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton buton4 = new JButton("");
		buton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buton4.setText(startGame);
				if(startGame.equalsIgnoreCase("S"))
				{
					buton4.setForeground(Color.MAGENTA);
					bt4=1;
					i++;
				}
				else 
				{
					buton4.setForeground(Color.BLUE);
					bt4=0;
					i++;
				}
				choose();
				winningGame();
			}
		});
		buton4.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_6.add(buton4, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.PINK, 4, true));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton buton5 = new JButton("");
		buton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buton5.setText(startGame);
				if(startGame.equalsIgnoreCase("S"))
				{
					buton5.setForeground(Color.MAGENTA);
					bt5=1;
					i++;
				}
				else 
				{
					buton5.setForeground(Color.BLUE);
					bt5=0;
					i++;
				}
				choose();
				winningGame();
			}
		});
		buton5.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_7.add(buton5, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(Color.PINK, 4, true));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton buton6 = new JButton("");
		buton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buton6.setText(startGame);
				if(startGame.equalsIgnoreCase("S"))
				{
					buton6.setForeground(Color.MAGENTA);
					bt6=1;
					i++;
				}
				else 
				{
					buton6.setForeground(Color.BLUE);
					bt6=0;
					i++;
				}
				choose();
				winningGame();
			}
		});
		buton6.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_8.add(buton6, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.PINK, 4, true));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Player O");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_9.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.PINK, 4, true));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		oCount = new JTextField();
		oCount.setBackground(new Color(154, 205, 50));
		oCount.setText("0");
		oCount.setFont(new Font("Times New Roman", Font.BOLD, 50));
		oCount.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(oCount, BorderLayout.CENTER);
		oCount.setColumns(10);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(Color.PINK, 4, true));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JButton buton7 = new JButton("");
		buton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buton7.setText(startGame);
				if(startGame.equalsIgnoreCase("S"))
				{
					buton7.setForeground(Color.MAGENTA);
					bt7=1;
					i++;
				}
				else 
				{
					buton7.setForeground(Color.BLUE);
					bt7=0;
					i++;
				}
				choose();
				winningGame();
			}
		});
		buton7.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_12.add(buton7, BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(Color.PINK, 4, true));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JButton buton8 = new JButton("");
		buton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buton8.setText(startGame);
				if(startGame.equalsIgnoreCase("S"))
				{
					buton8.setForeground(Color.MAGENTA);
					bt8=1;
					i++;
				}
				else 
				{
					buton8.setForeground(Color.BLUE);
					bt8=0;
					i++;
				}
				choose();
				winningGame();
			}
		});
		buton8.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_11.add(buton8, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(Color.PINK, 4, true));//panellerin birbirden ayrılmasını sağlıyor
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JButton buton9 = new JButton("");
		buton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buton9.setText(startGame);
				if(startGame.equalsIgnoreCase("S"))
				{
					buton9.setForeground(Color.MAGENTA);
					bt9=1;
					i++;
				}
				else 
				{
					buton9.setForeground(Color.BLUE);
					bt9=0;
					i++;
				}
				choose();
				winningGame();
			}
		});
		buton9.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_13.add(buton9, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(Color.PINK, 4, true));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JButton butonReset = new JButton("RESET");
		butonReset.setFont(new Font("Times New Roman", Font.BOLD, 27));
		butonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buton1.setText(null);
				buton2.setText(null);
				buton3.setText(null);
				buton4.setText(null);
				buton6.setText(null);
				buton5.setText(null);
				buton7.setText(null);
				buton8.setText(null);
				buton9.setText(null);
				bt1=10;
				bt2=10;
				bt3=10;
				bt4=10;
				bt5=10;
				bt6=10;
				bt7=10;
				bt8=10;
				bt9=10;
				i=0;
			}
		});
		panel_14.add(butonReset, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(Color.PINK, 4, true));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JButton butonExit = new JButton("EXIT");
		butonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Çıkış");
				if(JOptionPane.showConfirmDialog(frame, "Çıkmak İstiyor Musunuz?","SOS",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
					
				}
			}
		});
		butonExit.setFont(new Font("Times New Roman", Font.BOLD, 27));
		panel_15.add(butonExit, BorderLayout.CENTER);
	
	}

}
