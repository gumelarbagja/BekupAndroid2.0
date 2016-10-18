package com.bekup_portal.androidlesson3.models;

public class User {

    /**
     * login : derohimat
     * id : 3787041
     * avatar_url : https://avatars.githubusercontent.com/u/3787041?v=3
     * gravatar_id :
     * organization : https://api.github.com/users/derohimat
     * html_url : https://github.com/derohimat
     * followers_url : https://api.github.com/users/derohimat/followers
     * following_url : https://api.github.com/users/derohimat/following{/other_user}
     * gists_url : https://api.github.com/users/derohimat/gists{/gist_id}
     * starred_url : https://api.github.com/users/derohimat/starred{/owner}{/repo}
     * subscriptions_url : https://api.github.com/users/derohimat/subscriptions
     * organizations_url : https://api.github.com/users/derohimat/orgs
     * repos_url : https://api.github.com/users/derohimat/repos
     * events_url : https://api.github.com/users/derohimat/events{/privacy}
     * received_events_url : https://api.github.com/users/derohimat/received_events
     * type : User
     * site_admin : false
     * name : Deni Rohimat
     * company : Ebizu
     * blog : http://www.derohimat.net
     * location : Bandung, Indonesia
     * email : rohimatdeni@gmail.com
     * hireable : null
     * bio : about.me/denirohimat
     * public_repos : 20
     * public_gists : 11
     * followers : 34
     * following : 17
     * created_at : 2013-03-06T12:36:41Z
     * updated_at : 2016-10-10T05:46:32Z
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
    private String name;
    private String company;
    private String blog;
    private String location;
    private String email;
    private Object hireable;
    private String bio;
    private int public_repos;
    private int public_gists;
    private int followers;
    private int following;
    private String created_at;
    private String updated_at;

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

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getBlog() {
        return blog;
    }

    public String getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public Object getHireable() {
        return hireable;
    }

    public String getBio() {
        return bio;
    }

    public int getPublic_repos() {
        return public_repos;
    }

    public int getPublic_gists() {
        return public_gists;
    }

    public int getFollowers() {
        return followers;
    }

    public int getFollowing() {
        return following;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }
}