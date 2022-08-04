package org.firstinspires.ftc.teamcode._RobotCode.BackRow;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Core.InputSystem.ControllerInput;
import org.firstinspires.ftc.teamcode.Core.InputSystem.ControllerInputListener;

@TeleOp(name = "BackRow_Training_TeleOp")
public class TrainingTeleOp extends OpMode implements ControllerInputListener {
    private TrainingBot robot;
    private ControllerInput input;

    @Override
    public void init() {

        input = new ControllerInput(gamepad1, 1);
        input.addListener(this);
        robot = new TrainingBot(this, true, false, false);
    }

    @Override
    public void start() {
        robot.Start();
    }

    @Override
    public void loop() {
        input.Loop();
        robot.Update();
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
