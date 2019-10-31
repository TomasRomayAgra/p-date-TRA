
public class MainDate {
public static void main(String[] args) {
	
	Date myFecha1=new Date();
	Date myFecha2=new Date();
	if(myFecha1.isSameYear(myFecha2)) {
		System.out.println("Es el mismo year");
	}
	else {
		System.out.println("Son years distintos");
	}
	System.out.println(myFecha1);
}
	
}
