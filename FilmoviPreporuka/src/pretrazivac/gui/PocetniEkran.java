package pretrazivac.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Dimension;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

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

	public PocetniEkran() {
		setBounds(100, 100, 1203, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getPanel_1());
		contentPane.setBackground(new Color(29,29,40));
		contentPane.add(getLabel());
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				panel.setBounds(0,30,1203,835);
				panel_1.setBounds(0,-85,1203,100);
				repaint();
				
			}
		});
		setResizable(false);
		
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
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
			panel_1.setLayout(null);
			panel_1.setOpaque(false);
			panel_1.setBackground(null);
			panel_1.setBackground(new Color(29,29,40));
			panel_1.setBounds(0, -85, 1203, 100);
			panel_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent arg0) {
					panel_1.setBounds(0, 0, 1203, 100);
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
			scrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(7, 0));
			scrollPane.getVerticalScrollBar().setBackground(new Color(29, 29, 40));
			scrollPane.getVerticalScrollBar().setBorder(null);
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane.setViewportView(getPanel_2());
		}
		return scrollPane;
	}
	public JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBackground(new Color(29, 29, 40));

			panel_2.setLayout(new MigLayout("insets 0, wrap 8", "0[]0","0[]0"));			

		}
		return panel_2;
	}
	public void isprazniPanel_2(){
		panel_2=null;
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
			btnNaziv.setBounds(375, 50, 105, 33);
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
	public void noviPanel_2(){
		panel=null;
		contentPane.add(getPanel());
	}
}
