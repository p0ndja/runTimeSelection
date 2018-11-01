package runTimeSelection;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DelayLoadConfig implements Runnable {

	private boolean isRunning = true;

	public static String Time;

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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			DateFormat normalDateFormat = new SimpleDateFormat("HH:mm:ss");
			Date date = new Date();
			Time = normalDateFormat.format(date);
			Main1.timer.setText(Time);
			Main1.timer_shadow.setText(Time);

			// noFood Period
			// ==========================================================\\
			if ((Time.equalsIgnoreCase("10:15:00") && Main1.food1015.isSelected())
					|| (Time.equalsIgnoreCase("12:56:00") && Main1.food1256.isSelected())
					|| (Time.equalsIgnoreCase("14:45:00") && Main1.food1445.isSelected())) {
				Main1.announce("Run noFood.wav as scheduled.");
				Main1.playSound("No_FOOD.wav");
			}
			// ==========================================================\\

			// noShoe Period
			// ==========================================================\\
			if (Time.equalsIgnoreCase("12:55:00") && Main1.shoe1255.isSelected()) {
				Main1.announce("Run noShoe.wav as scheduled.");
				Main1.playSound("No_SHOE.wav");
			}
			// ==========================================================\\

			// closeElectric Period
			// ==========================================================\\
			if ((Time.equalsIgnoreCase("15:41:00") && Main1.closeElectric1541.isSelected())
					|| (Time.equalsIgnoreCase("16:31:00") && Main1.closeElectric1631.isSelected())) {
				Main1.announce("Run closeElectric.wav as scheduled.");
				Main1.playSound("Close_ELEC.wav");
			}
			// ==========================================================\\

			// goOut Period
			// ==========================================================\\
			if (Time.equalsIgnoreCase("16:32:00") && Main1.goOut1632.isSelected()) {
				Main1.announce("Run Leave_BUILDING.wav as scheduled. -- NO SOUND YET");
				// Main1.playSound("Leave_BUILDING.wav");
			}
			// ==========================================================\\

			// Sport Day Period
			// ==========================================================\\
			if ((Time.equalsIgnoreCase("12:21:00") && Main1.announce1221.isSelected())
					|| (Time.equalsIgnoreCase("12:29:00") && Main1.announce1229.isSelected())) {
				Main1.announce("Run sport.wav as scheduled.");
				Main1.playSound("sport.wav");
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
				Main1.playSound("Rhythm_1.wav");
			}
			// ==========================================================\\

			// Rhythm_2
			// ==========================================================\\
			if (Time.equalsIgnoreCase("12:00:00") && Main1.r1200.isSelected()) {
				Main1.announce("Run Rhythm_2.wav (lunch) as scheduled.");
				Main1.playSound("Rhythm_2.wav");
			}
			// ==========================================================\\

			// Rhythm_3
			// ==========================================================\\
			if (Time.equalsIgnoreCase("15:40:00") && Main1.r1540.isSelected()) {
				Main1.announce("Run Rhythm_3.wav (go back home #1) as scheduled.");
				Main1.playSound("Rhythm_3.wav");
			}
			// ==========================================================\\

			// Rhythm_4
			// ==========================================================\\
			if (Time.equalsIgnoreCase("16:30:00") && Main1.r1630.isSelected()) {
				Main1.announce("Run Rhythm_4.wav (go back home #2) as scheduled.");
				Main1.playSound("Rhythm_4.wav");
			}
			// ==========================================================\\

			// DEBUGER
			if (Time.equalsIgnoreCase("23:59:59")) {
				Main1.announce("DAY PASSED");
			}

		}

	}

}