package pretrazivac.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import pretrazivac.Film;

import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;

public class GledanjeFilma extends JFrame {

	private JPanel contentPane;
	private JLabel lblBackimage;
	private JLabel lblLink;
	private JSlider slider;
	private JButton btnOceni;
	private Film film;
	
	/**
	 * Create the frame.
	 */
	public GledanjeFilma(Film film) {
		setAlwaysOnTop(true);
		this.film=film;
		setUndecorated(true);
		setResizable(false);
		setVisible(true);
		setForeground(Color.BLACK);
		setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/images/clapperboard.png")));
		setTitle("BEST MOVIES 4 YOU");
		setBounds(0, 0, 450, 300);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblLink());
		contentPane.add(getBtnOceni());
		contentPane.add(getSlider());
		contentPane.add(getLblBackimage());
	}
	private JLabel getLblBackimage() {
		if (lblBackimage == null) {
			lblBackimage = new JLabel("");
			lblBackimage.setIcon(new ImageIcon(GledanjeFilma.class.getResource("/images/loginBack.png")));
			lblBackimage.setBounds(0, 0, 450, 300);
		}
		return lblBackimage;
	}
	private JLabel getLblLink() {
		if (lblLink == null) {
			lblLink = new JLabel("");
			lblLink.setText("Ocenite film: "+film.getNaziv());
			lblLink.setForeground(Color.LIGHT_GRAY);
			lblLink.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 21));
			lblLink.setBounds(70, 56, 302, 38);
		}
		return lblLink;
	}
	private JSlider getSlider() {
		if (slider == null) {
			
			slider = new JSlider();

			slider.setForeground(Color.LIGHT_GRAY);

			slider.setMajorTickSpacing(1);
			slider.setValue(1);
			slider.setMinimum(1);
			slider.setMaximum(10);
			slider.setOpaque(false);
			slider.setBackground(null);
			slider.setPaintLabels(true);
			slider.setSnapToTicks(true);
			slider.setBounds(70, 123, 315, 52);
			slider.addChangeListener(new ChangeListener() {
				
				@Override
				public void stateChanged(ChangeEvent e) {
					btnOceni.setEnabled(true);



				}
			});

		}
		return slider;
	}
	private JButton getBtnOceni() {
		if (btnOceni == null) {
			btnOceni = new JButton("OCENI");
			btnOceni.setContentAreaFilled(false);
			btnOceni.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
			btnOceni.setHorizontalTextPosition(SwingConstants.CENTER);
			btnOceni.setPressedIcon(new ImageIcon(GledanjeFilma.class.getResource("/images/frame1.png")));
			btnOceni.setVerticalTextPosition(SwingConstants.BOTTOM);
			btnOceni.setVerticalAlignment(SwingConstants.TOP);
			btnOceni.setForeground(Color.WHITE);
			btnOceni.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
			btnOceni.setIcon(new ImageIcon(GledanjeFilma.class.getResource("/images/frame.png")));
			btnOceni.setBounds(171, 188, 97, 64);
			btnOceni.setEnabled(false);
			btnOceni.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					GuiControler.azurirajFilm(film,1.0*slider.getValue());
					GuiControler.dodajKorisnikuFilm(film, 1.0*slider.getValue());
					GuiControler.ugasiGledanjeFilma();	
				}
			});

		}
		return btnOceni;
	}
}
