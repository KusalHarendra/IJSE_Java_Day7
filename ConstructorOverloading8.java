public class ConstructorOverloading8 {
    int length;
    int width;
    int height;
    //length = 10; // Illegal
    public void printVolume(){
        int volume;
        volume = length * height * width;
        System.out.println("Volume of the box : " + volume);
    }
}
class Example{
    public static void main(String[] args) {
    }
}
