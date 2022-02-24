package dev.ogabek.kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.model.Story

class StoryAdapter(private val context: Context, private val stories: ArrayList<Story>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_story_view, parent, false)
        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val story: Story = stories[position]
        if (holder is StoryViewHolder) {
            holder.iv_profile.setImageResource(story.profile)
            holder.tv_full_name.text = story.fullName
        }
    }

    override fun getItemCount(): Int {
        return stories.size
    }

    private class StoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iv_profile: ShapeableImageView = view.findViewById(R.id.iv_profile)
        var tv_full_name: TextView = view.findViewById(R.id.tv_full_name)

    }

}
