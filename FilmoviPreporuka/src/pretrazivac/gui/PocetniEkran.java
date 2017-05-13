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

public class PocetniEkran extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private JPanel panel_2;

	public PocetniEkran() {
		setBounds(100, 100, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getPanel_1());
		setResizable(false);
		
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(0, 105, 1200, 755);
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getScrollPane_1(), BorderLayout.CENTER);
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBounds(5, 5, 1200, 100);
			panel_1.setPreferredSize(new Dimension(10, 100));
		}
		return panel_1;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getPanel_2());
		}
		return scrollPane;
	}
	public JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(new MigLayout("insets 0, wrap 8", "0[]0","0[]0"));			

		}
		return panel_2;
	}
	public void dodajDugme(PristupFilmu p){
		this.panel_2.add(p);
		p.setVisible(true);

	}

}
