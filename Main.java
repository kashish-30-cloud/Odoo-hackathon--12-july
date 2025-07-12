public class Main {
    public static void main(String[] args) {
        SkillSwapPlatform platform = new SkillSwapPlatform();

        User user1 = new User("Alice", "Mumbai", "Java, Photoshop", "Python", "Evenings", true);
        User user2 = new User("Bob", "Delhi", "Python, Excel", "Photoshop", "Weekends", true);

        platform.registerUser(user1);
        platform.registerUser(user2);

        platform.sendRequest(user1, user2);
        platform.showRequests();
    }
}
