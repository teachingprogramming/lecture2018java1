package d00000.exam;

public class SuperMarioBros {
    public int mario;
    public int coin;


    public SuperMarioBros() {
        mario = 3;
        coin = 0;
    }

    public void takeCoin() {
        coin++;
        if (coin == 100) {
            mario++;
            coin = 0;
        }
    }

    public boolean fail() {
        mario--;
        return mario < 0;
    }

}
