package Character.Race;

import Character.Stat.*;

public class Mule extends Race {
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity) {
            return -5;
        } else if (stat instanceof Constitution) {
            return 8;
        } else if (stat instanceof Intelligence) {
            return 0;
        } else {
            return 2;
        }
    }
}
