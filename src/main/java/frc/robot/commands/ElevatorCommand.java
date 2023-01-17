package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.*;

public class ElevatorCommand extends CommandBase {
    
    XboxController controller;
    ElevatorSubsystem elevatorSubsystem;
    TiltSubsystem inclinatorSubsystem;
    final double upperDistance = 0;
    final double middleDistance = 0;
    final double restPosition = 0;
    final double upperDegree = 0;
    final double middleDegree = 0;
    final double restDegree = 0;

    public ElevatorCommand(ElevatorSubsystem eSubsystem, TiltSubsystem iSubsystem, XboxController controller)  {
        this.controller = controller;
        this.elevatorSubsystem = eSubsystem;
        this.inclinatorSubsystem = iSubsystem;
        addRequirements(elevatorSubsystem);
        addRequirements(inclinatorSubsystem);
    }

    @Override 
    public void execute()   {
        if (controller.getAButton())    {
            elevatorSubsystem.goUp(upperDistance);
            inclinatorSubsystem.tiltUp(upperDegree);
        }
        if (controller.getAButton())    {
            elevatorSubsystem.goUp(middleDistance);
            inclinatorSubsystem.tiltUp(middleDegree);
        }
        if (controller.getAButton())    {
            elevatorSubsystem.goDown(restPosition);
            inclinatorSubsystem.tiltDown(restDegree);
        }
    }

}
