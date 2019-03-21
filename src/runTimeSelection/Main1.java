package runTimeSelection;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Main1 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 561811103320831759L;
	public ArrayList<JButton> tmpButton = new ArrayList<JButton>();
	public final String title = "\u0E23\u0E30\u0E1A\u0E1A\u0E2D\u0E2D\u0E14\u0E40\u0E27\u0E25\u0E32\u0E42\u0E23\u0E07\u0E40\u0E23\u0E35\u0E22\u0E19 School Timer Clock System";
	public final String creditTxt = "Created by Palapon Soontornpas & Sahatsawat Sudaphonrat";
	public final int width = 656;
	public final int height = 555;
	public JLabel credit = new JLabel(creditTxt);
	public final Color bgcolor = Color.BLACK;
	public static JLabel timer = new JLabel("--:--:--");
	public static JLabel timer_shadow = new JLabel("--:--:--");
	public static final String password = "smdmm2524";
	public static File chooser;
	public static DelayLoadConfig delayLoadConfig = null;
	public static Thread delayLoadConnfig_Thread = null;

	public static JCheckBox food1015 = new JCheckBox("10.15");
	public static JCheckBox food1201 = new JCheckBox("12.01");
	public static JCheckBox food1256 = new JCheckBox("12.56");
	public static JCheckBox food1445 = new JCheckBox("14.45");

	public static JCheckBox shoe1255 = new JCheckBox("12.55");

	public static JCheckBox closeElectric1541 = new JCheckBox("15.41");
	public static JCheckBox closeElectric1631 = new JCheckBox("16.31");

	public static JCheckBox goOut1632 = new JCheckBox("16.32");

	public static JCheckBox announce1221 = new JCheckBox("");
	public static JCheckBox announce1229 = new JCheckBox("");

	public static boolean switcher = false;

	public static JCheckBox r0830 = new JCheckBox("08.30");
	public static JCheckBox r0920 = new JCheckBox("09.20");
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
	public static JButton under_button1 = new JButton(
			"\u0E44\u0E21\u0E48\u0E19\u0E33\u0E2D\u0E32\u0E2B\u0E32\u0E23\u0E02\u0E36\u0E49\u0E19\u0E15\u0E36\u0E01");
	public static JButton under_button = new JButton(
			"\u0E44\u0E21\u0E48\u0E2A\u0E27\u0E21\u0E23\u0E2D\u0E07\u0E40\u0E17\u0E49\u0E32\u0E02\u0E36\u0E49\u0E19\u0E15\u0E36\u0E01");
	public static JButton under_button2 = new JButton("\u0E1B\u0E34\u0E14\u0E44\u0E1F-\u0E1E\u0E31\u0E14\u0E25\u0E21");
	private final JButton under_button4 = new JButton("");
	private final JButton under_button18 = new JButton("");
	private final JButton line1 = new JButton("");
	private final JButton line2 = new JButton("");
	private final JLabel bg = new JLabel("");
	private final JButton txtV;

	public static JButton button_4 = new JButton(
			"\u0E01\u0E23\u0E38\u0E13\u0E32\u0E40\u0E25\u0E37\u0E2D\u0E01\u0E44\u0E1F\u0E25\u0E4C");
	private final JButton under_btnRhythm = new JButton("Rhythm 2");
	private final JButton under_btnRhythm_1 = new JButton("Rhythm 3");
	private final JButton under_btnRhythm_2 = new JButton("Rhythm 4");
	private final JPasswordField passwordField = new JPasswordField();
	public static JTextField a_h = new JTextField("00");
	public static JTextField a_m = new JTextField("00");
	public static JTextField b_h = new JTextField("00");
	public static JTextField b_m = new JTextField("00");

	public static JButton button = new JButton("");
	public static JButton button_1 = new JButton("");
	public static JButton button_2 = new JButton("");

	public static ArrayList<Double> Rhythm1 = new ArrayList<Double>();
	public static ArrayList<Double> Rhythm2 = new ArrayList<Double>();
	public static ArrayList<Double> Rhythm3 = new ArrayList<Double>();
	public static ArrayList<Double> Rhythm4 = new ArrayList<Double>();
	public static ArrayList<Double> RhythmShoe = new ArrayList<Double>();
	public static ArrayList<Double> RhythmFood = new ArrayList<Double>();
	public static double[] Rhythm_1 = { 08.30, 09.20, 10.10, 10.20, 11.10, 13.00, 13.50, 14.40, 14.50 };
	public static double[] Rhythm_2 = { 12.00 };
	public static double[] Rhythm_3 = { 15.40 };
	public static double[] Rhythm_4 = { 16.30 };
	public static double[] Rhythm_Shoe = { 12.55 };
	public static double[] Rhythm_Food = { 10.15, 12.56, 14.45 };

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				for (int i = 0; i < Rhythm_1.length; i++)
					Rhythm1.add(Rhythm_1[i]);
				for (int i = 0; i < Rhythm_2.length; i++)
					Rhythm2.add(Rhythm_2[i]);
				for (int i = 0; i < Rhythm_3.length; i++)
					Rhythm3.add(Rhythm_3[i]);
				for (int i = 0; i < Rhythm_4.length; i++)
					Rhythm4.add(Rhythm_4[i]);
				for (int i = 0; i < Rhythm_Food.length; i++)
					RhythmFood.add(Rhythm_Food[i]);
				for (int i = 0; i < Rhythm_Shoe.length; i++)
					RhythmShoe.add(Rhythm_1[i]);

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
		setTitle("SMD School Timer Clock System");
		setPreferredSize(new Dimension(width, height));
		setResizable(false);
		announce("set title = " + title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, width, height);
		announce("set gui border:");
		announce("   width = " + width);
		announce("   height = " + height);
		announce("set background = " + bgcolor.toString());

		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setOpaque(false);
		contentPane.setLayout(null);
		setContentPane(contentPane);

		label.setToolTipText(
				"\u0E40\u0E27\u0E25\u0E32\u0E02\u0E2D\u0E07\u0E40\u0E04\u0E23\u0E37\u0E48\u0E2D\u0E07\u0E1B\u0E31\u0E08\u0E08\u0E38\u0E1A\u0E31\u0E19");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Cordia New", Font.BOLD, 45));
		label.setBounds(5, 35, 280, 70);
		contentPane.add(label);
		date.setBackground(Color.WHITE);

		date.setHorizontalAlignment(SwingConstants.CENTER);
		date.setForeground(Color.BLACK);
		date.setFont(new Font("Cordia New", Font.BOLD, 45));
		date.setBounds(3, 38, 280, 70);
		contentPane.add(date);

		timer.setHorizontalAlignment(SwingConstants.CENTER);
		timer.setFont(new Font("Cordia New", Font.BOLD, 66));
		timer.setForeground(Color.WHITE);
		timer.setBounds(-55, -36, 400, 129);
		contentPane.add(timer);

		timer_shadow.setHorizontalAlignment(SwingConstants.CENTER);
		timer_shadow.setForeground(new Color(0, 0, 0));
		timer_shadow.setFont(new Font("Cordia New", Font.BOLD, 66));
		timer_shadow.setBounds(-57, -33, 400, 129);
		contentPane.add(timer_shadow);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				soundDir("No_SHOE.wav");
				announce("RUN No_SHOE.wav");
			}
		});
		// button.setBorder(null);
		button.setEnabled(false);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Cordia New", Font.BOLD, 30));
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(14, 190, 300, 36);
		button.setOpaque(false);
		button.setBorderPainted(true);
		contentPane.add(button);

		button_1.setEnabled(false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soundDir("No_FOOD.wav");
				announce("RUN No_FOOD.wav");
			}
		});
		under_button.setFont(new Font("Cordia New", Font.BOLD, 30));
		under_button.setForeground(Color.WHITE);
		under_button.setBorder(null);
		under_button.setBackground(new Color(0, 0, 0, 99));
		under_button.setBounds(14, 190, 300, 36);
		under_button.setEnabled(false);
		contentPane.add(under_button);

		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_1.setBounds(14, 145, 300, 36);
		button_1.setBackground(Color.DARK_GRAY);
		// button_1.setBorder(null);
		button_1.setOpaque(false);
		button_1.setBorderPainted(true);
		contentPane.add(button_1);

		button_2.setEnabled(false);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soundDir("Close_ELEC.wav");
				announce("RUN Close_ELEC.wav");
			}
		});
		under_button1.setFont(new Font("Cordia New", Font.BOLD, 30));
		under_button1.setForeground(Color.WHITE);
		under_button1.setBorder(null);
		under_button1.setEnabled(false);
		under_button1.setBackground(new Color(0, 0, 0, 99));
		under_button1.setBounds(14, 145, 300, 36);

		contentPane.add(under_button1);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_2.setBackground(Color.DARK_GRAY);
		// button_2.setBorder(null);
		button_2.setBounds(14, 235, 300, 36);
		button_2.setOpaque(false);
		button_2.setBorderPainted(true);
		contentPane.add(button_2);

		JButton button_3 = new JButton(
				"\u0E25\u0E07\u0E08\u0E32\u0E01\u0E2D\u0E32\u0E04\u0E32\u0E23\u0E40\u0E23\u0E35\u0E22\u0E19");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		under_button2.setFont(new Font("Cordia New", Font.BOLD, 30));
		under_button2.setForeground(Color.WHITE);
		under_button2.setBorder(null);
		under_button2.setEnabled(false);
		under_button2.setBackground(new Color(0, 0, 0, 99));
		under_button2.setBounds(14, 235, 300, 36);

		contentPane.add(under_button2);
		button_3.setEnabled(false);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_3.setBackground(new Color(0, 0, 0, 0));
		button_3.setBorder(null);
		button_3.setBounds(14, 280, 300, 36);
		contentPane.add(button_3);

		food1015.setSelected(true);
		food1015.setFont(new Font("Tahoma", Font.PLAIN, 20));
		food1015.setBounds(318, 145, 80, 40);
		food1015.setForeground(Color.WHITE);
		food1015.setBackground(Color.PINK);
		food1015.setOpaque(false);
		food1015.setContentAreaFilled(false);
		food1015.setBorderPainted(false);
		contentPane.add(food1015);

		food1256.setSelected(true);
		food1256.setFont(new Font("Tahoma", Font.PLAIN, 20));
		food1256.setBounds(477, 145, 75, 40);
		food1256.setForeground(Color.WHITE);
		food1256.setBackground(Color.PINK);
		food1256.setOpaque(false);
		food1256.setContentAreaFilled(false);
		food1256.setBorderPainted(false);
		food1256.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!passwordField.getText().equalsIgnoreCase(password))
					food1256.setSelected(true);
			}
		});

		food1201.setSelected(true);
		food1201.setOpaque(false);
		food1201.setForeground(Color.WHITE);
		food1201.setFont(new Font("Tahoma", Font.PLAIN, 20));
		food1201.setContentAreaFilled(false);
		food1201.setBorderPainted(false);
		food1201.setBackground(Color.PINK);
		food1201.setBounds(400, 145, 75, 40);
		contentPane.add(food1201);
		contentPane.add(food1256);

		food1445.setSelected(true);
		food1445.setFont(new Font("Tahoma", Font.PLAIN, 20));
		food1445.setBounds(554, 144, 89, 40);
		food1445.setForeground(Color.WHITE);
		food1445.setBackground(Color.PINK);
		food1445.setOpaque(false);
		food1445.setContentAreaFilled(false);
		food1445.setBorderPainted(false);
		contentPane.add(food1445);

		shoe1255.setSelected(true);
		shoe1255.setFont(new Font("Tahoma", Font.PLAIN, 20));
		shoe1255.setBounds(318, 190, 99, 40);
		shoe1255.setForeground(Color.WHITE);
		shoe1255.setBackground(Color.PINK);
		shoe1255.setOpaque(false);
		shoe1255.setContentAreaFilled(false);
		shoe1255.setBorderPainted(false);
		shoe1255.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!passwordField.getText().equalsIgnoreCase(password))
					shoe1255.setSelected(true);
			}
		});
		contentPane.add(shoe1255);

		closeElectric1541.setSelected(true);
		closeElectric1541.setFont(new Font("Tahoma", Font.PLAIN, 20));
		closeElectric1541.setBounds(318, 235, 80, 40);
		closeElectric1541.setForeground(Color.WHITE);
		closeElectric1541.setBackground(Color.PINK);
		closeElectric1541.setOpaque(false);
		closeElectric1541.setContentAreaFilled(false);
		closeElectric1541.setBorderPainted(false);
		contentPane.add(closeElectric1541);

		closeElectric1631.setSelected(true);
		closeElectric1631.setFont(new Font("Tahoma", Font.PLAIN, 20));
		closeElectric1631.setBounds(401, 235, 89, 40);
		closeElectric1631.setForeground(Color.WHITE);
		closeElectric1631.setBackground(Color.PINK);
		closeElectric1631.setOpaque(false);
		closeElectric1631.setContentAreaFilled(false);
		closeElectric1631.setBorderPainted(false);

		contentPane.add(closeElectric1631);

		goOut1632.setForeground(Color.GRAY);
		goOut1632.setBackground(Color.LIGHT_GRAY);
		goOut1632.setEnabled(false);
		goOut1632.setForeground(Color.WHITE);
		goOut1632.setBackground(new Color(0, 0, 0, 0));
		goOut1632.setFont(new Font("Tahoma", Font.PLAIN, 20));
		goOut1632.setBounds(318, 280, 99, 40);
		contentPane.add(goOut1632);

		button_4.setEnabled(false);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chooser != null)
					soundDir(chooser.toString());
			}
		});
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_4.setBackground(Color.LIGHT_GRAY);
		// button_4.setBorder(null);
		button_4.setBounds(14, 325, 264, 36);
		button_4.setOpaque(false);
		button_4.setBorderPainted(true);
		contentPane.add(button_4);
		under_button4.setEnabled(false);
		under_button4.setBorder(null);
		under_button4.setBackground(new Color(0, 0, 0, 99));
		under_button4.setBounds(14, 325, 264, 36);

		contentPane.add(under_button4);

		a_h.setFont(new Font("Tahoma", Font.BOLD, 22));
		a_h.setBounds(340, 327, 41, 36);
		a_h.setColumns(10);
		a_h.setEnabled(false);
		contentPane.add(a_h);
		a_m.setFont(new Font("Tahoma", Font.BOLD, 22));
		a_m.setColumns(10);
		a_m.setBounds(389, 327, 41, 36);
		a_m.setEnabled(false);

		contentPane.add(a_m);
		b_h.setFont(new Font("Tahoma", Font.BOLD, 22));
		b_h.setColumns(10);
		b_h.setBounds(477, 325, 41, 36);
		b_h.setEnabled(false);

		contentPane.add(b_h);
		b_m.setFont(new Font("Tahoma", Font.BOLD, 22));
		b_m.setColumns(10);
		b_m.setBounds(526, 325, 41, 36);
		b_m.setEnabled(false);

		contentPane.add(b_m);

		announce1221.setSelected(false);
		announce1221.setFont(new Font("Tahoma", Font.BOLD, 22));
		announce1221.setBounds(318, 325, 99, 40);
		announce1221.setForeground(Color.WHITE);
		announce1221.setBackground(null);
		announce1221.setOpaque(false);
		announce1221.setContentAreaFilled(false);
		announce1221.setBorderPainted(false);
		announce1221.setEnabled(false);
		contentPane.add(announce1221);

		announce1229.setSelected(false);
		announce1229.setFont(new Font("Tahoma", Font.BOLD, 22));
		announce1229.setBounds(449, 325, 99, 40);
		announce1229.setForeground(Color.WHITE);
		announce1229.setBackground(null);
		announce1229.setOpaque(false);
		announce1229.setContentAreaFilled(false);
		announce1229.setBorderPainted(false);
		announce1229.setEnabled(false);
		contentPane.add(announce1229);

		JButton button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soundDir("Rhythm_1.wav");
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
		button_5.setOpaque(false);
		button_5.setBorderPainted(true);
		button_5.setBounds(18, 382, 221, 31);
		contentPane.add(button_5);

		JButton under_button5 = new JButton("Rhythm 1");
		under_button5.setOpaque(false);
		under_button5.setForeground(Color.WHITE);
		under_button5.setFont(new Font("Cordia New", Font.BOLD, 30));
		under_button5.setBorderPainted(false);
		under_button5.setBackground(Color.DARK_GRAY);
		under_button5.setBounds(18, 382, 221, 31);
		contentPane.add(under_button5);

		r0830.setSelected(true);
		r0830.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r0830.setBounds(14, 417, 71, 31);
		r0830.setForeground(Color.WHITE);
		r0830.setBackground(Color.decode("#2b2b2b"));
		r0830.setOpaque(false);
		r0830.setContentAreaFilled(false);
		r0830.setBorderPainted(false);
		contentPane.add(r0830);

		r0920.setSelected(true);
		r0920.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r0920.setBounds(14, 452, 71, 31);
		r0920.setForeground(Color.WHITE);
		r0920.setBackground(Color.decode("#2b2b2b"));
		r0920.setOpaque(false);
		r0920.setContentAreaFilled(false);
		r0920.setBorderPainted(false);
		contentPane.add(r0920);

		r1010.setSelected(true);
		r1010.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1010.setBounds(14, 487, 71, 31);
		r1010.setForeground(Color.WHITE);
		r1010.setBackground(Color.decode("#2b2b2b"));
		r1010.setOpaque(false);
		r1010.setContentAreaFilled(false);
		r1010.setBorderPainted(false);
		contentPane.add(r1010);

		r1020.setSelected(true);
		r1020.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1020.setBounds(91, 417, 71, 31);
		r1020.setForeground(Color.WHITE);
		r1020.setBackground(Color.decode("#2b2b2b"));
		r1020.setOpaque(false);
		r1020.setContentAreaFilled(false);
		r1020.setBorderPainted(false);
		contentPane.add(r1020);

		r1110.setSelected(true);
		r1110.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1110.setBounds(91, 452, 71, 31);
		r1110.setForeground(Color.WHITE);
		r1110.setBackground(Color.decode("#2b2b2b"));
		r1110.setOpaque(false);
		r1110.setContentAreaFilled(false);
		r1110.setBorderPainted(false);
		contentPane.add(r1110);

		r1300.setSelected(true);
		r1300.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1300.setBounds(91, 487, 71, 31);
		r1300.setForeground(Color.WHITE);
		r1300.setBackground(Color.decode("#2b2b2b"));
		r1300.setOpaque(false);
		r1300.setContentAreaFilled(false);
		r1300.setBorderPainted(false);
		contentPane.add(r1300);

		r1350.setSelected(true);
		r1350.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1350.setBounds(168, 417, 71, 31);
		r1350.setForeground(Color.WHITE);
		r1350.setBackground(Color.decode("#2b2b2b"));
		r1350.setOpaque(false);
		r1350.setContentAreaFilled(false);
		r1350.setBorderPainted(false);
		contentPane.add(r1350);

		r1440.setSelected(true);
		r1440.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1440.setBounds(168, 452, 71, 31);
		r1440.setForeground(Color.WHITE);
		r1440.setBackground(Color.decode("#2b2b2b"));
		r1440.setOpaque(false);
		r1440.setContentAreaFilled(false);
		r1440.setBorderPainted(false);
		contentPane.add(r1440);

		r1450.setSelected(true);
		r1450.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1450.setBounds(168, 487, 71, 31);
		r1450.setForeground(Color.WHITE);
		r1450.setBackground(Color.decode("#2b2b2b"));
		r1450.setOpaque(false);
		r1450.setContentAreaFilled(false);
		r1450.setBorderPainted(false);
		contentPane.add(r1450);

		JButton btnRhythm = new JButton("");
		btnRhythm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soundDir("Rhythm_2.wav");
				announce("RUN Rhythm_2.wav");
			}
		});
		btnRhythm.setForeground(Color.WHITE);
		btnRhythm.setFont(new Font("Cordia New", Font.BOLD, 30));
		btnRhythm.setBackground(Color.DARK_GRAY);
		btnRhythm.setOpaque(false);
		btnRhythm.setBorderPainted(true);
		btnRhythm.setBounds(249, 382, 194, 31);
		contentPane.add(btnRhythm);
		under_btnRhythm.setOpaque(false);
		under_btnRhythm.setForeground(Color.WHITE);
		under_btnRhythm.setFont(new Font("Cordia New", Font.BOLD, 30));
		under_btnRhythm.setBorderPainted(false);
		under_btnRhythm.setBackground(Color.DARK_GRAY);
		under_btnRhythm.setBounds(249, 382, 194, 31);

		contentPane.add(under_btnRhythm);

		r1200.setSelected(true);
		r1200.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1200.setBounds(449, 382, 71, 31);
		r1200.setForeground(Color.WHITE);
		r1200.setBackground(Color.decode("#2b2b2b"));
		r1200.setOpaque(false);
		r1200.setContentAreaFilled(false);
		r1200.setBorderPainted(false);
		contentPane.add(r1200);

		JButton btnRhythm_1 = new JButton("");
		btnRhythm_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soundDir("Rhythm_3.wav");
				announce("RUN Rhythm_3.wav");
			}
		});
		btnRhythm_1.setForeground(Color.WHITE);
		btnRhythm_1.setFont(new Font("Cordia New", Font.BOLD, 30));
		btnRhythm_1.setBackground(Color.DARK_GRAY);
		btnRhythm_1.setOpaque(false);
		btnRhythm_1.setBorderPainted(true);
		btnRhythm_1.setBounds(249, 417, 194, 31);
		contentPane.add(btnRhythm_1);
		under_btnRhythm_1.setOpaque(false);
		under_btnRhythm_1.setForeground(Color.WHITE);
		under_btnRhythm_1.setFont(new Font("Cordia New", Font.BOLD, 30));
		under_btnRhythm_1.setBorderPainted(false);
		under_btnRhythm_1.setBackground(Color.DARK_GRAY);
		under_btnRhythm_1.setBounds(249, 417, 194, 31);

		contentPane.add(under_btnRhythm_1);

		r1540.setSelected(true);
		r1540.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1540.setBounds(449, 417, 71, 31);
		r1540.setForeground(Color.WHITE);
		r1540.setBackground(Color.decode("#2b2b2b"));
		r1540.setOpaque(false);
		r1540.setContentAreaFilled(false);
		r1540.setBorderPainted(false);
		contentPane.add(r1540);

		JButton btnRhythm_2 = new JButton("");
		btnRhythm_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soundDir("Rhythm_4.wav");
				announce("RUN Rhythm_4.wav");
			}
		});
		btnRhythm_2.setForeground(Color.WHITE);
		btnRhythm_2.setFont(new Font("Cordia New", Font.BOLD, 30));
		btnRhythm_2.setBackground(Color.DARK_GRAY);
		btnRhythm_2.setOpaque(false);
		btnRhythm_2.setBorderPainted(true);
		btnRhythm_2.setBounds(249, 452, 194, 31);
		contentPane.add(btnRhythm_2);
		under_btnRhythm_2.setOpaque(false);
		under_btnRhythm_2.setForeground(Color.WHITE);
		under_btnRhythm_2.setFont(new Font("Cordia New", Font.BOLD, 30));
		under_btnRhythm_2.setBorderPainted(false);
		under_btnRhythm_2.setBackground(Color.DARK_GRAY);
		under_btnRhythm_2.setBounds(249, 452, 194, 31);

		contentPane.add(under_btnRhythm_2);

		r1630.setSelected(true);
		r1630.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1630.setBounds(449, 452, 71, 31);
		r1630.setForeground(Color.WHITE);
		r1630.setBackground(Color.decode("#2b2b2b"));
		r1630.setOpaque(false);
		r1630.setContentAreaFilled(false);
		r1630.setBorderPainted(false);
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
		button_13.setBackground(new Color(100, 149, 237));
		button_13.setBounds(10, 325, 4, 36);
		contentPane.add(button_13);

		button_14.setForeground(Color.BLACK);
		button_14.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_14.setEnabled(false);
		button_14.setBorder(null);
		button_14.setBackground(new Color(220, 20, 60));
		button_14.setBounds(10, 280, 4, 36);

		contentPane.add(button_14);

		JButton thai = new JButton("");
		thai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					soundDir("thai.wav");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				announce("Run thai.wav");
				button_2.setEnabled(true);
				button_1.setEnabled(true);
				button.setEnabled(true);
				under_button.setEnabled(true);
				under_button1.setEnabled(true);
				under_button2.setEnabled(true);
				switcher = true;
			}
		});
		thai.setForeground(Color.WHITE);
		thai.setFont(new Font("Cordia New", Font.BOLD, 30));
		thai.setBackground(Color.DARK_GRAY);
		thai.setBounds(14, 100, 300, 36);
		// thai.setBorder(null);
		thai.setOpaque(false);
		thai.setBorderPainted(true);
		contentPane.add(thai);

		JButton under_thai = new JButton("\u0E40\u0E1E\u0E25\u0E07\u0E0A\u0E32\u0E15\u0E34");
		under_thai.setForeground(Color.WHITE);
		under_thai.setFont(new Font("Cordia New", Font.BOLD, 30));
		under_thai.setBorder(null);
		under_thai.setBackground(new Color(0, 0, 0, 99));
		under_thai.setBounds(14, 100, 300, 36);
		contentPane.add(under_thai);

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
					if (dirArray.length > 22) {
						String floatDir = "";
						for (int i = dirArray.length - 22; i < dirArray.length; i++) {
							floatDir += dirArray[i];
						}
						dir = "..." + floatDir;
					}

					button_4.setText(dir);
					button_4.setEnabled(true);
					a_h.setEnabled(true);
					a_m.setEnabled(true);
					b_h.setEnabled(true);
					b_m.setEnabled(true);
					announce1221.setEnabled(true);
					announce1229.setEnabled(true);
					chooser = fileopen.getSelectedFile();
					button_13.setBackground(new Color(144, 238, 144));
				}
			}
		});
		button_18.setForeground(Color.WHITE);
		button_18.setFont(new Font("Cordia New", Font.BOLD, 30));
		// button_18.setBorder(null);
		button_18.setBackground(Color.DARK_GRAY);
		button_18.setBounds(277, 325, 36, 36);
		button_18.setOpaque(false);
		button_18.setBorderPainted(true);
		contentPane.add(button_18);
		under_button18.setEnabled(false);
		under_button18.setBorder(null);
		under_button18.setBackground(new Color(0, 0, 0, 99));
		under_button18.setBounds(277, 325, 36, 36);

		contentPane.add(under_button18);

		txtV = new JButton("v7");
		txtV.setBorder(null);
		txtV.setBackground(new Color(0, 0, 0, 0));
		txtV.setForeground(new Color(105, 105, 105));
		txtV.setBounds(590, 505, 60, 20);
		txtV.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		txtV.setFont(new Font("Cordia New", Font.BOLD, 18));
		txtV.setOpaque(false);
		txtV.setBorderPainted(true);
		contentPane.add(txtV);
		txtV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtV.setVisible(false);
				credit.setVisible(true);
				passwordField.setVisible(true);
			}
		});

		credit.setBorder(null);
		credit.setForeground(new Color(105, 105, 105));
		credit.setBackground(new Color(0, 0, 0, 0));
		credit.setBounds(305, 505, 400, 20);
		credit.setFont(new Font("Cordia New", Font.BOLD, 18));
		credit.setVisible(false);
		passwordField.setBounds(551, 487, 99, 20);
		passwordField.setVisible(false);
		passwordField.setBackground(new Color(0, 0, 0, 0));
		passwordField.setForeground(new Color(0, 0, 0, 0));
		passwordField.setOpaque(false);
		passwordField.setBorder(null);
		contentPane.add(passwordField);
		contentPane.add(credit);

		JButton button_7 = new JButton("");
		button_7.setEnabled(false);
		button_7.setBorder(null);
		button_7.setBackground(new Color(0, 0, 0, 99));
		button_7.setBounds(0, 0, 650, 93);
		contentPane.add(button_7);

		JButton button_17 = new JButton("");
		button_17.setEnabled(false);
		button_17.setBorder(null);
		button_17.setBackground(new Color(0, 0, 0, 99));
		button_17.setBounds(0, 372, 650, 154);
		contentPane.add(button_17);
		bg.setIcon(new ImageIcon("Background_1.jpg"));
		bg.setBounds(0, 0, 650, 526);

		contentPane.add(bg);
		line1.setEnabled(false);
		line1.setBorder(null);
		line1.setBackground(new Color(100, 100, 100, 120));
		line1.setBounds(0, 92, 650, 281);

		contentPane.add(line1);
		line2.setEnabled(false);
		line2.setBorder(null);
		line2.setBackground(new Color(100, 100, 100, 120));
		line2.setBounds(0, 372, 650, 1);

		contentPane.add(line2);

		delayLoadConfig = new DelayLoadConfig();
		delayLoadConnfig_Thread = new Thread(delayLoadConfig);
		delayLoadConnfig_Thread.start();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//Default buttonActionPerformed event
	}

	public static void soundDir(String a) {
		try {
			// Open an audio input stream.
			URL url = Main1.class.getClassLoader().getResource(a);
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
			// Get a sound clip resource.
			Clip clip = AudioSystem.getClip();
			// Open audio clip and load samples from the audio input stream.
			clip.open(audioIn);
			clip.start();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}
	}
}