//Create a program that simulates an organization with different types of employees and departments. The program should have the following classes/interfaces:

//Employee - This is an abstract class that has the properties of an employee such as name, age, salary, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them.

//Department - This is an abstract class that has the properties of a department such as name, budget, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them. It should also have an interface named "Operation" that has a method named "performOperation" which will be implemented by different department operations such as hiring, firing, budget allocation, etc.

//Manager - This is a derived class of the Employee class. It should have additional properties such as team, department, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them.

//Developer - This is a derived class of the Employee class. It should have additional properties such as technology, experience, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them.

//Marketing - This is a derived class of the Department class. It should have additional properties such as campaigns, events, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them. It should also implement the "Operation" interface with a method implementation of the "performOperation" method that will simulate marketing campaigns and events.

//IT - This is a derived class of the Department class. It should have additional properties such as technology, infrastructure, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them. It should also implement the "Operation" interface with a method implementation of the "performOperation" method that will simulate IT operations such as hiring, firing, and budget allocation.

//In the main method, create objects of different types of employees and departments, and simulate employee management and department operations by calling the "performOperation" method of the respective department.


abstract class Employee {
  private String name;
  private int age;
  private double salary;

  public Employee(String name, int age, double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}


class Manager extends Employee {
  private String department;
  private String team;

  public Manager(String name, int age, double salary, String department, String team) {
    super(name, age, salary);
    this.department = department;
    this.team = team;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }
}

class Developer extends Employee {
  private String technology;
  private int experience;

  public Developer(String name, int age, double salary, String technology, int experience) {
    super(name, age, salary);
    this.technology = technology;
    this.experience = experience;
  }

  public String getTechnology() {
    return technology;
  }

  public void setTechnology(String technology) {
    this.technology = technology;
  }

  public int getExperience() {
    return experience;
  }

  public void setExperience(int experience) {
    this.experience = experience;
  }
}

abstract class Department {
  private String name;
  private double budget;

  public Department(String name, double budget) {
    this.name = name;
    this.budget = budget;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBudget() {
    return budget;
  }

  public void setBudget(double budget) {
    this.budget = budget;
  }

  public interface Operation {
    void performOperation();
  }
}

class Marketing extends Department implements Department.Operation {
  private String campaigns;
  private String events;

  public Marketing(String name, double budget, String campaigns, String events) {
    super(name, budget);
    this.campaigns = campaigns;
    this.events = events;
  }

  public String getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(String campaigns) {
    this.campaigns = campaigns;
  }

  public String getEvents() {
    return events;
  }

  public void setEvents(String events) {
    this.events = events;
  }

  public void performOperation() {
    System.out.println("Performing marketing operation: " + campaigns + ", " + events);
  }
}

class IT extends Department implements Department.Operation {
  private String technology;
  private String infrastructure;

  public IT(String name, double budget, String technology, String infrastructure) {
    super(name, budget);
    this.technology = technology;
    this.infrastructure = infrastructure;
  }
}
class Organization{
  public static void main(String[] args) {
    
    Marketing marketing = new Marketing("Marketing", 1000000, "Ad campaigns", "Product launch event");


    
    Manager marketingManager = new Manager("John Doe", 35, 80000, "Marketing", "Marketing Team");

    
    Developer itDeveloper = new Developer("Jane Smith", 23,60000, "Java, Python", 5 );
    
    IT it = new IT("IT", 2000000, "Java,Python", "Software development");

    
    marketing.performOperation();

    
    it.performOperation();

    
    it.performOperation();

    
    marketing.performOperation();

    
    System.out.println(marketing);
    System.out.println(marketingManager);
    System.out.println(itDeveloper);
    System.out.println(it);
  }
}
//This program models an organization with employees and departments. It includes classes for Employee and Department, with additional subclasses for Manager and Developer, and subclasses for Marketing and IT departments. The program simulates employee management and department operations.
