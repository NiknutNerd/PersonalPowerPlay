package org.firstinspires.ftc.teamcode.PowerPlay.TeleOp

import com.qualcomm.robotcore.eventloop.opmode.OpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import org.firstinspires.ftc.teamcode.PowerPlay.Hardware.MecanumHardware

@TeleOp (name = "Kotlin TeleOp")
class MecanumTeleOp : OpMode(){
    var robot = MecanumHardware()

    override fun init() {
        robot.init(this.hardwareMap)
    }

    override fun loop() {
        var y = -gamepad1.left_stick_y
        var x = gamepad1.left_stick_x
        var rx = gamepad1.right_stick_x as Double

        robot.frontLeft.power = y + x + rx
        robot.frontRight.power = y - x - rx
        robot.backLeft.power = y - x + rx
        robot.backRight.power = y + x - rx
    }
}