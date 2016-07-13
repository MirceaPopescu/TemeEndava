package game;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class representing a "treasure". The map contains treasures that the heroes
 * will collect.
 * <p>
 * The treasures have a special story(lore) associated with them.
 */
public class Treasure {

    protected String name;
    protected String lore;
    protected int posx, posy;

    protected Treasure(String name, String lore) {
        this.name = name;
        this.lore = lore;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }
}

/**
 * Builds random treasure objects. Hides the treasure creation mechanism using
 * a factory method.
 */
class TreasureFactory {
    private static TreasureFactory instance = null;
    // ideas for treasure names and lore:
    private final String[] names = {"Sword of Justice",
            "Leg of St Andrew",
            "Rabbit's Foot",
            "5-leaf Clover",
            "Shield of the Wise"};

    ;
    private final String[] lore = {"it looks quite old",
            "you've heard of this before",
            "tales of this legendary item are told in each tavern"};

    private TreasureFactory() {
    }

    public static TreasureFactory getFactoryInstance() {
        if (instance == null) {
            instance = new TreasureFactory();
        }

        return instance;
    }

    public Treasure createTreasure() {
        Random rand = new Random();
        int i = Math.abs(rand.nextInt()) % this.names.length;
        int j = Math.abs(rand.nextInt()) % this.lore.length;
        Treasure newTreasure = new Treasure(names[i], lore[j]);
        return newTreasure;
    }
}