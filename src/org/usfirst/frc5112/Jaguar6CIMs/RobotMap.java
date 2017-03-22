// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5112.Jaguar6CIMs;

import com.thegongoliers.hardware.Hardware;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController drivetrainRightFront;
    public static SpeedController drivetrainRightRear;
    public static SpeedController drivetrainLeftFront;
    public static SpeedController drivetrainLeftRear;
    public static SpeedController drivetrainRightMiddle;
    public static SpeedController drivetrainLeftMiddle;
    public static RobotDrive robotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        drivetrainRightFront = new Jaguar(5);
        LiveWindow.addActuator("Drivetrain", "RightFront", (Jaguar) drivetrainRightFront);
        
        drivetrainRightRear = new Jaguar(3);
        LiveWindow.addActuator("Drivetrain", "RightRear", (Jaguar) drivetrainRightRear);
        
        drivetrainLeftFront = new Jaguar(0);
        LiveWindow.addActuator("Drivetrain", "LeftFront", (Jaguar) drivetrainLeftFront);
        
        drivetrainLeftRear = new Jaguar(2);
        LiveWindow.addActuator("Drivetrain", "LeftRear", (Jaguar) drivetrainLeftRear);
        
        drivetrainRightMiddle = new Jaguar(4);
        LiveWindow.addActuator("Drivetrain", "RightMiddle", (Jaguar) drivetrainRightMiddle);
        
        drivetrainLeftMiddle = new Jaguar(1);
        LiveWindow.addActuator("Drivetrain", "LeftMiddle", (Jaguar) drivetrainLeftMiddle);
        
        robotDrive = new RobotDrive(Hardware.joinMotors(drivetrainLeftFront, drivetrainLeftMiddle, drivetrainLeftRear),
        		Hardware.joinMotors(drivetrainRightFront, drivetrainRightMiddle, drivetrainRightRear));
        
        robotDrive.setSafetyEnabled(true);
        robotDrive.setExpiration(0.1);
        robotDrive.setSensitivity(0.5);
        robotDrive.setMaxOutput(1.0);


        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
