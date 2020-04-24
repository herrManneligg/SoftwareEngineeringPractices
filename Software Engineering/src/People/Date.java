package People;
import java.io.PrintStream;

public class Date implements Cloneable {

	private int day, month, year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date(Date date) {
		this.day = date.day;
		this.month = date.month;
		this.year = date.year;
	}
	
	public Date clone () {
		return new Date(this.day, this.month, this.year);
	}

	/* Day */
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	/* Month */
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	/* Year */
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	/* Difference in years method */
	public int diffInYears(Date other_date) {
		return Math.abs(this.year - other_date.getYear());
	}

	/* PrintStream method */
	public void print(PrintStream pStream) {

		pStream.printf("%02d/%02d/%4d", day, month, year);
	}

	public String toString() {
		return String.format("%02d/%02d/%4d", day, month, year);
	}

}
