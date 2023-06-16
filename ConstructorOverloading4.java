class ConstructorOverloading4{
	int length;
	int width;
	int height;

	ConstructorOverloading4(){
		length = 5;
		width = 4;
		height = 3;
	}

	ConstructorOverloading4(int length){
		this.width = length;
		this.length= length;
		this.height = length;
	}

	ConstructorOverloading4(int length, int width, int height){
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

class Example12{
    public static void main(String args[]){
        ConstructorOverloading4 b1 = new ConstructorOverloading4();
		b1.printVolume();
		/*b1.ConstructorOverloading4(10, 5,6); // Illegal*/
		b1.printVolume(); // ?
    }
}
