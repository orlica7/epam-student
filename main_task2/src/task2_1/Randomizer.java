package task2_1;
import java.util.Random;

public class Randomizer {
    public static final int NULL = 0;
    public int count;

    public Randomizer(int count) {
        this.count = count;
    }

    public static int random(int count) {
        int rand;
        int head = NULL;
        Random random = new Random();
        for (int i = NULL; i < count; i++) {
            rand = random.nextInt(2);
            if (rand == 1) {
                head++;
            }
        }
        return head;
    }
}
