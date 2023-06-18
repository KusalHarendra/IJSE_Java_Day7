class Student{
    String id;
	String name;
	int sub1;
	int sub2;

}

class OOPExample3{
    public static void main(String args[]){
        Student s1; // Create an Object type 'Student' and assign reference to S1

		s1 = new Student(); // Create an Object type 'Student' and assign reference to S1

        s1.id = "S001";
        s1.name = "Kusal";
        s1.sub1 = 58;
        s1.sub2 = 65;

        Student s2 = new Student();

        s2.id = "S002";
        s2.name = "Harendra";
        s2.sub1 = 95;
        s2.sub2 = 45;


		System.out.println("Id : " + s1.id);
		System.out.println("Name : " + s1.name);
		System.out.println("Subject 1 : " + s1.sub1);
		System.out.println("Subject 2 : " + s1.sub2);

        System.out.println("Id : " + s2.id);
		System.out.println("Name : " + s2.name);
		System.out.println("Subject 1 : " + s2.sub1);
		System.out.println("Subject 2 : " + s2.sub2);
    }

}