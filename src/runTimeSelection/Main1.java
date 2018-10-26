package runTimeSelection;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sun.audio.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.management.timer.Timer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class Main1 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 561811103320831759L;
	private JPanel contentPane;
	public final int chairSize = 32;
	public final int chairSizeX = 130;
	public final int chairSizeY = 100;
	private JButton btnChair[] = new JButton[chairSize];
	public ArrayList<JButton> tmpButton = new ArrayList<JButton>();
	public final String title = "runTime";
	public final int width = 500;
	public final int height = 400;
	public final Color bgcolor = Color.BLACK;
	public static JLabel timer = new JLabel("--:--:--");
	
	public static JCheckBox food1015 = new JCheckBox("10.15");
	public static JCheckBox food1256 = new JCheckBox("12.56");
	public static JCheckBox food1445 = new JCheckBox("14.45");
	
	public static JCheckBox shoe1255 = new JCheckBox("12.55");
	
	public static JCheckBox closeElectric1541 = new JCheckBox("15.41");
	public static JCheckBox closeElectric1631 = new JCheckBox("16.31");
	
	public static JCheckBox goOut1632 = new JCheckBox("16.32");
	
	public static JCheckBox announce1220 = new JCheckBox("12.20");
	public static JCheckBox announce1229 = new JCheckBox("12.29");

	
	public static DelayLoadConfig delayLoadConfig = null;
	public static Thread delayLoadConnfig_Thread = null;

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
		System.out.print("<" + DelayLoadConfig.Time + "> " + m + String.format("%n"));
	}

	public Main1() {
		announce("running program . . .");
		setTitle(title);
		setPreferredSize(new Dimension(width, height));
		setResizable(false);
		announce("set title = " + title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 444);
		announce("set gui border");
		announce(" width = " + width);
		announce(" height = " + height);
		announce("set background = " + bgcolor.toString());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(bgcolor);
		setContentPane(contentPane);

		JButton btnRandom = new JButton("\u0E40\u0E1E\u0E25\u0E07\r\n\u0E0A\u0E32\u0E15\u0E34");
		btnRandom.setFont(new Font("Cordia New", Font.BOLD, 54));
		btnRandom.setBounds(10, 81, 626, 69);
		btnRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("thai.wav");
				announce("RUN thai.wav");
			}
		});
		btnRandom.setBackground(Color.BLUE);
		btnRandom.setForeground(Color.BLACK);
		contentPane.setLayout(null);
		
		JLabel lblXxxxxxxxxxxx = new JLabel("xxx\u0E22\u0E31\u0E07\u0E44\u0E21\u0E48\u0E21\u0E35\u0E44\u0E1F\u0E25\u0E4C\u0E40\u0E2A\u0E35\u0E22\u0E07xxx");
		lblXxxxxxxxxxxx.setForeground(Color.RED);
		lblXxxxxxxxxxxx.setHorizontalAlignment(SwingConstants.CENTER);
		lblXxxxxxxxxxxx.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblXxxxxxxxxxxx.setBounds(12, 295, 405, 40);
		contentPane.add(lblXxxxxxxxxxxx);
		contentPane.add(btnRandom);
		announce("add button 'thaiButton'");

		JButton btnClose = new JButton("\u0E2D\u0E2D\u0E01");
		btnClose.setFont(new Font("Cordia New", Font.BOLD, 56));
		btnClose.setForeground(Color.BLACK);
		btnClose.setBounds(526, 13, 110, 56);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnClose.setBackground(Color.RED);
		contentPane.setLayout(null);
		contentPane.add(btnClose);
		announce("add button 'exitButton'");
		
		timer.setToolTipText("\u0E40\u0E27\u0E25\u0E32\u0E02\u0E2D\u0E07\u0E40\u0E04\u0E23\u0E37\u0E48\u0E2D\u0E07\u0E1B\u0E31\u0E08\u0E08\u0E38\u0E1A\u0E31\u0E19");
		timer.setHorizontalAlignment(SwingConstants.CENTER);
		timer.setFont(new Font("Cordia New", Font.BOLD, 66));
		timer.setForeground(Color.WHITE);
		timer.setBounds(10, 11, 508, 59);
		contentPane.add(timer);
		
		JButton button = new JButton("\u0E44\u0E21\u0E48\u0E2A\u0E27\u0E21\u0E23\u0E2D\u0E07\u0E40\u0E17\u0E49\u0E32\u0E02\u0E36\u0E49\u0E19\u0E15\u0E36\u0E01");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("No_SHOE.wav");
				announce("RUN No_SHOE.wav");
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Cordia New", Font.BOLD, 30));
		button.setBackground(Color.GREEN);
		button.setBounds(10, 207, 300, 40);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u0E44\u0E21\u0E48\u0E19\u0E33\u0E2D\u0E32\u0E2B\u0E32\u0E23\u0E02\u0E36\u0E49\u0E19\u0E15\u0E36\u0E01");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("No_FOOD.wav");
				announce("RUN No_FOOD.wav");
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_1.setBackground(Color.ORANGE);
		button_1.setBounds(10, 163, 300, 40);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u0E1B\u0E34\u0E14\u0E44\u0E1F-\u0E1E\u0E31\u0E14\u0E25\u0E21");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound("Close_ELEC.wav");
				announce("RUN Close_ELEC.wav");
			}
		});
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_2.setBackground(Color.MAGENTA);
		button_2.setBounds(10, 252, 300, 40);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u0E25\u0E07\u0E08\u0E32\u0E01\u0E2D\u0E32\u0E04\u0E32\u0E23\u0E40\u0E23\u0E35\u0E22\u0E19");
		button_3.setEnabled(false);
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_3.setBackground(Color.CYAN);
		button_3.setBounds(10, 295, 300, 40);
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
		button_4.setForeground(Color.BLACK);
		button_4.setFont(new Font("Cordia New", Font.BOLD, 30));
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(10, 340, 300, 40);
		contentPane.add(button_4);
		
		JLabel lblPSoontornpas = new JLabel("P. Soontornpas");
		lblPSoontornpas.setToolTipText("\u0E40\u0E27\u0E25\u0E32\u0E02\u0E2D\u0E07\u0E40\u0E04\u0E23\u0E37\u0E48\u0E2D\u0E07\u0E1B\u0E31\u0E08\u0E08\u0E38\u0E1A\u0E31\u0E19");
		lblPSoontornpas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPSoontornpas.setForeground(Color.WHITE);
		lblPSoontornpas.setFont(new Font("Cordia New", Font.BOLD, 33));
		lblPSoontornpas.setBounds(483, 371, 177, 40);
		contentPane.add(lblPSoontornpas);
		
		announce1220.setSelected(true);
		announce1220.setFont(new Font("Tahoma", Font.BOLD, 22));
		announce1220.setBounds(318, 340, 99, 40);
		contentPane.add(announce1220);
		
		announce1229.setSelected(true);
		announce1229.setFont(new Font("Tahoma", Font.BOLD, 22));
		announce1229.setBounds(419, 340, 99, 40);
		contentPane.add(announce1229);
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
		        AudioInputStream inputStream = AudioSystem.getAudioInputStream(
		          Main1.class.getResourceAsStream("/" + url));
		        clip.open(inputStream);
		        clip.start(); 
		      } catch (Exception e) {
		        System.err.println(e.getMessage());
		      }
		    }
		  }).start();
		}
}