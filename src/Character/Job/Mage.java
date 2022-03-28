package Character.Job;

import Character.Stat.*;

public class Mage extends Job {
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity) {
            return 1;
        } else if (stat instanceof Constitution) {
            return 0;
        } else if (stat instanceof Intelligence) {
            return 4;
        } else {
            return 0;
        }
    }
}
