package things;

import java.util.Random;

public class RandomNumber {

    public static int getRandomNumber(){
        Random random=new Random();
        int number=random.nextInt(100000,999999);
        return number;
    }


}
