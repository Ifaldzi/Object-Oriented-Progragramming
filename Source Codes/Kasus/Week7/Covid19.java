package Kasus.Week7;

public class Covid19 implements Cloneable
{ 
    private boolean active; 
    private String status; 
    public void setActive(boolean act)
    { 
        this.active = act; 
    } 
    public boolean getActive()
    { 
        return active; 
    } 
    public void setStatus(String act)
    { 
        this.status = act; 
    } 
    public String getStatus()
    { 
        return status; 
    } 
    @Override 
    protected Covid19 clone() 
    { 
        try 
        { 
            return (Covid19) super.clone(); 
        } 
        catch (CloneNotSupportedException ex) 
        { 
            return null; 
        } 
    } 
}