import java.util.Scanner;

public class To {
    public static void convert() {
        System.out.println("Добрый день это программа умный дом, выберите себе что то пожалуйста");
        System.out.println("Если хотите перевести что то в кельвины жмите 1");
        System.out.println("Если хотите перевести что то в фаренгейты жмите 2");
        Scanner scanner = new Scanner(System.in);

        float degrees =0;
        float totalDegrees= degrees;
        switch (scanner.nextInt()) {
            
            case 1:
                System.out.println("Введите градусы по цельсию");
                degrees = scanner.nextInt();
                Converter converterKelvin = new Kelvin();
                totalDegrees =converterKelvin.createConverter(degrees);
                break;
            case 2:
                System.out.println("Введите градусы по цельсию");
                degrees = scanner.nextInt();
                Converter converterFahrenheit = new Fahrenheit();
                totalDegrees = converterFahrenheit.createConverter(degrees);
                break;
            default:
                System.out.println("ащибка, попробуйте в другой раз");
                break;
        }
        System.out.println(totalDegrees+" Градусов получиться");
    }
}
