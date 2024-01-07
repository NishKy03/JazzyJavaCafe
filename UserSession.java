package cafesystem2;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UserSession {

    private static UserSession instance;
    private String username;

    private UserSession() {
        // Private constructor to prevent instantiation
    }

    public static synchronized UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    public void setUsername(String username) {
        this.username = username;
        resetSessionFile(); // Reset file when a new username is set
        saveSessionDetails(username); // Save session details to file
    }

    public String getUsername() {
        return username;
    }

    private void resetSessionFile() {
        try {
            FileWriter fileWriter = new FileWriter("userSession.txt");
            fileWriter.write("");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveSessionDetails(String username) {
        try {
            FileWriter fileWriter = new FileWriter("userSession.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(username);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
