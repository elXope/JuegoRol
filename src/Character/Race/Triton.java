package Character.Race;

import Character.Stat.*;

public class Triton extends Race {
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity) {
            return 0;
        } else if (stat instanceof Constitution) {
            return -2;
        } else if (stat instanceof Intelligence) {
            return 10;
        } else {
            return -3;
        }
    }
}
