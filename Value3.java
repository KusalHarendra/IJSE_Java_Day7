class Value3{
	int x; // Instance/ Object variable
	static int y; // static / Template, class variable
}

class Example17{
    public static void main(String args[]){
		Value3.y = 100; // Legal
		//Value.x = 200; // Illegal

		Value3 v1 = new Value3();
		v1.x = 200; // Legal
		v1.y = 300; // Legal
    }
}
