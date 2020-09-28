/**
 * Race.java - Class for encapsulating an individual race of ThreadRunner 
 *             objects.
 * 
 * @author Jason Schroeder
 * @created 06/21/2017
 */

import java.util.ArrayList;
import java.util.Collections;

public class Race
{
    /* Class attributes */
    private final ArrayList<ThreadRunner> racers;
    private ArrayList<Thread> threads;
    private final int numRacers;
    private final ThreadRaceFrame parent;
    private final ArrayList<Integer> startOrder;
    
    /* Class methods */
    
    /* Constructor */
    public Race(ArrayList<ThreadRunner> racers, int numRacers, 
            ThreadRaceFrame parent)
    {
        this.racers = racers;
        this.numRacers = numRacers;
        this.parent = parent;
        
        //Set ThreadRunner Race parent attribute for each instance
        for (int i = 0; i < numRacers; i++)
            racers.get(i).setParentRace(this);          
        
        //Populate ArrayList startOrder with randomly generated integers
        startOrder = getStartOrder(numRacers);
    }
    
    //Method used to start race
    public void runRace()
    {
        threads = new ArrayList<>();
        
        for (int i = 0; i < numRacers; i++)
            threads.add(new Thread(racers.get(i)));
        
        //Start threads in order determined by startOrder ArrayList
        for (int j = 0; j < numRacers; j++)
            threads.get(startOrder.get(j)).start();
    }
    
    // Public method that interrupts threads once a winner has been determined
    public synchronized void endRace()
    {
        threads.forEach((thread) ->
        {
            thread.interrupt();            
        });        
    }
    
    // Method that randomly determines start order of ThreadRacer instances
    private ArrayList<Integer> getStartOrder(int numRacers)
    {
        ArrayList<Integer> order = new ArrayList<>();
        
        for (int i = 0; i < numRacers; i++)
            order.add(i);
        
        Collections.shuffle(order);
        
        return order;
    }
}