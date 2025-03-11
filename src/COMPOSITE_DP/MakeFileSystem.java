package COMPOSITE_DP;

public class MakeFileSystem {
    public static void main(String[] args) {
        File file1 = new File("file 1");
        File file11 = new File("file 11");

        Folder folder1 = new Folder("folder f1");
        folder1.addToFolder(file1);
        folder1.addToFolder(file11);

        Folder folder2 = new Folder("folder f2");
        File file2 = new File("file f2");
        File file22 = new File("file 22");

        folder2.addToFolder(file2);
        folder2.addToFolder(file22);
        folder2.addToFolder(folder1);

        System.out.println(folder2.getDescription());

    }
}