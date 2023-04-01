import java.io.File;
import java.io.FileInputStream;
public class OpenFileWithNonCheckedException {

    public void openFile() {
        String fileName = "wrongfilename.doc";
        File file = new File(fileName);

        // O construtor na classe FileInputStream exige
        // o tratamento da exception FileNotFoundException
        FileInputStream fileInputStream = new FileInputStream(file);
    }

}
