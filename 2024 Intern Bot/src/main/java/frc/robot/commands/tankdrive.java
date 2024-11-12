// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.tank;

public class tankdrive extends Command {
  /** Creates a new tankdrive. */
  DoubleSupplier a;
  DoubleSupplier b;
  public tankdrive(tank t_tank, DoubleSupplier a, DoubleSupplier b) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(t_tank);
    this.a = a;
    this.b = b;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    tank.left1.set(a.getAsDouble());
    tank.left2.set(a.getAsDouble());
    tank.right1.set(-b.getAsDouble());
    tank.right2.set(-b.getAsDouble());


  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
