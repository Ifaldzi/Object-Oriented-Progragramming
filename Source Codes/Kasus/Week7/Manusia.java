package Kasus.Week7;

public class Manusia implements Cloneable 
{
    private int imun;
    private String status_covid;
    private Covid19 corona;
    public void setImun(int imun) 
    {
        this.imun = imun;
    }
    public void setStatusCovid19() 
    {
        if(this.corona.getActive()){
        if (imun > 100) 
        {
            this.corona.setStatus("Negatif");
        } else 
        {
            this.corona.setStatus("Positif");
        }
        }else
        {
            this.corona.setStatus("Negatif");
        }
    }
    @Override
    protected Manusia clone() 
    {
        try 
        {
            return (Manusia) super.clone();
        } 
        catch (CloneNotSupportedException ex) 
        {
            return null;
        }
    }
    public void setCovid19(Covid19 corona) 
    {
        this.corona = corona;
    }
    public Covid19 getCovid19() 
    {
        return corona;
    }
}