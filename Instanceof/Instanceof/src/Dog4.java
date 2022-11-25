public class Dog4  extends Animal{
    static void method(Animal a) {
        Dog4 d = (Dog4) a; //downCasting
        System.out.println("DownCasting is ok");
    }

    public static void main(String[] args) {
        Animal a = new Dog4();
        Dog4.method(a);
    }
}
