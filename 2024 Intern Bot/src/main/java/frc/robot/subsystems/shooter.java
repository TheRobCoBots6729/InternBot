package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class shooter extends SubsystemBase{
    public static leftshooter;
    public static rightshooter;
    public shooter() {
        leftshooter = new Talon(0);
        rightshooter = new Talon(1);

    }
    @Override
    public void periodic() {

    }
}
