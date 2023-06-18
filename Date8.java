public class Date8 {
    int year;
	int month;
	int day;

	Date8(){
		this.year = 2000;
		this.month = 10;
		this.day = 15;
	}

	Date8(int year, int month, int day){
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

	public void setDate(Date d){
		// this.year = d.year;
		// this.month = d.month;
		// this.day = d.day;

		setDate(d.year, d.month, d.day);
	}

	public static Date8 getInstance(){
		Date d = new Date();
		return d;
	}
}

class Example28{
    public static void main(String args[]){
		Date8 d = Date8.getInstance();
		d.printDate(); // 2000-10-15
    }

}
