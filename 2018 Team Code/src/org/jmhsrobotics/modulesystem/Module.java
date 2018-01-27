package org.jmhsrobotics.modulesystem;

import edu.wpi.first.wpilibj.command.Command;

public interface Module
{
	public Command getTest();
	
	public default void onLink()
	{}
}