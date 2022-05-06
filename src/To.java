import java.util.Scanner;

public class To {
    public static void to() {
        System.out.println("Добрый день это программа умный дом, выберите себе что то пожалуйста");
        System.out.println("Если хотите перевести что то в цельсии жмите 1");
        System.out.println("Если хотите перевести что то в фаренгейты жмите 2");
        Scanner scanner = new Scanner(System.in);
        int degrees;
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Введите градусы по цельсию");
                degrees = scanner.nextInt();
                Converter converterKelvin = new Kelvin();
                converterKelvin.convert(degrees);
                break;
            case 2:
                System.out.println("Введите градусы по цельсию");
                degrees = scanner.nextInt();
                Converter converterFahrenheit = new Fahrenheit();
                converterFahrenheit.convert(degrees);
                break;
        }
    }
}
