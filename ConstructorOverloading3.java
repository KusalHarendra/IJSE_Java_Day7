class ConstructorOverloading3{

	String id;
	String name;
	int sub1;
	int sub2;

	ConstructorOverloading3(){

	}

	ConstructorOverloading3 (String id, String name){ // without marks
		this.id = id;
		this.name = name;
		this.sub1 = -1;
		this.sub2 = -1;
	}

	ConstructorOverloading3(String id, String name, int sub1, int sub2){
		this.id = id;
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
	}

	public void setValues(String stId, String stName, int stSub1, int stSub2){
		id = stId;
		name = stName;
		sub1 = stSub1;
		sub2 = stSub2;
	}
	public void print(){
		System.out.println("Id : " + id + ", Name : " + name + ", Sub1 : " + sub1 + ", Sub2 :" + sub2);
	}

	public int total(){
		int total = sub1+ sub2;
		return total;
	}

	public double average(){
		double avg = (double) (sub1 + sub2) / 2;
		return avg;
	}

	public void setMarks(int sub1, int sub2){
		this.sub1 = sub1;
		this.sub2 = sub2;
	}
}

class Example11{
    public static void main(String args[]){
        ConstructorOverloading3 s1 = new ConstructorOverloading3();
		s1.print();
		s1.setValues("S001", "Student 1", 78, 34);
		s1.print();

		ConstructorOverloading3 s2 = new ConstructorOverloading3("S002", "Student 2");
		s2.print();
		s2.setMarks(78, 98);
		s2.print();

		ConstructorOverloading3 s3 = new ConstructorOverloading3("S003", "Student 3", 67, 78);
		s3.print();

    }
}
