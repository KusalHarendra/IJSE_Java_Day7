class Student{
    String id;
	String name;
	int sub1;
	int sub2;

}

class OOPExample1{
    public static void main(String args[]){
        Student s1;	// Create Reference Variable for type 'Student'
		s1 = new Student();	// Create an Object type 'Student' and assign reference to S1


		System.out.println("Id : " + s1.id);
		System.out.println("Name : " + s1.name);
		System.out.println("Subject 1 : " + s1.sub1);
		System.out.println("Subject 2 : " + s1.sub2);
    }

}