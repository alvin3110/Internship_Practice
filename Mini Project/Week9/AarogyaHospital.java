
import java.util.*;

class Patient {
  private static int nextId = 1;
  
  private int id;
  private String name;
  private int age;
  private String gender;
  private String aadharNumber;
  private String contactNumber;
  private String city;
  private String address;
  private Date dateOfAdmission;
  private String guardianName;
  private String guardianAddress;
  private String guardianContactNumber;
  private boolean recovered;
  
  public Patient(String name, int age, String gender, String aadharNumber, String contactNumber,String city, String address, String guardianName, String guardianAddress,String guardianContactNumber)  {
    this.id = nextId++;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.aadharNumber = aadharNumber;
    this.contactNumber = contactNumber;
    this.city = city;
    this.address = address;
    this.dateOfAdmission = new Date();
    this.guardianName = guardianName;
    this.guardianAddress = guardianAddress;
    this.guardianContactNumber = guardianContactNumber;
    this.recovered = false;
  }
  
  int getId() {
    return id;
  }
  
  String getName() {
    return name;
  }
  
  
  int getAge() {
    return age;
  }
  
  String getGender() {
    return gender;
  }
  
  String getAadharNumber() {
    return aadharNumber;
  }
  
  String getContactNumber() {
    return contactNumber;
  }
  
  String getCity() {
    return city;
  }
  
  String getAddress() {
    return address;
  }
  
  Date getDateOfAdmission() {
    return dateOfAdmission;
  }
  
  String getGuardianName() {
    return guardianName;
  }
  
  String getGuardianAddress() {
    return guardianAddress;
  }
  
  String getGuardianContactNumber() {
    return guardianContactNumber;
  }
  
  boolean isRecovered() {
    return recovered;
  }
  void setName(String name){
    this.name=name;
  }
  void setAge(int age){
    this.age=age;
  }
  
  
  void setGender(String gender) {
    this.gender = gender;
  }
  
  void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
  }
  
  void setCity(String city) {
    this.city = city;
  }
  void setAadharNumber( String aadharNumber){
    this.aadharNumber=aadharNumber;
  }
  
  void setAddress(String address) {
    this.address = address;
  }
  
  void setDateOfAdmission(Date dateOfAdmission) {
    this.dateOfAdmission = dateOfAdmission;
  }
  
  void setGuardianName(String guardianName) {
    this.guardianName = guardianName;
  }

  void setGaurdianContactNumber(String gaurdianContactNumber){
    this.guardianContactNumber=gaurdianContactNumber;
  }
  
  void setGuardianAddress(String guardianAddress) {
    this.guardianAddress = guardianAddress;
  }
  
  void setGuardianContactNumber(String guardianContactNumber) {
    this.guardianContactNumber = guardianContactNumber;
  }
  public void setRecovered(boolean recovered) {
    this.recovered = recovered;
  }
  public void displayPatientDetails() {
    System.out.println("Name: " + getName());
    System.out.println("Age: " + getAge());
    System.out.println("Gender: " + getGender());
    System.out.println("Aadhar number: " + getAadharNumber());
    System.out.println("Contact number: " + getContactNumber());
    System.out.println("City: " + getCity());
    System.out.println("Address: " + getAddress());
    System.out.println("Date of admission: " + getDateOfAdmission());
    System.out.println("Guardian name: " + getGuardianName());
    System.out.println("Guardian address: " + getGuardianAddress());
    System.out.println("Guardian contact number: " + getGuardianContactNumber());
    System.out.println("Unique ID: " + getId());
    System.out.println("Recovered: " + isRecovered());
  }
}

class PatientManagementSystem {
  Scanner sc=new Scanner(System.in);
  private ArrayList<Patient> patientList= new ArrayList<Patient>();
  
  void addPatient(String name, int age, String gender, String aadharNumber, String contactNumber, String city, String address, String guardianName, String guardianAddress, String guardianContactNumber) throws IllegalArgumentException {
        // Validate user entered data
    if (age < 1 || age > 99) {
      throw new IllegalArgumentException("Age should be between 1 and 99");
    }
    if (aadharNumber.length() != 12) {
      throw new IllegalArgumentException("Aadhar Card number should contain 12 digits only");
    }
    if (contactNumber.length() != 10) {
      throw new IllegalArgumentException("Contact number should contain 10 digits only");
    }
    Patient patient = new Patient(name, age, gender, aadharNumber, contactNumber, city, address, guardianName, guardianAddress, guardianContactNumber);
    patientList.add(patient);
    System.out.println("Patient added with id: " + patient.getId());
  }
  public Patient getPatientById(int id) {
    for (Patient patient : patientList) {
      if (patient.getId() == id) {
        return patient;
      }
    }
    return null;
  }
  public List<Patient> getPatientsByName(String name) {
    List<Patient> patients = new ArrayList<>();
    for (Patient patient : patientList) {
      if (patient.getName().equals(name)) {
        patients.add(patient);
      }
    }
    return patients;
  }
  public List<Patient> getPatientsByCity(String city) {
    List<Patient> patients = new ArrayList<>();
    for (Patient patient : patientList) {
      if (patient.getCity().equals(city)) {
        patients.add(patient);
      }
    }
    return patients;
  }
  public List<Patient> getPatientsByAgeGroup(int startAge, int endAge) {
    List<Patient> patients = new ArrayList<>();
    for (Patient patient : patientList) {
      int age = patient.getAge();
      if (age >= startAge && age <= endAge) {
        patients.add(patient);
      }
    }
    return patients;
  }
  public void markPatientAsRecovered(int id) throws NullPointerException 
  {
    Patient patient = getPatientById(id);
    //System.out.println(patient.isRecovered());
    if (patient == null) {
      throw new NullPointerException("Patient with id " + id + " not found");
    }
    else if (patient.isRecovered()==true) {
      System.out.println("Patient is already marked as recovered");
    } 
    else 
    {
      patient.setRecovered(true);
      System.out.println("Patient marked as recovered");
    }
  }

  public void deletePatient(int id) throws NullPointerException {
    Patient patient = getPatientById(id);
    if (patient == null) {
      throw new NullPointerException("Patient with id " + id + " not found");
    }
    patientList.remove(patient);
    System.out.println("Patient with id " + id + " deleted");
  }
  
  public void updatePatientDetails(int id) {
    Patient patient = getPatientById(id);
    if (patient != null) {
      System.out.println("Enter updated details for patient " + patient.getName() +" (Enter '-' to leave a field unchanged): ");
      System.out.print("Name: ");
      String name = sc.nextLine();
      if (!name.equals("-")) {
        patient.setName(name);
      }
      System.out.print("Age: ");
      String ageStr = sc.nextLine();
      if (!ageStr.equals("-")) {
        int age = Integer.parseInt(ageStr);
        if (age < 1 || age > 99) {
          throw new IllegalArgumentException("Age should be between 1 and 99");
        }
        patient.setAge(age);
      }
      System.out.print("Gender: ");
      String gender = sc.nextLine();
      if (!gender.equals("-")) {
        patient.setGender(gender);
      }
      System.out.print("Aadhar Number: ");
      String aadharNumber = sc.nextLine();
      if (!aadharNumber.equals("-")) {
        if (aadharNumber.length() != 12) {
          throw new IllegalArgumentException("Aadhar number should be of 12 digits");
        }
        patient.setAadharNumber(aadharNumber);
      }
      System.out.print("Contact Number: ");
      String contactNumber = sc.nextLine();
      if (!contactNumber.equals("-")) {
        if (contactNumber.length() != 10) {
          throw new IllegalArgumentException("Contact number should be of 10 digits");
        }
        patient.setContactNumber(contactNumber);
      }
      System.out.print("City: ");
      String city = sc.nextLine();
      if (!city.equals("-")) {
        patient.setCity(city);
      }
      System.out.print("Address: ");
      String address = sc.nextLine();
      if (!address.equals("-")) {
        patient.setAddress(address);
      }
      System.out.print("Guardian Name: ");
      String guardianName = sc.nextLine();
      if (!guardianName.equals("-")) {
        patient.setGuardianName(guardianName);
      }
      System.out.print("Guardian Address: ");
      String guardianAddress = sc.nextLine();
      if (!guardianAddress.equals("-")) {
        patient.setGuardianAddress(guardianAddress);
      }
      System.out.print("Guardian Contact Number: ");
      String guardianContactNumber = sc.nextLine();
      if (!contactNumber.equals("-")) {
        if (contactNumber.length() != 10) {
          throw new IllegalArgumentException("Contact number should be of 10 digits");
        }
        patient.setGaurdianContactNumber(guardianContactNumber);
      }
      System.out.println("Patient details updated successfully.");
    }
    else
    {
      System.out.println("Patient with ID " + id + " not found");
    }
  }
  void displayPatients() {
    if (patientList.size() == 0) {
      System.out.println("No patients found");
    } 
    else
    {
      System.out.println("List of patients:");
      for (Patient patient : patientList) {
        System.out.println("Id: " + patient.getId());
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Gender: " + patient.getGender());
        System.out.println("Aadhar Number: " + patient.getAadharNumber());
        System.out.println("Contact Number: " + patient.getContactNumber());
        System.out.println("City: " + patient.getCity());
        System.out.println("Address: " + patient.getAddress());
        System.out.println("Date of Admission: " + patient.getDateOfAdmission());
        System.out.println("Guardian Name: " + patient.getGuardianName());
        System.out.println("Guardian Address: " + patient.getGuardianAddress());
        System.out.println("Guardian Contact Number: "+patient.getGuardianContactNumber());
        System.out.println("Recovered: " + patient.isRecovered());
        System.out.println();
      }
    }
  }
}

public class AarogyaHospital{
  public static void main(String[] args) {
    PatientManagementSystem patientSystem = new PatientManagementSystem();
    Scanner sc = new Scanner(System.in);
    boolean exit = false;
    while (!exit) {
      System.out.println("Aarogya Hospital:Patient Management System(Team 5)");
      System.out.println("1. Add Patient");
      System.out.println("2. Search Patient by ID");
      System.out.println("3. Search Patient by Name");
      System.out.println("4. Search Patient by City");
      System.out.println("5. Search Patient by Age Group");
      System.out.println("6. Mark Patient as Recovered");
      System.out.println("7. Display Patient List");
      System.out.println("8. Update Patient Records");
      System.out.println("9. Delete Patient Records");
      System.out.println(" Enter 0 to Exit");
      System.out.print("Enter your choice: ");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          System.out.print("Enter patient name: ");
          String name = sc.next();
          System.out.print("Enter patient age: ");
          int age = sc.nextInt();
          System.out.print("Enter patient gender: ");
          String gender = sc.next();
          System.out.print("Enter patient Aadhar Card number: ");
          String aadharNumber = sc.next();
          System.out.print("Enter patient contact number: ");
          String contactNumber = sc.next();
          System.out.print("Enter patient city: ");
          String city = sc.next();
          System.out.print("Enter patient address: ");
          String address = sc.next();
          System.out.print("Enter patient guardian name: ");
          String guardianName = sc.next();
          System.out.print("Enter patient guardian address: ");
          String guardianAddress = sc.next();
          System.out.print("Enter patient guardian contact number: ");
          String guardianContactNumber = sc.next();
          try {
            patientSystem.addPatient(name, age, gender, aadharNumber, contactNumber, city, address, guardianName, guardianAddress, guardianContactNumber);
          } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
          }
          break;
        case 2:
          System.out.print("Enter patient ID: ");
          int id = sc.nextInt();
          Patient patient = patientSystem.getPatientById(id);
          if (patient != null) {
            System.out.println("Patient found:");
            System.out.println(patient);
          } else {
            System.out.println("Patient not found");
          }
          break;
        case 3:
          System.out.print("Enter patient name: ");
          String patientName = sc.next();
          List<Patient> patientsByName = patientSystem.getPatientsByName(patientName);
          if (patientsByName.size() > 0) {
            System.out.println("Patients found:");
            for (Patient p : patientsByName) {
              p.displayPatientDetails();
            }
          } else {
            System.out.println("No patients found");
          }
          break;
        case 4:
          System.out.print("Enter patient city: ");
          String patientCity = sc.next();
          List<Patient> patientsByCity = patientSystem.getPatientsByCity(patientCity);
          if (patientsByCity.size() > 0) {
            System.out.println("Patients found:");
            for (Patient p : patientsByCity) {
              p.displayPatientDetails();
            }
          } else {
            System.out.println("No patients found");
              
          }
          break;
        case 5:
          System.out.print("Enter start age: ");
          int startAge = sc.nextInt();
          System.out.print("Enter end age: ");
          int endAge = sc.nextInt();
          List<Patient>patientsByAgeGroup=patientSystem.getPatientsByAgeGroup(startAge,endAge);
          if (patientsByAgeGroup.size() > 0) {
            System.out.println("Patients found:");
            for (Patient p : patientsByAgeGroup) {
              p.displayPatientDetails();
            }
          } else {
            System.out.println("No patients found");
          }
          break;
        case 6:
          System.out.print("Enter patient ID: ");
          int recoverId = sc.nextInt();
          patientSystem.markPatientAsRecovered(recoverId);
          break;
        case 7:
          patientSystem.displayPatients();
          break;
        case 8:
          System.out.print("Enter patient ID: ");
          int pid = sc.nextInt();
          patientSystem.updatePatientDetails(pid);
          break;
        case 9:
          int did=sc.nextInt();
          patientSystem.deletePatient(did);
          break;
        case 0:
          System.out.println("Exiting program...");
          exit = true;
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }
    }
  }
}
          

       
