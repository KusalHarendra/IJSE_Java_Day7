class ConstructorOverloading1{
	int length;
	int width;
	int height;

	ConstructorOverloading1(){
		length = 5;
		width = 4;
		height = 3;
	}

	ConstructorOverloading1(int length){
		this.width = length;
		this.length= length;
		this.height = length;
	}

	ConstructorOverloading1(int length, int width, int height){
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public void printVolume(){
		int volume;
		volume = length * width* height;
		System.out.println("Volume : " + volume);
	}
}

class Example10{
    public static void main(String args[]){
        ConstructorOverloading1 b1 = new ConstructorOverloading1(10, 5, 6);
		b1.printVolume();

		ConstructorOverloading1 b2 = new ConstructorOverloading1();
		b2.printVolume();

		ConstructorOverloading1 b3 = new ConstructorOverloading1(10);
		b3.printVolume();
    }
}
