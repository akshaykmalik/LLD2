package COMPOSITE_DP;
import java.util.List;
import java.util.LinkedList;

public class Folder implements FileSystem {
    String folderName;
    List<FileSystem> fsList;

    Folder(String folderName) {
        this.folderName = folderName;
        fsList = new LinkedList<>();
    }

    void addToFolder(FileSystem fs) {
        fsList.add(fs);
    }

    public String getDescription() {
        String result = this.folderName + " -> ";
        for (FileSystem fs : fsList) {
            result +=   fs.getDescription() + ", ";
        }   

        return result;
    }

}
