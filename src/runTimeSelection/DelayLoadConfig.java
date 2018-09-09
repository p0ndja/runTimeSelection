package runTimeSelection;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;

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
			
			//noFood Period
			//==========================================================\\
			if (Time.equalsIgnoreCase("10:15:00") && Main1.food1015.isSelected() == true) {
				Main1.announce("Run noFood.wav as scheduled at 10:15:00");
				Main1.playSound("No_FOOD.wav");
			}
			if (Time.equalsIgnoreCase("12:56:00") && Main1.food1256.isSelected() == true) {
				Main1.announce("Run noFood.wav as scheduled at 12:56:00");
				Main1.playSound("No_FOOD.wav");
			}
			if (Time.equalsIgnoreCase("14:45:00") && Main1.food1445.isSelected() == true) {
				Main1.announce("Run noFood.wav as scheduled at 14:45:00");
				Main1.playSound("No_FOOD.wav");
			}
			//==========================================================\\
			
			//noShoe Period
			//==========================================================\\
			if (Time.equalsIgnoreCase("12:55:00") && Main1.shoe1255.isSelected() == true) {
				Main1.announce("Run noShoe.wav as scheduled at 12:55:00");
				Main1.playSound("No_SHOE.wav");
			}
			//==========================================================\\
			
			//closeElectric Period
			//==========================================================\\
			if (Time.equalsIgnoreCase("15:41:00") && Main1.closeElectric1541.isSelected() == true) {
				Main1.announce("Run closeElectric.wav as scheduled at 15:41:00");
				Main1.playSound("Close_ELEC.wav");
			}
			if (Time.equalsIgnoreCase("16:31:00") && Main1.closeElectric1631.isSelected() == true) {
				Main1.announce("Run closeElectric.wav as scheduled at 16:31:00");
				Main1.playSound("Close_ELEC.wav");
			}
			//==========================================================\\
			
			
			//goOut Period
			//==========================================================\\
			if (Time.equalsIgnoreCase("16:32:00") && Main1.goOut1632.isSelected() == true) {
				Main1.announce("Run Leave_BUILDING.wav as scheduled at 16:32:00");
				//Main1.playSound("Leave_BUILDING.wav");
			}
			//==========================================================\\
			
			//DEBUGER
			if (Time.equalsIgnoreCase("23:59:59")) {
				Main1.announce("DAY PASSED");
			}

		}

	}

}