// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.Ctank;

public class tank extends SubsystemBase {
  /** Creates a new tank. */
  public static Spark left1;
  public static Spark left2;
  public static Spark right1;
  public static Spark right2;
  public tank() {
    left1 = new Spark(Ctank.leftnumber1);
    left2 = new Spark(Ctank.leftNumber2);
    right1 = new Spark(Ctank.rightNumber1);
    right2 = new Spark(Ctank.rightNumber2);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
