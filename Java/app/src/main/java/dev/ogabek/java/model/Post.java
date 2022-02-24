package dev.ogabek.java.model;

public class Post {

    private final int profile;
    private final int photo;
    private final String fullName;

    public Post(int profile, int photo, String fullName) {
        this.profile = profile;
        this.photo = photo;
        this.fullName = fullName;
    }

    public int getProfile() {
        return profile;
    }

    public int getPhoto() {
        return photo;
    }

    public String getFullName() {
        return fullName;
    }
}
