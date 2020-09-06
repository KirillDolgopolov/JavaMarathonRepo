package Day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions = new ArrayList<>();

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        for (User userX : subscriptions) {
            if (userX == user)
                return true;
        }
        return false;

    }

    public boolean isFriend(User user) {
        for (User userX : subscriptions) {
            if (userX == user)
                for (User userY : user.getSubscriptions()) {
                    if (userY == null) {
                        return true;
                    }
                }


        }
        return false;//Если мы не находим Юзера в нашем списке, а также себя в его списке
    }//Не работает

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
    /*public void sendMessage(User user, String text) -
    отправляет сообщение с текстом text пользователю user.
    Здесь должен использоваться статический метод из MessageDatabase.
*/
}
