/**
 * Created by David on 11/7/16.
 */
public class TrickOrTreater extends Thread {

    private Children children;

    private int childrenNumber;

    public TrickOrTreater(Children children) {
        this.children = children;
        this.childrenNumber = 0;
    }

    @Override
    public void run() {
        super.run();

        System.out.println("Trick-or-treating begins...");

        int randomTime = 0;
        while(childrenNumber < 50) {

            randomTime = ((int) (Math.random() * 8)) * 10 + 5;
            try {
                sleep(randomTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            addChild();
        }

        System.out.println("No more kids");
    }

    synchronized public void addChild() {

        if (children.getNumberOfChildren() == 0) {
            childrenNumber++;
            System.out.println("Child " + childrenNumber + " was created");
            System.out.println("Child " + childrenNumber + " rings the doorbell");
            children.addChild();

        } else if (children.getNumberOfChildren() <= 10) {
            childrenNumber++;
            System.out.println("Child " + childrenNumber + " was created");
            children.addChild();

        }
    }
}
