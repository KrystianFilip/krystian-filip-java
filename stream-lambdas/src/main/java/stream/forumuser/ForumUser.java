package stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {
    private final int id;
    private final String userName;
    private final char sex;
    private final LocalDate dob;
    private final int postsPublished;

    public ForumUser(int id, String userName, char sex, int year, int month, int day, int postsPublished) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.dob = LocalDate.of(year,month,day);
        this.postsPublished = postsPublished;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDob() {
        return dob;
    }

    public int getPostsPublished() {
        return postsPublished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return id == forumUser.id &&
                sex == forumUser.sex &&
                postsPublished == forumUser.postsPublished &&
                Objects.equals(userName, forumUser.userName) &&
                Objects.equals(dob, forumUser.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dob);
    }

    @Override
    public String toString() {
        return userName + "(Born: " + dob + " /sex: " + sex + " /posts: " + postsPublished + ")";
    }
}
