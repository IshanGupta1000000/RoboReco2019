package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;
import com.ctre.phoenix.*;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

public class DriveTrain extends Subsystem {
    private TalonSRX motorLeft1 = new TalonSRX(RobotMap.motorLeft1ID);
    private VictorSPX motorLeft2 = new VictorSPX(RobotMap.motorLeft2ID);
    private VictorSPX motorLeft3 = new VictorSPX(RobotMap.motorLeft3ID);
    private TalonSRX motorRight1 = new TalonSRX(RobotMap.motorRight1ID);
    private VictorSPX motorRight2 = new VictorSPX(RobotMap.motorRight2ID);
    private VictorSPX motorRight3 = new VictorSPX(RobotMap.motorRight3ID);

    @Override
    public void initDefaultCommand() {

        setDefaultCommand(new TankDrive());
    }
    //talon srx
    //victor spx
    public void setLeftMotors(double speed) {
        //motorLeft1.setinverted
        motorLeft1.set(null, -speed);
        motorLeft2.set(null, -speed);
        motorLeft3.set(null, -speed);
    }

    public void setRightMotors(double speed) {
        motorRight1.set(null, speed);
        motorRight2.set(null, speed);
        motorRight3.set(null, speed);
    }
}