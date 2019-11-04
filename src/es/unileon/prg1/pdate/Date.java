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
		StringBuilder error=new StringBuilder("");
		if (month<1||month>12) {
			error.append("Error en el mes introducido, debe estar entre 1 y 12.");
		}
		else {
			this.month=month;
		}
		if (day<1||day>this.numberOfDaysInMonth()) {
			error.append("Error en el dia introducido, debe estar entre 1 y "+this.numberOfDaysInMonth());
		}
		if (year<1) {
			error.append("Error en el anho introducido, debe ser mayor que 1");
		}
		else {
			this.day=day;
			this.year=year;
		}
	}
	/**
	 * geters y seters
	 * @return
	 */
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
			throw new DateException("Error en el mes introducido, debe estar entre 1 y 12.");
	}}



	public int getYear() {
		return year;
	}



	public void setYear(int year) throws DateException {
		if (year>0) {
			this.year=year;
		}
		else {
			throw new DateException("Error en el year introducido");
	}
	}
/**Comprueba si los años de dos fechas son iguales
 * 
 * @param miFecha
 * @return
 */
	public boolean isSameYear(Date miFecha) {
		
		return (this.year==miFecha.getYear());
	}
	/**Comprueba si los meses de dos fechas son iguales
	 * 
	 * @param miFecha
	 * @return
	 */
	
	public boolean isSameMonth(Date miFecha) {
		return (this.month==miFecha.getMonth());
	}
	/**Comprueba si los dias de dos fechas son iguales
	 * 
	 * @param miFecha
	 * @return
	 */
	
	public boolean isSameDay(Date miFecha){
		return (this.day==miFecha.getDay());
	}
	/**Comprueba si dos fechas son iguales
	 * 
	 * @param miFecha
	 * @return
	 */
	
	public boolean isSame(Date miFecha) {
		return (isSameDay(miFecha)&&isSameMonth(miFecha)&&isSameYear(miFecha));
	}
	/**
	 * Devuelve en un string el nombre del mes de la fecha en letra
	 * @return
	 */
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
	/**
	 * Devuelve verdadero si el numero de dias que tiene el mes son correctos
	 * @return
	 */
public boolean areDaysOfTheMonthRight() {
	boolean areDaysOfTheMonthRight=false;
	switch(this.month) {
	case 1://next
	case 3://next
	case 5://next
	case 7://next
	case 8://next
	case 10://next
	case 12:
		areDaysOfTheMonthRight=(this.day>0&&this.day<32);
		break;
			
	case 4://next
	case 6://next
	case 9://next
	case 11:
		areDaysOfTheMonthRight=(this.day>0&&this.day<31);
		break;
	case 2:
		areDaysOfTheMonthRight=(this.day>0&&this.day<29);
		break;
	}
	return areDaysOfTheMonthRight;
}
/**
 * Devuelve la estacion meteorologica en un string
 * @return
 */
public String seasonOfTheYear() {
	String seasonOfTheYear="";
	switch(this.month) {
	case 12://next
	case 1://next
	case 2:
		seasonOfTheYear="Invierno";
		break;
	case 3://next
	case 4://next
	case 5:
		seasonOfTheYear="Primavera";
		break;
	case 6://next
	case 7://next
	case 8:
		seasonOfTheYear="Verano";
		break;
	case 9://next
	case 10://next
	case 11:
		seasonOfTheYear="Otonho";
		break;
		
		
	}
	return seasonOfTheYear;
	
}
/**
 * Devuelve el numero de meses que faltan para que acabe el anho
 * @return
 */
public int monthsUntilEndOfYear() {
	int monthsUntilEndOfYear;
	monthsUntilEndOfYear=(12-this.month);
	return monthsUntilEndOfYear;
}
	/**
	 * Devuelve el numero de dias que tiene un mes
	 * @return
	 */
public int numberOfDaysInMonth() {
	int numberOfDaysInMonth=0;
	switch(this.month) {
	case 1://next
	case 3://next
	case 5://next
	case 7://next
	case 8://next
	case 10://next
	case 12:
		numberOfDaysInMonth=31;
		break;
			
	case 4://next
	case 6://next
	case 9://next
	case 11:
		numberOfDaysInMonth=30;
		break;
	case 2:
		numberOfDaysInMonth=28;
		break;
	}
	return numberOfDaysInMonth;
}
/**
 * Devuelve un string con todas las fechas desde la fecha sobre la que se aplica hasta el final del mes
 * @return
 */
public String datesUntilEndOfMonth() {
	StringBuffer datesUntilEndOfMonth = new StringBuffer();
	for (int i = this.day; i < this.numberOfDaysInMonth(); i++) {
		datesUntilEndOfMonth.append("Date [day=" + i + ", month=" + month + ", year=" + year + "]\n");
	}
	return datesUntilEndOfMonth.toString();
}
/**
 * Devuelve el nombre de los meses que tienen el mismo numero de dias que el mes de la fecha
 * @return
 * @throws DateException
 */
public String monthsWithSameNumberOfDays() throws DateException {
	StringBuffer monthsWithSameNumberOfDays=new StringBuffer();
	for (int i=1;i<=12;i++) {
	
		Date bucle=new Date(i,1,1);
		if((bucle.numberOfDaysInMonth()==this.numberOfDaysInMonth())&&(i!=this.month)) {
			
			monthsWithSameNumberOfDays.append(this.nameOfMonth()+ ", ");
		}
	 }
		return monthsWithSameNumberOfDays.toString();
	}
/**
 * Devuelve el numero de dias que han pasado desde el primer dia del anho hasta la fecha
 * @return
 * @throws DateException
 */
public int daysSinceJanuaryFirst() throws DateException {
	int daysSinceJanuaryFirst=0;

	for(int i=1;i<this.month;i++) {
		Date bucle=new Date(1,i,1);
		daysSinceJanuaryFirst+=bucle.numberOfDaysInMonth();
	}
	daysSinceJanuaryFirst=daysSinceJanuaryFirst+this.day-1;
	return daysSinceJanuaryFirst;
}
/**
 * Devuelve el numero de intentos que le ha costado generar aleatoriamente la fecha sobre la que se aplica el metodo
 * @return
 * @throws DateException
 */
public int numberOfAttempsWhile()throws DateException{
	int numberOfAttempsWhile=0;
	Date bucle=new Date(1,1,(this.year+1));//La fecha exirá pero no será inmediatamente igual a la otra fecha
	int day;
	int month;
	int year;
	while(!(this.isSame(bucle))) {
		bucle.setMonth((int)(Math.random()*12)+1);
		bucle.setDay((int)(Math.random()*bucle.numberOfDaysInMonth())+1);
		year=this.year;
		numberOfAttempsWhile++;
	}
	return numberOfAttempsWhile;
}
/**
 * Devuelve el numero de intentos que le ha costado generar aleatoriamente la fecha sobre la que se aplica el metodo
 * @return
 * @throws DateException
 */
public int numberOfAttempsDoWhile()throws DateException{
	int numberOfAttempsDoWhile=0;
	Date bucle=new Date(1,1,1);
	int day;
	int month;
	int year;
	do {
		bucle.setMonth((int)(Math.random()*12)+1);
		bucle.setDay((int)(Math.random()*bucle.numberOfDaysInMonth())+1);
		year=this.year;
		numberOfAttempsDoWhile++;
	}while(!(this.isSame(bucle)));
	return numberOfAttempsDoWhile;
}
/**
 * Devuelve en un string el nombre del dia 1=lunes 2=martes ....
 * @param day
 * @return
 * @throws DateException
 */
public String nameOfTheDay(int day)throws DateException{
	String nameOfTheDay="";
	
	switch(day) {
		case 1:
			nameOfTheDay="Lunes";
			break;
		case 2:
			nameOfTheDay="Martes";
			break;
		case 3:
			nameOfTheDay="Miercoles";
			break;
		case 4:
			nameOfTheDay="Jueves";
			break;
		case 5:
			nameOfTheDay="Viernes";
			break;
		case 6:
			nameOfTheDay="Sabado";
			break;
		case 7:
			nameOfTheDay="Domingo";
			break;
		default:
			throw new DateException("Error en el dia de la semana introducido, tiene que estar entre 1 y 7");
			
	}
	
	return nameOfTheDay;
}
/**
 * Calcula el dia de la semana de la fecha sabiendo el dia de la semana del primer dia del anho
 * @param day
 * @return
 * @throws DateException
 */
public String dayOfTheWeek(int day)throws DateException {
	int dayOfTheWeek;
	dayOfTheWeek=((this.daysSinceJanuaryFirst()%7+day)%7);
	return nameOfTheDay(dayOfTheWeek);
}


/**
 * Devuelve en un string la fecha
 */
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	
}
