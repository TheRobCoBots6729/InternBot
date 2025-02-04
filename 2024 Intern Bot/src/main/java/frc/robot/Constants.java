// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
  public static final class Shooter {
    public static int leftWheel = 4;
    public static int rightWheel = 5;
    public static double leftSpeed = -1.0;
    public static double rightSpeed = 1.0;
  }
  public static final class Conveyor {
    public static int conveyorMotor = 6;
    public static double speed = 1.0;
  }
  public static final class Ctank {
   public static int leftnumber1 = 0;
   public static int leftNumber2 = 1;
   public static int rightNumber1 = 2;
   public static int  rightNumber2 = 3;
   
  }
}
