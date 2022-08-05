package org.firstinspires.ftc.teamcode._RobotCode.owen;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Servo;

public class ServoController
{
    OpMode opMode;
    Servo servo;

    //Class which controls a servo
    public ServoController(OpMode setOpMode, Servo setServo){
        opMode = setOpMode;
        servo = setServo;
    }

    //Moves the servo to the minimum position
    public void GoToMin(){
        opMode.telemetry.addLine("Going to min position");
        servo.setPosition(0);
    }

    //Moves the servo to the max position
    public void GoToMax(){
        opMode.telemetry.addLine("Going to max position");
        servo.setPosition(1);
    }
}
