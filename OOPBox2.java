class OOPBox2{
	int length;
	int width;
	int height;

	public void printVolume(){
		int volume;
		volume = length * width* height;
		System.out.println("Volume : " + volume);
	}
}

class Example1{
    public static void main(String args[]){
        OOPBox2 b1 = new OOPBox2();
	   	b1.length = 10;
        b1.width = 5;
	   	b1.height = 6;
        b1.printVolume();
    } 
}   
