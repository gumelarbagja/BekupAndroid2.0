package com.bekup_portal.androidlesson3;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bekup_portal.androidlesson3.models.User;
import com.bekup_portal.androidlesson3.networks.GitHubService;
import com.bumptech.glide.Glide;

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

        mImageProfilePict = (ImageView) findViewById(R.id.iv_profile_pic);

        loadData();
    }

    private void loadData() {
        final ProgressDialog progressDialog = new ProgressDialog(GetObjectActivity.this);
        progressDialog.setMessage("Load data...");
        progressDialog.show();

        GitHubService gitHubService = GitHubService.retrofit.create(GitHubService.class);
        Call<User> call = gitHubService.getUser();
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                progressDialog.dismiss();
                User user = response.body();

                if (user != null) {
                    tvUser.setText(user.getLogin());
                    tvBio.setText(user.getBio());

                    Glide.with(GetObjectActivity.this)
                            .load(user.getAvatar_url())
                            .into(mImageProfilePict);
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(GetObjectActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
