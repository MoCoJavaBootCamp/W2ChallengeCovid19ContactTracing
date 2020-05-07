import java.util.HashMap;
import java.util.Scanner;

public class Searcher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Center for Disease Control's " +
                "COVID-19 Contact Tracing Program");
        Person patient = new Person(getInfo());
        // checkSymptoms((String) patient.personalInfo.get("name"), patient);
        checkSymptoms((String) patient.personalInfo.get("name"), patient);
    }

    public static HashMap getInfo() {
        Scanner input = new Scanner(System.in);
        HashMap<String, String> personalInfo = new HashMap<>();
        System.out.println("Enter newly infected person's information");
        System.out.println("What is the patient's name?");
        personalInfo.put("name", input.nextLine());
        System.out.println("What is the patient's phone number?");
        personalInfo.put("phone", input.nextLine());
        System.out.println("What is the patient's email?");
        personalInfo.put("email", input.nextLine());
        System.out.println("What city does the patient live in?");
        personalInfo.put("city", input.nextLine());
        System.out.println("What what state does the patient live in?");
        personalInfo.put("state", input.nextLine());
        return personalInfo;
    };

    public static HashMap checkSymptoms(String name, Person person) {
        Scanner input = new Scanner(System.in);
        String[] symptoms = {"cough", "shortness of breath or difficulty breathing",
                "tiredness", "aches", "chills", "sore throat", "loss of smell",
                "loss of taste", "headache", "diarrhea", "severe vomiting"};
        for (String symptom : symptoms) {
            System.out.printf("Does %s have any symptoms for %s? (y/n)\n", name, symptom);
            String response = input.nextLine();
            if (response.equalsIgnoreCase("y")) {
                System.out.printf("How many days has %s had symptoms for %s?\n", name, symptom);
                int length = input.nextInt();
                input.nextLine();
                person.symptoms.symptomMap.put(symptom, length);
            } else {
                person.symptoms.symptomMap.put(symptom, 0);
            }
        }
        return person.symptoms.symptomMap;
    }

    public void traceContacts() {
        // get other person's contact info
    }

    public void tracePlaces() {
        // get travel history
    }

}
