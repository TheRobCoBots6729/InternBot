package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;


public class shooter extends SubsystemBase{
    public static TalonSRX rightshooter;
    public static TalonSRX leftshooter;
    public shooter() {
        leftshooter = new TalonSRX(Constants.Shooter.leftWheel);
        rightshooter = new TalonSRX(Constants.Shooter.rightWheel);

    }
    @Override
    public void periodic() {

    }
}
