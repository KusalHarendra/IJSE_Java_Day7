class OOPBox3{
	int length;
	int width;
	int height;

	public void printVolume(){
		int volume;
		volume = length * width* height;
		System.out.println("Volume : " + volume);
	}

	public void setValue(int l, int w, int h){
		length = l;
		width = w;
		height = h;
	}
}

class Example2{
    public static void main(String args[]){
        OOPBox3 b1 = new OOPBox3();
		b1.setValue(10, 5, 6);
		b1.printVolume();
    }
}
