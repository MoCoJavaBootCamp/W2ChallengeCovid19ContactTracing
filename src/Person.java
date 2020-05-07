import java.util.ArrayList;
import java.util.HashMap;

public class Person {
    HashMap personalInfo = new HashMap();
    ArrayList<Person> knownContacts = new ArrayList<>();
//    ArrayList<String>
    Symptom symptoms = new Symptom();


    Person() {};

    public String getPersonalInfo(String key) {
        return (String) this.personalInfo.get(key);
    }

//    public String getAllPersonalInfo() {
//        //
//    }

    public void setPersonalInfo(String key, String value) {
        this.personalInfo.put(key, value);
    }

    // retrieve known contacts from array list
    // get each person, use person methods to get info
    public void getKnownContacts() {
        for (int i = 0; i < knownContacts.size(); i += 1) {
            System.out.printf("Name: %s\n", knownContacts.get(i).getPersonalInfo("name"));
            System.out.printf("Phone: %s\n", knownContacts.get(i).getPersonalInfo("phone"));
            System.out.printf("Email: %s\n", knownContacts.get(i).getPersonalInfo("email"));
            System.out.printf("City: %s\n", knownContacts.get(i).getPersonalInfo("city"));
            System.out.printf("State: %s\n", knownContacts.get(i).getPersonalInfo("state"));
            System.out.printf("Contacted Location: %s, %s\n",
                    knownContacts.get(i).getPersonalInfo("contactedCity"),
                    knownContacts.get(i).getPersonalInfo("contactedState"));
            System.out.printf("Contacted Date: %s\n\n", knownContacts.get(i).getPersonalInfo("date"));
        }
    }

    public void setKnownContacts(Person person) {
        this.knownContacts.add(person);
    }

    public int getSymptoms(String key) {
        return symptoms.symptomMap.get(key);
    }

    // getAllSymptoms(){};

    public void setSymptoms(String symptom, int length) {
        this.symptoms.symptomMap.put(symptom, length);
    }
}