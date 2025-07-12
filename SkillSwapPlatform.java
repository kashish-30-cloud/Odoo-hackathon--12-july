import java.util.*;

public class SkillSwapPlatform {
    private List<User> users = new ArrayList<>();
    private List<SwapRequest> requests = new ArrayList<>();

    public void registerUser(User user) {
        users.add(user);
    }

    public List<User> searchBySkill(String skill) {
        List<User> results = new ArrayList<>();
        for (User user : users) {
            if (user.getSkillsOffered().toLowerCase().contains(skill.toLowerCase())) {
                results.add(user);
            }
        }
        return results;
    }

    public void sendRequest(User from, User to) {
        SwapRequest request = new SwapRequest(from, to);
        requests.add(request);
    }

    public void showRequests() {
        for (SwapRequest r : requests) {
            System.out.println(r);
        }
    }
}
