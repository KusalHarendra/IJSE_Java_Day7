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
}

class OOPExample4{
    public static void main(String args[]){
        Student s1; // Create Reference Variable for type 'Student'
		s1 = new Student(); // Create an Object type 'Student' and assign Reference to S1

		// s1.id = "S001";
		// s1.name = "Student 1";
		// s1.sub1 = 89;
		// s1.sub2 = 78;

		s1.setValues("S001", "Student 1", 89, 78);

		System.out.println("S1 Id : " + s1.id); //S1 Id : S001
		System.out.println("S1 Name : " + s1.name); //S1 Name : student 1 
		System.out.println("S1 Subject 1 : " + s1.sub1); //S1 Subject 1 : 89
		System.out.println("S1 Subject 2 : " + s1.sub2);    //S1 Subject 2 :  78
    }
}
