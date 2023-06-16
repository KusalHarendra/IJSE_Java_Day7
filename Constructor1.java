class Constructor1{
	int length;
	int width;
	int height;

	// Default Constructor --> Compiler
	/*  Box(){
	length = 0;
	width = 0;
	height = 0;
	}   */              //not necessary. Noany return type

	public void printVolume(){
		int volume;
		volume = length * width* height;
		System.out.println("Volume : " + volume);
	}
}

class Example7{
    public static void main(String args[]){
        Constructor1 b1 = new Constructor1();
		System.out.println("Length : " + b1.length);
		System.out.println("Width : " + b1.width);
		System.out.println("Height : " + b1.height);
		
		b1.printVolume();
    }
}
