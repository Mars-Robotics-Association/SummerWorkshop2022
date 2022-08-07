package org.firstinspires.ftc.teamcode._RobotCode.owen;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DistanceSensor;

import org.firstinspires.ftc.teamcode.Core.MechanicalControlToolkit.Chassis.MecanumChassis;

public class TestNavigator
{
    OpMode opMode;
    MecanumChassis chassis;
    DistanceSensor sideDistanceSensor;
    ColorSensor colorSensor;

    double whiteThreshold = 150;
    double wallDistThreshold = 3; //in cm

    public TestNavigator(OpMode setOpMode, MecanumChassis setChassis, DistanceSensor setDistance, ColorSensor setColor){

    }

    //Goes to the wall at a given angle and speed. Takes both distance sensors into account
    public void goToWall(double angle, double speed){

    }
    //Drives at angle and speed until color sensor detects white
    public void driveToWhite(double angle, double speed){

    }
    //Drives for time
    public void driveForTime(double timeSeconds, double speed){

    }
    //Does nothing for time
    public void waitSeconds(double time){

    }
    //Stops moving
    public void stopMoving(){

    }
}
