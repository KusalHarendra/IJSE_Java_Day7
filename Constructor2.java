class Constructor2{
	int length;
	int width;
	int height;

	// Default Constructor 
	Constructor2(){  // No return Type
	 	length = 10;
	 	width = 5;
	 	height = 6;
	}

	public void printVolume(){
		int volume;
		volume = length * width* height;
		System.out.println("Volume : " + volume);
	}
}

class Example8{
    public static void main(String args[]){
        Constructor2 b1 = new Constructor2();
		System.out.println("Length : " + b1.length);
		System.out.println("Width : " + b1.width);
		System.out.println("Height : " + b1.height);
		
		b1.printVolume();
    }
}
