import java.util.LinkedList;
import java.util.List;

public class MicroOven {
    private String model;
    private String ownerName;
    private int purchasedPrice;
    public static final int GRILL=1001;
    public static final int DEFROST =1002;
    public static final int HEAT=1003;
    private int currentMode;

    private Door door;

    private List<Light> lights;

    public MicroOven (int numberLights) {
        this.door = new Door();
        this.lights = new LinkedList<>();

        for(int i=0;i<numberLights;i++){
            int value = (int)(Math.random()*10000);
            this.lights.add(new Light(value));
        }
    }
    public void start(int mode, int duration) {
        if(this.door.isOpen())
        {
            System.out.println("Door is opened, starting is aborted.");
            return;
        }

        this.currentMode = mode;
        System.out.println("Started in mode:" + this.currentMode);
        this.door.lock();
        while (duration > 0) {
            System.out.println("Timer : " + duration);
            --duration;
        }
        System.out.println("Please wait while the food is cooling down.");
        duration = 3;

        while (duration > 0) {
            System.out.println("Timer : " + duration);
            --duration;
        }

        door.unlock();
        System.out.println("Done, door is unclocked.");
    }

        public void stop() {
            System.out.println("Stopped!");
            door.unlock();
        }

        public void open(){
            door.open();
            System.out.println("Switching lights ON.");
            for(Light l : this.lights){
                l.switchOn();
            }
        }

        public void close(){
            door.close();;
            System.out.println("Switching lights OFF.");
            for(Light l : this.lights){
                l.switchOff();
            }
        }
    }