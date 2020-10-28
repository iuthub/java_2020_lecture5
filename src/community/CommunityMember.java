package community;

public class CommunityMember {
    private String fullName;

    public CommunityMember(String fullName) {
//        super();
        this.fullName = fullName;
    }

    public String getNameTag() {
        return this.fullName;
    }

    protected String greet() {
        return "Hello";
    }
}