package pretrazivac.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import java.awt.ComponentOrientation;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;
import pretrazivac.Korisnik;
import javax.swing.JTextArea;

public class KorisnikEkran extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnAccount;
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private JPanel panel_2;
	private JLabel lblBackground;
	private JLabel lblIcon;
	private JLabel lblUsername;
	private JTextField txtPretrazi;
	private JLabel lblPretrazi;
	private JButton btnNazivu;
	private JButton btnOceni;
	private JButton btnPopularnosti;
	private JButton btnGodini;
	private JLabel lblSortirajPo;
	private JButton btnObrisiNalog;
	private Korisnik korisnik;
	private JButton btnTrazi;
	private JTextArea txtrInfo;

	public KorisnikEkran(Korisnik korisnik) {
		this.korisnik=korisnik;
		setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/images/clapperboard.png")));
		setTitle(korisnik.getUsername());
		setBounds(100, 100, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanel_1_1(), BorderLayout.NORTH);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);

		setResizable(false);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
	private JPanel getPanel_1_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setPreferredSize(new Dimension(10, 300));
			panel_1.setLayout(null);
			panel_1.add(getLblIcon());
			panel_1.add(getLblUsername());
			panel_1.add(getTxtPretrazi());
			panel_1.add(getLblPretrazi());
			panel_1.add(getBtnNazivu());
			panel_1.add(getBtnOceni());
			panel_1.add(getBtnPopularnosti());
			panel_1.add(getBtnGodini());
			panel_1.add(getLblSortirajPo());
			panel_1.add(getBtnObrisiNalog());
			panel_1.add(getBtnTrazi());
			panel_1.add(getTxtrInfo());
			panel_1.add(getLblBackground());
		}
		return panel_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getPanel_2_1());
		}
		return scrollPane;
	}
	private JPanel getPanel_2_1() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setAutoscrolls(true);
			panel_2.setBackground(new Color(29, 29, 40));
			panel_2.setLayout(new MigLayout("insets 0, wrap 8", "0[]0","0[]0"));
		}
		return panel_2;
	}
	public void dodajDugme(PristupFilmu p){
		this.panel_2.add(p);
		p.setVisible(true);

	}
	private JLabel getLblBackground() {
		if (lblBackground == null) {
			lblBackground = new JLabel("");
			lblBackground.setIcon(new ImageIcon(KorisnikEkran.class.getResource("/images/loginBack.png")));
			lblBackground.setBounds(0, 0, 1194, 300);
		}
		return lblBackground;
	}
	private JLabel getLblIcon() {
		if (lblIcon == null) {
			lblIcon = new JLabel("");
			lblIcon.setIcon(new ImageIcon(KorisnikEkran.class.getResource("/images/account (2).png")));
			lblIcon.setBounds(39, 27, 128, 133);
		}
		return lblIcon;
	}
	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("");
			lblUsername.setFont(new Font("Yu Gothic UI", Font.PLAIN, 33));
			lblUsername.setForeground(Color.LIGHT_GRAY);
			lblUsername.setBounds(179, 50, 255, 43);
			lblUsername.setText(korisnik.getUsername());
		}
		return lblUsername;
	}
	private JTextField getTxtPretrazi() {
		if (txtPretrazi == null) {
			txtPretrazi = new JTextField();
			txtPretrazi.setForeground(Color.WHITE);
			txtPretrazi.setOpaque(false);
			txtPretrazi.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			txtPretrazi.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
			txtPretrazi.setBounds(534, 78, 264, 35);
			txtPretrazi.setColumns(10);
		}
		return txtPretrazi;
	}
	private JLabel getLblPretrazi() {
		if (lblPretrazi == null) {
			lblPretrazi = new JLabel("PRETRAZI:");
			lblPretrazi.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
			lblPretrazi.setForeground(Color.WHITE);
			lblPretrazi.setBounds(534, 50, 264, 16);
		}
		return lblPretrazi;
	}
	private JButton getBtnNazivu() {
		if (btnNazivu == null) {
			btnNazivu = new JButton("Nazivu");
			btnNazivu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GuiControler.sortirajKorisnikovuListuPoNazivu();
				}
			});
			btnNazivu.setFocusPainted(false);
			btnNazivu.setContentAreaFilled(false);
			btnNazivu.setBorder(null);
			btnNazivu.setIcon(new ImageIcon(KorisnikEkran.class.getResource("/images/clapperboard.png")));
			btnNazivu.setForeground(Color.WHITE);
			btnNazivu.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
			btnNazivu.setBounds(534, 198, 153, 33);
		}
		return btnNazivu;
	}
	private JButton getBtnOceni() {
		if (btnOceni == null) {
			btnOceni = new JButton("Oceni");
			btnOceni.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GuiControler.sortirajKorisnikovuListuPoOceni();
				}
			});
			btnOceni.setFocusPainted(false);
			btnOceni.setContentAreaFilled(false);
			btnOceni.setBorder(null);
			btnOceni.setIcon(new ImageIcon(KorisnikEkran.class.getResource("/images/frame.png")));
			btnOceni.setForeground(Color.WHITE);
			btnOceni.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
			btnOceni.setBounds(738, 198, 103, 33);
		}
		return btnOceni;
	}
	private JButton getBtnPopularnosti() {
		if (btnPopularnosti == null) {
			btnPopularnosti = new JButton("Popularnosti");
			btnPopularnosti.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GuiControler.sortirajKorisnikovuListuPoGledanosti();
				}
			});
			btnPopularnosti.setFocusPainted(false);
			btnPopularnosti.setContentAreaFilled(false);
			btnPopularnosti.setBorder(null);
			btnPopularnosti.setIcon(new ImageIcon(KorisnikEkran.class.getResource("/images/tickets.png")));
			btnPopularnosti.setForeground(Color.WHITE);
			btnPopularnosti.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
			btnPopularnosti.setBounds(534, 244, 192, 43);
		}
		return btnPopularnosti;
	}
	private JButton getBtnGodini() {
		if (btnGodini == null) {
			btnGodini = new JButton("Godini");
			btnGodini.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GuiControler.sortirajKorisnikovuListuPoGodini();
				}
			});
			btnGodini.setFocusPainted(false);
			btnGodini.setContentAreaFilled(false);
			btnGodini.setBorder(null);
			btnGodini.setIcon(new ImageIcon(KorisnikEkran.class.getResource("/images/popcorn.png")));
			btnGodini.setForeground(Color.WHITE);
			btnGodini.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
			btnGodini.setBounds(738, 244, 103, 43);
		}
		return btnGodini;
	}
	private JLabel getLblSortirajPo() {
		if (lblSortirajPo == null) {
			lblSortirajPo = new JLabel("SORTIRAJ PO:");
			lblSortirajPo.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
			lblSortirajPo.setForeground(Color.WHITE);
			lblSortirajPo.setBounds(534, 166, 264, 16);
		}
		return lblSortirajPo;
	}
	private JButton getBtnObrisiNalog() {
		if (btnObrisiNalog == null) {
			btnObrisiNalog = new JButton("Obrisi nalog");
			btnObrisiNalog.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GuiControler.obrisiKorisnickiNalog();
				}
			});
			btnObrisiNalog.setContentAreaFilled(false);
			btnObrisiNalog.setOpaque(false);
			btnObrisiNalog.setBorder(null);
			btnObrisiNalog.setBackground(null);
			btnObrisiNalog.setForeground(Color.WHITE);
			btnObrisiNalog.setHorizontalTextPosition(SwingConstants.CENTER);
			btnObrisiNalog.setVerticalTextPosition(SwingConstants.BOTTOM);
			btnObrisiNalog.setIcon(new ImageIcon(KorisnikEkran.class.getResource("/images/user.png")));
			btnObrisiNalog.setBounds(1070, 189, 83, 85);
		}
		return btnObrisiNalog;
	}
	private JButton getBtnTrazi() {
		if (btnTrazi == null) {
			btnTrazi = new JButton("");
			btnTrazi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GuiControler.pretraziKorisnikoveFilmove(txtPretrazi.getText(), 0, "");
				}
			});
			btnTrazi.setFocusPainted(false);
			btnTrazi.setBorderPainted(false);
			btnTrazi.setContentAreaFilled(false);
			btnTrazi.setIcon(new ImageIcon(KorisnikEkran.class.getResource("/images/magnifier.png")));
			btnTrazi.setBounds(810, 80, 36, 33);
		}
		return btnTrazi;
	}
	private JTextArea getTxtrInfo() {
		if (txtrInfo == null) {
			txtrInfo = new JTextArea();
			txtrInfo.setOpaque(false);
			txtrInfo.setEditable(false);
			txtrInfo.setAutoscrolls(false);
			txtrInfo.setForeground(Color.LIGHT_GRAY);
			txtrInfo.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
			txtrInfo.setText(String.format("Ime: %s\nPrezime: %s\nBroj odgledanih filmova: %d", korisnik.getIme(),korisnik.getPrezime(),korisnik.getFilmovi().size()));
			txtrInfo.setBounds(179, 138, 264, 118);
		}
		return txtrInfo;
	}
}
