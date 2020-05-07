import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Center for Disease Control's " +
                "COVID-19 Contact Tracing Program");
        //make new patient
        Person patient = new Person();
        //set patient info
        getInfo(patient);
        String patientName = patient.getPersonalInfo("name");
        //check symptoms
        checkSymptoms(patientName, patient);
        //trace contacts
        System.out.printf("Has %s met or run into anyone else? (y/n)\n", patientName);
        String response = "y";
        response = input.nextLine();
        while (response.equalsIgnoreCase("y")) {
            traceContacts(patient, patientName);
            System.out.printf("Has %s met or run into anyone else? (y/n)\n", patientName);
            response = input.nextLine();
        }

        //print known contacts
        System.out.println("\t\tKnown Contacts:");
        patient.getKnownContacts();

        //print known locations
    }

    public static void getInfo(Person person) {
        Scanner input = new Scanner(System.in);
        HashMap<String, String> personalInfo = new HashMap<>();
        System.out.println("Enter newly infected person's information");
        System.out.println("What is the patient's full name?");
        person.setPersonalInfo("name", input.nextLine());
        System.out.println("What is the patient's phone number?");
        person.setPersonalInfo("phone", input.nextLine());
        System.out.println("What is the patient's email?");
        person.setPersonalInfo("email", input.nextLine());
        System.out.println("What city does the patient live in?");
        person.setPersonalInfo("city", input.nextLine());
        System.out.println("What what state does the patient live in?");
        person.setPersonalInfo("state", input.nextLine());
    };

    public static void checkSymptoms(String patientName, Person person) {
        Scanner input = new Scanner(System.in);
        String[] symptoms = {"cough", "shortness of breath or difficulty breathing",
                "tiredness", "aches", "chills", "sore throat", "loss of smell",
                "loss of taste", "headache", "diarrhea", "severe vomiting"};
        for (String symptom : symptoms) {
            System.out.printf("Does %s have any symptoms for %s? (y/n)\n", patientName, symptom);
            String response = input.nextLine();
            if (response.equalsIgnoreCase("y")) {
                System.out.printf("How many days has %s had symptoms for %s?\n", patientName, symptom);
                int length = input.nextInt();
                input.nextLine();
                person.setSymptoms(symptom, length);
            } else {
                person.setSymptoms(symptom, 0);
            }
        }
    }

    public static void traceContacts(Person patient, String patientName) {
        Scanner input = new Scanner(System.in);
        Person contact = new Person();
        System.out.println("What is his/her full name?");
        contact.setPersonalInfo("name", input.nextLine());
        String name = contact.getPersonalInfo("name");
        System.out.printf("What is %s's phone number?\n", name);
        contact.setPersonalInfo("phone", input.nextLine());
        System.out.printf("What is %s's email?\n", name);
        contact.setPersonalInfo("email", input.nextLine());
        System.out.printf("What city does %s live in?\n", name);
        contact.setPersonalInfo("city", input.nextLine());
        System.out.printf("What state does %s live in?\n", name);
        contact.setPersonalInfo("state", input.nextLine());
        System.out.printf("What city did %s see %s?\n", patientName, name);
        contact.setPersonalInfo("contactedCity", input.nextLine());
        System.out.printf("What state did %s see %s?\n", patientName, name);
        contact.setPersonalInfo("contactedState", input.nextLine());
        System.out.printf("When did %s see %s? (mm/dd/yyyy)\n", patientName, name);
        contact.setPersonalInfo("date", input.nextLine());
        patient.setKnownContacts(contact);
    }

//    public static void tracePlaces(Person patient) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("What is his/her name?");
//        contact.setPersonalInfo("name", input.nextLine());
//    }
}
