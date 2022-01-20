import java.util.Random;

public class Computer {
    public static int decidesComputerHand() {
        // 課題3 Computerの手の決定とその表示
        Random rand = new Random();

        int computerHand = rand.nextInt(3) + 1;

        return computerHand;
    }
}
