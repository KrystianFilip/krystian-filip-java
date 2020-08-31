package stubs.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatistics {
    public int users;
    public int posts;
    public int comments;
    private double avgUsersPosts;
    private double avgUsersComments;
    private double avgCommentsToPost;

    public int getUsers() {
        return users;
    }

    public int getPosts() {
        return posts;
    }

    public int getComments() {
        return comments;
    }

    public double getAvgUsersPosts() {
        return avgUsersPosts;
    }

    public double getAvgUsersComments() {
        return avgUsersComments;
    }

    public double getAvgCommentsToPost() {
        return avgCommentsToPost;
    }
    public void calculateAdvStatistics(Statistics statistics) {
        users = statistics.getUserNames().size();
        posts = statistics.getPostCount();
        comments = statistics.getCommentsCount();
        avgUsersPosts = calculateAvgUsersPosts();
        avgUsersComments = calculateAvgUsersComments();
        avgCommentsToPost = calculateAvgCommentsToPost();

    }
    private int calculateAvgUsersPosts() {
        if (users > 0) {
            return posts / users;
        } else {
            return 0;
        }
    }
    private double calculateAvgUsersComments() {
        if (users > 0) {
            return (double) comments / users;
        } else {
            return 0;
        }
    }
    private double calculateAvgCommentsToPost() {
        if(posts > 0) {
            return (double) comments / posts;
        } else {
            return 0;
        }
    }
}
