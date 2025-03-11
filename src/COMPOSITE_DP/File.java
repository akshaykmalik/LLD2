package COMPOSITE_DP;

public class File implements FileSystem {
    String fileName;
    File(String fileName) {
        this.fileName = fileName;
    }

    public String getDescription() {
        return fileName;
    }
}
