package Oopsconcept;

public class Employee {
    int eid;
    String Name;
    int empno;
    String Position;

    void Display()
    {
        System.out.println(eid);
        System.out.println(Name);
        System.out.println(empno);
        System.out.println(Position);
    }

    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.eid=101;
        employee1.Name="john";
        employee1.empno=12;
        employee1.Position="manager";

        employee1.Display();

        Employee employee2=new Employee();
        employee2.eid=102;
        employee2.Name="kim";
        employee2.empno=10;
        employee2.Position="system eng";

        employee2.Display();
    }
}
