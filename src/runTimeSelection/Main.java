package runTimeSelection;

import java.awt.Color;
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

public class Main extends JFrame implements ActionListener {
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
	public static JLabel label = new JLabel("--:--:--");
	
	public static DelayLoadConfig delayLoadConfig = null;
	public static Thread delayLoadConnfig_Thread = null;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void announce(String m) {
		System.out.print(m + String.format("%n"));
	}

	public Main() {
		announce("running program . . .");
		setTitle(title);
		announce("set title = " + title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 250);
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
		btnRandom.setBounds(10, 81, 233, 120);
		btnRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playSound("thai.wav");
				announce("RUN thai.wav");
			}
		});
		btnRandom.setBackground(Color.BLUE);
		btnRandom.setForeground(Color.BLACK);
		contentPane.setLayout(null);
		contentPane.add(btnRandom);
		announce("add button 'thaiButton'");

		JButton btnClose = new JButton("\u0E2D\u0E2D\u0E01");
		btnClose.setFont(new Font("Cordia New", Font.BOLD, 56));
		btnClose.setForeground(Color.BLACK);
		btnClose.setBounds(364, 13, 110, 56);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnClose.setBackground(Color.RED);
		contentPane.setLayout(null);
		contentPane.add(btnClose);
		announce("add button 'exitButton'");
		
		label.setToolTipText("\u0E40\u0E27\u0E25\u0E32\u0E02\u0E2D\u0E07\u0E40\u0E04\u0E23\u0E37\u0E48\u0E2D\u0E07\u0E1B\u0E31\u0E08\u0E08\u0E38\u0E1A\u0E31\u0E19");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Cordia New", Font.BOLD, 60));
		label.setForeground(Color.WHITE);
		label.setBounds(10, 11, 344, 59);
		contentPane.add(label);
		
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
		button.setBounds(253, 120, 221, 40);
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
		button_1.setBounds(253, 81, 221, 40);
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
		button_2.setBounds(253, 161, 221, 40);
		contentPane.add(button_2);
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
		          Main.class.getResourceAsStream("/" + url));
		        clip.open(inputStream);
		        clip.start(); 
		      } catch (Exception e) {
		        System.err.println(e.getMessage());
		      }
		    }
		  }).start();
		}
}