public class FileCaculatorAdaptee {
    private FileCalculator fileCalculator;

    public FileCaculatorAdaptee(FileCalculator fileCalculator) {
        this.fileCalculator = fileCalculator;
    }

    public void printFileSize(String path){
        long size = fileCalculator.calculateSize(path);
        System.out.println("Size: " + size);
    }
}
