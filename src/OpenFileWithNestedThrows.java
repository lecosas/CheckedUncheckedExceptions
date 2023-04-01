import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class OpenFileWithNestedThrows {

    public void openFile() throws FileNotFoundException {
        String fileName = "wrongfilename.doc";
        File file = new File(fileName);
        FileInputStream fileInputStream = new FileInputStream(file);
    }

    public void callOpenFile() throws FileNotFoundException {
        try {
            this.openFile();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void callCallOpenFile() {
        try {
            this.callOpenFile();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
