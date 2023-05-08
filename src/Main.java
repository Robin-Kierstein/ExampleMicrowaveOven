public class Main {
    public static void main(String[] args) {
        MicroOven o = new MicroOven((int) (Math.random()*10));
        o.open();
        o.start(MicroOven.GRILL,5);
        o.close();
        o.start(MicroOven.GRILL,5);
        o.open();
    }
}
