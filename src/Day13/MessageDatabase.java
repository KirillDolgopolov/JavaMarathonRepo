package Day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {

        messages.add(new Message(u1, u2, text));
    }

    public static void showDialog(User u1, User u2) {
        for (Message message : messages) {
            if ((message.getSender() == u1) && (message.getReciver() == u2)) {
                System.out.println(message.getSender() + " :" + message.getText());

            }
        }
    }
}
