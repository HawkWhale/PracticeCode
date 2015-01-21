package ROBO.commands;

import edu.wpi.first.wpilibj.CANTalon.ControlMode;
import edu.wpi.first.wpilibj.command.Command;
import ROBO.Robot;

public class Auto extends Command {

    public Auto() {
        requires(Robot.drivetrain);
    }

    
    protected void initialize() {
    	Robot.drivetrain.enableMotors(ControlMode.PercentVbus);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.drive(0.6, 0.6);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (Robot.drivetrain.leftEncoder.get() > 600);
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.drivetrain.disableMotors();
    }
}
