public class PersonTest 
{
    public static void main(String[] args) 
    {
        Person person = new Person("Gilang");
        Person person2 = new Person("Encun");
        System.out.println(person.equals(person2));
        Person person3 = new Person("Gilang");
        System.out.println(person.equals(person3));
        person.print();
        person2.print();
        person3.print();

        Employee employee = new Employee("Ahmad", 10_000_000, 2002, "12345");
        Employee employee2 = new Employee("Budi", 7_500_000, 2012, "24242");
        System.out.println(employee.equals(employee2));
        Employee employee3 = new Employee("Budi", 7_500_000, 2012, "24242");
        System.out.println(employee3.equals(employee2));
        employee.print();
        employee2.print();
        employee3.print();
    }
}
