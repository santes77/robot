package Strategy;

public class DeffensiveBehavior implements RobotBehavior {

    @Override
    public int moveCommand() {
        return -1;
    }

    @Override
    public String toString() {
        return "DeffensiveRobotBehavior" + "si encuentra otro robot corre";
    }

}
