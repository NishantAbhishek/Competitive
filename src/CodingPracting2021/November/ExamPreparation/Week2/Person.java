package CodingPracting2021.November.ExamPreparation.Week2;


class Driver{
    public static void main(String[] args) {
        Person person = new Person("Shivam", 20, 1000);
        System.out.println(person.getName());
        System.out.println(person.getSalary());
        System.out.println(person.getAge());
    }
}

public class Person {
    private String name;
    private int age;
    private int salary;
    
    public Person(String _name,int _age,int _salary){
        setAge(_age);
        setSalary(_salary);
        setName(_name);
    }

    public String getName(){
        return name;        
    }

    public int getAge(){
        return age;
    }

    public int getSalary(){
        return salary;
    }

    public void setAge(int age){
        if(age>0 && age<120){
            this.age = age;
        }
    }

    public void setSalary(int salary){
        if(salary>0 && salary<10000000){
            this.salary = salary;
        }
    }

    public void setName(String name){
        if(name!=null){
            this.name = name;
        }
    }

}
