package basics.interfaces.telephone;

public class MainApp {
    public static void main(String[] args) {
        MobilePhone mobile = new MobilePhone();

        mobile.callTo("Iwona");
        mobile.callToMom();
        System.out.println(Telephone.call911());
    }
}
