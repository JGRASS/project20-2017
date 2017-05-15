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

public class KorisnikEkran extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnAccount;
	private JPanel panel_1;
	private JButton btnPopularnost;
	private JButton btnOcena;
	private JButton btnGodina;
	private JButton btnZanr;
	private JLabel lblSortirajPo;
	private JButton btnPreporuke;
	private JTextField textField;
	private JLabel lblPretrai;
	private JButton btnNapredno;
	private JPopupMenu popupMenu;
	private JPanel panelNapredno;
	private JLabel lblGodina;
	private JTextField txtGodina;
	private JLabel lblZanr;
	private JTextField txtZanr;
	private JButton btnPretrazi;
	private JButton btnPonistiPretragu;
	private JPanel panel_2;

	public KorisnikEkran() {
		setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/images/clapperboard.png")));
		setTitle("BEST MOVIES 4 YOU");
		setBounds(100, 100, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel_1());
		contentPane.add(getPanel_2());

		setResizable(false);
	}


	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBounds(new Rectangle(12, 0, 1203, 100));
			panel_1.setLayout(null);
			panel_1.add(getBtnPopularnost());
			panel_1.add(getBtnOcena());
			panel_1.add(getBtnGodina());
			panel_1.add(getBtnZanr());
			panel_1.add(getLblSortirajPo());
			panel_1.add(getBtnPreporuke());
			panel_1.add(getTextField());
			panel_1.add(getLblPretrai());
			panel_1.add(getBtnNapredno());
			panel_1.add(getBtnPretrazi());
			panel_1.add(getBtnPonistiPretragu());
		}
		return panel_1;
	}
	private JButton getBtnPopularnost() {
		if (btnPopularnost == null) {
			btnPopularnost = new JButton("Popularnosti");
			btnPopularnost.setContentAreaFilled(false);
			btnPopularnost.setIcon(new ImageIcon("E:\\data\\output\\tickets.png"));
			btnPopularnost.setBounds(12, 46, 146, 41);
		}
		return btnPopularnost;
	}
	private JButton getBtnOcena() {
		if (btnOcena == null) {
			btnOcena = new JButton("Oceni");
			btnOcena.setIcon(new ImageIcon("E:\\data\\output\\frame.png"));
			btnOcena.setBounds(159, 46, 105, 41);
			btnOcena.setContentAreaFilled(false);

		}
		return btnOcena;
	}
	private JButton getBtnGodina() {
		if (btnGodina == null) {
			btnGodina = new JButton("Godini");
			btnGodina.setIcon(new ImageIcon("E:\\data\\output\\popcorn.png"));
			btnGodina.setBounds(264, 50, 107, 33);
			btnGodina.setContentAreaFilled(false);

		}
		return btnGodina;
	}
	private JButton getBtnZanr() {
		if (btnZanr == null) {
			btnZanr = new JButton("Zanru");
			btnZanr.setIcon(new ImageIcon("E:\\data\\output\\clapperboard.png"));
			btnZanr.setContentAreaFilled(false);

			btnZanr.setBounds(375, 50, 105, 33);
		}
		return btnZanr;
	}
	private JLabel getLblSortirajPo() {
		if (lblSortirajPo == null) {
			lblSortirajPo = new JLabel("SORTIRAJ PO:");
			lblSortirajPo.setBounds(37, 17, 95, 16);
		}
		return lblSortirajPo;
	}
	private JButton getBtnPreporuke() {
		if (btnPreporuke == null) {
			btnPreporuke = new JButton("");
			btnPreporuke.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnPreporuke.setPressedIcon(new ImageIcon(KorisnikEkran.class.getResource("/images/preporuke1.png")));
			btnPreporuke.setFocusPainted(false);
			btnPreporuke.setContentAreaFilled(false);
			btnPreporuke.setBorderPainted(false);
			btnPreporuke.setIcon(new ImageIcon(KorisnikEkran.class.getResource("/images/preporuke.png")));
			btnPreporuke.setBounds(548, 29, 151, 58);
		}
		return btnPreporuke;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setOpaque(false);
			textField.setForeground(Color.WHITE);
			textField.setColumns(10);
			textField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			textField.setBounds(744, 52, 140, 28);
		}
		return textField;
	}
	private JLabel getLblPretrai() {
		if (lblPretrai == null) {
			lblPretrai = new JLabel("PRETRA\u017DI:");
			lblPretrai.setForeground(Color.WHITE);
			lblPretrai.setBounds(744, 29, 84, 16);
		}
		return lblPretrai;
	}
	private JButton getBtnNapredno() {
		if (btnNapredno == null) {
			btnNapredno = new JButton("Napredno");
			btnNapredno.setFocusPainted(false);
			btnNapredno.setVisible(false);
			btnNapredno.setContentAreaFilled(false);
			btnNapredno.setBorderPainted(false);
			btnNapredno.setIcon(null);
			btnNapredno.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnNapredno.setIconTextGap(0);
			btnNapredno.setForeground(Color.WHITE);
			btnNapredno.setBounds(798, 77, 101, 23);
			addPopup(btnNapredno, getPopupMenu());
		}
		return btnNapredno;
	}
	private JPopupMenu getPopupMenu() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.add(getPanelNapredno());
		}
		return popupMenu;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	private JPanel getPanelNapredno() {
		if (panelNapredno == null) {
			panelNapredno = new JPanel();
			panelNapredno.setBackground(Color.BLACK);
			panelNapredno.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panelNapredno.add(getLblGodina());
			panelNapredno.add(getTxtGodina());
			panelNapredno.add(getLblZanr());
			panelNapredno.add(getTxtZanr());
		}
		return panelNapredno;
	}
	private JLabel getLblGodina() {
		if (lblGodina == null) {
			lblGodina = new JLabel("Godina:");
			lblGodina.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
			lblGodina.setForeground(Color.LIGHT_GRAY);
		}
		return lblGodina;
	}
	private JTextField getTxtGodina() {
		if (txtGodina == null) {
			txtGodina = new JTextField();
			txtGodina.setOpaque(false);
			txtGodina.setForeground(Color.WHITE);
			txtGodina.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			txtGodina.setColumns(10);
		}
		return txtGodina;
	}
	private JLabel getLblZanr() {
		if (lblZanr == null) {
			lblZanr = new JLabel(" \u017Danr:   ");
			lblZanr.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
			lblZanr.setForeground(Color.LIGHT_GRAY);
		}
		return lblZanr;
	}
	private JTextField getTxtZanr() {
		if (txtZanr == null) {
			txtZanr = new JTextField();
			txtZanr.setOpaque(false);
			txtZanr.setForeground(Color.WHITE);
			txtZanr.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			txtZanr.setColumns(10);
		}
		return txtZanr;
	}
	private JButton getBtnPretrazi() {
		if (btnPretrazi == null) {
			btnPretrazi = new JButton("");
			btnPretrazi.setFocusPainted(false);
			btnPretrazi.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			btnPretrazi.setContentAreaFilled(false);
			btnPretrazi.setIcon(new ImageIcon(KorisnikEkran.class.getResource("/images/magnifier.png")));
			btnPretrazi.setBounds(899, 46, 41, 41);
		}
		return btnPretrazi;
	}
	private JButton getBtnPonistiPretragu() {
		if (btnPonistiPretragu == null) {
			btnPonistiPretragu = new JButton("");
			btnPonistiPretragu.setFocusPainted(false);
			btnPonistiPretragu.setContentAreaFilled(false);
			btnPonistiPretragu.setBorderPainted(false);
			btnPonistiPretragu.setIcon(new ImageIcon(KorisnikEkran.class.getResource("/images/ponistiPretragu.png")));
			btnPonistiPretragu.setBounds(1003, 43, 74, 37);
		}
		return btnPonistiPretragu;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBounds(638, 181, 308, 283);
			panel_2.setLayout(null);
		}
		return panel_2;
	}
}
