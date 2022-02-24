package dev.ogabek.java.model;

import java.util.ArrayList;

public class Feed {

    Post post = null;

    ArrayList<Story> stories = new ArrayList<>();

    public Feed(Post post) {
        this.post = post;
    }

    public Feed(ArrayList<Story> stories) {
        this.stories = stories;
    }

    public Post getPost() {
        return post;
    }

    public ArrayList<Story> getStories() {
        return stories;
    }
}
