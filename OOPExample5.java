class Student{
	// -- Start Attributes Declaration--
	String id;
	String name;
	int sub1;
	int sub2;
	// -- End Attributes Declaration--

	// -- Start Method Declaration--
	public void setValues(String stId, String stName, int stSub1, int stSub2){
		id = stId;
		name = stName;
		sub1 = stSub1;
		sub2 = stSub2;
	}
	// -- End Method Declaration--

    public void printValues(){
        System.out.println("Student Id : " + id);
		System.out.println("Student Name : " + name);
		System.out.println("Subject 1 : " + sub1);
		System.out.println("Subject 2 : " + sub2); 
    }
}

class OOPExample5{
    public static void main(String args[]){
        Student s1; 
		s1 = new Student(); 
		s1.setValues("S001", "Student 1", 89, 78);

        s1.printValues();


		Student s2 = new Student();
		s2.setValues("S002", "Student 2", 78, 88);

        s2.printValues();

        

    }
}
