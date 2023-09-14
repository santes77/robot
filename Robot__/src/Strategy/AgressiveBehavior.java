package Strategy;

public class AgressiveBehavior implements RobotBehavior{

    @Override
    public int moveCommand(){
        return 1;
    }

    @Override
    public String toString() {
        return "AgressiveRobotBehavior;" + "si encuentra otro robot ataca";
    }
  
}