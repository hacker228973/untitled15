import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите градусы по цельсию");
        Scanner scanner=new Scanner(System.in);
        int degrees=scanner.nextInt();
        System.out.println(Converter.convert(degrees));
    }
}
