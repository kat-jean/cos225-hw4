import java.util.ArrayList;

public class PatientManager {
    public ArrayList<Patient> patients;

    public PatientManager(){
        patients = new ArrayList<>(); // used quickfix ... had ArrayList<Patient>() and it gave warning
    }

    public int addPatient(Patient p){
        patients.add(p);
        return patients.size()-1;
    }



}
