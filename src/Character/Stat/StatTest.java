package Character.Stat;

import static org.junit.jupiter.api.Assertions.*;

class StatTest {

    @org.junit.jupiter.api.Test
    void getValue() {
        int[] values = {0, 3, -2, 100};
        Stat cons = new Constitution(values[0]);
        Stat dex = new Dexterity(values[1]);
        Stat intel = new Intelligence(values[2]);
        Stat stren = new Strength(values[3]);
        Stat[] arr = {cons, dex, intel, stren};
        for (int i = 0; i < arr.length; i++) {
            assertEquals(values[i], arr[i].getValue());
        }
    }

    @org.junit.jupiter.api.Test
    void increase() {
        int[] values = {0, 3, -2, 100};
        Stat cons = new Constitution(values[0]);
        Stat dex = new Dexterity(values[1]);
        Stat intel = new Intelligence(values[2]);
        Stat stren = new Strength(values[3]);
        Stat[] arr = {cons, dex, intel, stren};
        for (int i = 0; i < arr.length; i++) {
            arr[i].increase();
            assertEquals(values[i] + 1, arr[i].getValue());
        }
    }

    @org.junit.jupiter.api.Test
    void decrease() {
        int[] values = {0, 3, -2, 100};
        Stat cons = new Constitution(values[0]);
        Stat dex = new Dexterity(values[1]);
        Stat intel = new Intelligence(values[2]);
        Stat stren = new Strength(values[3]);
        Stat[] arr = {cons, dex, intel, stren};
        for (int i = 0; i < arr.length; i++) {
            arr[i].decrease();
            assertEquals(values[i] - 1, arr[i].getValue());
        }
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        int[] values = {0, 3, -2, 100};
        Stat cons = new Constitution(values[0]);
        Stat dex = new Dexterity(values[1]);
        Stat intel = new Intelligence(values[2]);
        Stat stren = new Strength(values[3]);
        Stat[] arr = {cons, dex, intel, stren};

        String[] test = {
                "Constitution",
                "Dexterity",
                "Intelligence",
                "Strength"
        };
        for (int i = 0; i < arr.length; i++) {
            assertEquals(test[i], arr[i].toString());
        }
    }
}