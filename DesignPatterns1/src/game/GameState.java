package game;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

import java.util.ArrayList;
import java.util.Observer;
import java.util.Random;

/**
 * Class representing the game's world. It is observable by other observer-type
 * classes.
 */
public class GameState extends java.util.Observable {
    public static final int MAP_SIZE = 5;
    // you can change how the map is created if you'd like
    public int[][] map = new int[][]
            {
                    {0, 1, 1, 1, 0},
                    {0, 0, 0, 1, 0},
                    {0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0}
            };

    private ArrayList<Hero> heroes = new ArrayList<Hero>();
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private ArrayList<Hero> party = new ArrayList<Hero>();
    private ArrayList<Treasure> treasures = new ArrayList<Treasure>();
    private boolean adventureStarted = false;

    public void populateTreasures(int numTreasures) {

        if (numTreasures > MAP_SIZE * MAP_SIZE) {
            System.err.println("Too many treasures");
            return;
        }

        TreasureFactory treasureFactory = TreasureFactory.getFactoryInstance();
        while (numTreasures > 0) {
            Treasure newTreasure = treasureFactory.createTreasure();
            Random rand = new Random();
            int i, j;

            while (1 + 1 == 2) {
                i = Math.abs(rand.nextInt()) % MAP_SIZE;
                j = Math.abs(rand.nextInt()) % MAP_SIZE;

                if (map[i][j] == 0) {
                    map[i][j] = 2;
                    break;
                }
            }

            treasures.add(newTreasure);
            numTreasures--;
        }
    }


    public ArrayList<Hero> getParty() {
        return party;
    }

    public void setParty(ArrayList<Hero> party) {
        this.party = party;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(ArrayList<Treasure> treasures) {
        this.treasures = treasures;
    }

    public boolean isAdventureStarted() {
        return adventureStarted;
    }

    public void setAdventureStarted(boolean adventureStarted) {
        this.adventureStarted = adventureStarted;
    }

    public void addObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void notifyObservers(){
        for(Observer o : observers){
            o.update(this, null);
        }
    }

    public void addHero(Hero h){
        heroes.add(h);
    }
    
    public int[][] getMap() {
        return map;
    }

    public void setMap(int[][] map) {
        this.map = map;
    }

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }
}
