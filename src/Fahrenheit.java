

public class Fahrenheit implements Converter{
    @Override
    public float convert(float degrees) {


//        System.out.println((int)(degrees * 1.2 + 32));



//        }

        return (float)(degrees * 1.8 + 32);
    }
}
