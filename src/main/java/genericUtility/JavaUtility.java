package genericUtility;

import java.time.LocalDateTime;

public class JavaUtility {
	
	/**
	 * This method is used to capture the current date and time from the system
	 * @return
	 */
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(':', '-');
	}
}
