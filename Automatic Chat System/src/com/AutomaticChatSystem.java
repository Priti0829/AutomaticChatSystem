package com;
import java.util.Scanner;
public class AutomaticChatSystem {

    public static String getIntent(String msg) {
        msg = msg.toLowerCase();

        if (msg.contains("hi") || msg.contains("hello") || msg.contains("hey")) {
            return "greeting";

        } else if (msg.contains("name")) {
            return "ask_name";

        } else if (msg.contains("bye")) {
            return "goodbye";

        } else if (msg.contains("thank")) {
            return "thanks";

        } else {
            return "unknown";
        }
    }

    public static String getReply(String intent) {

        switch (intent) {
            case "greeting":
                return "Hello! How can I help you?";

            case "ask_name":
                return "I am Mini Chat Bot.";

            case "goodbye":
                return "Bye! Take care!";

            case "thanks":
                return "You're welcome!";

            default:
                return "Sorry, I didn't understand that.";
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Mini Automatic Chat System Started...");

        while (true) {
            System.out.print("You: ");
            String userMsg = sc.nextLine();

            // Step 1 → Detect Intent
            String intent = getIntent(userMsg);

            // Step 2 → Generate reply
            String reply = getReply(intent);

            // Step 3 → Print reply
            System.out.println("Bot: " + reply);

            if (intent.equals("goodbye")) break;
        }

        sc.close();
    }
}
