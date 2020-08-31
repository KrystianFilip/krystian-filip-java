package stream.forumuser;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        Forum forum = new Forum();
        List<ForumUser> resultList = forum.getListOfUsers().stream()
                .filter(ForumUser -> ForumUser.getSex() =='m')
                .filter(ForumUser -> ForumUser.getPostsPublished() > 200)
                .filter(ForumUser -> ForumUser.getDob().getYear() <= 1994)
                .collect(Collectors.toList());
        System.out.println("Elements of the list: " + resultList.size());
        resultList.stream()
                .forEach(System.out::println);

        Map<Integer,ForumUser> resultMap = forum.getListOfUsers().stream()
                .filter(ForumUser -> ForumUser.getSex() =='m')
                .filter(ForumUser -> ForumUser.getPostsPublished() > 200)
                .filter(ForumUser -> ForumUser.getDob().getYear() <= 1994)
                .collect(Collectors.toMap(ForumUser::getId, ForumUser -> ForumUser));

        System.out.println("Map contains: " + resultMap.size() + " entries.");
        resultMap.entrySet().stream()
                .map(entry -> entry.getKey()+ ":" + entry.getValue())
                .forEach(System.out::println);


    }
}
