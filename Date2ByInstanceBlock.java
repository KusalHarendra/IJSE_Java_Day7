public class Date2ByInstanceBlock {
    int year;
	int month;
	int day;

	{ // Using Instance Block
		year = 1995;
		month = 12;
		day = 12;
	}
}

class Example{
    public static void main(String args[]){
		Date d1 = new Date();
    }

}
