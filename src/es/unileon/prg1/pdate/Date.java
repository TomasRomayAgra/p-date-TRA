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
	private StringBuilder error= new StringBuilder("");
	
	/**
	 * Constructor clase date
	 * 
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
		setMonth(month);
		setYear(year);
		if (error.length()>0) {
			throw new DateException(this.error);
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
			this.error.append("Error en el dia introducido");
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
			this.error.append("Error en el mes introducido");
	}}



	public int getYear() {
		return year;
	}



	public void setYear(int year) throws DateException {
		if (year>1) {
			this.year=year;
		}
		else {
			this.error.append("Error en el year introducido");
	}
	}
/**
 * 
 * @param miFecha
 * @return
 */
	public boolean isSameYear(Date miFecha) {
		
		return (this.year==miFecha.getYear());
	}
	
	public boolean isSameMonth(Date miFecha) {
		return (this.month==miFecha.getMonth());
	}
	
	public boolean isSameDay(Date miFecha){
		return (this.day==miFecha.getDay());
	}
	
	public boolean isSame(Date miFecha) {
		return (isSameDay(miFecha)&&isSameMonth(miFecha)&&isSameYear(miFecha));
	}
	public String nameOfMonth() {
		String nameOfMonth="";
		switch(this.month) {
		case 1:
			nameOfMonth="Enero";
			break;
		case 2:
			nameOfMonth="Febrero";
			break;
		case 3:
			nameOfMonth="Marzo";
			break;
		case 4:
			nameOfMonth="Abril";
			break;
		case 5:
			nameOfMonth="Mayo";
			break;
		case 6:
			nameOfMonth="Junio";
			break;
		case 7:
			nameOfMonth="Julio";
			break;
		case 8:
			nameOfMonth="Agosto";
			break;
		case 9:
			nameOfMonth="Septiembre";
			break;
		case 10:
			nameOfMonth="Octubre";
			break;
		case 11:
			nameOfMonth="Noviembre";
			break;
		case 12:
			nameOfMonth="Diciembre";
			break;
		}
		return nameOfMonth;
	}
public boolean checkDayOfTheMonth() {
	boolean checkDayOfTheMonth=false;
	switch(this.month) {
	case 1://next
	case 3://next
	case 5://next
	case 7://next
	case 8://next
	case 10://next
	case 12:
		checkDayOfTheMonth=(this.day>0&&this.day<32);
		break;:
			
	case 4://next
	case 6://next
	case 9://next
	case 11:
		checkDayOfTheMonth=(this.day>0&&this.day<31);
		break;
	case 2:
		checkDayOfTheMonth=(this.day>0&&this.day<29);
		break;
	}
	return checkDayOfTheMonth;
}

	


	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	
}
