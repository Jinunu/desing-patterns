public class App {

    public static void main(String[] args) {
        Settings settings = Settings.getInstence();
        Settings settings1 = Settings.getInstence();
        System.out.println(settings == settings1);
    }
}
