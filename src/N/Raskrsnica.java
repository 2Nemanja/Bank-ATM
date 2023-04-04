package N;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Raskrsnica extends JFrame {

	private JPanel contentPane;
	static JTextField tPodizetNovac;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Raskrsnica frame = new Raskrsnica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	ArrayList<Banka> t=new ArrayList<>();
	/**
	 * Create the frame.
	 */
	public Raskrsnica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 488);
		contentPane = new JPanel();
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.windowBorder);
		panel.setBounds(0, 0, 841, 71);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\Logo banke 1.png"));
		lblNewLabel.setBounds(335, 11, 185, 48);
		panel.add(lblNewLabel);
		
		JLabel Strelica = new JLabel("");
		Strelica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				PocetnaStrana PS= new PocetnaStrana();
				PS.setVisible(true);
			}
		});
		Strelica.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\arrow (2) 1.png"));
		Strelica.setForeground(Color.WHITE);
		Strelica.setFont(new Font("Lato", Font.BOLD, 17));
		Strelica.setBackground(Color.WHITE);
		Strelica.setBounds(10, 11, 24, 32);
		panel.add(Strelica);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 70, 849, 380);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(408, 354, 385, 4);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_3 = new JLabel("(Unesite kolicinu novca koju zelite da podignete)");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Lato", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(56, 101, 334, 31);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Podizete novac?");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Lato", Font.BOLD, 18));
		lblNewLabel_2.setBounds(56, 35, 142, 41);
		panel_1.add(lblNewLabel_2);
		
		tPodizetNovac = new JTextField();
		tPodizetNovac.setFont(new Font("Lato", Font.PLAIN, 14));
		tPodizetNovac.setBounds(56, 83, 142, 20);
		panel_1.add(tPodizetNovac);
		tPodizetNovac.setColumns(10);
		

		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(56, 205, 334, 153);
		panel_1.add(scrollPane);
		
		JTextArea taRaspolozivost = new JTextArea();
		taRaspolozivost.setFont(new Font("Lato", Font.PLAIN, 16));
		scrollPane.setViewportView(taRaspolozivost);
		
		JButton btnProveriRaspolozivost = new JButton("PROVERI RASPOLOZIVOST");
		btnProveriRaspolozivost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int p=Integer.parseInt(tPodizetNovac.getText());
				if(p<0)
					JOptionPane.showMessageDialog(null, "Unesite pozitivnu vrednost!");
				Banka l1=new Banka(p);
				t.add(l1);
				for(Bankomat i:PocetnaStranaBanke.b)
					if(i.getNovacNaRaspolaganju()>=p && PocetnaStrana.t.get(0).kes>p)
					{
							taRaspolozivost.append("Bankomat B" + i+1 + "\n");
							taRaspolozivost.append(PocetnaStranaBanke.b.toString());
							break;
					}
			}
		});
		btnProveriRaspolozivost.setForeground(new Color(0, 51, 102));
		btnProveriRaspolozivost.setFont(new Font("Lato", Font.PLAIN, 18));
		btnProveriRaspolozivost.setBackground(SystemColor.controlHighlight);
		btnProveriRaspolozivost.setBounds(56, 149, 266, 32);
		panel_1.add(btnProveriRaspolozivost);
		

		JLabel lblNewLabel_4 = new JLabel("Ukoliko ne podizete novac");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Lato", Font.BOLD, 22));
		lblNewLabel_4.setBounds(527, 35, 266, 52);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("pogledajte ostale opcije.");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Lato", Font.BOLD, 18));
		lblNewLabel_5.setBounds(527, 75, 206, 31);
		panel_1.add(lblNewLabel_5);
		
		JButton btnPogledajOpcije = new JButton("POGLEDAJ OPCIJE");
		btnPogledajOpcije.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				OstaleOpcije OO=new OstaleOpcije();
				OO.setVisible(true);
				}
		
		});
		btnPogledajOpcije.setForeground(new Color(0, 51, 102));
		btnPogledajOpcije.setFont(new Font("Lato", Font.PLAIN, 18));
		btnPogledajOpcije.setBackground(SystemColor.controlHighlight);
		btnPogledajOpcije.setBounds(527, 117, 197, 32);
		panel_1.add(btnPogledajOpcije);
		
		JButton btnPodigni = new JButton("PODIGNI");
		btnPodigni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Podizanje PO= new Podizanje();
				PO.setVisible(true);
			}
		});
		btnPodigni.setForeground(new Color(0, 51, 102));
		btnPodigni.setFont(new Font("Lato", Font.PLAIN, 18));
		btnPodigni.setBackground(SystemColor.controlHighlight);
		btnPodigni.setBounds(677, 313, 116, 32);
		panel_1.add(btnPodigni);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\pozadinaRaskrsnice.png"));
		lblNewLabel_1.setBounds(0, 0, 849, 380);
		panel_1.add(lblNewLabel_1);
	}

	}


