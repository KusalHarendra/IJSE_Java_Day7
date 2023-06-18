class OOPBox4{
	int length;
	int width;
	int height;

	public int getVolume(){
		int volume;
		volume = length * width* height;
		return volume;
	}

	public void setValue(int l, int w, int h){
		length = l;
		width = w;
		height = h;
	}
}

class Example{
    public static void main(String args[]){
        OOPBox4 b1 = new OOPBox4();
		b1.setValue(10, 5, 6);
		int volume = b1.getVolume();
		System.out.println("Volume : " + volume);
    }
}

