package Character.Race;

import Character.Stat.*;

public class Human extends Race {

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity) {
            return 1;
        } else if (stat instanceof Constitution) {
            return 2;
        } else if (stat instanceof Intelligence) {
            return 0;
        } else {
            return 2;
        }
    }
}
