public class PatientTester{

public static void main(String[] args) {

PatientManager manager = new PatientManager();

    System.out.println(manager);

manager.addPatient(new Patient(1, 100));
manager.addPatient(new Patient(2, 200));
manager.addPatient(new Patient(3, 300));
manager.addPatient(new Patient(4, 400));

    System.out.println(manager);

manager.caffeineAbsorption();

    System.out.println(manager);

manager.removePatient(2);

    System.out.println(manager);
}
}