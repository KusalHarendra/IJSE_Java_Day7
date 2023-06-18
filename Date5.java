public class Date5 {
    int year;
	int month;
	int day;

	Date5(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
    Date5(){
        this.year = 2000;
        this.month = 10;
        this.day = 15;

    }

	public void printDate(){
		System.out.println(year + "-" + month + "-" + day);
	}
}

class Example26{
    public static void main(String args[]){
		Date5 d1 = new Date5(1995, 12, 12);
		d1.printDate(); // 1995-12-12

		Date5 d2 = new Date5();
		d2.printDate(); // 2000-10-15
    }


}
