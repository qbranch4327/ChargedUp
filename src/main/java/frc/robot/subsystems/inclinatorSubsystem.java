package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType; 

public class inclinatorSubsystem extends SubsystemBase  {
    
    CANSparkMax tiltMotor;
    Encoder tiltEncoder;

    public inclinatorSubsystem()    {
        tiltMotor = new CANSparkMax(5, MotorType.kBrushless);
        tiltEncoder = new Encoder(2, 3);
    }

    public void tiltUp(double degrees)    {
        tiltMotor.set(0.3);
        if (tiltEncoder.getDistance() == degrees)   {
            tiltMotor.stopMotor();
        }
    }

    public void tiltDown(double degrees)    {
        tiltMotor.set(-0.3);
        if (tiltEncoder.getDistance() == degrees)   {
            tiltMotor.stopMotor();
        }
    }
}
