class StudentEx{
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

	public void print(){
		System.out.println("Id : " + id + ", Name : " + name + ", Sub1 : " + sub1 + ", Sub2 :" + sub2);
	}
	// -- End Method Declaration--
    public int total(){
        return sub1 + sub2;
    }
    public double average(){
        return (sub1+sub2)/2;
    }
}

class ExcersiseOOP6{
    public static void main(String args[]){
        StudentEx s1; 
		s1 = new StudentEx(); 

		s1.setValues("S001", "Student 1", 89, 78);
		s1.print();

		System.out.println("Total Marks : " + s1.total());
		System.out.println("Average : " + s1.average());
    }
}
