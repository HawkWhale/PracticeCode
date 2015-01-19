
package ROBO;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import ROBO.commands.TankLinear;
import ROBO.subsystems.DriveSub;



public class Robot extends IterativeRobot {

	public static final DriveSub drivetrain = new DriveSub();
	public static OI oi;

    

    
    public void robotInit() {
		oi = new OI();
       
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
      
    }

    
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		
    }

   
    public void disabledInit(){

    }

   
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    
    public void testPeriodic() {
        LiveWindow.run();
    }
}
