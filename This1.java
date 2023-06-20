class This1{
	int length;
	int width;
	int height;

	public int getVolume(){
		int volume;
		volume = length * width* height;
		return volume;
	}

	public void setValue(int length, int width, int height){
		this.length = length; 
		this.width = width;
		this.height = height;
	}
}

class Example5{
    public static void main(String args[]){
        This1 b1 = new This1();
		b1.setValue(10, 5, 6);
		System.out.println("Height : " + b1.height);
		System.out.println("Width : " + b1.width);
		System.out.println("Length : " + b1.length);
		int volume = b1.getVolume();
		System.out.println("Volume : " + volume);
    }
}
