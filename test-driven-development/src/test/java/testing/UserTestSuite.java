package testing;

import org.junit.*;

public class UserTestSuite {
    @Before
    public void before() {
        System.out.println("Testing Case: ");
    }
    @After
    public void after() {
        System.out.println("Testing Case Ended.");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("User Test Suite starts now!");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("User Test Suite ends now!");
    }
    @Test
    public void testGetUserName() {
        //Given = creating a new object "user" belonging to class User.
        User user = new User("Krystek", "Krystian Filip");

        //When = call to the method .getUsername() of our User class.
        String userName = user.getUsername();
        System.out.println("Testing .getUsername method...");

        //Then = testing through assertion, using expected value and actual value.
        Assert.assertEquals("Krystek", userName);
    }
    @Test
    public void testGetRealName() {
        //Given
        User user = new User("Krystek", "Krystian Filip");
        //When
        String realName = user.getRealName();
        System.out.println("Testing .getRealName method...");
        //Then
        Assert.assertEquals("Krystian Filip", realName);
    }
}
