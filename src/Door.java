public class Door {

    private boolean isLocked;
    private boolean isOpen;

    public Door(){
        this.isLocked = false;
        this.isOpen = false;
    }

    public void lock(){
        System.out.println("Locking the Door!");
        this.isLocked = true;
    }

    public void unlock(){
        System.out.println("Unlocking the Door!");
        this.isLocked = false;
    }

    public void open() {
        if(!this.isLocked) {
            System.out.println("Opening the Door!");
            this.isOpen = true;
        }else {
            System.out.println("Sorry, door is locked. Stop the program first.");
        }
    }

    public void close() {
        System.out.println("Closing the Door!");
        this.isOpen = false;
    }

    public boolean isOpen(){
        return this.isOpen;
    }
}
