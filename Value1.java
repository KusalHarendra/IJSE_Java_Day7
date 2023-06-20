public class Value1 {
    int x;
	static int y;

    public static void main(String args[]){
		Value1 v1 = new Value1();
		v1.x = 100;
		v1.y = 10;
        System.out.println(v1.x + " " + v1.y); // 100 10

		Value1 v2 = new Value1();
		v2.x = 200;
		v2.y = 20;
        System.out.println(v2.x + " " + v2.y); // 200 20    

		Value1 v3 = new Value1();
		v3.x = 300;
		v3.y = 30;
        System.out.println(v3.x + " " + v3.y); // 300 30
    }

}
