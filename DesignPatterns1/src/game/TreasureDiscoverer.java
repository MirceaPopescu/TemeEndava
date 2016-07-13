package game;


import java.util.Observable;

/**
 * Observer that prints the lore of a treasure when a hero discovers it. 
 *
 */
class TreasureDiscoverer implements java.util.Observer{
    @Override
    public void update(Observable o, Object arg) {

    }
    // TODO
		// check if any hero is in an area containing a treasure
		// print some message
		// remove treasure from map and 
		// add to specific hero's inventory		
}