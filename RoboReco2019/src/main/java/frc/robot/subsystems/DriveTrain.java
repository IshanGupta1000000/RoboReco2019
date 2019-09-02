package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;

public class DriveTrain extends Subsystem {
    private Talon motorLeft1 = new Talon(RobotMap.motorLeft1ID);
    private Talon motorLeft2 = new Talon(RobotMap.motorLeft2ID);
    private Talon motorLeft3 = new Talon(RobotMap.motorLeft3ID);
    private Talon motorRight1 = new Talon(RobotMap.motorRight1ID);
    private Talon motorRight2 = new Talon(RobotMap.motorRight2ID);
    private Talon motorRight3 = new Talon(RobotMap.motorRight3ID);

    @Override
    public void initDefaultCommand() {

        setDefaultCommand(new TankDrive());
    }

    public void setLeftMotors(double speed) {
        //motorLeft1.setinverted
        motorLeft1.set(-speed);
        motorLeft2.set(-speed);
        motorLeft3.set(-speed);
    }

    public void setRightMotors(double speed) {
        motorRight1.set(speed);
        motorRight2.set(speed);
        motorRight3.set(speed);
    }
}