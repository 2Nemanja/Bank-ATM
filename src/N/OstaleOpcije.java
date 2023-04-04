package N;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OstaleOpcije extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OstaleOpcije frame = new OstaleOpcije();
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
	public OstaleOpcije() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 499);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Uvek tu za Vas");
		lblNewLabel_1.setBounds(359, 233, 149, 31);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Lato", Font.BOLD, 22));
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.windowBorder);
		panel.setBounds(0, 0, 841, 70);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\Logo banke 1.png"));
		lblNewLabel.setBounds(326, 11, 188, 48);
		panel.add(lblNewLabel);
		
		JLabel Strelica = new JLabel("");
		Strelica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Raskrsnica R= new Raskrsnica();
				R.setVisible(true);
			}
		});
		Strelica.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\arrow (2) 1.png"));
		Strelica.setForeground(Color.WHITE);
		Strelica.setFont(new Font("Lato", Font.BOLD, 17));
		Strelica.setBackground(Color.WHITE);
		Strelica.setBounds(10, 11, 24, 32);
		panel.add(Strelica);
		
		JLabel Home = new JLabel("");
		Home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				PocetnaStrana PS= new PocetnaStrana();
				PS.setVisible(true);
			}
		});
		Home.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\home 1.png"));
		Home.setForeground(Color.WHITE);
		Home.setFont(new Font("Lato", Font.BOLD, 17));
		Home.setBackground(Color.WHITE);
		Home.setBounds(799, 11, 32, 35);
		panel.add(Home);
		
		JButton btnPrebaci = 
				
				
				
				new JButton("PREBACI");
		btnPrebaci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Prebaci PR=new Prebaci();
				PR.setVisible(true);
				
			}
		});
		btnPrebaci.setForeground(new Color(0, 51, 102));
		btnPrebaci.setFont(new Font("Lato", Font.PLAIN, 18));
		btnPrebaci.setBackground(SystemColor.controlHighlight);
		btnPrebaci.setBounds(142, 183, 161, 32);
		contentPane.add(btnPrebaci);
		
		JButton btnUplati = new JButton("UPLATI");
		btnUplati.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Uplati U=new Uplati();
				U.setVisible(true);
			}
		});
		btnUplati.setForeground(new Color(0, 51, 102));
		btnUplati.setFont(new Font("Lato", Font.PLAIN, 18));
		btnUplati.setBackground(SystemColor.controlHighlight);
		btnUplati.setBounds(559, 183, 161, 32);
		contentPane.add(btnUplati);
		
		JButton btnStanje = new JButton("STANJE");
		btnStanje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Stanje S=new Stanje();
				S.setVisible(rootPaneCheckingEnabled);
			}
		});
		btnStanje.setForeground(new Color(0, 51, 102));
		btnStanje.setFont(new Font("Lato", Font.PLAIN, 18));
		btnStanje.setBackground(SystemColor.controlHighlight);
		btnStanje.setBounds(142, 272, 161, 32);
		contentPane.add(btnStanje);
		
		JButton btnPromeniPin = new JButton("PROMENI PIN");
		btnPromeniPin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PromenaPina PP=new PromenaPina();
				PP.setVisible(true);
			}
		});
		btnPromeniPin.setForeground(new Color(0, 51, 102));
		btnPromeniPin.setFont(new Font("Lato", Font.PLAIN, 18));
		btnPromeniPin.setBackground(SystemColor.controlHighlight);
		btnPromeniPin.setBounds(559, 280, 161, 32);
		contentPane.add(btnPromeniPin);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\pozadinaprava.png"));
		lblNewLabel_2.setBounds(0, 69, 841, 393);
		contentPane.add(lblNewLabel_2);
	}
}
