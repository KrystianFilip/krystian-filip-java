package testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {
    private String userName;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<>();
    private LinkedList<ForumComment> comments = new LinkedList<>();

    public ForumUser(String userName, String realName) {
        this.userName = userName;
        this.realName = realName;
    }

    public void addPost(String postBody, String author) {
        ForumPost thePost = new ForumPost(author, postBody);
        posts.add(thePost);
    }

    public void addComment(ForumPost forumPost, String author, String commentBody) {
        ForumComment theComment = new ForumComment(forumPost,commentBody,author);
        comments.add(theComment);
    }

    public int getPostsQuantity() {
        return posts.size();
    }

    public int getCommentsQuantity() {
        return comments.size();
    }

    public ForumPost getPost(int postNumber) {
        ForumPost thePost = null;
        if (postNumber >= 0 && postNumber < posts.size()) {
            thePost = posts.get(postNumber);
        }
        return thePost;
    }

    public ForumComment getComment(int commentNumber) {
        ForumComment theComment = null;
        if (commentNumber >= 0 && commentNumber < comments.size()) {
            theComment = comments.get(commentNumber);
        }
        return theComment;
    }

    public boolean removePost(ForumPost forumPost) {
        boolean result = false;
        if(posts.contains(forumPost)) {
            posts.remove(forumPost);
            result = true;
        }
        return result;
    }

    public boolean removeComment(ForumComment forumComment) {
        boolean result = false;
        if(comments.contains(forumComment)) {
            comments.remove(forumComment);
            result = true;
        }
        return result;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }
}
