

/**
 * A simple circut class
 * 
 * @author Wynant Slayton 
 * @version 87b.4a
 */
public class Circut
{
    private int sw1, sw2;
    private boolean lstate;

    /**
     * This creates the object, defining both switches as 0, or off, and the lamp state as false
     * @param Nothing
     * @return nothing
     */
    public Circut()
    {
        sw1 = 0;
        sw2 = 0;
        lstate = false;

    }
    
    /**
     * This gets the state of the first switch
     * @param Nothing
     * @return int switch 1
     */
    public int getFirstSwitchState(){
        return sw1;
    }
    
    /**
     * This gets the state of the second switch
     * @param nothing
     * @return int switch 2
     */
    public int getSecondSwitchState(){
        return sw2;
    }
    /**
     * This figures out whether the lamp would be on or off and returns false if off and true if on
     * @param nothing
     * @return boolean lamp state
     */
    public boolean getLampState(){
        if ((sw1 == 0 && sw2 == 1) || (sw1 == 1 && sw2 == 0)){
            lstate = true;
            System.out.println("The lamp is on");
        }
        else{
            lstate = false;
            System.out.println("The lamp is off");
        }
        return lstate;
    }
    /**
     * This flips the first switch
     * @param nothing
     * @return void
     */
    public void toggleFirstSwitch(){
        if (sw1 == 0)
            sw1 = 1;
        else sw1 = 0;
        getLampState();
    }
    /**
     * This flips the second switch
     * @param nothing
     * @return void
     */
    public void toggleSecondSwitch(){
        if (sw2 == 0)
            sw2 = 1;
        else sw2 = 0;
        getLampState();
    }
    /**
     * This is the toString method
     * @param nothing
     * @return String switch 1 state, switch 2 state, lamp state
     */
    public String toString(){
        String data = "Switch 1: " + sw1 + " Switch 2: " + sw2 + " Lamp State: " + lstate;
        return data;
    }

}
