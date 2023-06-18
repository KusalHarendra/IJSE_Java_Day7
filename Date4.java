public class Date4 {
    int year;
	int month;
	int day;

	Date4(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
    }

    public void printDate4(){
        System.out.println(year+ "-" + month+ "-" + day);
    }
	

}

class Example25{
    public static void main(String args[]){
		Date4 d1 = new Date4(1995, 12, 12);
		d1.printDate4(); // 1995-12-12
    }

}
