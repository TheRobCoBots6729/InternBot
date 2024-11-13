// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.tankdrive;
import frc.robot.subsystems.shooter;
import frc.robot.commands.shoot_stuff;
import frc.robot.subsystems.tank;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // Subsystems
  private final tank t_tank = new tank();
  private final shooter s_shooter = new shooter();

  // Controller(s)
  private final Joystick m_driverController =
      new Joystick(OperatorConstants.kDriverControllerPort);

  // Drive Controls
  private final int leftSide = XboxController.Axis.kLeftY.value;
  private final int rightSide = XboxController.Axis.kRightY.value;

  // Mechanism Controls
  private final JoystickButton shoot = new JoystickButton(m_driverController, XboxController.Button.kY.value);
  private final JoystickButton intake = new JoystickButton(m_driverController, XboxController.Button.kRightBumper.value);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    t_tank.setDefaultCommand(
      new tankdrive(
        t_tank, 
        () -> leftSide, 
        () -> rightSide)
    );
    s_shooter.setDefaultCommand(
      new shoot_stuff(
        s_shooter,
        () -> shoot.getAsBoolean(),
        () -> intake.getAsBoolean()
      )
    );
    // Configure the trigger bindings
    configureBindings();
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
    // Schedule `ExampleCommand` when `exampleCondition` changes to `true`
    
    // Schedule `exampleMethodCommand` when the Xbox controller's B button is pressed,
    // cancelling on release.

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return null;
  }
}
