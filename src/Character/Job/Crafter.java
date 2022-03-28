package Character.Job;

import Character.Stat.*;

public class Crafter extends Job {
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity) {
            return 3;
        } else if (stat instanceof Constitution) {
            return 0;
        } else if (stat instanceof Intelligence) {
            return 2;
        } else {
            return 0;
        }
    }
}
