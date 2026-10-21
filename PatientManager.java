import java.util.ArrayList;

public class PatientManager{
    public ArrayList<Patient> patients;

    public PatientManager(){
        patients = new ArrayList<>(); // used quickfix ... had ArrayList<Patient>() and it gave warning
    }

    public int addPatient(Patient p){
        patients.add(p);
        return patients.size()-1;
    }
    public Patient removePatient(int index) {
        return patients.remove(index);
    }

    public void caffeineAbsorption() {
        for (int i = patients.size() - 1; i >= 0; i--) {
            Patient p = patients.get(i);
            p.caffeineLevel -= 140; 
            
            if (p.caffeineLevel <= 0) {
                patients.remove(i);
            }
        }
    }

}
