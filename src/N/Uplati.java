package N;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Uplati extends JFrame {

	private JPanel contentPane;
	private JTextField tSumaNovca;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uplati frame = new Uplati();
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
	public Uplati() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.windowBorder);
		panel.setBounds(0, 0, 846, 70);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\Logo banke 1.png"));
		lblNewLabel.setBounds(344, 11, 160, 48);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				OstaleOpcije OO=new OstaleOpcije();
				OO.setVisible(true);
			}
		});
		lblNewLabel_2_1_1_1.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\arrow (2) 1.png"));
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Lato", Font.BOLD, 17));
		lblNewLabel_2_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_1_1_1.setBounds(10, 11, 24, 32);
		panel.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				PocetnaStrana PS= new PocetnaStrana();
				PS.setVisible(true);
			}
		});
		lblNewLabel_2_1_1.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\home 1.png"));
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Lato", Font.BOLD, 17));
		lblNewLabel_2_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_1_1.setBounds(800, 11, 32, 35);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Unesite sumu novca koju zelite da uplatite na vas racun");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Graphie", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(128, 103, 454, 33);
		contentPane.add(lblNewLabel_1);
		
		tSumaNovca = new JTextField();
		tSumaNovca.setFont(new Font("Lato", Font.PLAIN, 14));
		tSumaNovca.setColumns(10);
		tSumaNovca.setBounds(592, 111, 129, 20);
		contentPane.add(tSumaNovca);
		
		JButton btnUplati = new JButton("UPLATI");
		btnUplati.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int kolicina=Integer.parseInt(tSumaNovca.getText());
				
				if(kolicina>0)
				{
					for(Nalog i:PIN.n)
					{
						if(PocetnaStrana.t.get(0).getBrojNaloga()==i.getBrojNaloga())
						{
							PocetnaStrana.t.get(0).setKes(PocetnaStrana.t.get(0).getKes()+kolicina);
							double z=PocetnaStrana.t.get(0).getKes();
							i.setNaKartici(z);
							JOptionPane.showMessageDialog(null, "IZVRSENA UPLATA!" + "\nNa Nalog Je Uplacno: " + kolicina + "\n\nNa Vasem Nalogu Je Sada: " + z);
						}
					}
				}
				else if(kolicina<0)
					JOptionPane.showMessageDialog(null, "Unesite pozitivnu vrednost!");
			}
		});
		
		btnUplati.setForeground(new Color(0, 51, 102));
		btnUplati.setFont(new Font("Lato", Font.PLAIN, 18));
		btnUplati.setBackground(SystemColor.controlHighlight);
		btnUplati.setBounds(353, 147, 149, 32);
		contentPane.add(btnUplati);
		
		
		JButton btn1000din = new JButton("1000din");
		btn1000din.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Nalog i:PIN.n)
				{
					if(PocetnaStrana.t.get(0).getBrojNaloga()==i.getBrojNaloga())
					{
						PocetnaStrana.t.get(0).setKes(PocetnaStrana.t.get(0).getKes()+1000);
						double z=PocetnaStrana.t.get(0).getKes();
						i.setNaKartici(z);
						JOptionPane.showMessageDialog(null, "IZVRSENA UPLATA!" + "\nNa Nalog Je Uplacno: " + 1000 + "\n\nNa Vasem Nalogu Je Sada: " + z);
					}
				}
			}
		});
		btn1000din.setForeground(new Color(0, 51, 102));
		btn1000din.setFont(new Font("Lato", Font.PLAIN, 18));
		btn1000din.setBackground(SystemColor.controlHighlight);
		btn1000din.setBounds(128, 274, 149, 32);
		contentPane.add(btn1000din);
		
		JButton btn5000din = new JButton("5000din");
		btn5000din.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Nalog i:PIN.n)
				{
					if(PocetnaStrana.t.get(0).getBrojNaloga()==i.getBrojNaloga())
					{
						PocetnaStrana.t.get(0).setKes(PocetnaStrana.t.get(0).getKes()+5000);
						double z=PocetnaStrana.t.get(0).getKes();
						i.setNaKartici(z);
						JOptionPane.showMessageDialog(null, "IZVRSENA UPLATA!" + "\nNa Nalog Je Uplacno: " + 5000 + "\n\nNa Vasem Nalogu Je Sada: " + z);
					}
				}
			}
			
		});
		btn5000din.setForeground(new Color(0, 51, 102));
		btn5000din.setFont(new Font("Lato", Font.PLAIN, 18));
		btn5000din.setBackground(SystemColor.controlHighlight);
		btn5000din.setBounds(353, 274, 149, 32);
		contentPane.add(btn5000din);
		
		JButton btn10000din = new JButton("10000din");
		btn10000din.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Nalog i:PIN.n)
				{
					if(PocetnaStrana.t.get(0).getBrojNaloga()==i.getBrojNaloga())
					{
						PocetnaStrana.t.get(0).setKes(PocetnaStrana.t.get(0).getKes()+10000);
						double z=PocetnaStrana.t.get(0).getKes();
						i.setNaKartici(z);
						JOptionPane.showMessageDialog(null, "IZVRSENA UPLATA!"  + "\nNa Nalog Je Uplacno: " + 10000 + "\n\nNa Vasem Nalogu Je Sada: " + z);
					}
				}
			}
		});
		btn10000din.setForeground(new Color(0, 51, 102));
		btn10000din.setFont(new Font("Lato", Font.PLAIN, 18));
		btn10000din.setBackground(SystemColor.controlHighlight);
		btn10000din.setBounds(572, 273, 149, 32);
		contentPane.add(btn10000din);
		
		JButton btn15000din = new JButton("15000din");
		btn15000din.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Nalog i:PIN.n)
				{
					if(PocetnaStrana.t.get(0).getBrojNaloga()==i.getBrojNaloga())
					{
						PocetnaStrana.t.get(0).setKes(PocetnaStrana.t.get(0).getKes()+15000);
						double z=PocetnaStrana.t.get(0).getKes();
						i.setNaKartici(z);
						JOptionPane.showMessageDialog(null, "IZVRSENA UPLATA!" + "\nNa Nalog Je Uplacno: " + 15000 + "\n\nNa Vasem Nalogu Je Sada: " + z);
					}
				}
			}
		});
		btn15000din.setForeground(new Color(0, 51, 102));
		btn15000din.setFont(new Font("Lato", Font.PLAIN, 18));
		btn15000din.setBackground(SystemColor.controlHighlight);
		btn15000din.setBounds(128, 345, 149, 32);
		contentPane.add(btn15000din);
		
		JButton btn30000din = new JButton("30000din");
		btn30000din.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Nalog i:PIN.n)
				{
					if(PocetnaStrana.t.get(0).getBrojNaloga()==i.getBrojNaloga())
					{
						PocetnaStrana.t.get(0).setKes(PocetnaStrana.t.get(0).getKes()+30000);
						double z=PocetnaStrana.t.get(0).getKes();
						i.setNaKartici(z);
						JOptionPane.showMessageDialog(null, "IZVRSENA UPLATA!" + "\nNa Nalog Je Uplacno: " + 30000 + "\n\nNa Vasem Nalogu Je Sada: " + z);
					}
				}
			}
		});
		btn30000din.setForeground(new Color(0, 51, 102));
		btn30000din.setFont(new Font("Lato", Font.PLAIN, 18));
		btn30000din.setBackground(SystemColor.controlHighlight);
		btn30000din.setBounds(353, 345, 149, 32);
		contentPane.add(btn30000din);
		
		JButton btn50000din = new JButton("50000din");
		btn50000din.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Nalog i:PIN.n)
				{
					if(PocetnaStrana.t.get(0).getBrojNaloga()==i.getBrojNaloga())
					{
						PocetnaStrana.t.get(0).setKes(PocetnaStrana.t.get(0).getKes()+50000);
						double z=PocetnaStrana.t.get(0).getKes();
						i.setNaKartici(z);
						JOptionPane.showMessageDialog(null, "IZVRSENA UPLATA!"  + "\nNa Nalog Je Uplacno: " + 50000 + "\n\nNa Vasem Nalogu Je Sada: " + z);
					}
				}
			}
		});
		btn50000din.setForeground(new Color(0, 51, 102));
		btn50000din.setFont(new Font("Lato", Font.PLAIN, 18));
		btn50000din.setBackground(SystemColor.controlHighlight);
		btn50000din.setBounds(571, 345, 149, 32);
		contentPane.add(btn50000din);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ili odaberite neke od opcija");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Graphie", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(319, 230, 221, 33);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("");
		lblNewLabel_1_1_2.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\pozadinaprava.png"));
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Graphie", Font.PLAIN, 18));
		lblNewLabel_1_1_2.setBounds(0, 70, 846, 368);
		contentPane.add(lblNewLabel_1_1_2);
	}
}
