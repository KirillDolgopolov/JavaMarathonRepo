package Day13;

public class Test {
    public static void main(String[] args) {

        User user1 = new User("Mike");
        User user2 = new User("Kate");
        User user3 = new User("John");

        user1.subscribe(user2);
        System.out.println(user1.isSubscribed(user2));
        System.out.println(user2.isSubscribed(user1));

        System.out.println(user1.isFriend(user2));
        System.out.println(user2.isFriend(user1));

        user2.subscribe(user1);
        System.out.println(user1.isSubscribed(user2));
        System.out.println(user2.isSubscribed(user1));

        System.out.println(user1.isFriend(user2));
        System.out.println(user2.isFriend(user1));

        Message m1=new Message(user1, user2, "Privet");
       MessageDatabase.sendMessage(user1,user2,"Chto eto takoe");


    }
}
