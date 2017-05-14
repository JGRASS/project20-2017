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
import javax.swing.JComboBox;
import javax.swing.JLabel;

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

	public KorisnikEkran() {
		setBounds(100, 100, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel_1());

		setResizable(false);
	}


	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBounds(new Rectangle(0, 0, 1203, 100));
			panel_1.setLayout(null);
			panel_1.add(getBtnPopularnost());
			panel_1.add(getBtnOcena());
			panel_1.add(getBtnGodina());
			panel_1.add(getBtnZanr());
			panel_1.add(getLblSortirajPo());
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
}
