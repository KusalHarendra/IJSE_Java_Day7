class ParameterisedConstructor2{
	int length;
	int width;
	int height;

	ParameterisedConstructor2(int length, int width, int height){
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

class Example9{
    public static void main(String args[]){
        ParameterisedConstructor2 b1 = new ParameterisedConstructor2(10, 5, 6);
		b1.printVolume();

		/*ParameterisedConstructor2 b2 = new ParameterisedConstructor2();         // Illegal
		b2.printVolume();       //?         */
    }
}
