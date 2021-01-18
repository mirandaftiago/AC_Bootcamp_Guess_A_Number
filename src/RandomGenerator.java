public class RandomGenerator {
    public static int getRandom(int max) {
        return getRandom(0, max);
    }

    //Random between 0 and max
    public static int getRandom(int min, int max){
        return (int) (Math.random() * (max + 1));
    }
}
