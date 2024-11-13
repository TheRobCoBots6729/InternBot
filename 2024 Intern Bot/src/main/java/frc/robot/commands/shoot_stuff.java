package frc.robot.commands;
import java.util.function.BooleanSupplier;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.shooter;

public class shoot_stuff extends Command {
  BooleanSupplier a;
  BooleanSupplier b;
    public shoot_stuff(shooter s_shooter, BooleanSupplier a, BooleanSupplier b){
    
        addRequirements(s_shooter);
        this.a = a;
        this.b = b;
    }
    @Override
    public void initialize() {}

  @Override
  public void execute() {
    if (a.getAsBoolean()){
    shooter.leftshooter.set(ControlMode.PercentOutput, -0.1);
    shooter.rightshooter.set(ControlMode.PercentOutput, 0.1);
    }
    else if (b.getAsBoolean()){
    shooter.leftshooter.set(ControlMode.PercentOutput, 0.1);
    shooter.rightshooter.set(ControlMode.PercentOutput, -0.1);

    }
    else{
    shooter.leftshooter.set(ControlMode.PercentOutput, 0);
    shooter.rightshooter.set(ControlMode.PercentOutput, 0);
    } 
    
  }

  @Override
  public void end(boolean interrupted) {}



  @Override
  public boolean isFinished(){
    return false; 
  }
}