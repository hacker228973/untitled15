import java.util.Scanner;
public class Converter {

    static public double convert(int degrees){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Во что будем конвертировать?");
        String choice= scanner.nextLine();
        if(choice.equals("В Фаренгейты")){
            return degrees * 9/5 + 32;
        }
        if(choice.equals("В Кельвины")){
            return degrees + 273.15;
        }
        System.out.println("ащибка");
        return degrees;
    }
}
