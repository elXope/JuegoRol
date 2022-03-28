package Character.Race;

import org.junit.jupiter.api.Test;
import Character.Stat.*;

import static org.junit.jupiter.api.Assertions.*;

class RaceTest {

    @Test
    void modifier() {
        Race human = new Human();
        Race elf = new Elf();
        Race orc = new Orc();
        Race triton = new Triton();
        Race mule = new Mule();

        Stat dex = new Dexterity(0);
        Stat con = new Constitution(0);
        Stat intel = new Intelligence(0);
        Stat str = new Strength(0);

        int[] expectedHuman = { 1, 2, 0, 2};
        int[] expectedElf = { 3, -1, 3, 0};
        int[] expectedOrc = { 0, 3, -3, 5};
        int[] expectedTriton = { 0, -2, 10, -3};
        int[] expectedMule = { -5, 8, 0, 2};

        int[] valueHuman = {
                human.modifier(dex),
                human.modifier(con),
                human.modifier(intel),
                human.modifier(str)
        };
        int[] valueElf = {
                elf.modifier(dex),
                elf.modifier(con),
                elf.modifier(intel),
                elf.modifier(str)
        };
        int[] valueOrc = {
                orc.modifier(dex),
                orc.modifier(con),
                orc.modifier(intel),
                orc.modifier(str)
        };
        int[] valueTriton = {
                triton.modifier(dex),
                triton.modifier(con),
                triton.modifier(intel),
                triton.modifier(str)
        };
        int[] valueMule = {
                mule.modifier(dex),
                mule.modifier(con),
                mule.modifier(intel),
                mule.modifier(str)
        };

        assertArrayEquals(expectedHuman, valueHuman);
        assertArrayEquals(expectedElf, valueElf);
        assertArrayEquals(expectedOrc, valueOrc);
        assertArrayEquals(expectedTriton, valueTriton);
        assertArrayEquals(expectedMule, valueMule);
    }

    @Test
    void testEquals() {
        Race human = new Human();
        Race elf = new Elf();
        Race orc = new Orc();
        Race triton = new Triton();
        Race mule = new Mule();

        assertEquals(human, new Human());
        assertEquals(elf, new Elf());
        assertEquals(orc, new Orc());
        assertEquals(triton, new Triton());
        assertEquals(mule, new Mule());

        assertNotEquals(human, new Elf());
        assertNotEquals(human, new Orc());
        assertNotEquals(human, new Triton());
        assertNotEquals(human, new Mule());

        assertNotEquals(elf, new Human());
        assertNotEquals(elf, new Orc());
        assertNotEquals(elf, new Triton());
        assertNotEquals(elf, new Mule());

        assertNotEquals(orc, new Elf());
        assertNotEquals(orc, new Human());
        assertNotEquals(orc, new Triton());
        assertNotEquals(orc, new Mule());

        assertNotEquals(triton, new Elf());
        assertNotEquals(triton, new Orc());
        assertNotEquals(triton, new Human());
        assertNotEquals(triton, new Mule());

        assertNotEquals(mule, new Elf());
        assertNotEquals(mule, new Orc());
        assertNotEquals(mule, new Triton());
        assertNotEquals(mule, new Human());
    }

    @Test
    void testToString() {
        Race human = new Human();
        Race elf = new Elf();
        Race orc = new Orc();
        Race triton = new Triton();
        Race mule = new Mule();

        assertEquals("Human", human.toString());
        assertEquals("Elf", elf.toString());
        assertEquals("Orc", orc.toString());
        assertEquals("Triton", triton.toString());
        assertEquals("Mule", mule.toString());
    }
}