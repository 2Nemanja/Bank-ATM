package N;

import java.awt.EventQueue;
import java.time.*;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class PravljnjeNaloga extends JFrame {

	static JPanel contentPane;
	static JTextField tIme;
	static JTextField tPrezime;
	static JTextField tPrebivaliste;
	static  JTextField tJMBG;
	static  JTextField tBRLicne;
	static  JTextField tAdresa;
	static  JTextField tBRFona;
	static  JTextField tPostanskiBR;
	static JComboBox cbRadniOdnos;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PravljnjeNaloga frame = new PravljnjeNaloga();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}
	static int brr=0;
	public static int brojjjac() {
		brr++;
		return brr;
	}

	/**
	 * Create the frame.
	 */
	public PravljnjeNaloga() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 494);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.windowBorder);
		panel.setBounds(0, 0, 824, 70);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\Logo banke 1.png"));
		lblNewLabel.setBounds(345, 11, 172, 35);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Zapocni partnerstvo sa broj jedan bankom u regionu!");
		lblNewLabel_1.setForeground(new Color(255, 153, 51));
		lblNewLabel_1.setFont(new Font("Lato", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(255, 47, 331, 18);
		panel.add(lblNewLabel_1);
		
		JLabel Strelica = new JLabel("");
		Strelica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				PocetnaStrana PS= new PocetnaStrana();
				PS.setVisible(true);
			}
		});
		Strelica.setBounds(10, 14, 24, 32);
		panel.add(Strelica);
		Strelica.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\arrow (2) 1.png"));
		Strelica.setForeground(Color.WHITE);
		Strelica.setFont(new Font("Lato", Font.BOLD, 17));
		Strelica.setBackground(Color.WHITE);
		
		JLabel home = new JLabel("");
		home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				PocetnaStrana PS= new PocetnaStrana();
				PS.setVisible(true);
			}
		});
		ArrayList<Korisnik> k= new ArrayList<>();
		home.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\home 1.png"));
		home.setForeground(Color.WHITE);
		home.setFont(new Font("Lato", Font.BOLD, 17));
		home.setBackground(Color.WHITE);
		home.setBounds(782, 11, 32, 35);
		panel.add(home);
		
		JLabel lblNewLabel_2 = new JLabel("IME:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Lato", Font.ITALIC, 16));
		lblNewLabel_2.setBounds(76, 106, 128, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("PREZIME:");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Lato", Font.ITALIC, 16));
		lblNewLabel_2_1.setBounds(76, 137, 128, 20);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("JMBG:");
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Lato", Font.ITALIC, 16));
		lblNewLabel_2_3.setBounds(76, 168, 128, 20);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("BROJ LICNE KARTE:");
		lblNewLabel_2_4.setForeground(Color.WHITE);
		lblNewLabel_2_4.setFont(new Font("Lato", Font.ITALIC, 16));
		lblNewLabel_2_4.setBounds(76, 199, 143, 20);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("PREBIVALISTE:");
		lblNewLabel_2_5.setForeground(Color.WHITE);
		lblNewLabel_2_5.setFont(new Font("Lato", Font.ITALIC, 16));
		lblNewLabel_2_5.setBounds(453, 106, 128, 20);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("ADRESA:");
		lblNewLabel_2_6.setForeground(Color.WHITE);
		lblNewLabel_2_6.setFont(new Font("Lato", Font.ITALIC, 16));
		lblNewLabel_2_6.setBounds(453, 137, 128, 20);
		contentPane.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_7 = new JLabel("BROJ TELEFONA:");
		lblNewLabel_2_7.setForeground(Color.WHITE);
		lblNewLabel_2_7.setFont(new Font("Lato", Font.ITALIC, 16));
		lblNewLabel_2_7.setBounds(453, 168, 128, 20);
		contentPane.add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_2_8 = new JLabel("POSTANSKI BROJ:");
		lblNewLabel_2_8.setForeground(Color.WHITE);
		lblNewLabel_2_8.setFont(new Font("Lato", Font.ITALIC, 16));
		lblNewLabel_2_8.setBounds(453, 199, 128, 20);
		contentPane.add(lblNewLabel_2_8);
		
		tIme = new JTextField();
		tIme.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (((c < '0') || (c > '9'))) {
					;
				}
				else
				{
					e.consume();
				}
			}
		});
		tIme.setFont(new Font("Lato", Font.PLAIN, 14));
		tIme.setBounds(241, 108, 136, 20);
		contentPane.add(tIme);
		tIme.setColumns(10);
		
		tPrezime = new JTextField();
		tPrezime.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (((c < '0') || (c > '9'))) {
					;
				}
				else
				{
					e.consume();
				}
			}
		});
		tPrezime.setFont(new Font("Lato", Font.PLAIN, 14));
		tPrezime.setColumns(10);
		tPrezime.setBounds(241, 139, 136, 20);
		contentPane.add(tPrezime);
		
		tPrebivaliste = new JTextField();
		tPrebivaliste.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (((c < '0') || (c > '9'))) {
					;
				}
				else
				{
					e.consume();
				}
			}
		});
		tPrebivaliste.setFont(new Font("Lato", Font.PLAIN, 14));
		tPrebivaliste.setColumns(10);
		tPrebivaliste.setBounds(603, 106, 136, 20);
		contentPane.add(tPrebivaliste);
		
		tJMBG = new JTextField();
		tJMBG.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					e.consume();
				}
			}
		});
		tJMBG.setFont(new Font("Lato", Font.PLAIN, 14));
		tJMBG.setColumns(10);
		tJMBG.setBounds(241, 170, 136, 20);
		contentPane.add(tJMBG);
		
		tBRLicne = new JTextField();
		tBRLicne.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					e.consume();
				}
			}
		});
		tBRLicne.setFont(new Font("Lato", Font.PLAIN, 14));
		tBRLicne.setColumns(10);
		tBRLicne.setBounds(241, 201, 136, 20);
		contentPane.add(tBRLicne);
		
		tAdresa = new JTextField();
		tAdresa.setFont(new Font("Lato", Font.PLAIN, 14));
		tAdresa.setColumns(10);
		tAdresa.setBounds(603, 135, 136, 20);
		contentPane.add(tAdresa);
		
		tBRFona = new JTextField();
		tBRFona.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					e.consume();
				}
			}
		});
		tBRFona.setFont(new Font("Lato", Font.PLAIN, 14));
		tBRFona.setColumns(10);
		tBRFona.setBounds(636, 168, 103, 20);
		contentPane.add(tBRFona);
		
		tPostanskiBR = new JTextField();
		tPostanskiBR.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
					e.consume();
				}
			}
		});
		tPostanskiBR.setFont(new Font("Lato", Font.PLAIN, 14));
		tPostanskiBR.setColumns(10);
		tPostanskiBR.setBounds(603, 198, 136, 20);
		contentPane.add(tPostanskiBR);
		
		JLabel lblNewLabel_3 = new JLabel("+381");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Lato", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(600, 171, 49, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Klikom na dugme kreiracete nalog, a potom i PIN");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Graphie", Font.BOLD, 18));
		lblNewLabel_4.setBounds(76, 329, 423, 22);
		contentPane.add(lblNewLabel_4);
		
		JButton btnKreirajNalog = new JButton("KREIRAJ NALOG");
		btnKreirajNalog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String ime=tIme.getText().toString().trim();
					String prezime=tPrezime.getText().toString().trim();
					int JMBG=Integer.parseInt(tJMBG.getText());
					int brLicne=Integer.parseInt(tBRLicne.getText());
					String prebivaliste=tPrebivaliste.getText().toString().trim();
					
					dispose();
					PIN P = new PIN();
					P.setVisible(true);
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Polja su lose popunjena");
				}
				
				
			
			}
		});
		btnKreirajNalog.setForeground(new Color(0, 51, 102));
		btnKreirajNalog.setFont(new Font("Lato", Font.PLAIN, 18));
		btnKreirajNalog.setBackground(SystemColor.controlHighlight);
		btnKreirajNalog.setBounds(563, 323, 176, 32);
		contentPane.add(btnKreirajNalog);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\pozadinaprava.png"));
		lblNewLabel_5.setBounds(0, 70, 831, 387);
		contentPane.add(lblNewLabel_5);
	}
	
}
