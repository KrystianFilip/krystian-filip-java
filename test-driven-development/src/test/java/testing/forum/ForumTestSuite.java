package testing.forum;

import org.junit.*;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Forum Test Suite initiated.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("Forum Test Suite ended.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing Test Case: #" + testCounter);
    }

    @Test
    public void testAddPost() {
        //Given
        ForumUser forumUser = new ForumUser("Krystek", "Krystian Filip");
        //When
        forumUser.addPost("Krystek", "New SSD Card to my Pavilion Notebook");
        //Then
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }

    @Test
    public void testAddComment() {
        //Given
        ForumUser forumUser = new ForumUser("Krystek", "Krystian Filip");
        ForumPost forumPost = new ForumPost("New SSD Card to my Pavilion Notebook", "Krystek");
        //When
        forumUser.addComment(forumPost, "Krystek", "I bought some RAM as well. It's 8GB DDR4 by Kingstone");
        //Then
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test
    public void testGetPost() {
        //Given
        ForumUser forumUser = new ForumUser("Krystek", "Krystian Filip");
        ForumPost forumPost = new ForumPost("New SSD Card to my Pavilion Notebook", "Krystek");
        forumUser.addPost(forumPost.getAuthor(), forumPost.getPostBody());
        //When
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);
        //Then
        Assert.assertEquals(forumPost,retrievedPost);
    }

    @Test
    public void testGetComment() {
        //Given
        ForumUser forumUser = new ForumUser("Krystek", "Krystian Filip");
        ForumPost forumPost = new ForumPost("New SSD Card to my Pavilion Notebook", "Krystek");
        ForumComment forumComment = new ForumComment(forumPost, "Krystek",
                "I bought some RAM as well. It's 8GB DDR4 by Kingstone");
        forumUser.addComment(forumPost, forumComment.getAuthor(), forumComment.getCommentBody());
        //When
        ForumComment retrievedComment;
        retrievedComment = forumUser.getComment(0);
        //Then
        Assert.assertEquals(forumComment,retrievedComment);
    }
    @Test
    public void testRemoveNonExistingPost() {
        //Given
        ForumUser forumUser = new ForumUser("Krystek", "Krystian Filip");
        ForumPost forumPost = new ForumPost("New SSD Card to my Pavilion Notebook", "Krystek");
        //WHen
        boolean result = forumUser.removePost(forumPost);
        //Then
        Assert.assertFalse(result);
    }
    @Test
    public void testRemoveNonExistingComment() {
        //Given
        ForumUser forumUser = new ForumUser("Krystek", "Krystian Filip");
        ForumPost forumPost = new ForumPost("New SSD Card to my Pavilion Notebook", "Krystek");
        ForumComment forumComment = new ForumComment(forumPost, "Krystek",
                "I bought some RAM as well. It's 8GB DDR4 by Kingstone");
        //When
        boolean result = forumUser.removeComment(forumComment);
        //Then
        Assert.assertFalse(result);
    }
    @Test
    public void testRemovePost() {
        //Given
        ForumUser forumUser = new ForumUser("Krystek", "Krystian Filip");
        ForumPost forumPost = new ForumPost("New SSD Card to my Pavilion Notebook", "Krystek");
        forumUser.addPost(forumPost.getAuthor(),forumPost.getPostBody());
        //When
        boolean result = forumUser.removePost(forumPost);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,forumUser.getPostsQuantity());
    }
    @Test
    public void testRemoveComment() {
        //Given
        ForumUser forumUser = new ForumUser("Krystek", "Krystian Filip");
        ForumPost forumPost = new ForumPost("New SSD Card to my Pavilion Notebook", "Krystek");
        ForumComment forumComment = new ForumComment(forumPost, "Krystek",
                "I bought some RAM as well. It's 8GB DDR4 by Kingstone");
        forumUser.addComment(forumPost,forumComment.getAuthor(),forumComment.getCommentBody());
        //When
        boolean result = forumUser.removeComment(forumComment);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,forumUser.getCommentsQuantity());

    }
}
