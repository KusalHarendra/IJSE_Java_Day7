class Value2{
	int x;
	static int y;		//static keyword is using the final value for y
}

class Example16{
    public static void main(String args[]){
		Value2 v1 = new Value2();
		v1.x = 100;
		v1.y = 10;

		Value2 v2 = new Value2();
		v2.x = 200;
		v2.y = 20;

		Value2 v3 = new Value2();
		v3.x = 300;
		v3.y = 30;

		System.out.println(v1.x + " " + v1.y); // 100 30
		System.out.println(v2.x + " " + v2.y); // 200 30
		System.out.println(v3.x + " " + v3.y); // 300 30
    }
}
