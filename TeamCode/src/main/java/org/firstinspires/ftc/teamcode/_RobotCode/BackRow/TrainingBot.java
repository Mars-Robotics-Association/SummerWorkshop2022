package org.firstinspires.ftc.teamcode._RobotCode.BackRow;

import com.acmerobotics.dashboard.FtcDashboard;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.Core.HermesLog.HermesLog;
import org.firstinspires.ftc.teamcode.Core.MechanicalControlToolkit.Basic.BaseRobot;
import org.firstinspires.ftc.teamcode.Core.MechanicalControlToolkit.Chassis.ChassisProfile;
import org.firstinspires.ftc.teamcode.Core.MechanicalControlToolkit.Chassis.MecanumChassis;
import org.firstinspires.ftc.teamcode.Core.MechanicalControlToolkit.Extras.BlinkinController;
import org.firstinspires.ftc.teamcode.Navigation.Archive.FieldState.Pose;


class TrainingBot extends BaseRobot {
    ////Dependencies////
    OpMode opMode;
    MecanumChassis chassis;
    public MecanumChassis getChassis(){return chassis;}
    //Mechanical Components
    BlinkinController blinkinController;


    //Misc
    FtcDashboard dashboard;

    public TrainingBot(OpMode setOpMode, boolean useChassis, boolean usePayload, boolean useNavigator) {
        //set up robot state parent
        super(FieldSide.BLUE, new Pose(0, 0, 0), usePayload, useChassis, useNavigator);
        opMode = setOpMode;

        dashboard = FtcDashboard.getInstance();

        if (USE_CHASSIS) {
            //initialize the chassis

            chassis = new MecanumChassis(opMode, new _ChassisProfile(), new HermesLog("Tag", 500, opMode), this);

        }

        if (USE_PAYLOAD) {
            //motors

            //sensors

            blinkinController = new BlinkinController(opMode);

        }

        if (USE_NAVIGATOR) {
            //sensors

            //initialize navigator

        }
    }

    //SETUP METHODS//
    public void Init() {
        //TODO ===INIT PAYLOAD===

        //TODO ===INIT CORE ROBOT===
        chassis.InitCoreRobotModules();

        if (USE_NAVIGATOR) {
        }
    }

    public void Start() {
        chassis.StartCoreRobotModules();
        //if(USE_NAVIGATOR) navigator.NavigatorOn();
    }

    public void Update() {
        if (USE_PAYLOAD) {
        }
    }

    //TODO make sure to stop everything
    public void Stop() {
        if (USE_PAYLOAD) {

        }
    }


    public BlinkinController getLights() {
        return blinkinController;
    }


}
