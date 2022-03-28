package Character.Job;

import org.junit.jupiter.api.Test;
import Character.Stat.*;

import static org.junit.jupiter.api.Assertions.*;

class JobTest {

    @Test
    void modifier() {
        Job war = new Warrior();
        Job mage = new Mage();
        Job ass = new Assasin();
        Job cra = new Crafter();
        Job tan = new Tank();

        Stat dex = new Dexterity(0);
        Stat con = new Constitution(0);
        Stat intel = new Intelligence(0);
        Stat str = new Strength(0);

        int[] warExpected = {0, 2, 0, 3};
        int[] mageExpected = {1, 0, 4, 0};
        int[] assExpected = {3, 1, 0, 1};
        int[] craExpected = {3, 0, 2, 0};
        int[] tanExpected = {-3, 10, -4, 2};

        int[] valueWarrior = {
                war.modifier(dex),
                war.modifier(con),
                war.modifier(intel),
                war.modifier(str)
        };
        int[] valueMage = {
                mage.modifier(dex),
                mage.modifier(con),
                mage.modifier(intel),
                mage.modifier(str)
        };
        int[] valueAssassin = {
                ass.modifier(dex),
                ass.modifier(con),
                ass.modifier(intel),
                ass.modifier(str)
        };
        int[] valueCrafter = {
                cra.modifier(dex),
                cra.modifier(con),
                cra.modifier(intel),
                cra.modifier(str)
        };
        int[] valueTank = {
                tan.modifier(dex),
                tan.modifier(con),
                tan.modifier(intel),
                tan.modifier(str)
        };

        assertArrayEquals(warExpected, valueWarrior);
        assertArrayEquals(mageExpected, valueMage);
        assertArrayEquals(assExpected, valueAssassin);
        assertArrayEquals(craExpected, valueCrafter);
        assertArrayEquals(tanExpected, valueTank);
    }
}