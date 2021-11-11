public class Settings {

    private static Settings instace;

    private Settings() {}

    public static Settings getInstence() {
        if (instace == null) {
            instace = new Settings();
            return instace;
        }
        return instace;

    }
}
