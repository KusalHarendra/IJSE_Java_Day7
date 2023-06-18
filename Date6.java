public class Date6 {
    int year;
	int month;
	int day;

	Date6(){
		this.year = 2000;
		this.month = 10;
		this.day = 15;
	}

	Date6(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void printDate(){
		System.out.println(year + "-" + month + "-" + day);
	}
    public void setDate(int year, int month, int day){
        this.year = year;
		this.month = month;
		this.day = day;
    }
}

class Example27{
    public static void main(String args[]){
		Date6 d1 = new Date6(1995, 12, 12);
		d1.printDate(); // 1995-12-12

		Date6 d2 = new Date6();
		d2.printDate(); // 2000-10-15
		d2.setDate(1998, 10, 12);
		d2.printDate(); // 1998-10-12
    }

}
