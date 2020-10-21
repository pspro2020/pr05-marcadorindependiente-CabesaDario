package ejercicio;

import java.util.concurrent.ThreadLocalRandom;

public class Contadores implements Runnable{

    protected int counterOne = 0;
    protected int counterTwo = 0;
    protected int counterThree = 0;
    protected int counterFour = 0;
    protected int counterFive = 0;
    protected int counterSix = 0;
    


    @Override
    public void run() {
        for (int i = 0; i < 10000; i++){
            increment();
        }

    }


    private  void increment(){
        switch (ThreadLocalRandom.current().nextInt(1,7)){
            case 1:
                counterOne++;
                break;
            case 2:
                counterTwo++;
                break;
            case 3:
                counterThree++;
                break;
            case 4:
                counterFour++;
                break;
            case 5:
                counterFive++;
                break;
            case 6:
                counterSix++;
                break;

        }

    }
}
