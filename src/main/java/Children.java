import java.util.Random;

/**
 * Created by David on 11/7/16.
 */
public class Children {

    private int numberOfChildren;

    public Children() {
        numberOfChildren = 0;
    }

    public int getNumberOfChildren() {
       return numberOfChildren;
    }

    public void addChild() {
        numberOfChildren++;
    }

    public void removeChild() {
        numberOfChildren--;
    }
}
