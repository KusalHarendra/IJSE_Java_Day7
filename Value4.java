public class Value4 {
    public void instanceMethod(){
		System.out.println("Instance Method...");
	}

	public static void staticMethod(){
		System.out.println("Static Method...");
	}
}

class Example18{
    public static void main(String args[]){
		Value4.staticMethod();
		// Value.instanceMethod();// Illegal

		Value4 v1 = new Value4();
		v1.instanceMethod();
		v1.staticMethod();
    }

}
