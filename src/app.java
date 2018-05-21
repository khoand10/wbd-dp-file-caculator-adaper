import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file or folder path: ");
        String path = scanner.nextLine();
        FileCalculator fileCalculator = new FileCalculatorAdapter();
        FileCaculatorAdaptee adaptee = new FileCaculatorAdaptee(fileCalculator);
        adaptee.printFileSize(path);
    }
}
