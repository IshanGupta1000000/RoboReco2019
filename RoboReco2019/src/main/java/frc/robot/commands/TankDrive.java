package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class TankDrive extends Command {
    public TankDrive(){
        requires(Robot.driveTrain);
    }
    @Override
    protected void initialize(){

    }

    @Override
    protected void execute(){
        double leftStickY = Robot.m_oi.GetDriverRawAxis(RobotMap.LeftStickYID);
        double rightStickY = Robot.m_oi.GetDriverRawAxis(RobotMap.RightStickYID);
    
        Robot.driveTrain.setLeftMotors(leftStickY);
        Robot.driveTrain.setRightMotors(rightStickY);
        //if this is too sensitive, you can scale the
        //leftStickY and rightStickY variables in the 
        //two lines above by multiplying them by a factor
        //such as (leftStickY*0.5)
        //
        //OR you multiply it by itself for an exponential curve
        //such as (leftStickY*leftStickY)
        //
        //also make sure you do this in Robot map instead
        //of here for convenience
    }

    @Override
    protected boolean isFinished() {
        return false;

    }

    @Override
    protected void end(){
        Robot.driveTrain.setLeftMotors(0);
        Robot.driveTrain.setRightMotors(0);
    }

    @Override
    protected void interrupted(){
        this.end();
    }
}
