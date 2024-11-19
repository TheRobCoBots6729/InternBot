package frc.robot.commands;
import java.util.function.BooleanSupplier;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.Shooter;
import frc.robot.subsystems.shooter;

public class shoot_stuff extends Command {
  BooleanSupplier a;
  BooleanSupplier b;
    public shoot_stuff(shooter s_shooter){
    
        addRequirements(s_shooter);
       
    }
    @Override
    public void initialize() {}

  @Override
  public void execute() {
    
    shooter.leftshooter.set(ControlMode.PercentOutput, Shooter.leftSpeed);
    shooter.rightshooter.set(ControlMode.PercentOutput, Shooter.rightSpeed);
  
    
  }

  @Override
  public void end(boolean interrupted) {}



  @Override
  public boolean isFinished(){
    return false; 
  }
}