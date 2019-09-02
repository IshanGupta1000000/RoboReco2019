package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class DriveTrain extends Subsystem {
    private Talon motorLeft1 = new Talon(RobotMap.motorLeft1ID);
    private Talon motorLeft2 = new Talon(RobotMap.motorLeft2ID);
    private Talon motorRight1 = new Talon(RobotMap.motorRight1ID);
    private Talon motorRight2 = new Talon(RobotMap.motorRight2ID);

    @Override
    public void initDefaultCommand() {


    }

    public void setLeftMotors(double speed) {
        //motorLeft1.setinverted
        motorLeft1.set(ControlMode.PercentOutput, -speed);
        motorLeft2.set(ControlMode.PercentOutput, -speed);

    }

    public void setRightMotors(double speed) {
        motorRight1.set(ControlMode.PercentOutput, speed);
        motorRight2.set(ControlMode.PercentOutput, speed);

    }
}