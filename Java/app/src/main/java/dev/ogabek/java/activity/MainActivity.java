package dev.ogabek.java.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import dev.ogabek.java.R;
import dev.ogabek.java.adapter.FeedAdapter;
import dev.ogabek.java.model.Feed;
import dev.ogabek.java.model.Post;
import dev.ogabek.java.model.Story;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new FeedAdapter(this, getAllFeeds()));
    }

    private ArrayList<Feed> getAllFeeds() {
        ArrayList<Feed> feeds = new ArrayList<>();

        ArrayList<Story> stories = new ArrayList<>();
        stories.add(new Story(R.drawable.bogibek, "Bogibek"));
        stories.add(new Story(R.drawable.ogabekdev, "OgabekDev"));
        stories.add(new Story(R.drawable.aziz, "Aziz"));
        stories.add(new Story(R.drawable.elmurod, "Elmurod"));
        stories.add(new Story(R.drawable.jabbor, "Jabbor"));
        stories.add(new Story(R.drawable.jonibek, "Jonibek"));
        stories.add(new Story(R.drawable.shakhriyor, "Shakhriyor"));
        stories.add(new Story(R.drawable.yahyo, "Yahyo"));

        feeds.add(new Feed(stories));

        feeds.add(new Feed(new Post(R.drawable.bogibek, R.drawable.post_1, "bogibek")));
        feeds.add(new Feed(new Post(R.drawable.ogabekdev, R.drawable.post_2, "ogabekdev")));
        feeds.add(new Feed(new Post(R.drawable.aziz, R.drawable.post_3, "aziz")));
        feeds.add(new Feed(new Post(R.drawable.elmurod, R.drawable.post_4, "elmurod")));
        feeds.add(new Feed(new Post(R.drawable.jabbor, R.drawable.post_3, "jabbor")));
        feeds.add(new Feed(new Post(R.drawable.jonibek, R.drawable.post_2, "jonibek")));
        feeds.add(new Feed(new Post(R.drawable.shakhriyor, R.drawable.post_1, "shakhriyor")));
        feeds.add(new Feed(new Post(R.drawable.yahyo, R.drawable.post_2, "yahyo")));
        feeds.add(new Feed(new Post(R.drawable.bogibek, R.drawable.post_1, "bogibek")));
        feeds.add(new Feed(new Post(R.drawable.ogabekdev, R.drawable.post_2, "ogabekdev")));
        feeds.add(new Feed(new Post(R.drawable.aziz, R.drawable.post_3, "aziz")));
        feeds.add(new Feed(new Post(R.drawable.elmurod, R.drawable.post_4, "elmurod")));
        feeds.add(new Feed(new Post(R.drawable.jabbor, R.drawable.post_3, "jabbor")));
        feeds.add(new Feed(new Post(R.drawable.jonibek, R.drawable.post_2, "jonibek")));
        feeds.add(new Feed(new Post(R.drawable.shakhriyor, R.drawable.post_1, "shakhriyor")));
        feeds.add(new Feed(new Post(R.drawable.yahyo, R.drawable.post_2, "yahyo")));

        return feeds;
    }
}