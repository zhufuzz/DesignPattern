package com.java.jikexueyuan.commandmode.command;

import com.java.jikexueyuan.commandmode.device.Stereo;

public class StereoOffCommand implements Command {
	private Stereo setreo;
	public StereoOffCommand(Stereo setreo)
	{
		this.setreo=setreo;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		setreo.Off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		setreo.On();
		setreo.SetCd();
	}

}
