class ConstructorOverloading6{
	int length = 10; // Attribute Declaration Values
	int width = 5; // Attribute Declaration Values
	int height = 6; // Attribute Declaration Values

	public void printVolume(){
		int volume;
		volume = length * width* height;
		System.out.println("Volume : " + volume);
	}
}

class Example14{
    public static void main(String args[]){
		ConstructorOverloading6 b1 = new ConstructorOverloading6();
		System.out.println("Length : " + b1.length);
		System.out.println("Width : " + b1.width);
		System.out.println("Height : " + b1.height);

		b1.printVolume();
    }
}
