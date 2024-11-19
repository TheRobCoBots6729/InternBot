// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.Conveyor;

public class conveyor extends SubsystemBase {
  /** Creates a new conveyor. */
  public static TalonSRX conveyor;
  public conveyor() {
  conveyor = new TalonSRX(Conveyor.conveyorMotor);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
