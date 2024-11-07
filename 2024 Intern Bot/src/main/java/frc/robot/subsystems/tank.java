// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class tank extends SubsystemBase {
  /** Creates a new tank. */
  public tank() {
    left1 = new Spark;
    left2 = new Spark;
    right1 = new Spark;
    right2 = new Spark;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
