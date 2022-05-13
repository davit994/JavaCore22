package chapters.chapter3;

public class Light {
    public static void main(String[] args) {
        int lightspeed = 186000;
        long days = 1000;
        long seconds = 24 * 60 * 60;
        long distance = lightspeed * seconds;
        System.out.print("Za " + days + " ");
        System.out.print("dnei svet proidyot okalo ");
        System.out.println(distance + " mil.");
    }
}
