package Character;

import Character.Job.*;
import Character.Race.*;
import Character.Stat.*;

public class Character {

    private String name;
    private Race race;
    private Job job;
    private Stat dexterity;
    private Stat constitution;
    private Stat intelligence;
    private Stat strength;

    public Character(String name, Race race, Job job) {
        this.name = name;
        this.race = race;
        this.job = job;
        dexterity = new Dexterity(5);
        constitution = new Constitution(5);
        intelligence = new Intelligence(5);
        strength = new Strength(5);
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public Job getJob() {
        return job;
    }

    public double velocity() {
        return (dexterity.getValue() + race.modifier(dexterity) + job.modifier(dexterity))*2;
    }

    public double power() {
        return (strength.getValue() + race.modifier(strength) + job.modifier(strength))*2;
    }

    public double magic() {
        return (intelligence.getValue() + race.modifier(intelligence) + job.modifier(intelligence))*2;
    }

    public double health() {
        return (constitution.getValue() + race.modifier(constitution) + job.modifier(constitution))*10;
    }

    @Override
    public String toString() {
        return "My name is " + name + ". I'm an " + race + job + ". My Stats are:" +
                "\nStrength: " + strength +
                "\nDexterity: " + dexterity +
                "\nConstitution: " + constitution +
                "\nIntelligence: " + intelligence +
                "\nVelocity: " + velocity() +
                "\nPower: " + power() +
                "\nMagic: " + magic() +
                "\nHealth: " + health();
    }
}
