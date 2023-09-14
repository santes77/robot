import Strategy.AgressiveBehavior;
import Strategy.Robot;



public class App {
    public static void main(String[] args) throws Exception {
        Robot roboto = new Robot();
        roboto.setName("Mr. Roboto");
        roboto.setBehavior(new AgressiveBehavior());

            roboto.move();
    }
}