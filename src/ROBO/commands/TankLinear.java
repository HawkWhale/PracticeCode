package ROBO.commands;

import ROBO.OI;
import ROBO.Robot;
import edu.wpi.first.wpilibj.CANTalon.ControlMode;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TankLinear extends Command {

    public TankLinear() {
        requires(Robot.drivetrain);
    }

    protected void initialize() {
    	Robot.drivetrain.enableMotors(ControlMode.PercentVbus);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.drive(OI.leftStick.getY(), OI.rightStick.getY());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
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
