package stubs.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private Statistics statisticsMock;
    private ForumStatistics statistics;
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Initiating Forum Statistics Test Suite...");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("Test ended with total amount of tests: " + testCounter);
    }
    @Before
    public void beforeEachTest() {
        testCounter++;

        statisticsMock = mock(Statistics.class);

        List<String> usersMockList = new ArrayList<>();
        usersMockList.add("Krystek");
        usersMockList.add("Prezio");
        usersMockList.add("Iwka");
        usersMockList.add("Pento");
        usersMockList.add("Filip");

        when(statisticsMock.getUserNames()).thenReturn(usersMockList);

        statistics = new ForumStatistics();
        System.out.println("Test #" + testCounter);
    }
    @Test
    public void testCalculateAdvStatisticsWithZeroPosts() {
        //given
        when(statisticsMock.getPostCount()).thenReturn(0);
        //when
        statistics.calculateAdvStatistics(statisticsMock);
        //then
        Assert.assertEquals(0, statistics.getPosts());
        Assert.assertEquals(0,statistics.getAvgCommentsToPost(),0.1);
        Assert.assertEquals(0,statistics.getAvgUsersComments(),0.1);
        Assert.assertEquals(0,statistics.getAvgUsersPosts(),0.1);

    }
    @Test
    public void testCalculateAdvStatisticsWithThousandPosts() {
        //given
        when(statisticsMock.getPostCount()).thenReturn(1000);
        //when
        statistics.calculateAdvStatistics(statisticsMock);
        //then
        Assert.assertEquals(statistics.getPosts(),1000);
        Assert.assertEquals(statistics.getAvgUsersPosts(), 200,0.01);
        Assert.assertEquals(statistics.getAvgUsersComments(),0,0.01);
        Assert.assertEquals(statistics.getAvgCommentsToPost(),0,0.01);
    }
    @Test
    public void testCalculateAdvStatisticsWithZeroComments() {
        //given
        when(statisticsMock.getCommentsCount()).thenReturn(0);
        //when
        statistics.calculateAdvStatistics(statisticsMock);
        //then
        Assert.assertEquals(0,statistics.getComments());
    }
    @Test
    public void testCalculateAdvStatisticsMorePostsThanComments() {
        //given
        when(statisticsMock.getPostCount()).thenReturn(100);
        when(statisticsMock.getCommentsCount()).thenReturn(50);
        //when
        statistics.calculateAdvStatistics(statisticsMock);
        //then
        Assert.assertEquals(statistics.getAvgUsersPosts(), 20,0.01);
        Assert.assertEquals(statistics.getAvgUsersComments(),10,0.01);
        Assert.assertEquals(statistics.getAvgCommentsToPost(),0.5,0.01);

    }
    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts() {
        //given
        when(statisticsMock.getPostCount()).thenReturn(100);
        when(statisticsMock.getCommentsCount()).thenReturn(200);
        //when
        statistics.calculateAdvStatistics(statisticsMock);
        //then
        Assert.assertEquals(statistics.getAvgUsersPosts(),20,0.01);
        Assert.assertEquals(statistics.getAvgUsersComments(),40,0.01);
        Assert.assertEquals(statistics.getAvgCommentsToPost(),2,0.01);
    }
    @Test
    public void testCalculateAdvStatisticsWithZeroUsers() {
        //given
        List<String> zeroUsers = new ArrayList<>();
        when(statisticsMock.getUserNames()).thenReturn(zeroUsers);
        //when
        statistics.calculateAdvStatistics(statisticsMock);
        //then
        Assert.assertEquals(statistics.getAvgUsersPosts(),0,0.1);
        Assert.assertEquals(statistics.getAvgUsersComments(),0,0.1);
        Assert.assertEquals(statistics.getAvgCommentsToPost(),0,0.1);
    }
    @Test
    public void testCalculateAdvStatisticsWithHundredUsers() {
        //given
        List<String> hundredUsers = new ArrayList<>();
        for (int i=0;i<100;i++) {
            hundredUsers.add("user");
        }
        when(statisticsMock.getUserNames()).thenReturn(hundredUsers);
        when(statisticsMock.getPostCount()).thenReturn(1000);
        when(statisticsMock.getCommentsCount()).thenReturn(100);
        //when
        statistics.calculateAdvStatistics(statisticsMock);
        //then
        Assert.assertEquals(statistics.getAvgUsersPosts(),10,0.01);
        Assert.assertEquals(statistics.getAvgUsersComments(),1,0.01);
        Assert.assertEquals(statistics.getAvgCommentsToPost(),0.1,0.01);
    }
}
