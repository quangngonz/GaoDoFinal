// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import static frc.robot.Constants.SPEED.*;
import static frc.robot.Constants.SUBSYSTEM.*;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */
  public WPI_TalonSRX Intake1 = new WPI_TalonSRX(INTAKE1_ID);
  public WPI_TalonSRX Intake2 = new WPI_TalonSRX(INTAKE2_ID);
  public Intake() {
    Intake2.setInverted(true);
  }

  public void Suck(double v){
    Intake1.set(v);
    Intake2.set(v);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
