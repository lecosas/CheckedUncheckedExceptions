import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class OpenFileWithTryCatch {

    public void openFile() {
        String fileName = "wrongfilename.doc";
        File file = new File(fileName);

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
