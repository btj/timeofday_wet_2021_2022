package timeofday_wet;

/**
 * Each instance of this class stores a time of day.
 * 
 * @invar | 0 <= getHours() && getHours() <= 23
 * @invar | 0 <= getMinutes() && getMinutes() <= 59
 * @invar | getMinutesSinceMidnight() == getHours() * 60 + getMinutes()
 */
public class TimeOfDay {
	
	/**
	 * @invar | 0 <= minutesSinceMidnight && minutesSinceMidnight < 24 * 60
	 */
	private int minutesSinceMidnight;
	
	public int getHours() { return minutesSinceMidnight / 60; }
	
	public int getMinutes() { return minutesSinceMidnight % 60; }
	
	public int getMinutesSinceMidnight() { return minutesSinceMidnight; }

	/**
	 * Initializes this instance so that it stores the given time of day.
	 * 
	 * @throws IllegalArgumentException | hours < 0 || 23 < hours
	 * @throws IllegalArgumentException | minutes < 0 || 59 < minutes
	 * 
	 * @post | getHours() == hours
	 * @post | getMinutes() == minutes
	 */
	public TimeOfDay(int hours, int minutes) {
		if (hours < 0 || 23 < hours)
			throw new IllegalArgumentException();
		if (minutes < 0 || 59 < minutes)
			throw new IllegalArgumentException();
		
		this.minutesSinceMidnight = hours * 60 + minutes;
	}

	/**
	 * Sets this object's hours to the given value.
	 * 
	 * @throws IllegalArgumentException | hours < 0 || 23 < hours
	 * 
	 * @mutates | this
	 * 
	 * @post | getHours() == hours
	 * @post | getMinutes() == old(getMinutes())
	 */
	public void setHours(int hours) {
		minutesSinceMidnight = 60 * hours + minutesSinceMidnight % 60;
	}
	
	/**
	 * Sets this object's minutes to the given value.
	 * 
	 * @throws IllegalArgumentException | minutes < 0 || 59 < minutes
	 * 
	 * @mutates | this
	 * 
	 * @post | getMinutes() == minutes
	 * @post | getHours() == old(getHours())
	 */
	public void setMinutes(int minutes) {
		minutesSinceMidnight = minutes + minutesSinceMidnight / 60 * 60;
	}
	
	/**
	 * Sets this object's minutes since midnight to the given value.
	 * 
	 * @throws IllegalArgumentException | minutesSinceMidnight < 0 || 23 < minutesSinceMidnight
	 * 
	 * @mutates | this
	 * 
	 * @post | getMinutesSinceMidnight() == minutesSinceMidnight
	 */
	public void setMinutesSinceMidnight(int minutesSinceMidnight) {
		this.minutesSinceMidnight = minutesSinceMidnight; 
	}
	
	
}
