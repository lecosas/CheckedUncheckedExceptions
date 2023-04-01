import java.io.File;
import java.io.FileInputStream;
public class OpenFileWithoutChecking {

    public void openFile() {
        String fileName = "wrongfilename.doc";
        File file = new File(fileName);

        /*
            O construtor da classe FileInputStream exige o tratamento
            da exception FileNotFoundException. Sendo assim, esta classe
            não poderá ser compilada desta forma.
        */
        //FileInputStream fileInputStream = new FileInputStream(file);
    }

}
