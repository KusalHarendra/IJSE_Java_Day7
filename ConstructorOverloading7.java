class ConstructorOverloading7{
    int a =100;
    ConstructorOverloading7(){
    a=200;
    }
    ConstructorOverloading7(int a){
    this.a = a;
    }
    public void print(){
    System.out.println("A : " + a);
    }
    }
    class Example{
    public static void main(String[] args) {
    ConstructorOverloading7 a1 = new ConstructorOverloading7();
    a1.print(); // 200
    ConstructorOverloading7 a2 = new ConstructorOverloading7(300);
    a2.print(); // 300
    }
    }
    