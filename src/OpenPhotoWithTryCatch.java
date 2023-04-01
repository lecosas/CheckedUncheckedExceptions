import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class OpenPhotoWithTryCatch {

    public void openPhoto() {
        String fileName = "wrongfilephotoname.jpg";
        File file = new File(fileName);

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new PhotoNotFoundException();
        }
    }

}
