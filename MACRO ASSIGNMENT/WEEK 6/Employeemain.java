class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) throws InvalidSalaryException {
        if(salary<1000) {
            throw new InvalidSalaryException("Salary cannot be less than 1000.");
        }
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }
}

class Company {
    private Employee[] pr = new Employee[10];
    private int nextIndex = 0;

    void addEmployee(Employee emp) {
        if (nextIndex == pr.length) {
            Employee[] newPr = new Employee[pr.length * 2];
            System.arraycopy(pr, 0, newPr, 0, pr.length);
            pr = newPr;
        }
        pr[nextIndex] = emp;
        nextIndex++;
    }

    void removeProduct(Employee emp)  {
        int index = -1;
        for (int i = 0; i < nextIndex; i++) {
            if (pr[i].getId() == emp.getId()) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println(" not found");
        }
        for (int i = index; i < nextIndex - 1; i++) {
            pr[i] = pr[i + 1];
        }
        pr[nextIndex - 1] = null;
        nextIndex--;
    }

    void displayEmployees() {
        for (int i = 0; i < nextIndex; i++) {
            System.out.println(pr[i].getId() + " " + pr[i].getName() + " - $" + pr[i].getSalary());
        }
    }
}

class Employeemain {
    public static void main(String[] args) {
        Company a = new Company();
        try {
            Employee e1 = new Employee(1213, "Alvin", 87349.99);
           // Employee e2 = new Employee(223, "Pshjbd", 19.99);
            a.addEmployee(e1);
            //a.addEmployee(e2);
        } catch (InvalidSalaryException e) {
            System.out.println(e);
        }
        a.displayEmployees();
    }
}
