package runTimeSelection;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.security.CodeSource;

import sun.audio.*;

public class Main1 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 561811103320831759L;
	public ArrayList<JButton> tmpButton = new ArrayList<JButton>();
	public final String title = "\u0E23\u0E30\u0E1A\u0E1A\u0E2D\u0E2D\u0E14\u0E40\u0E27\u0E25\u0E32\u0E42\u0E23\u0E07\u0E40\u0E23\u0E35\u0E22\u0E19 School Timer Clock System";
	public final int width = 656;
	public final int height = 555;
	public final Color bgcolor = Color.BLACK;
	public static JLabel timer = new JLabel("--:--:--");
	public static JLabel timer_shadow = new JLabel("--:--:--");
	public static File chooser;
	public static String jarDir;
	public static DelayLoadConfig delayLoadConfig = null;
	public static Thread delayLoadConnfig_Thread = null;

	public static JCheckBox food1015 = new JCheckBox("10.15");
	public static JCheckBox food1256 = new JCheckBox("12.56");
	public static JCheckBox food1445 = new JCheckBox("14.45");

	public static JCheckBox shoe1255 = new JCheckBox("12.55");

	public static JCheckBox closeElectric1541 = new JCheckBox("15.41");
	public static JCheckBox closeElectric1631 = new JCheckBox("16.31");

	public static JCheckBox goOut1632 = new JCheckBox("16.32");

	public static JCheckBox announce1221 = new JCheckBox("12.21");
	public static JCheckBox announce1229 = new JCheckBox("12.29");

	public static JCheckBox r0830 = new JCheckBox("8.30");
	public static JCheckBox r0920 = new JCheckBox("9.20");
	public static JCheckBox r1010 = new JCheckBox("10.10");
	public static JCheckBox r1020 = new JCheckBox("10.20");
	public static JCheckBox r1110 = new JCheckBox("11.10");
	public static JCheckBox r1300 = new JCheckBox("13.00");
	public static JCheckBox r1350 = new JCheckBox("13.50");
	public static JCheckBox r1440 = new JCheckBox("14.40");
	public static JCheckBox r1450 = new JCheckBox("14.50");
	public static JCheckBox r1200 = new JCheckBox("12.00");
	public static JCheckBox r1540 = new JCheckBox("15.40");
	public static JCheckBox r1630 = new JCheckBox("16.30");

	public static JLabel date = new JLabel("--/--/----");
	public static JLabel label = new JLabel("--/--/----");
	private final JButton button_6 = new JButton("");
	private final JButton button_10 = new JButton("");
	private final JButton button_11 = new JButton("");
	private final JButton button_12 = new JButton("");
	private final JButton button_13 = new JButton("");
	private final JButton button_14 = new JButton("");
	private final JButton button_8 = new JButton("");
	private final JButton button_9 = new JButton("");
	private final JButton button_15 = new JButton("");
	private final JButton button_16 = new JButton("");
	private final JLabel lblNewLabel = new JLabel("");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main1 frame = new Main1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void announce(String m) {
		String Time = DelayLoadConfig.Time;
		if (Time == null)
			Time = "          ";
		else
			Time = "<" + DelayLoadConfig.Time + ">";
		System.out.print(Time + " " + m + String.format("%n"));
	}

	public Main1() {
		announce("running program . . .");
		setTitle(title);
		setPreferredSize(new Dimension(width, height));
		setResizable(false);
		announce("set title = " + title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, width, height);
		announce("set gui border:");
		announce("   width = " + width);
		announce("   height = " + height);
		announce("set background = " + bgcolor.toString());
		JPanel contentPane = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponents(g);
				Graphics2D g2d = (Graphics2D) g;
				g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
				int w = getWidth();
				int h = getHeight();
				Color color1 = Color.decode("#ffafbd");
				Color color2 = Color.decode("#ffc3a0");
				GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
				g2d.setPaint(gp);
				g2d.fillRect(0, 0, w, h);
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		// contentPane.setBackground(Color.decode("#333333"));

		contentPane.setLayout(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		label.setToolTipText(
				"\u0E40\u0E27\u0E25\u0E32\u0E02\u0E2D\u0E07\u0E40\u0E04\u0E23\u0E37\u0E48\u0E2D\u0E07\u0E1B\u0E31\u0E08\u0E08\u0E38\u0E1A\u0E31\u0E19");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Cordia New", Font.BOLD, 45));
		label.setBounds(5, 35, 280, 70);
		contentPane.add(label);
		date.setBackground(Color.WHITE);

		date.setToolTipText(
				"\u0E40\u0E27\u0E25\u0E32\u0E02\u0E2D\u0E07\u0E40\u0E04\u0E23\u0E37\u0E48\u0E2D\u0E07\u0E1B\u0E31\u0E08\u0E08\u0E38\u0E1A\u0E31\u0E19");
		date.setHorizontalAlignment(SwingConstants.CENTER);
		date.setForeground(Color.BLACK);
		date.setFont(new Font("Cordia New", Font.BOLD, 45));
		date.setBounds(3, 38, 280, 70);
		contentPane.add(date);

		timer.setToolTipText(
				"\u0E40\u0E27\u0E25\u0E32\u0E02\u0E2D\u0E07\u0E40\u0E04\u0E23\u0E37\u0E48\u0E2D\u0E07\u0E1B\u0E31\u0E08\u0E08\u0E38\u0E1A\u0E31\u0E19");
		timer.setHorizontalAlignment(SwingConstants.CENTER);
		timer.setFont(new Font("Cordia New", Font.BOLD, 66));
		timer.setForeground(Color.WHITE);
		timer.setBounds(-55, -33, 400, 129);
		contentPane.add(timer);

		timer_shadow.setToolTipText(
				"\u0E40\u0E27\u0E25\u0E32\u0E02\u0E2D\u0E07\u0E40\u0E04\u0E23\u0E37\u0E48\u0E2D\u0E07\u0E1B\u0E31\u0E08\u0E08\u0E38\u0E1A\u0E31\u0E19");
		timer_shadow.setHorizontalAlignment(SwingConstants.CENTER);
		timer_shadow.setForeground(new Color(0, 0, 0));
		timer_shadow.setFont(new Font("Cordia New", Font.BOLD, 66));
		timer_shadow.setBounds(-57, -30, 400, 129);
		contentPane.add(timer_shadow);

		JButton button = new JButton(
				"\u0E44\u0E21\u0E48\u0E2A\u0E27\u0E21\u0E23\u0E2D\u0E07\u0E40\u0E17\u0E49\u0E32\u0E02\u0E36\u0E49\u0E19\u0E15\u0E36\u0E01");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				soundDir(jarDir + "No_SHOE.wav");
				announce("RUN No_SHOE.wav");
			}
		});
		button.setBorder(null);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Cordia New", Font.BOLD, 30));
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(14, 190, 300, 36);
		contentPane.add(button);

		JButton button_1 = new JButton(
				"\u0E44\u0E21\u0E48\u0E19\u0E33\u0E2D\u0E32\u0E2B\u0E32\u0E23\u0E02\u0E36\u0E49\u0E19\u0E15\u0E36\u0E01");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soundDir(jarDir + "No_FOOD.wav");
				announce("RUN No_FOOD.wav");
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_1.setBounds(14, 145, 300, 36);
		button_1.setBackground(Color.DARK_GRAY);
		button_1.setBorder(null);
		contentPane.add(button_1);

		JButton button_2 = new JButton("\u0E1B\u0E34\u0E14\u0E44\u0E1F-\u0E1E\u0E31\u0E14\u0E25\u0E21");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soundDir(jarDir + "Close_ELEC.wav");
				announce("RUN Close_ELEC.wav");
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_2.setBackground(Color.DARK_GRAY);
		button_2.setBorder(null);
		button_2.setBounds(14, 235, 300, 36);
		contentPane.add(button_2);

		JButton button_3 = new JButton(
				"\u0E25\u0E07\u0E08\u0E32\u0E01\u0E2D\u0E32\u0E04\u0E32\u0E23\u0E40\u0E23\u0E35\u0E22\u0E19");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_3.setEnabled(false);
		button_3.setForeground(Color.GRAY);
		button_3.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_3.setBackground(null);
		button_3.setBorder(null);
		button_3.setBounds(14, 280, 300, 36);
		contentPane.add(button_3);

		food1015.setSelected(true);
		food1015.setFont(new Font("Tahoma", Font.BOLD, 22));
		food1015.setBounds(318, 145, 99, 40);
		food1015.setForeground(Color.WHITE);
		food1015.setBackground(null);
		contentPane.add(food1015);
		food1256.setSelected(true);

		food1256.setFont(new Font("Tahoma", Font.BOLD, 22));
		food1256.setBounds(421, 145, 99, 40);
		food1256.setForeground(Color.WHITE);
		food1256.setBackground(null);
		contentPane.add(food1256);

		food1445.setSelected(true);
		food1445.setFont(new Font("Tahoma", Font.BOLD, 22));
		food1445.setBounds(526, 145, 99, 40);
		food1445.setForeground(Color.WHITE);
		food1445.setBackground(null);
		contentPane.add(food1445);

		shoe1255.setSelected(true);
		shoe1255.setFont(new Font("Tahoma", Font.BOLD, 22));
		shoe1255.setBounds(318, 190, 99, 40);
		shoe1255.setForeground(Color.WHITE);
		shoe1255.setBackground(null);
		contentPane.add(shoe1255);

		closeElectric1541.setSelected(true);
		closeElectric1541.setFont(new Font("Tahoma", Font.BOLD, 22));
		closeElectric1541.setBounds(318, 235, 99, 40);
		closeElectric1541.setForeground(Color.WHITE);
		closeElectric1541.setBackground(null);
		contentPane.add(closeElectric1541);

		closeElectric1631.setSelected(true);
		closeElectric1631.setFont(new Font("Tahoma", Font.BOLD, 22));
		closeElectric1631.setBounds(421, 235, 99, 40);
		closeElectric1631.setForeground(Color.WHITE);
		closeElectric1631.setBackground(null);
		contentPane.add(closeElectric1631);

		goOut1632.setForeground(Color.GRAY);
		goOut1632.setBackground(Color.LIGHT_GRAY);
		goOut1632.setEnabled(false);
		goOut1632.setForeground(Color.WHITE);
		goOut1632.setBackground(null);
		goOut1632.setFont(new Font("Tahoma", Font.BOLD, 22));
		goOut1632.setBounds(318, 280, 99, 40);
		contentPane.add(goOut1632);

		JButton button_4 = new JButton(
				"\u0E01\u0E23\u0E38\u0E13\u0E32\u0E40\u0E25\u0E37\u0E2D\u0E01\u0E44\u0E1F\u0E25\u0E4C");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chooser != null)
					soundDir(chooser.toString());
			}
		});
		button_4.setEnabled(false);
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_4.setBackground(Color.DARK_GRAY);
		button_4.setBorder(null);
		button_4.setBounds(14, 325, 264, 36);
		contentPane.add(button_4);

		announce1221.setSelected(true);
		announce1221.setFont(new Font("Tahoma", Font.BOLD, 22));
		announce1221.setBounds(318, 325, 99, 40);
		announce1221.setForeground(Color.WHITE);
		announce1221.setBackground(null);
		contentPane.add(announce1221);

		announce1229.setSelected(true);
		announce1229.setFont(new Font("Tahoma", Font.BOLD, 22));
		announce1229.setBounds(419, 325, 99, 40);
		announce1229.setForeground(Color.WHITE);
		announce1229.setBackground(null);
		contentPane.add(announce1229);

		JButton button_5 = new JButton("Rhythm 1");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soundDir(jarDir + "Rhythm_1.wav");
				announce("RUN Rhythm_1.wav");
			}
		});
		button_8.setForeground(Color.BLACK);
		button_8.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_8.setEnabled(false);
		button_8.setBorder(null);
		button_8.setBackground(new Color(144, 238, 144));
		button_8.setBounds(14, 382, 4, 31);

		contentPane.add(button_8);
		button_9.setForeground(Color.BLACK);
		button_9.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_9.setEnabled(false);
		button_9.setBorder(null);
		button_9.setBackground(new Color(144, 238, 144));
		button_9.setBounds(245, 382, 4, 31);

		contentPane.add(button_9);
		button_15.setForeground(Color.BLACK);
		button_15.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_15.setEnabled(false);
		button_15.setBorder(null);
		button_15.setBackground(new Color(144, 238, 144));
		button_15.setBounds(245, 417, 4, 31);

		contentPane.add(button_15);
		button_16.setForeground(Color.BLACK);
		button_16.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_16.setEnabled(false);
		button_16.setBorder(null);
		button_16.setBackground(new Color(144, 238, 144));
		button_16.setBounds(245, 452, 4, 31);

		contentPane.add(button_16);
		button_5.setForeground(Color.WHITE);
		button_5.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_5.setBackground(Color.DARK_GRAY);
		button_5.setBounds(18, 382, 221, 31);
		contentPane.add(button_5);

		r0830.setSelected(true);
		r0830.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r0830.setBounds(14, 417, 71, 31);
		r0830.setForeground(Color.WHITE);
		r0830.setBackground(Color.decode("#2b2b2b"));
		contentPane.add(r0830);

		r0920.setSelected(true);
		r0920.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r0920.setBounds(14, 452, 71, 31);
		r0920.setForeground(Color.WHITE);
		r0920.setBackground(Color.decode("#2b2b2b"));
		contentPane.add(r0920);

		r1010.setSelected(true);
		r1010.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1010.setBounds(14, 487, 71, 31);
		r1010.setForeground(Color.WHITE);
		r1010.setBackground(Color.decode("#2b2b2b"));
		contentPane.add(r1010);

		r1020.setSelected(true);
		r1020.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1020.setBounds(91, 417, 71, 31);
		r1020.setForeground(Color.WHITE);
		r1020.setBackground(Color.decode("#2b2b2b"));
		contentPane.add(r1020);

		r1110.setSelected(true);
		r1110.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1110.setBounds(91, 452, 71, 31);
		r1110.setForeground(Color.WHITE);
		r1110.setBackground(Color.decode("#2b2b2b"));
		contentPane.add(r1110);

		r1300.setSelected(true);
		r1300.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1300.setBounds(91, 487, 71, 31);
		r1300.setForeground(Color.WHITE);
		r1300.setBackground(Color.decode("#2b2b2b"));
		contentPane.add(r1300);

		r1350.setSelected(true);
		r1350.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1350.setBounds(168, 417, 71, 31);
		r1350.setForeground(Color.WHITE);
		r1350.setBackground(Color.decode("#2b2b2b"));
		contentPane.add(r1350);

		r1440.setSelected(true);
		r1440.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1440.setBounds(168, 452, 71, 31);
		r1440.setForeground(Color.WHITE);
		r1440.setBackground(Color.decode("#2b2b2b"));
		contentPane.add(r1440);

		r1450.setSelected(true);
		r1450.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1450.setBounds(168, 487, 71, 31);
		r1450.setForeground(Color.WHITE);
		r1450.setBackground(Color.decode("#2b2b2b"));
		contentPane.add(r1450);

		JButton btnRhythm = new JButton("Rhythm 2");
		btnRhythm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soundDir(jarDir + "Rhythm_2.wav");
				announce("RUN Rhythm_2.wav");
			}
		});
		btnRhythm.setForeground(Color.WHITE);
		btnRhythm.setFont(new Font("Cordia New", Font.BOLD, 30));
		btnRhythm.setBackground(Color.DARK_GRAY);
		btnRhythm.setBounds(249, 382, 194, 31);
		contentPane.add(btnRhythm);

		r1200.setSelected(true);
		r1200.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1200.setBounds(449, 382, 71, 31);
		r1200.setForeground(Color.WHITE);
		r1200.setBackground(Color.decode("#2b2b2b"));
		contentPane.add(r1200);

		JButton btnRhythm_1 = new JButton("Rhythm 3");
		btnRhythm_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soundDir(jarDir + "Rhythm_3.wav");
				announce("RUN Rhythm_3.wav");
			}
		});
		btnRhythm_1.setForeground(Color.WHITE);
		btnRhythm_1.setFont(new Font("Cordia New", Font.BOLD, 30));
		btnRhythm_1.setBackground(Color.DARK_GRAY);
		btnRhythm_1.setBounds(249, 417, 194, 31);
		contentPane.add(btnRhythm_1);

		r1540.setSelected(true);
		r1540.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1540.setBounds(449, 417, 71, 31);
		r1540.setForeground(Color.WHITE);
		r1540.setBackground(Color.decode("#2b2b2b"));
		contentPane.add(r1540);

		JButton btnRhythm_2 = new JButton("Rhythm 4");
		btnRhythm_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soundDir(jarDir + "Rhythm_4.wav");
				announce("RUN Rhythm_4.wav");
			}
		});
		btnRhythm_2.setForeground(Color.WHITE);
		btnRhythm_2.setFont(new Font("Cordia New", Font.BOLD, 30));
		btnRhythm_2.setBackground(Color.DARK_GRAY);
		btnRhythm_2.setBounds(249, 452, 194, 31);
		contentPane.add(btnRhythm_2);

		r1630.setSelected(true);
		r1630.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1630.setBounds(449, 452, 71, 31);
		r1630.setForeground(Color.WHITE);
		r1630.setBackground(Color.decode("#2b2b2b"));
		contentPane.add(r1630);
		button_6.setEnabled(false);
		button_6.setBorder(null);
		button_6.setForeground(Color.WHITE);
		button_6.setFont(new Font("Cordia New", Font.BOLD, 54));
		button_6.setBackground(new Color(144, 238, 144));
		button_6.setBounds(10, 100, 4, 36);
		contentPane.add(button_6);

		button_10.setEnabled(false);
		button_10.setForeground(Color.BLACK);
		button_10.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_10.setBackground(new Color(144, 238, 144));
		button_10.setBounds(10, 145, 4, 36);
		button_10.setBorder(null);
		contentPane.add(button_10);

		button_11.setForeground(Color.BLACK);
		button_11.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_11.setEnabled(false);
		button_11.setBorder(null);
		button_11.setBackground(new Color(144, 238, 144));
		button_11.setBounds(10, 190, 4, 36);
		contentPane.add(button_11);

		button_12.setForeground(Color.BLACK);
		button_12.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_12.setEnabled(false);
		button_12.setBorder(null);
		button_12.setBackground(new Color(144, 238, 144));
		button_12.setBounds(10, 235, 4, 36);
		contentPane.add(button_12);

		button_13.setForeground(Color.BLACK);
		button_13.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_13.setEnabled(false);
		button_13.setBorder(null);
		button_13.setBackground(new Color(255, 127, 80));
		button_13.setBounds(10, 325, 4, 36);
		contentPane.add(button_13);

		button_14.setForeground(Color.BLACK);
		button_14.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_14.setEnabled(false);
		button_14.setBorder(null);
		button_14.setBackground(new Color(220, 20, 60));
		button_14.setBounds(10, 280, 4, 36);

		contentPane.add(button_14);

		JButton thai = new JButton("\u0E40\u0E1E\u0E25\u0E07\r\n\u0E0A\u0E32\u0E15\u0E34");
		thai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					soundDir(jarDir + "thai.wav");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				announce("Run thai.wav");
			}
		});
		thai.setForeground(Color.WHITE);
		thai.setFont(new Font("Cordia New", Font.BOLD, 30));
		thai.setBorder(null);
		thai.setBackground(Color.DARK_GRAY);
		thai.setBounds(14, 100, 300, 36);
		contentPane.add(thai);
		lblNewLabel.setIcon(new ImageIcon("logo1.png"));
		lblNewLabel.setBounds(575, 403, 65, 115);

		contentPane.add(lblNewLabel);

		JButton button_18 = new JButton("...");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// File Chooser

				JFileChooser fileopen = new JFileChooser();
				int ret = fileopen.showDialog(null, "Choose file (WAV)");

				// get Selected File
				if (ret == JFileChooser.APPROVE_OPTION) {
					String dir = fileopen.getSelectedFile().toString();
					String dirArray[] = dir.split("");
					if (dirArray.length > 23) {
						String floatDir = "";
						for (int i = dirArray.length - 23; i < dirArray.length; i++) {
							floatDir += dirArray[i];
						}
						dir = "..." + floatDir;
					}

					button_4.setText(dir);
					button_4.setEnabled(true);
					chooser = fileopen.getSelectedFile();
					button_13.setBackground(new Color(144, 238, 144));
				}
			}
		});
		button_18.setForeground(Color.WHITE);
		button_18.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_18.setBorder(null);
		button_18.setBackground(Color.LIGHT_GRAY);
		button_18.setBounds(277, 325, 36, 36);
		contentPane.add(button_18);

		delayLoadConfig = new DelayLoadConfig();
		delayLoadConnfig_Thread = new Thread(delayLoadConfig);
		delayLoadConnfig_Thread.start();

		CodeSource codeSource = Main1.class.getProtectionDomain().getCodeSource();
		File jarFile;
		try {
			jarFile = new File(codeSource.getLocation().toURI().getPath());
			jarDir = jarFile.getParentFile().getPath() + "/";
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
	}

	@SuppressWarnings("restriction")
	public static void soundDir(String string) {
		String gongFile = string;
		InputStream in;
		try {
			in = new FileInputStream(gongFile);
			AudioStream stream = new AudioStream(in);
			AudioPlayer.player.start(stream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}