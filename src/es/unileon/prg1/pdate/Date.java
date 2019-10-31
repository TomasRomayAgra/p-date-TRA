package es.unileon.prg1.pdate;
/**
 * Clase date para la superacion de la practica 
 * de Prog1 de la clase date
 * 
 * 
 */
public class Date {


	private int day;
	private int month;
	private int year;
	
	/**
	 * Constructor clase date
	 * 
	 */
		/**
		 * Constructor de la clase date
		 */
	public Date() {
		this.day=1;
		this.month=1;
		this.year=1;
	
	}
	/**
	 * Constructor de la clase day con parametros
	 * @param day
	 * @param month
	 * @param year
	 * @throws DateException 
	 */
	public Date(int day,int month,int year) throws DateException {
		setDay(day);
		
		if (month>0&&month<13) {
			this.month=month;
		}
		else {
			throw new DateException("Error en el mes introducido");
		}
		if (year>1) {
			this.year=year;
		}
		else {
			throw new DateException("Error en el year introducido");
	}
	}
	public int getDay() {
		return day;
	}



	public void setDay(int day) throws DateException {
		if (day>0&&day<32) {
			this.day=day;
		}
		else {
			throw new DateException("Error en el dia introducido");
		}
	}



	public int getMonth() {
		return month;
	}



	public void setMonth(int month) throws DateException {
		if (month>0&&month<13) {
			this.month=month;
		}
		else {
			throw new DateException("Error en el mes introducido");
	}}



	public int getYear() {
		return year;
	}



	public void setYear(int year) throws DateException {
		if (year>1) {
			this.year=year;
		}
		else {
			throw new DateException("Error en el year introducido");
	}
	}



	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	
	public boolean isSameYear(Date miFecha) {
		
		return (this.year==miFecha.getYear());
	}
	
}
