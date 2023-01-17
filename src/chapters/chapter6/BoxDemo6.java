package chapters.chapter6;

public class BoxDemo6 {
    public static void main(String[] args) {

        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();
        double vol;

        vol = mybox1.volume();
        System.out.println("Oбъeм равен" + vol);
        vol = mybox2.volume();
        System.out.println("Oбъeм равен " + vol);
    }
}
