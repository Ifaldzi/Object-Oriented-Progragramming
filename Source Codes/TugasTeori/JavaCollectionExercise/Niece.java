package TugasTeori.JavaCollectionExercise;

import java.time.Month;
import java.util.*;

public class Niece implements Comparable<Niece>
{
    private String name;
    private int birthDay;
    private int birthMonth;
    Map<Uncle, String> presents = new HashMap<Uncle, String>();

    public void setName(String name)
    {
        this.name = name;
    }

    public void setBirthDay(int birthDay)
    {
        this.birthDay = birthDay;
    }

    public void setBirthMonth(int birthMonth)
    {
        this.birthMonth = birthMonth;
    }

    public String getName()
    {
        return this.name;
    }

    public int getBirthDay()
    {
        return this.birthDay;
    }

    public int getBirthMonth()
    {
        return this.birthMonth;
    }

    public Map<Uncle, String> getPresents()
    {
        return this.presents;
    }

    public int clearPresents()
    {
        int totalPresent = presents.size();
        presents.clear();
        return totalPresent;
    }

    public void listPresents()
    {
        System.out.println(this.presents);
    }

    @Override
    public String toString()
    {
        return "Name: " + name + " | Birth Day: " + birthDay + "-" + birthMonth;
    }

    @Override
    public boolean equals(Object other)
    {
        if(other == this) return true;
        if(other == null) return false;
        if(getClass() != other.getClass()) return false;
        return name.equals(((Niece)other).name);
    }

    @Override
    public int hashCode()
    {
        return name.hashCode();
    }

    @Override
    public int compareTo(Niece other)
    {
        if(this.birthMonth > other.birthMonth) return 1;
        if(this.birthMonth == other.birthMonth)
        {
            return (this.birthDay > other.birthDay ? 1 : -1);
        }
        return -1;
    }
}
