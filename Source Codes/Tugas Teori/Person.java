public class Person 
{
    private String name;

	public Person()
	{
		name = "No name yet.";
	}
	public Person(String n)
	{
		name = n;
	}
	public void setName(String newName)
	{
		name = newName;
	}
	public String getName()
	{
		return name;
	}
	public void print()
	{
		System.out.println("Name: " + name);
	}
	public boolean equals(Object p)
	{
        if(p==this) return true;
        if(p == null) return false;
        if(p.getClass() != this.getClass()) return false;
        Person other = (Person) p;
        return name.equals(other.name);
	}  
}
