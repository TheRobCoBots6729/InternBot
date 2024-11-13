package frc.robot.commands;

import frc.robot.subsystems.shooter;

public class shoot_stuff extends Command {
    public shoot_stuff(shooter s_shooter, Boolean a, Boolean b)
    
        addRequirements(s_shooter);
        this.a = a;
        this.b = b;
    
    @Override
    public void initialize() {}

  @Override
  public void execute() {
    if (shooter.a == true){
    shooter.leftshooter.set(-0.1);
    shooter.rightshooter.set(0.1);
    }
    else if (shooter.b == true){
    shooter.leftshooter.set(0.1);
    shooter.rightshooter.set(-0.1);

    }
    else{
    shooter.leftshooter.set(0);
    shooter.rightshooter.set(0);
    } 
    
  }




  @Override
  public void end(boolean interrupted) {}



  @Override
  public boolean isFinished(){
    return false; `
  }
}