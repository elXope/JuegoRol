package Character.Job;

import Character.Stat.*;

public class Tank extends Job{
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity) {
            return -3;
        } else if (stat instanceof Constitution) {
            return 10;
        } else if (stat instanceof Intelligence) {
            return -4;
        } else {
            return 2;
        }
    }
}
