/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.AnalogInput;
import frc.robot.MiniPID;
import frc.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.ControlMode;
/**
 * Add your docs here.
 */
 public class TalonModule extends Subsystem {
  private TalonSRX iamspeed;
  private TalonSRX turning;
  private AnalogInput encoder;
  private MiniPID turningController;
  public TalonModule(int speedPort,int turningPort,int encoderPort){
    iamspeed = new TalonSRX(speedPort);
    turning = new TalonSRX(turningPort);
    encoder = new AnalogInput(encoderPort);
    turningController = new MiniPID(RobotMap.Values.turningP, RobotMap.Values.turningI, RobotMap.Values.turningD);
  }
  
  public void setDrivingSpeed(double driveSpeed){
    iamspeed.set(ControlMode.PercentOutput, driveSpeed);
  }

  public void setTurningSpeed(double turningSpeed){
    turning.set(ControlMode.PercentOutput, turningSpeed);
  }

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
