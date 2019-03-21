package runTimeSelection;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DelayLoadConfig implements Runnable {

	private boolean isRunning = true;

	public static String Time;
	public static String Time1;
	public static String Time2;
	public static String Time3;

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	@Override
	public void run() {

		while (isRunning == true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			Date date = new Date();
			Time3 = new SimpleDateFormat("HH").format(date);
			Time2 = new SimpleDateFormat("ss").format(date);
			Time1 = new SimpleDateFormat("HH.mm").format(date);
			Time = new SimpleDateFormat("HH:mm:ss").format(date);
			String month = new SimpleDateFormat("dd/MM/YYYY").format(date);
			Main1.timer.setText(Time);
			Main1.timer_shadow.setText(Time);
			Main1.date.setText(month);
			Main1.label.setText(month);

			if (Float.parseFloat(Time1) >= 8.20) {
				if (Main1.switcher == false) {
					Main1.button_2.setEnabled(true);
					Main1.button_1.setEnabled(true);
					Main1.button.setEnabled(true);
					Main1.under_button.setEnabled(true);
					Main1.under_button1.setEnabled(true);
					Main1.under_button2.setEnabled(true);
					Main1.switcher = true;
				}
			}
			
			
			// noFood Period
			// ==========================================================\\
			if ((Time.equalsIgnoreCase("12:01:00") && Main1.food1201.isSelected())
					|| (Time.equalsIgnoreCase("10:15:00") && Main1.food1015.isSelected())
					|| (Time.equalsIgnoreCase("12:56:00") && Main1.food1256.isSelected())
					|| (Time.equalsIgnoreCase("14:45:00") && Main1.food1445.isSelected())) {
				Main1.announce("Run noFood.wav as scheduled.");
				Main1.soundDir("No_FOOD.wav");
			}
			// ==========================================================\\

			// noShoe Period
			// ==========================================================\\
			if (Time.equalsIgnoreCase("12:55:00") && Main1.shoe1255.isSelected()) {
				Main1.announce("Run noShoe.wav as scheduled.");
				Main1.soundDir("No_SHOE.wav");
			}
			// ==========================================================\\

			// closeElectric Period
			// ==========================================================\\
			if ((Time.equalsIgnoreCase("15:41:00") && Main1.closeElectric1541.isSelected())
					|| (Time.equalsIgnoreCase("16:31:00") && Main1.closeElectric1631.isSelected())) {
				Main1.announce("Run closeElectric.wav as scheduled.");
				Main1.soundDir("Close_ELEC.wav");
			}
			// ==========================================================\\

			// goOut Period
			// ==========================================================\\
			if (Time.equalsIgnoreCase("16:32:00") && Main1.goOut1632.isSelected()) {
				Main1.announce("Run Leave_BUILDING.wav as scheduled. -- NO SOUND YET");
				// Main1.soundDir( Main1.jarDir +"Leave_BUILDING.wav");
			}
			// ==========================================================\\

			// Sport Day Period
			// ==========================================================\\
			if (Main1.a_h.getText().length() == 1) {
				Main1.a_h.setText("0" + Main1.a_h.getText());
			}
			if (Main1.b_h.getText().length() == 1) {
				Main1.b_h.setText("0" + Main1.b_h.getText());
			}
			String timeA = Main1.a_h.getText() + "." + Main1.a_m.getText();
			String timeB = Main1.b_h.getText() + "." + Main1.b_m.getText();
			if (((Time1.equalsIgnoreCase(timeA) && Main1.announce1221.isSelected())
					|| (Time1.equalsIgnoreCase(timeB) && Main1.announce1229.isSelected())) && Main1.button_4.isEnabled()
					&& Time2.equalsIgnoreCase("00") && !(Time.equalsIgnoreCase("00.00"))) {
				Main1.announce("Run special clock as scheduled.");
				Main1.soundDir(Main1.chooser.toString());
			}
			// ==========================================================\\

			// Rhythm_1
			// ==========================================================\\
			if ((Time.equalsIgnoreCase("08:30:00") && Main1.r0830.isSelected())
					|| (Time.equalsIgnoreCase("09:20:00") && Main1.r0920.isSelected())
					|| (Time.equalsIgnoreCase("10:10:00") && Main1.r1010.isSelected())
					|| (Time.equalsIgnoreCase("10:20:00") && Main1.r1020.isSelected())
					|| (Time.equalsIgnoreCase("11:10:00") && Main1.r1110.isSelected())
					|| (Time.equalsIgnoreCase("13:00:00") && Main1.r1300.isSelected())
					|| (Time.equalsIgnoreCase("13:50:00") && Main1.r1350.isSelected())
					|| (Time.equalsIgnoreCase("14:40:00") && Main1.r1440.isSelected())
					|| (Time.equalsIgnoreCase("14:50:00") && Main1.r1450.isSelected())) {
				Main1.announce("Run Rhythm_1.wav as scheduled.");
				Main1.soundDir("Rhythm_1.wav");
			}
			// ==========================================================\\

			// Rhythm_2
			// ==========================================================\\
			if (Time.equalsIgnoreCase("12:00:00") && Main1.r1200.isSelected()) {
				Main1.announce("Run Rhythm_2.wav (lunch) as scheduled.");
				Main1.soundDir("Rhythm_2.wav");
			}
			// ==========================================================\\

			// Rhythm_3
			// ==========================================================\\
			if (Time.equalsIgnoreCase("15:40:00") && Main1.r1540.isSelected()) {
				Main1.announce("Run Rhythm_3.wav (go back home #1) as scheduled.");
				Main1.soundDir("Rhythm_3.wav");
			}
			// ==========================================================\\

			// Rhythm_4
			// ==========================================================\\
			if (Time.equalsIgnoreCase("16:30:00") && Main1.r1630.isSelected()) {
				Main1.announce("Run Rhythm_4.wav (go back home #2) as scheduled.");
				Main1.soundDir("Rhythm_4.wav");
			}
			// ==========================================================\\

			// DEBUGER
			if (Time.equalsIgnoreCase("23:59:59")) {
				Main1.announce("DAY PASSED");
			}

		}

	}

}