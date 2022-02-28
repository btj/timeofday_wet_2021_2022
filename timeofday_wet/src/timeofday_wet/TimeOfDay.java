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
	 * @invar | 0 <= hours && hours <= 23
	 * @invar | 0 <= minutes && minutes <= 59
	 */
	private int hours;
	private int minutes;
	
	public int getHours() { return hours; }
	
	public int getMinutes() { return minutes; }
	
	public int getMinutesSinceMidnight() { return hours * 60 + minutes; }

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
			throw new IllegalArgumentException("`hours` is out of range");
		if (minutes < 0 || 59 < minutes)
			throw new IllegalArgumentException("`minutes` is out of range");
		
		this.hours = hours;
		this.minutes = minutes;
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
		if (hours < 0 || 23 < hours)
			throw new IllegalArgumentException("`hours` is out of range");

		this.hours = hours;
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
		if (minutes < 0 || 59 < minutes)
			throw new IllegalArgumentException("`minutes` is out of range");
		
		this.minutes = minutes;
	}
	
	/**
	 * Sets this object's minutes since midnight to the given value.
	 * 
	 * @throws IllegalArgumentException | minutesSinceMidnight < 0 || 24 * 60 <= minutesSinceMidnight
	 * 
	 * @mutates | this
	 * 
	 * @post | getMinutesSinceMidnight() == minutesSinceMidnight
	 */
	public void setMinutesSinceMidnight(int minutesSinceMidnight) {
		if (minutesSinceMidnight < 0 || 24 * 60 <= minutesSinceMidnight)
			throw new IllegalArgumentException("`minutes` is out of range");
		
		this.hours = minutesSinceMidnight / 60;
		this.minutes = minutesSinceMidnight % 60;
	}
	
	
}
