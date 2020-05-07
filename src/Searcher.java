import java.util.HashMap;
import java.util.Scanner;

public class Searcher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Center for Disease Control's COVID-19 Contact Tracing Program");

    }

    public void getInfo() {
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
    };

    public void checkSymptoms(String name) {
        Scanner input = new Scanner(System.in);
        String[] symptoms = {"cough", "shortness of breath or difficulty breathing",
                "tiredness", "aches", "chills", "sore throat", "loss of smell",
                "loss of taste", "headache", "diarrhea", "severe vomiting"};
        for (int i = 0; i < symptoms.length; i += 1) {
            System.out.printf("Does %s have any symptoms for %s? (y/n)\n", name, symptoms[i]);
            String response = input.nextLine();
            if (response.equalsIgnoreCase("y")) {
                System.out.printf("How long has %s had symptoms for %s?\n", name, symptoms[i]);

            }
        }
    }

    public void traceContacts() {
        // get other person's contact info
    }

    public void tracePlaces() {
        // get travel history
    }

}
