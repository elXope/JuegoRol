package Character.Job;

import Character.Stat.*;

public class Warrior extends Job {
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity) {
            return 0;
        } else if (stat instanceof Constitution) {
            return 2;
        } else if (stat instanceof Intelligence) {
            return 0;
        } else {
            return 3;
        }
    }
}
