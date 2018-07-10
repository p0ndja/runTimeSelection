package runTimeSelection;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;

public class DelayLoadConfig implements Runnable {

	private boolean isRunning = true;

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
			String Time = normalDateFormat.format(date);
			Main.label.setText(Time);
			
			if (Time.equalsIgnoreCase("23:59:59")) {
				Main.announce("DAY PASSED");
			}

		}

	}

}