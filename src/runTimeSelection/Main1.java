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
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class Main1 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 561811103320831759L;
	private JPanel contentPane;
	public ArrayList<JButton> tmpButton = new ArrayList<JButton>();
	public final String title = "\u0E23\u0E30\u0E1A\u0E1A\u0E2D\u0E2D\u0E14\u0E40\u0E27\u0E25\u0E32\u0E42\u0E23\u0E07\u0E40\u0E23\u0E35\u0E22\u0E19 School Timer Clock System";
	public final int width = 656;
	public final int height = 555;
	public final Color bgcolor = Color.BLACK;
	public static JLabel timer = new JLabel("--:--:--");
	public static JLabel timer_shadow = new JLabel("--:--:--");

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

	public static DelayLoadConfig delayLoadConfig = null;
	public static Thread delayLoadConnfig_Thread = null;
	private final JButton thai = new JButton("\u0E40\u0E1E\u0E25\u0E07\r\n\u0E0A\u0E32\u0E15\u0E34");
	private final JButton button_6 = new JButton("");
	private final JButton button_7 = new JButton("");
	private final JButton button_8 = new JButton("");
	private final JButton button_9 = new JButton("");
	private final JButton button_10 = new JButton("");
	private final JButton button_12 = new JButton("");
	private final JButton button_13 = new JButton("");
	private final JButton button_14 = new JButton("");

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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.decode("#333333"));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		announce("add button 'thaiButton'");
		contentPane.setLayout(null);
		announce("add button 'exitButton'");

		timer.setToolTipText(
				"\u0E40\u0E27\u0E25\u0E32\u0E02\u0E2D\u0E07\u0E40\u0E04\u0E23\u0E37\u0E48\u0E2D\u0E07\u0E1B\u0E31\u0E08\u0E08\u0E38\u0E1A\u0E31\u0E19");
		timer.setHorizontalAlignment(SwingConstants.CENTER);
		timer.setFont(new Font("Cordia New", Font.BOLD, 66));
		timer.setForeground(Color.WHITE);
		timer.setBounds(60, 11, 508, 59);
		contentPane.add(timer);

		JButton button = new JButton(
				"\u0E44\u0E21\u0E48\u0E2A\u0E27\u0E21\u0E23\u0E2D\u0E07\u0E40\u0E17\u0E49\u0E32\u0E02\u0E36\u0E49\u0E19\u0E15\u0E36\u0E01");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("No_SHOE.wav");
				announce("RUN No_SHOE.wav");
			}
		});
		button.setBorder(null);

		timer_shadow.setToolTipText(
				"\u0E40\u0E27\u0E25\u0E32\u0E02\u0E2D\u0E07\u0E40\u0E04\u0E23\u0E37\u0E48\u0E2D\u0E07\u0E1B\u0E31\u0E08\u0E08\u0E38\u0E1A\u0E31\u0E19");
		timer_shadow.setHorizontalAlignment(SwingConstants.CENTER);
		timer_shadow.setForeground(new Color(0, 0, 0));
		timer_shadow.setFont(new Font("Cordia New", Font.BOLD, 66));
		timer_shadow.setBounds(58, 15, 508, 59);
		contentPane.add(timer_shadow);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Cordia New", Font.BOLD, 30));
		button.setBackground(new Color(255, 255, 255));
		button.setBounds(10, 207, 300, 36);
		button.setBackground(Color.decode("#333333"));
		contentPane.add(button);

		JButton button_1 = new JButton(
				"\u0E44\u0E21\u0E48\u0E19\u0E33\u0E2D\u0E32\u0E2B\u0E32\u0E23\u0E02\u0E36\u0E49\u0E19\u0E15\u0E36\u0E01");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("No_FOOD.wav");
				announce("RUN No_FOOD.wav");
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_1.setBounds(10, 163, 300, 36);
		button_1.setBackground(null);
		button_1.setBorder(null);
		contentPane.add(button_1);

		JButton button_2 = new JButton("\u0E1B\u0E34\u0E14\u0E44\u0E1F-\u0E1E\u0E31\u0E14\u0E25\u0E21");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Close_ELEC.wav");
				announce("RUN Close_ELEC.wav");
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_2.setBackground(null);
		button_2.setBorder(null);
		button_2.setBounds(10, 252, 300, 36);
		contentPane.add(button_2);

		JButton button_3 = new JButton(
				"\u0E25\u0E07\u0E08\u0E32\u0E01\u0E2D\u0E32\u0E04\u0E32\u0E23\u0E40\u0E23\u0E35\u0E22\u0E19");
		button_3.setEnabled(false);
		button_3.setForeground(Color.GRAY);
		button_3.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setBounds(10, 295, 300, 36);
		contentPane.add(button_3);

		food1015.setSelected(true);
		food1015.setFont(new Font("Tahoma", Font.BOLD, 22));
		food1015.setBounds(318, 163, 99, 40);
		contentPane.add(food1015);
		food1256.setSelected(true);

		food1256.setFont(new Font("Tahoma", Font.BOLD, 22));
		food1256.setBounds(421, 163, 99, 40);
		contentPane.add(food1256);

		food1445.setSelected(true);
		food1445.setFont(new Font("Tahoma", Font.BOLD, 22));
		food1445.setBounds(526, 163, 99, 40);
		contentPane.add(food1445);

		shoe1255.setSelected(true);
		shoe1255.setFont(new Font("Tahoma", Font.BOLD, 22));
		shoe1255.setBounds(318, 207, 99, 40);
		contentPane.add(shoe1255);

		closeElectric1541.setSelected(true);
		closeElectric1541.setFont(new Font("Tahoma", Font.BOLD, 22));
		closeElectric1541.setBounds(318, 252, 99, 40);
		contentPane.add(closeElectric1541);

		closeElectric1631.setSelected(true);
		closeElectric1631.setFont(new Font("Tahoma", Font.BOLD, 22));
		closeElectric1631.setBounds(421, 252, 99, 40);
		contentPane.add(closeElectric1631);
		goOut1632.setForeground(Color.GRAY);
		goOut1632.setBackground(Color.LIGHT_GRAY);

		goOut1632.setSelected(true);
		goOut1632.setEnabled(false);
		goOut1632.setFont(new Font("Tahoma", Font.BOLD, 22));
		goOut1632.setBounds(318, 295, 99, 40);
		contentPane.add(goOut1632);

		JButton button_4 = new JButton("\u0E0B\u0E49\u0E2D\u0E21\u0E01\u0E35\u0E2C\u0E32\u0E2A\u0E35");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("sport.wav");
			}
		});
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_4.setBackground(null);
		button_4.setBorder(null);
		button_4.setBounds(10, 340, 300, 36);
		contentPane.add(button_4);

		announce1221.setSelected(true);
		announce1221.setFont(new Font("Tahoma", Font.BOLD, 22));
		announce1221.setBounds(318, 340, 99, 40);
		contentPane.add(announce1221);

		announce1229.setSelected(true);
		announce1229.setFont(new Font("Tahoma", Font.BOLD, 22));
		announce1229.setBounds(419, 340, 99, 40);
		contentPane.add(announce1229);

		JButton button_5 = new JButton("Rythm 1");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Rythm_1.wav");
				announce("RUN Rythm_1.wav");
			}
		});
		button_5.setForeground(Color.BLACK);
		button_5.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(12, 387, 225, 31);
		contentPane.add(button_5);

		r0830.setSelected(true);
		r0830.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r0830.setBounds(12, 422, 71, 31);
		contentPane.add(r0830);

		r0920.setSelected(true);
		r0920.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r0920.setBounds(12, 456, 71, 31);
		contentPane.add(r0920);

		r1010.setSelected(true);
		r1010.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1010.setBounds(12, 490, 71, 31);
		contentPane.add(r1010);

		r1020.setSelected(true);
		r1020.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1020.setBounds(89, 422, 71, 31);
		contentPane.add(r1020);

		r1110.setSelected(true);
		r1110.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1110.setBounds(89, 456, 71, 31);
		contentPane.add(r1110);

		r1300.setSelected(true);
		r1300.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1300.setBounds(89, 490, 71, 31);
		contentPane.add(r1300);

		r1350.setSelected(true);
		r1350.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1350.setBounds(166, 422, 71, 31);
		contentPane.add(r1350);

		r1440.setSelected(true);
		r1440.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1440.setBounds(166, 456, 71, 31);
		contentPane.add(r1440);

		r1450.setSelected(true);
		r1450.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1450.setBounds(166, 490, 71, 31);
		contentPane.add(r1450);

		JButton btnRythm = new JButton("Rythm 2");
		btnRythm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Rythm_2.wav");
				announce("RUN Rythm_2.wav");
			}
		});
		btnRythm.setForeground(Color.BLACK);
		btnRythm.setFont(new Font("Cordia New", Font.BOLD, 30));
		btnRythm.setBackground(Color.WHITE);
		btnRythm.setBounds(243, 387, 198, 31);
		contentPane.add(btnRythm);

		r1200.setSelected(true);
		r1200.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1200.setBounds(447, 387, 71, 31);
		contentPane.add(r1200);

		JButton btnRythm_1 = new JButton("Rythm 3");
		btnRythm_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Rythm_3.wav");
				announce("RUN Rythm_3.wav");
			}
		});
		btnRythm_1.setForeground(Color.BLACK);
		btnRythm_1.setFont(new Font("Cordia New", Font.BOLD, 30));
		btnRythm_1.setBackground(Color.WHITE);
		btnRythm_1.setBounds(243, 422, 198, 31);
		contentPane.add(btnRythm_1);

		r1540.setSelected(true);
		r1540.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1540.setBounds(447, 422, 71, 31);
		contentPane.add(r1540);

		JButton btnRythm_2 = new JButton("Rythm 4");
		btnRythm_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Rythm_4.wav");
				announce("RUN Rythm_4.wav");
			}
		});
		btnRythm_2.setForeground(Color.BLACK);
		btnRythm_2.setFont(new Font("Cordia New", Font.BOLD, 30));
		btnRythm_2.setBackground(Color.WHITE);
		btnRythm_2.setBounds(243, 456, 198, 31);
		contentPane.add(btnRythm_2);

		r1630.setSelected(true);
		r1630.setFont(new Font("Tahoma", Font.PLAIN, 18));
		r1630.setBounds(447, 456, 71, 31);
		contentPane.add(r1630);

		thai.setBorder(null);
		thai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("thai.wav");
				announce("Run thai.wav");
			}
		});
		thai.setForeground(Color.WHITE);
		thai.setFont(new Font("Cordia New", Font.BOLD, 54));
		thai.setBackground(Color.BLUE);
		thai.setBounds(191, 81, 269, 69);
		contentPane.add(thai);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("thai.wav");
				announce("Run thai.wav");
			}
		});
		button_6.setBorder(null);
		button_6.setForeground(Color.WHITE);
		button_6.setFont(new Font("Cordia New", Font.BOLD, 54));
		button_6.setBackground(new Color(255, 0, 0));
		button_6.setBounds(12, 81, 91, 69);

		contentPane.add(button_6);
		button_7.setBorder(null);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("thai.wav");
				announce("Run thai.wav");
			}
		});
		button_7.setForeground(Color.WHITE);
		button_7.setFont(new Font("Cordia New", Font.BOLD, 54));
		button_7.setBackground(new Color(255, 255, 255));
		button_7.setBounds(101, 81, 91, 69);

		contentPane.add(button_7);
		button_8.setBorder(null);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("thai.wav");
				announce("Run thai.wav");
			}
		});
		button_8.setForeground(Color.WHITE);
		button_8.setFont(new Font("Cordia New", Font.BOLD, 54));
		button_8.setBackground(new Color(255, 0, 0));
		button_8.setBounds(548, 81, 91, 69);

		contentPane.add(button_8);
		button_9.setBorder(null);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("thai.wav");
				announce("Run thai.wav");
			}
		});
		button_9.setForeground(Color.WHITE);
		button_9.setFont(new Font("Cordia New", Font.BOLD, 54));
		button_9.setBackground(new Color(255, 255, 255));
		button_9.setBounds(458, 81, 91, 69);

		contentPane.add(button_9);
		button_10.setEnabled(false);
		button_10.setForeground(Color.BLACK);
		button_10.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_10.setBackground(new Color(128, 0, 128));
		button_10.setBounds(10, 198, 300, 4);
		button_10.setBorder(null);
		contentPane.add(button_10);

		JButton button_11 = new JButton("");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_11.setForeground(Color.BLACK);
		button_11.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_11.setEnabled(false);
		button_11.setBorder(null);
		button_11.setBackground(Color.CYAN);
		button_11.setBounds(10, 242, 300, 4);
		contentPane.add(button_11);
		button_12.setForeground(Color.BLACK);
		button_12.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_12.setEnabled(false);
		button_12.setBorder(null);
		button_12.setBackground(Color.GREEN);
		button_12.setBounds(10, 287, 300, 4);
		
		contentPane.add(button_12);
		button_13.setForeground(Color.BLACK);
		button_13.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_13.setEnabled(false);
		button_13.setBorder(null);
		button_13.setBackground(Color.RED);
		button_13.setBounds(10, 375, 300, 4);
		
		contentPane.add(button_13);
		button_14.setForeground(Color.BLACK);
		button_14.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_14.setEnabled(false);
		button_14.setBorder(null);
		button_14.setBackground(Color.ORANGE);
		button_14.setBounds(10, 330, 300, 4);
		
		contentPane.add(button_14);

		announce("add text 'mainText'");

		delayLoadConfig = new DelayLoadConfig();
		delayLoadConnfig_Thread = new Thread(delayLoadConfig);
		delayLoadConnfig_Thread.start();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
	}

	public static synchronized void playSound(String url) {
		new Thread(new Runnable() {
			public void run() {
				try {
					Clip clip = AudioSystem.getClip();
					AudioInputStream inputStream = AudioSystem
							.getAudioInputStream(Main1.class.getResourceAsStream("/" + url));
					clip.open(inputStream);
					clip.start();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}).start();
	}
}