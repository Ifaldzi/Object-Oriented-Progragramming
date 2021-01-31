package main;

public class Student 
{
    private String name;
    private String studentCode;
    private float[] taskHoursPerDay;

    public Student(String name, String studentCode, float taskHoursPerDay[])
    {
        this.name = name;
        this.studentCode = studentCode;
        this.taskHoursPerDay = taskHoursPerDay;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setStudentCode(String studentCode)
    {
        this.studentCode = studentCode;
    }

    public String getName()
    {
        return this.name;
    }

    public String getStudentCode()
    {
        return this.studentCode;
    }

    public void setTaskHourPerDay(float[] taskHoursPerDay)
    {
        this.taskHoursPerDay = taskHoursPerDay;
    }

    public float[] getTaskHourPerDay()
    {
        return this.taskHoursPerDay;
    }
}
