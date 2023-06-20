class ParameterisedConstructor1{
	int length;
	int width;
	int height;

	ParameterisedConstructor1(int length, int width, int height){
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

class Example{
    public static void main(String args[]){
        ParameterisedConstructor1 b1 = new ParameterisedConstructor1(10, 5, 6); //have to use arguments
		System.out.println("Length : " + b1.length);
		System.out.println("Width : " + b1.width);
		System.out.println("Height : " + b1.height);
		
		b1.printVolume();
    }
}
