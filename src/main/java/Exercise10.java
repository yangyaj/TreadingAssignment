/**
 * Created by David on 11/7/16.
 */
public class Exercise10 {
    public static void main(String[] args) {

        Children children = new Children();

        TrickOrTreater trickOrTreaters = new TrickOrTreater(children);
        trickOrTreaters.start();

        Riley riley = new Riley(children);
        riley.start();

    }
}
