package Strategy;

public class NormalBehavior implements RobotBehavior {

    @Override
    public int moveCommand() {
        return 0;
    }

    @Override
    public String toString() {
        return "NormalRobotBehavior;" + "si encuentra otro robot ignora";
    }
   
}

  
