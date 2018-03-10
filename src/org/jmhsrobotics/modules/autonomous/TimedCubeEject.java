package org.jmhsrobotics.modules.autonomous;

import org.jmhsrobotics.core.modulesystem.Submodule;
import org.jmhsrobotics.hardwareinterface.GrabberController;

public class TimedCubeEject extends PathNode
{
	private @Submodule GrabberController grabber;
	
	@Override
	protected void execute()
	{
		grabber.setWheels(1, 0);
	}
	
	@Override
	protected boolean isFinished()
	{
		return timeSinceInitialized() > 2;
	}
	
	@Override
	protected void end()
	{
		grabber.setWheels(0, 0);
	}
}