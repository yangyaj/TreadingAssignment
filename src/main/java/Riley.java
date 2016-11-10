/**
 * Created by David on 11/7/16.
 */
public class Riley extends Thread {

    private Children children;

    public Riley(Children children) {
        this.children = children;
    }

    public void watchMovie(){
        System.out.println("Riley watches TV");
    }

    public void openDoor(){
        System.out.println("Riley answers the door");
    }

    synchronized public void giveCandy(){
        System.out.println("Riley gives candy");
        children.removeChild();
    }

    @Override
    public void run() {
        super.run();
        watchMovie();

        boolean kidsAtDoor = false;
        boolean atDoor = false;
        int treatsGiven = 0;

        while(treatsGiven < 50) {

            kidsAtDoor = checkForKids();

            if (kidsAtDoor) {
                if (atDoor == false) {
                    atDoor = true;
                    openDoor();
                }

                try {
                    sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                giveCandy();
                treatsGiven++;
            } else if (atDoor == true) {
                atDoor = false;
                watchMovie();
            }

        }

        System.out.println("Halloween is over.");

    }

    synchronized public boolean checkForKids() {
        if (children.getNumberOfChildren() > 0){
            return true;
        } else {
            return false;
        }
    }
}
