class A{
	int a;
	public void print(){
		System.out.println(this);
	}
}

class Example6{
    public static void main(String args[]){
       	A a1 = new A();
		System.out.println(a1);
		a1.print();

		System.out.println("-----------");

		A a2 = new A();
		System.out.println(a2);
		a2.print();
    }
}
