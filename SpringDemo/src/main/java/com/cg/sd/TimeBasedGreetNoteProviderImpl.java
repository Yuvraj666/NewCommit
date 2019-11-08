package com.cg.sd;

import java.time.LocalDateTime;

public class TimeBasedGreetNoteProviderImpl implements GreetNoteProvider {

	public String getGreetNote() {
		String result = null;
		int hour = LocalDateTime.now().getHour();
		if (hour >= 4 && hour <= 11) {
			result = "Suprabhaat";
		}
		else if(hour>11 && hour<=16) {
			result = "Lunch Time";
		}
		else {
			result = "Shubho Raatri";
		}
		return result;
	}

}
