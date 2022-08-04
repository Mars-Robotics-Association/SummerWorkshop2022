package org.firstinspires.ftc.teamcode._RobotCode.owen;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Core.InputSystem.ControllerInput;
import org.firstinspires.ftc.teamcode.Core.InputSystem.ControllerInputListener;

@TeleOp(name = "Owen_Training_Teleop", group = "Training")
public class TrainingTeleOp extends OpMode implements ControllerInputListener
{
    private TrainingBot robot;
    private ControllerInput input;

    @Override
    public void init() {
        input = new ControllerInput(gamepad1, 1);
        input.addListener(this);
        robot = new TrainingBot(this, true, false, false);
        robot.Init();
    }

    @Override
    public void start(){
        robot.Start();
    }

    @Override
    public void loop() {
        input.Loop();
        robot.Update();
        //driving
        robot.getChassis().DriveWithGamepad(input, 1, 1, 1);
        telemetry.update();
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
