public class Date7 {
    int year;
	int month;
	int day;

	Date7(){
		this.year = 2000;
		this.month = 10;
		this.day = 15;
	}

	Date7(int year, int month, int day){
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
    public void setDate(Date7 d){
        this.year = d.year;
        this.month = d.month;
        this.day = d.day;
    }
}

class Example{
    public static void main(String args[]){
		Date7 d1 = new Date7(1995, 12, 12);
		d1.printDate(); // 1995-12-12

		Date7 d2 = new Date7();
		d2.printDate(); // 2000-10-15
		d2.setDate(1998, 10, 12);
		d2.printDate(); // 1998-10-12
		d2.setDate(d1);
		d2.printDate(); // 1995-12-12
    }

}
