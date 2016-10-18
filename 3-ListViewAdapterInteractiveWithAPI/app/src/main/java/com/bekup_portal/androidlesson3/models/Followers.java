package com.bekup_portal.androidlesson3.models;

public class Followers {

    /**
     * login : mhaidarh
     * id : 235584
     * avatar_url : https://avatars.githubusercontent.com/u/235584?v=3
     * gravatar_id :
     * organization : https://api.github.com/users/mhaidarh
     * html_url : https://github.com/mhaidarh
     * followers_url : https://api.github.com/users/mhaidarh/followers
     * following_url : https://api.github.com/users/mhaidarh/following{/other_user}
     * gists_url : https://api.github.com/users/mhaidarh/gists{/gist_id}
     * starred_url : https://api.github.com/users/mhaidarh/starred{/owner}{/repo}
     * subscriptions_url : https://api.github.com/users/mhaidarh/subscriptions
     * organizations_url : https://api.github.com/users/mhaidarh/orgs
     * repos_url : https://api.github.com/users/mhaidarh/repos
     * events_url : https://api.github.com/users/mhaidarh/events{/privacy}
     * received_events_url : https://api.github.com/users/mhaidarh/received_events
     * type : User
     * site_admin : false
     */

    private String login;
    private int id;
    private String avatar_url;
    private String gravatar_id;
    private String url;
    private String html_url;
    private String followers_url;
    private String following_url;
    private String gists_url;
    private String starred_url;
    private String subscriptions_url;
    private String organizations_url;
    private String repos_url;
    private String events_url;
    private String received_events_url;
    private String type;
    private boolean site_admin;

    public String getLogin() {
        return login;
    }

    public int getId() {
        return id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public String getGravatar_id() {
        return gravatar_id;
    }

    public String getUrl() {
        return url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public String getFollowers_url() {
        return followers_url;
    }

    public String getFollowing_url() {
        return following_url;
    }

    public String getGists_url() {
        return gists_url;
    }

    public String getStarred_url() {
        return starred_url;
    }

    public String getSubscriptions_url() {
        return subscriptions_url;
    }

    public String getOrganizations_url() {
        return organizations_url;
    }

    public String getRepos_url() {
        return repos_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public String getReceived_events_url() {
        return received_events_url;
    }

    public String getType() {
        return type;
    }

    public boolean isSite_admin() {
        return site_admin;
    }
}