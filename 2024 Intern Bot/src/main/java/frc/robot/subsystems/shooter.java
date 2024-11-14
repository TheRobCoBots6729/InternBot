package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;


public class shooter extends SubsystemBase{
    public static TalonSRX rightshooter;
    public static TalonSRX leftshooter;
    public shooter() {
        leftshooter = new TalonSRX(5);
        rightshooter = new TalonSRX(6);

    }
    @Override
    public void periodic() {

    }
}
