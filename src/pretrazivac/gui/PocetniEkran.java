package pretrazivac.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;

import java.awt.Dimension;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PocetniEkran extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private JPanel panel_2;
	private JLabel lblImage;
	private JButton btnX;
	private JButton btnAccount;
	private JButton btnPopularnost;
	private JButton btnOcena;
	private JButton btnGodina;
	private JButton btnNaziv;
	private JLabel lblSortirajPo;
	private JLabel label;
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
	private JLabel lblPulldown;



	public PocetniEkran() {
		setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/images/clapperboard.png")));
		setTitle("BEST MOVIES 4 YOU");
		setBounds(100, 100, 1203, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblPulldown());
		contentPane.add(getPanel());
		contentPane.add(getPanel_1());
		contentPane.setBackground(new Color(29,29,40));
		contentPane.add(getLabel());
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel.setBounds(0,30,1203,835);
				btnNapredno.setVisible(false);
				lblPulldown.setVisible(true);
				panel_1.setBounds(0,-85,1203,100);
				repaint();
				
			}
		});
		setResizable(false);
		
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setAutoscrolls(true);
			panel.setOpaque(false);
			panel.setBounds(0, 30, 1203, 835);
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getScrollPane_1(), BorderLayout.CENTER);


		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.add(getBtnAccount());
			panel_1.add(getBtnPopularnost());
			panel_1.add(getBtnOcena());
			panel_1.add(getBtnGodina());
			panel_1.add(getBtnNaziv());
			panel_1.add(getLblSortirajPo());
			panel_1.add(getBtnPreporuke());
			panel_1.add(getLblPretrai());
			panel_1.add(getTextField());
			panel_1.add(getBtnNapredno());
			panel_1.add(getBtnPretrazi());
			panel_1.add(getBtnPonistiPretragu());
			panel_1.setLayout(null);
			panel_1.setOpaque(false);
			panel_1.setBackground(null);
			panel_1.setBounds(0, -85, 1203, 100);
			panel_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent arg0) {
					panel_1.setBounds(0, 0, 1203, 100);
					btnNapredno.setVisible(true);
					lblPulldown.setVisible(false);
					panel.setBounds(0,110,1203,755);
					repaint();
					
				}
			});
			
			
			
		}
		return panel_1;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setAutoscrolls(true);
			scrollPane.setOpaque(false);
			scrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(7, 0));
			scrollPane.setBackground(null);
			scrollPane.getVerticalScrollBar().setBorder(null);
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane.setViewportView(getPanel_2());
			scrollPane.getVerticalScrollBar().setUnitIncrement(16);
		}
		return scrollPane;
	}
	public JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setOpaque(true);
			panel_2.setBackground(new Color(29, 29, 40));
			panel_2.setAutoscrolls(true);
			panel_2.setLayout(new MigLayout("insets 0, wrap 8", "0[]0","0[]0"));			

		}
		return panel_2;
	}

	public void dodajDugme(PristupFilmu p){
		this.panel_2.add(p);
		p.setVisible(true);

	}
	private JLabel getLblImage() {
		if (lblImage == null) {
			lblImage = new JLabel("");
			lblImage.setOpaque(true);
			lblImage.setPreferredSize(new Dimension(1203, 100));
			lblImage.setIcon(new ImageIcon("E:\\data\\output\\loginBack.png"));
			lblImage.setLocation(panel_1.getLocation());
			lblImage.setVisible(true);
			
		}
		return lblImage;
	}
	private JButton getBtnX() {
		if (btnX == null) {
			btnX = new JButton("X");
			btnX.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					GuiControler.ugasiPocetniEkran();
					
				}
			});
		}
		return btnX;
	}
	private JButton getBtnAccount() {
		if (btnAccount == null) {
			btnAccount = new JButton("");
			btnAccount.setFocusPainted(false);
			btnAccount.setContentAreaFilled(false);
			btnAccount.setBorderPainted(false);
			btnAccount.setPressedIcon(new ImageIcon("E:\\data\\output\\account.png"));
			btnAccount.setIcon(new ImageIcon("E:\\data\\output\\account (1).png"));
			btnAccount.setBounds(1091, 13, 79, 74);
		}
		return btnAccount;
	}
	private JButton getBtnPopularnost() {
		if (btnPopularnost == null) {
			
			btnPopularnost = new JButton("Popularnosti");
			btnPopularnost.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					GuiControler.sortirajListuPoGledanosti();
				}
			});
			btnPopularnost.setFocusPainted(false);
			btnPopularnost.setBorderPainted(false);
			btnPopularnost.setForeground(new Color(255, 255, 255));
			btnPopularnost.setContentAreaFilled(false);
			btnPopularnost.setIcon(new ImageIcon("E:\\data\\output\\tickets.png"));
			btnPopularnost.setPressedIcon(new ImageIcon("E:\\data\\output\\tickets1.png"));
			btnPopularnost.setBounds(12, 46, 146, 41);
			btnPopularnost.setBorderPainted(false);
		}
		return btnPopularnost;
	}
	private JButton getBtnOcena() {
		if (btnOcena == null) {
			btnOcena = new JButton("Oceni");
			btnOcena.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GuiControler.sortirajListuPoOceni();
				}
			});
			btnOcena.setPressedIcon(new ImageIcon("E:\\data\\output\\frame1.png"));
			btnOcena.setFocusPainted(false);
			btnOcena.setBorderPainted(false);
			btnOcena.setForeground(new Color(255, 255, 255));
			btnOcena.setIcon(new ImageIcon("E:\\data\\output\\frame.png"));
			btnOcena.setBounds(159, 46, 105, 41);
			btnOcena.setContentAreaFilled(false);

		}
		return btnOcena;
	}
	private JButton getBtnGodina() {
		if (btnGodina == null) {
			btnGodina = new JButton("Godini");
			btnGodina.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GuiControler.sortirajListuPoGodini();
				}
			});
			btnGodina.setPressedIcon(new ImageIcon("E:\\data\\output\\popcorn1.png"));
			btnGodina.setFocusPainted(false);
			btnGodina.setBorderPainted(false);
			btnGodina.setForeground(new Color(255, 255, 255));
			btnGodina.setIcon(new ImageIcon("E:\\data\\output\\popcorn.png"));
			btnGodina.setBounds(264, 50, 107, 33);
			btnGodina.setContentAreaFilled(false);

		}
		return btnGodina;
	}
	private JButton getBtnNaziv() {
		if (btnNaziv == null) {
			btnNaziv = new JButton("Nazivu");
			btnNaziv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GuiControler.sortirajListuPoNazivu();
				}
			});
			btnNaziv.setPressedIcon(new ImageIcon("E:\\data\\output\\clapperboard1.png"));
			btnNaziv.setBorderPainted(false);
			btnNaziv.setFocusPainted(false);
			btnNaziv.setForeground(new Color(255, 255, 255));
			btnNaziv.setIcon(new ImageIcon("E:\\data\\output\\clapperboard.png"));
			btnNaziv.setContentAreaFilled(false);
			btnNaziv.setBounds(375, 50, 115, 33);
		}
		return btnNaziv;
	}
	private JLabel getLblSortirajPo() {
		if (lblSortirajPo == null) {
			lblSortirajPo = new JLabel("SORTIRAJ PO:");
			lblSortirajPo.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 13));
			lblSortirajPo.setForeground(new Color(255, 255, 255));
			lblSortirajPo.setBounds(37, 17, 95, 16);
		}
		return lblSortirajPo;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
			label.setIcon(new ImageIcon("E:\\data\\output\\loginBack.png"));
			label.setBounds(0, 0, 1203, 865);
		}
		return label;
	}
	private JButton getBtnPreporuke() {
		if (btnPreporuke == null) {
			btnPreporuke = new JButton("");
			btnPreporuke.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GuiControler.preporuciFilmove();
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
			textField.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					textField.setText("");
				}
			});
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
					showMenu(e);
				
			}
			public void mouseReleased(MouseEvent e) {
					showMenu(e);
				
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
			txtGodina.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					txtGodina.setText("");
				}
			});
			txtGodina.setText("0");
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
			txtZanr.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					txtZanr.setText("");
				}
			});
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
			btnPretrazi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GuiControler.pretraziFilmove(textField.getText().toLowerCase(), Integer.parseInt(txtGodina.getText()), txtZanr.getText());
				}
			});
			btnPretrazi.setFocusPainted(false);
			btnPretrazi.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			btnPretrazi.setContentAreaFilled(false);
			btnPretrazi.setIcon(new ImageIcon(KorisnikEkran.class.getResource("/images/magnifier.png")));
			btnPretrazi.setBounds(899, 46, 41, 41);
			btnPretrazi.setVisible(true);
		}
		return btnPretrazi;
	}
	private JButton getBtnPonistiPretragu() {
		if (btnPonistiPretragu == null) {
			btnPonistiPretragu = new JButton("");
			btnPonistiPretragu.setFocusPainted(false);
			btnPonistiPretragu.addActionListener(new ActionListener() {				
				@Override
				public void actionPerformed(ActionEvent e) {
					GuiControler.ponistiIzmene();
				}
			});
			btnPonistiPretragu.setContentAreaFilled(false);
			btnPonistiPretragu.setBorderPainted(false);
			btnPonistiPretragu.setIcon(new ImageIcon(KorisnikEkran.class.getResource("/images/ponistiPretragu.png")));
			btnPonistiPretragu.setBounds(1003, 43, 74, 37);
		}
		return btnPonistiPretragu;
	}
	private JLabel getLblPulldown() {
		if (lblPulldown == null) {
			lblPulldown = new JLabel("");
			lblPulldown.setBackground(Color.GRAY);
			lblPulldown.setHorizontalAlignment(SwingConstants.CENTER);
			lblPulldown.setIcon(new ImageIcon(PocetniEkran.class.getResource("/javax/swing/plaf/metal/icons/sortDown.png")));
			lblPulldown.setBounds(570, 13, 56, 16);
		}
		return lblPulldown;
	}
}
