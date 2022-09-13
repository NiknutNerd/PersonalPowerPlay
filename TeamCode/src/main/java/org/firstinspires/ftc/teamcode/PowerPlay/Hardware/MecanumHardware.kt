package org.firstinspires.ftc.teamcode.PowerPlay.Hardware

import com.qualcomm.robotcore.hardware.DcMotor
import com.qualcomm.robotcore.hardware.DcMotorSimple
import com.qualcomm.robotcore.hardware.HardwareMap
import kotlin.math.PI

class MecanumHardware {
    val TICKS_PER_MOTOR_REV = 537.7
    val DRIVE_GEAR_RATIO = 1
    val TICKS_PER_DRIVE_REV = TICKS_PER_MOTOR_REV * DRIVE_GEAR_RATIO
    val WHEEL_CIRCUMFERENCE = 4 * PI
    val TICKS_PER_INCH = TICKS_PER_DRIVE_REV / WHEEL_CIRCUMFERENCE

    lateinit var frontLeft : DcMotor
    lateinit var frontRight : DcMotor
    lateinit var backLeft : DcMotor
    lateinit var backRight : DcMotor

    fun init(hardwareMap : HardwareMap){
        frontLeft = hardwareMap["frontLeft"] as DcMotor
        frontRight = hardwareMap["frontRight"] as DcMotor
        backLeft = hardwareMap["backLeft"] as DcMotor
        backRight = hardwareMap["backRight"] as DcMotor

        frontRight.direction = DcMotorSimple.Direction.REVERSE
        backRight.direction = DcMotorSimple.Direction.REVERSE

        frontLeft.power = 0.0
        frontRight.power = 0.0
        backLeft.power = 0.0
        backRight.power = 0.0

        frontLeft.mode = DcMotor.RunMode.RUN_USING_ENCODER
        frontRight.mode = DcMotor.RunMode.RUN_USING_ENCODER
        backLeft.mode = DcMotor.RunMode.RUN_USING_ENCODER
        backRight.mode = DcMotor.RunMode.RUN_USING_ENCODER


    }
}