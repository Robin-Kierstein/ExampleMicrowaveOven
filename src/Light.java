public class Light {
    private int serialNumber;
    private boolean isSwitchedOn;

    public Light(int serialNumber){
        this.serialNumber = serialNumber;
        this.isSwitchedOn = false;
    }

    public boolean switchOn(){
        return toggleSwitch(true);
    }

    public boolean switchOff(){
        return toggleSwitch(false);
    }

    private boolean toggleSwitch(boolean toggle){
        this.isSwitchedOn = toggle;
        System.out.println("Light on lightbulb #"+serialNumber+" is now switched " + (toggle?"ON":"OFF") +".");
        return this.isSwitchedOn;
    }
}
