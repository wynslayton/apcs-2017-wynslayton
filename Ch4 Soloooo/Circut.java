

/**
 * Write a description of class Circut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circut
{
    private int sw1, sw2;
    private boolean lstate;

    public Circut()
    {
        sw1 = 0;
        sw2 = 0;
        lstate = false;

    }
    
    public int getFirstSwitchState(){
        return sw1;
    }
    public int getSecondSwitchState(){
        return sw2;
    }
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
    public void toggleFirstSwitch(){
        sw1 = 1;
        getLampState();
    }
    public void toggleSecondSwitch(){
        sw2 = 1;
        getLampState();
    }
    public String toString(){
        String data = "Switch 1: " + sw1 + " Switch 2: " + sw2 + " Lamp State: " + lstate;
        return data;
    }

}
