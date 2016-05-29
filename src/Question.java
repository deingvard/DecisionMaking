import java.util.Random;

/**
 * Created by igor on 29.05.16.
 */
public class Question implements  SharedContacts {
    Random random = new Random();

    int ask() {
        int prob = (int) (100 * random.nextDouble());
        if (prob < 30)return NO; //30%
        else if (prob < 60) return YES; //30%
        else if (prob < 75) return LATER; //15%
        else if (prob < 98) return SOON; //13%
        else
            return NEVER; //2%
    }
}
