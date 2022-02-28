package timeofday_wet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay myTimeOfDay = new TimeOfDay(10, 25);
		assertEquals(10, myTimeOfDay.getHours());
		assertEquals(25, myTimeOfDay.getMinutes());
		assertEquals(625, myTimeOfDay.getMinutesSinceMidnight());
		
		myTimeOfDay.setHours(11);
		assertEquals(11, myTimeOfDay.getHours());
		assertEquals(25, myTimeOfDay.getMinutes());
		assertEquals(685, myTimeOfDay.getMinutesSinceMidnight());
		
		myTimeOfDay.setMinutes(45);
		assertEquals(11, myTimeOfDay.getHours());
		assertEquals(45, myTimeOfDay.getMinutes());
		assertEquals(705, myTimeOfDay.getMinutesSinceMidnight());
		
		myTimeOfDay.setMinutesSinceMidnight(90);
		assertEquals(1, myTimeOfDay.getHours());
		assertEquals(30, myTimeOfDay.getMinutes());
		assertEquals(90, myTimeOfDay.getMinutesSinceMidnight());
	}

}
