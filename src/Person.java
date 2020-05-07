import java.util.HashMap;

public class Person {
    HashMap personalInfo = new HashMap<>();
    Symptom symptoms = new Symptom();

    Person(HashMap personalInfo) {
        this.personalInfo = personalInfo;
    };

    public HashMap getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(HashMap personalInfo) {
        this.personalInfo = personalInfo;
    }

    public Symptom getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(Symptom symptoms) {
        this.symptoms = symptoms;
    }
}

/*
class Person
    HashMap personalInfo
        name
        email
        phone
        address
            city
            state
        visitedPlaces
            city
            state
        contactedPersons
            personalInfo
        Symptom

    User = new Person
    UserContact = new Person
class Symptom
    fever
    cough
    Shortness of breath or difficulty breathing
    Tiredness
    Aches
    Chills
    Sore throat
    Loss of smell
    Loss of taste
    Headache
    Diarrhea
    Severe vomiting
 */