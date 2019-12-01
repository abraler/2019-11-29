import java.io.File;

public class Scanner {
    public static void scannerDirectory(TreeNode node) {
        File[] files = node.file.listFiles();
        if (files == null) {
            return;
        }
        for (File file : files) {
            TreeNode child = new TreeNode();
            child.file = file;
            if (file.isDirectory()) {
                scannerDirectory(child);
            } else {
                child.totallength = file.length();
            }
            node.totallength += child.totallength;
            node.children.add(child);
        }
    }
    public static void main(String[] args) {

    }
}
