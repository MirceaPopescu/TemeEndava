package game;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

enum HeroType {
    WARRIOR, MAGE, PRIEST
}

enum Direction {
    S, N, E, W
}

public abstract class Hero extends java.util.Observable {

    protected String name;
    protected List<Treasure> inventory;
    protected int posx, posy;
    ArrayList<Observer> observers;


    protected Hero(){
        observers = new ArrayList<Observer>();
        this.posx = 0;
        this.posy = 0;
    }

    /* Hero actions */
    public void move(Direction direction) {

        if (direction == Direction.E)
            posy = (posy + 1) % GameState.MAP_SIZE;
        if (direction == Direction.W)
            posy = (posy + GameState.MAP_SIZE - 1) % GameState.MAP_SIZE;
        if (direction == Direction.S)
            posx = (posx + 1) % GameState.MAP_SIZE;
        if (direction == Direction.N)
            posx = (posx + GameState.MAP_SIZE - 1) % GameState.MAP_SIZE;

        notifyObservers();

    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(){
        for(Observer o : observers){
            o.update(this, null);
        }
    }

    public void collect(Treasure treasure) {

        // TODO

    }

    public abstract void attack();


    /* Getters and setters */
    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


// Warrior
// - extra attribute: damage (aka strength)
class Warrior extends Hero {

    protected Warrior(String heroName) {
        super();
        this.name = heroName;
    }

    @Override
    public void attack() {
        System.out.println("Warrior attacks!");
    }

    public String toString(){
        return this.name + " the Warrior @" + this.posx + ", " + this.posy;
    }
}
// In this lab they don't fight, so now just implement a different toString()
// for each of them

// Priest
// - extra attribute: knowledge
class Priest extends Hero {

    public Priest(String heroName) {
        super();
        this.name = heroName;
    }

    @Override
    public void attack() {
        System.out.println("Priest attacks!");
    }

    public String toString(){
        return this.name + " the Priest @" + this.posx + ", " + this.posy;
    }
}

class Mage extends Hero {

    public Mage(String heroName) {
        super();
        this.name = heroName;
    }

    @Override
    public void attack() {
        System.out.println("Mage attacks!");
    }

    public String toString(){
        return this.name + " the Mage @" + this.posx + ", " + this.posy;
    }
}

class HeroFactory {
    private static HeroFactory instance = null;

    private HeroFactory() {
    }

    public static HeroFactory getFactoryInstance() {
        if (instance == null) {
            instance = new HeroFactory();
        }

        return instance;
    }

    public Hero createHero(HeroType type, String heroName) {
        if (type == HeroType.WARRIOR) {
            return new Warrior(heroName);
        }

        if (type == HeroType.MAGE) {
            return new Mage(heroName);
        }

        if (type == HeroType.PRIEST) {
            return new Priest(heroName);
        }

        return null;
    }
}



