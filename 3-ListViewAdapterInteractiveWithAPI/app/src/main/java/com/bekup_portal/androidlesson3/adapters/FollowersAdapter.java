package com.bekup_portal.androidlesson3.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bekup_portal.androidlesson3.R;
import com.bekup_portal.androidlesson3.models.Followers;

import java.util.List;

public class FollowersAdapter extends RecyclerView.Adapter<FollowersAdapter.MyViewHolder> {

    private List<Followers> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, profile, organization;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            organization = (TextView) view.findViewById(R.id.organization);
            profile = (TextView) view.findViewById(R.id.profile);
        }
    }


    public FollowersAdapter(List<Followers> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_followers, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Followers movie = moviesList.get(position);
        holder.title.setText(movie.getLogin());
        holder.organization.setText(movie.getOrganizations_url());
        holder.profile.setText(movie.getUrl());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}