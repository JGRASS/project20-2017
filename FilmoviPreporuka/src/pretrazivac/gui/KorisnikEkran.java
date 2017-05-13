package pretrazivac.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class KorisnikEkran extends JFrame {

	private JPanel contentPane;

	public KorisnikEkran() {
		setBounds(100, 100, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setResizable(false);
	}

}
