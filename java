import java.util.ArrayList;
import java.util.List;

// Superclass
abstract class Employee {
    public abstract void work();
}

// First subclass
class Teacher extends Employee {
    @Override
    public void work() {
        System.out.println("Teacher: I teach students.");
    }
}

// Second subclass
class Doctor extends Employee {
    @Override
    public void work() {
        System.out.println("Doctor: I help patients.");
    }
}

// Third subclass
class Chef extends Employee {
    @Override
    public void work() {
        System.out.println("Chef: I prepare food.");
    }
}

// Fourth subclass added later
class Driver extends Employee {
    @Override
    public void work() {
        System.out.println("Driver: I transport people.");
    }
}

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Teacher());
        employees.add(new Doctor());
        employees.add(new Chef());

        // Added fourth subclass
        employees.add(new Driver());

        // Same loop works for every subclass
        for (Employee employee : employees) {
            employee.work();
        }
    }
}
