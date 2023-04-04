package N;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class PocetnaStrana extends JFrame {

	private JPanel contentPane;
	private JTextField tBRNaloga;
	private JTextField tPIN;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PocetnaStrana frame = new PocetnaStrana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static Trenutni p;
	public static ArrayList<Trenutni> t=new ArrayList<>();
	/**
	 * Create the frame.
	 */
	public PocetnaStrana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 128, 128));
		panel.setForeground(new Color(0, 64, 128));
		panel.setBounds(0, 0, 841, 447);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.windowBorder);
		panel_1.setBounds(0, 0, 863, 70);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N BANK");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\Logo banke 1.png"));
		lblNewLabel.setBounds(345, 10, 152, 30);
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("Lato", Font.BOLD, 24));
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Jedina prava!");
		lblNewLabel_1.setFont(new Font("Lato", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(new Color(255, 153, 51));
		lblNewLabel_1.setBounds(385, 45, 84, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel Strelica = new JLabel("");
		Strelica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				PocetnaStranaBanke PSB = new PocetnaStranaBanke();
				PSB.setVisible(true);
				
			}
		});
		Strelica.setBounds(10, 10, 32, 32);
		panel_1.add(Strelica);
		Strelica.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\arrow (2) 1.png"));
		Strelica.setForeground(Color.WHITE);
		Strelica.setFont(new Font("Lato", Font.BOLD, 17));
		Strelica.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_2 = new JLabel("Nemate nalog?");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Lato", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_2.setBounds(546, 159, 123, 20);
		panel.add(lblNewLabel_2);
		
		JButton btnNapraviNalog = new JButton("NAPRAVI NALOG");
		btnNapraviNalog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PravljnjeNaloga PN = new PravljnjeNaloga();
				PN.NewScreen();
				PN.setVisible(false);
			
			}
		});
		btnNapraviNalog.setFont(new Font("Lato", Font.PLAIN, 18));
		btnNapraviNalog.setForeground(new Color(0, 51, 102));
		btnNapraviNalog.setBackground(new Color(253, 245, 230));
		btnNapraviNalog.setBounds(546, 199, 189, 32);
		panel.add(btnNapraviNalog);
		
		JButton btnPrijaviSe = new JButton("PRIJAVI SE");
		btnPrijaviSe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int brn=Integer.parseInt(tBRNaloga.getText());
				int pin=Integer.parseInt(tPIN.getText());
				try {
					t.clear();
				
					for(Nalog i:PIN.n)
					if(brn==i.getBrojNaloga() && pin==i.getPIN()) {
						Trenutni x= new Trenutni(i.getBrojNaloga(), i.getNaKartici(), i.getPIN());
						t.add(x);
						dispose();
						Raskrsnica R= new Raskrsnica();
						R.setVisible(true);

					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Nepostojeci nalog");
				}
				
				
			}
		});
		btnPrijaviSe.setForeground(new Color(0, 51, 102));
		btnPrijaviSe.setFont(new Font("Lato", Font.PLAIN, 18));
		btnPrijaviSe.setBackground(new Color(253, 245, 230));
		btnPrijaviSe.setBounds(92, 247, 146, 32);
		panel.add(btnPrijaviSe);
		
		JLabel lblNewLabel_2_1 = new JLabel("Broj naloga:");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Lato", Font.BOLD, 17));
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setBounds(92, 159, 95, 20);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = 	new JLabel("PIN:");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Lato", Font.BOLD, 17));
		lblNewLabel_2_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_1_1.setBounds(92, 199, 34, 20);
		panel.add(lblNewLabel_2_1_1);
		
		tBRNaloga = new JTextField();
		tBRNaloga.setFont(new Font("Lato", Font.PLAIN, 14));
		tBRNaloga.setBounds(197, 159, 102, 20);
		panel.add(tBRNaloga);
		tBRNaloga.setColumns(10);
		
		tPIN = new JTextField();
		tPIN.setFont(new Font("Lato", Font.PLAIN, 14));
		tPIN.setColumns(10);
		tPIN.setBounds(148, 199, 52, 20);
		panel.add(tPIN);
		
		JLabel lblNewLabel_3 = new JLabel("Zahvalni smo Vam na poverenju!");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Lato", Font.BOLD, 30));
		lblNewLabel_3.setBounds(205, 353, 450, 42);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setFont(new Font("Lato", Font.PLAIN, 14));
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\pozadinaprava.png"));
		lblNewLabel_4.setBounds(0, 70, 841, 377);
		panel.add(lblNewLabel_4);
	}
}
