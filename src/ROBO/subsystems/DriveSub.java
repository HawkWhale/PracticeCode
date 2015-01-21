package ROBO.subsystems;

import ROBO.RobotMap;
import ROBO.commands.TankLinear;
import edu.wpi.first.wpilibj.CANTalon.ControlMode;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSub extends Subsystem {
    
	private static final CANTalon frontLeft = new CANTalon(RobotMap.frontLeft);
	private static final CANTalon frontRight = new CANTalon(RobotMap.frontRight);
	private static final CANTalon rearLeft = new CANTalon(RobotMap.rearLeft);
	private static final CANTalon rearRight = new CANTalon(RobotMap.rearRight);
    
	public static final Encoder leftEncoder = new Encoder(RobotMap.leftEncoderA, RobotMap.leftEncoderB);
	public static final Encoder rightEncoder = new Encoder(RobotMap.rightEncoderA, RobotMap.rightEncoderB);
    	public void enableMotors(ControlMode controlMode) {
    		frontLeft.changeControlMode(controlMode);
    		frontRight.changeControlMode(controlMode);
    		rearLeft.changeControlMode(controlMode);
    		rearRight.changeControlMode(controlMode);
    	}
    	public void drive(double leftSpeed, double rightSpeed) {
    		frontLeft.set(leftSpeed);
    		frontRight.set(-rightSpeed);
    		rearLeft.set(leftSpeed);
    		rearRight.set(-rightSpeed);
    }
    	public void disableMotors() {
    		frontLeft.disableControl();
    		frontRight.disableControl();
    		rearLeft.disableControl();
    		rearRight.disableControl();
    } 
    public void initDefaultCommand() {
    	setDefaultCommand(new TankLinear());
    }





}

