import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       AI CHATBOT");
        System.out.println("================================");
        System.out.println("Bot: Hello! I am your chatbot.");
        System.out.println("Bot: Type 'bye' to exit.");

        while (true) {

            System.out.print("You: ");
            String input = sc.nextLine().toLowerCase();

            String response;

            if (input.contains("hello") || input.contains("hi")) {
                response = "Hello! How can I help you?";
            }
            else if (input.contains("name")) {
                response = "My name is Java AI Chatbot.";
            }
            else if (input.contains("java")) {
                response = "Java is an object-oriented programming language.";
            }
            else if (input.contains("nlp")) {
                response = "NLP stands for Natural Language Processing.";
            }
            else if (input.contains("machine learning")) {
                response = "Machine Learning allows computers to learn from data.";
            }
            else if (input.contains("how are you")) {
                response = "I am fine. Thank you!";
            }
            else if (input.contains("thank")) {
                response = "You're welcome!";
            }
            else if (input.contains("bye")) {
                response = "Goodbye! Have a nice day.";
                System.out.println("Bot: " + response);
                break;
            }
            else {
                response = "Sorry, I don't understand. Please ask another question.";
            }

            System.out.println("Bot: " + response);
        }

        sc.close();
    }
}