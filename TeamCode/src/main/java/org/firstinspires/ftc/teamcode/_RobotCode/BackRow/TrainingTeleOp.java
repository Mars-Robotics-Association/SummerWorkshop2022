package org.firstinspires.ftc.teamcode._RobotCode.BackRow;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Core.InputSystem.ControllerInput;
import org.firstinspires.ftc.teamcode.Core.InputSystem.ControllerInputListener;

@TeleOp(name= "BackRow_Training_TeleOp")
public class TrainingTeleOp extends OpMode implements ControllerInputListener
{
    private TrainingBot robot;

    @Override
    public void init() {
        robot = new TrainingBot(this,true,false,false);


    }

    @Override
    public void loop() {

    }

    @Override
    public void ButtonPressed(int id, ControllerInput.Button button) {

    }

    @Override
    public void ButtonHeld(int id, ControllerInput.Button button) {

    }

    @Override
    public void ButtonReleased(int id, ControllerInput.Button button) {

    }
}
