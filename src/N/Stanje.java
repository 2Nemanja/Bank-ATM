package N;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Stanje extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stanje frame = new Stanje();
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
	public Stanje() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(260, 179, 313, 220);
		contentPane.add(scrollPane);
		
		JTextArea taStanje = new JTextArea();
		taStanje.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				taStanje.append("TRENUTNO STANJE VASEG NALOGA");
				taStanje.append("\n\nNA RACUNU IMATE: " + PocetnaStrana.t.get(0).getKes());
				
			}
		});
		taStanje.setFont(new Font("Lato", Font.PLAIN, 18));
		taStanje.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(taStanje);
		
		JLabel lblNewLabel_3 = new JLabel("Stanje Vaseg naloga");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Lato", Font.BOLD, 24));
		lblNewLabel_3.setBounds(304, 106, 239, 39);
		contentPane.add(lblNewLabel_3);
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(new Color(0, 51, 102));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\pozadinaprava.png"));
		lblNewLabel_2.setBounds(0, 69, 846, 361);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.windowBorder);
		panel.setBounds(0, 0, 846, 70);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\Logo banke 1.png"));
		lblNewLabel_1.setBounds(343, 11, 160, 48);
		panel.add(lblNewLabel_1);
		
		JLabel Strelica = new JLabel("");
		Strelica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				OstaleOpcije OO=new OstaleOpcije();
				OO.setVisible(true);
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
		Home.setBounds(800, 11, 32, 35);
		panel.add(Home);
	}
}
