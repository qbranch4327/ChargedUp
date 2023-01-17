package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.*;

import java.sql.Time;
import java.util.Timer;

public class AutonElevatorCommand extends CommandBase{
    ElevatorSubsystem elevatorSubsystem;
    Timer timer;
    TiltSubsystem tiltSubsystem;
    
    public AutonElevatorCommand(ElevatorSubsystem elevatorSubsystem, Timer timer, TiltSubsystem tiltSubsystem) {
        this.elevatorSubsystem = elevatorSubsystem;
        this.timer = timer;
    }
}
