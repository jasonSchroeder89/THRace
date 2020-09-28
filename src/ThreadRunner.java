/**
 * ThreadRunner.java - Class used to model a racer in the application.
 * 
 * @author Jason Schroeder
 * @created 06/14/2017
 */

import java.util.Random;

public class ThreadRunner implements Runnable
{
    /* Class attributes */
    private String name;
    private int restPercentage;
    private int speed;
    private long restTime;
    private int distanceRan;
    private ThreadRaceFrame parent;
    private Race parentRace;
    private final Random randNum;
    
    /* Class methods */
    
    /* Constructor */
    public ThreadRunner(String name, int restPercentage, int speed)
    {
        this.name = name;
        this.restPercentage = restPercentage;
        this.speed = speed;
        this.restTime = 100;
        this.distanceRan = 0;
        randNum = new Random();
    }
    
    //Overriden Thread.run() method
    @Override
    public void run()
    {        
        //Roll to determine if runner should run, or rest
        //If runner runs 1000 meters, finsih race and output data
        while (distanceRan < 1000)
        {
            try
            {
                int restRoll = randNum.nextInt(101) + 1;
                
                if (restRoll < restPercentage)
                {
                    Thread.sleep(restTime);
                }
            
                else
                {
                    distanceRan += speed;
                    parent.racerOutput(writeMove());
                }
            }
            
            catch(InterruptedException e)
            {
                parent.racerOutput(name + 
                    " is out of the race, and concedes!\n");
                
                return;
            }
        }
        
        parent.finished(name, parentRace);       
    }

    /* Getter and setter methods */
    
    public String getName()
    {
        return name;
    }
    
    public int getRestPercentage()
    {
        return restPercentage;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setRestPercentage(int restPercentage)
    {
        this.restPercentage = restPercentage;
    }
    
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    
    public int getDistanceRan()
    {
        return distanceRan;
    }

    public void setDistanceRan(int distanceRan)
    {
        this.distanceRan = distanceRan;
    }
    
    public void setRestTime(long restTime)
    {
        this.restTime = restTime;
    }
    
    public long getRestTime()
    {
        return restTime;
    }
    
    public void setParent(ThreadRaceFrame trf)
    {
        parent = trf;
    }
    
    public void setParentRace(Race race)
    {
        parentRace = race;
    }
    
    //Method to send move to parent ThreadRaceFrame
    private String writeMove()
    {
        String move = name + ": " + Integer.toString(distanceRan) + "\n";
        
        return move;
    }
}