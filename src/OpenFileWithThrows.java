import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class OpenFileWithThrows {

    public void openFile() throws FileNotFoundException {
        String fileName = "wrongfilename.doc";
        File file = new File(fileName);
        FileInputStream fileInputStream = new FileInputStream(file);
    }

    public void callOpenFile() {
        try {
            this.openFile();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
