package com.bekup_portal.androidlesson3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bekup_portal.androidlesson3.models.User;
import com.bekup_portal.androidlesson3.networks.GitHubService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetObjectActivity extends AppCompatActivity {

    private TextView tvUser, tvBio;
    private ImageView mImageProfilePict;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_object);

        tvUser = (TextView) findViewById(R.id.tv_username);
        tvBio = (TextView) findViewById(R.id.tv_bio);

        loadData();
    }

    private void loadData() {
        GitHubService gitHubService = GitHubService.retrofit.create(GitHubService.class);
        Call<User> call = gitHubService.getUser();
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                User user = response.body();

                if (user != null) {
                    tvUser.setText(user.getLogin());
                    tvBio.setText(user.getBio());
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });
    }
}
