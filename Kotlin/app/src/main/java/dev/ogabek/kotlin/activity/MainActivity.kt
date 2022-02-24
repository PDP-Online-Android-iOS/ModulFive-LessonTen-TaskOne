package dev.ogabek.kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.adapter.FeedAdapter
import dev.ogabek.kotlin.model.Feed
import dev.ogabek.kotlin.model.Post
import dev.ogabek.kotlin.model.Story

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false))
        recyclerView.setAdapter(FeedAdapter(this, allFeeds()))
    }

    private fun allFeeds(): ArrayList<Feed> {
        val feeds: ArrayList<Feed> = ArrayList()
        val stories: ArrayList<Story> = ArrayList()
        stories.add(Story(R.drawable.bogibek, "Bogibek"))
        stories.add(Story(R.drawable.ogabekdev, "OgabekDev"))
        stories.add(Story(R.drawable.aziz, "Aziz"))
        stories.add(Story(R.drawable.elmurod, "Elmurod"))
        stories.add(Story(R.drawable.jabbor, "Jabbor"))
        stories.add(Story(R.drawable.jonibek, "Jonibek"))
        stories.add(Story(R.drawable.shakhriyor, "Shakhriyor"))
        stories.add(Story(R.drawable.yahyo, "Yahyo"))

        feeds.add(Feed(stories))

        feeds.add(Feed(Post(R.drawable.bogibek, R.drawable.post_1, "bogibek")))
        feeds.add(Feed(Post(R.drawable.ogabekdev, R.drawable.post_2, "ogabekdev")))
        feeds.add(Feed(Post(R.drawable.aziz, R.drawable.post_3, "aziz")))
        feeds.add(Feed(Post(R.drawable.elmurod, R.drawable.post_4, "elmurod")))
        feeds.add(Feed(Post(R.drawable.jabbor, R.drawable.post_3, "jabbor")))
        feeds.add(Feed(Post(R.drawable.jonibek, R.drawable.post_2, "jonibek")))
        feeds.add(Feed(Post(R.drawable.shakhriyor, R.drawable.post_1, "shakhriyor")))
        feeds.add(Feed(Post(R.drawable.yahyo, R.drawable.post_2, "yahyo")))
        feeds.add(Feed(Post(R.drawable.bogibek, R.drawable.post_1, "bogibek")))
        feeds.add(Feed(Post(R.drawable.ogabekdev, R.drawable.post_2, "ogabekdev")))
        feeds.add(Feed(Post(R.drawable.aziz, R.drawable.post_3, "aziz")))
        feeds.add(Feed(Post(R.drawable.elmurod, R.drawable.post_4, "elmurod")))
        feeds.add(Feed(Post(R.drawable.jabbor, R.drawable.post_3, "jabbor")))
        feeds.add(Feed(Post(R.drawable.jonibek, R.drawable.post_2, "jonibek")))
        feeds.add(Feed(Post(R.drawable.shakhriyor, R.drawable.post_1, "shakhriyor")))
        feeds.add(Feed(Post(R.drawable.yahyo, R.drawable.post_2, "yahyo")))
        return feeds
    }
}