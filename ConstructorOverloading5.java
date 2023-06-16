class ConstructorOverloading5{
	int length;
	int width;
	int height;

	ConstructorOverloading5(){
		length = 5;
		width = 4;
		height = 3;
	}

	ConstructorOverloading5(int length){
		this.width = length;
		this.length= length;
		this.height = length;
	}

	public void ConstructorOverloading5(int length, int width, int height){ //Not a Constructor, Method with return type
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

class Example13{
    public static void main(String args[]){
        ConstructorOverloading5 b1 = new ConstructorOverloading5();
		b1.printVolume();
		b1.ConstructorOverloading5  (10,5,6); 
		b1.printVolume();
    }
}
