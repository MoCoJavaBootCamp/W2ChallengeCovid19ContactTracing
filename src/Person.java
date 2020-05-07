import java.util.ArrayList;
import java.util.HashMap;

public class Person {
    HashMap personalInfo = new HashMap();
    ArrayList<Person> knownContacts = new ArrayList<>();
    ArrayList<Location> visitedPlaces = new ArrayList<>();
    ArrayList<Symptom> symptoms = new ArrayList<>();

    Person() {};

    public String getPersonalInfo(String key) {
        return (String) this.personalInfo.get(key);
    }

    public void getAllPersonalInfo() {
        System.out.printf("Name: %s\n", getPersonalInfo("name"));
        System.out.printf("Phone: %s\n", getPersonalInfo("phone"));
        System.out.printf("Email: %s\n", getPersonalInfo("email"));
        System.out.printf("Location: %s, %s\n\n",
                getPersonalInfo("city"),
                getPersonalInfo("state"));
    }

    public void setPersonalInfo(String key, String value) {
        this.personalInfo.put(key, value);
    }

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

    public void getAllSymptoms(){
        for (int i = 0; i < this.symptoms.size(); i += 1) {
            if (this.symptoms.get(i).getLength() > 0) {
                System.out.printf("\t\thad %s for %d day(s)\n",
                        this.symptoms.get(i).getSymptom(),
                        this.symptoms.get(i).getLength());
            }
        }
    };

    public void setSymptoms(String symptom, int length) {
        Symptom newSymp = new Symptom();
        newSymp.setSymptom(symptom);
        newSymp.setLength(length);
        this.symptoms.add(newSymp);
    }

    public void getVisitedPlaces() {
        for (int i = 0; i < this.visitedPlaces.size(); i += 1) {
            System.out.printf("Name: %s\n", this.visitedPlaces.get(i).getName());
            System.out.printf("Location: %s, %s\n",
                    this.visitedPlaces.get(i).getCity(),
                    this.visitedPlaces.get(i).getState());
            System.out.printf("Visit Date: %s\n\n", this.visitedPlaces.get(i).getVisitDate());
        }
    }

    public void setVisitedPlaces(Location location) {
        this.visitedPlaces.add(location);
    }
}