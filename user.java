public class User {
    private String name;
    private String location;
    private String skillsOffered;
    private String skillsWanted;
    private String availability;
    private boolean isPublic;

    public User(String name, String location, String skillsOffered, String skillsWanted, String availability, boolean isPublic) {
        this.name = name;
        this.location = location;
        this.skillsOffered = skillsOffered;
        this.skillsWanted = skillsWanted;
        this.availability = availability;
        this.isPublic = isPublic;
    }

    public String getName() { return name; }
    public String getSkillsOffered() { return skillsOffered; }
    public String getSkillsWanted() { return skillsWanted; }

    @Override
    public String toString() {
        return name + " | Offers: " + skillsOffered + " | Wants: " + skillsWanted + " | Availability: " + availability;
    }
}
