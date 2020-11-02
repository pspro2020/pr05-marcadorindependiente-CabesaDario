package ejercicio;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {



        Contadores count = new Contadores();

        ThreadGroup diceGroup = new ThreadGroup("Grupo Dados");
        for (int i = 0; i < 10; i++) {
            Thread hilo = new Thread(diceGroup, count);
            hilo.start();
        }

        esperarHiloGrupo(diceGroup);

        System.out.printf("Número 1: %d veces.%nNúmero 2: %d veces.%nNúmero 3: %d veces.%n" +
                "Número 4: %d veces.%nNúmero 5: %d veces.%nNúmero 6: %d veces.%nTotal de veces: %d + %d + %d + %d + %d + %d = %d",count.counterOne, count.counterTwo, count.counterThree,
                count.counterFour, count.counterFive, count.counterSix, count.counterOne, count.counterTwo, count.counterThree,
                count.counterFour, count.counterFive, count.counterSix, count.counterOne + count.counterTwo + count.counterThree +
                count.counterFour + count.counterFive + count.counterSix);



    }

    // Espera la finalización de todos los hilos del grupo
    private static void esperarHiloGrupo(ThreadGroup grupoHilos) {
        // Mientras algún hilo del grupo estén activos
        // duerme durante un segundo.
        while (grupoHilos.activeCount() > 0) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
