package Character.Job;

import Character.Stat.*;

public class Assasin extends Job {
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity) {
            return 3;
        } else if (stat instanceof Constitution) {
            return 1;
        } else if (stat instanceof Intelligence) {
            return 0;
        } else {
            return 1;
        }
    }
}
