package dev.ogabek.java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

import dev.ogabek.java.R;
import dev.ogabek.java.model.Story;


public class StoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final Context context;
    private final ArrayList<Story> stories;

    public StoryAdapter(Context context, ArrayList<Story> stories) {
        this.context = context;
        this.stories = stories;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_story_view, parent, false);
        return new StoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Story story = stories.get(position);

        if (holder instanceof StoryViewHolder) {
            ((StoryViewHolder) holder).iv_profile.setImageResource(story.getProfile());
            ((StoryViewHolder) holder).tv_full_name.setText(story.getFullName());
        }
    }

    @Override
    public int getItemCount() {
        return stories.size();
    }

    private static class StoryViewHolder extends RecyclerView.ViewHolder {

        ShapeableImageView iv_profile;
        TextView tv_full_name;

        public StoryViewHolder(View view) {
            super(view);

            iv_profile = view.findViewById(R.id.iv_profile);
            tv_full_name = view.findViewById(R.id.tv_full_name);

        }
    }
}
