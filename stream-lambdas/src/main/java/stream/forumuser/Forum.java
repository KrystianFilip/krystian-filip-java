package stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private List<ForumUser> listOfUsers = new ArrayList<>();

    public Forum() {
        listOfUsers.add(new ForumUser(1,"Wetfingerzz", 'm',1994, 7,7,567));
        listOfUsers.add(new ForumUser(2,"Mishka", 'f',1990,12,21,578));
        listOfUsers.add(new ForumUser(3,"Joane", 'f',1988,6,30,943));
        listOfUsers.add(new ForumUser(4,"Trogthar", 'm',1996,3,6,121));
        listOfUsers.add(new ForumUser(5,"Hera", 'f',2000,1,12,87));
        listOfUsers.add(new ForumUser(6,"Welllington", 'm',1991,7,6,432));
        listOfUsers.add(new ForumUser(7,"Krozka", 'f',1974,4,22,887));
        listOfUsers.add(new ForumUser(8,"Metadatazzz", 'm',1984,11,5,1567));
        listOfUsers.add(new ForumUser(9,"Analka", 'f',1975,6,2,467));
        listOfUsers.add(new ForumUser(10,"Thor", 'm',1996,4,17,267));

    }
    public List<ForumUser> getListOfUsers() {
        return new ArrayList<>(listOfUsers);
    }
}
