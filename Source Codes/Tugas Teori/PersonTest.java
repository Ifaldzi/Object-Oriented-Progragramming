public class PersonTest 
{
    public static void main(String[] args) 
    {
        Person person = new Person("Gilang");
        Person person2 = new Person("Encun");
        System.out.println(person.equals(person2));
        Person person3 = new Person("Gilang");
        System.out.println(person.equals(person3));

        Employee employee = new Employee("Ahmad", 10_000_000, 2002, "12345");
        Employee employee2 = new Employee("Yadhi", 7_500_000, 2012, "24242");
        System.out.println(employee.equals(employee2));
        Employee employee3 = new Employee("Yadhi", 7_500_000, 2012, "24242");
        System.out.println(employee3.equals(employee2));
    }
}
