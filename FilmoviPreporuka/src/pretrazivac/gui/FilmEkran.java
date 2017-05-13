package pretrazivac.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pretrazivac.Film;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JTextField;

public class FilmEkran extends JFrame {
	private Film film;
	private JPanel contentPane;
	private JPanel panel;
	private JButton btnGledaj;
	private JTextField textField;
	/**
	 * Create the frame
	 */
	public FilmEkran(Film film) {
		this.film=film;
		setBounds(100, 100, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanel(), BorderLayout.SOUTH);
		contentPane.add(getTextField(), BorderLayout.CENTER);
		setResizable(false);
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(10, 110));
			panel.add(getBtnGledaj());
		}
		return panel;
	}
	private JButton getBtnGledaj() {
		if (btnGledaj == null) {
			btnGledaj = new JButton("Gledaj");
		}
		return btnGledaj;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
		}
		return textField;
	}
	
}
