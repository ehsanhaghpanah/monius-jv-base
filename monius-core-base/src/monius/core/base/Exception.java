/**
 * @author Ehsan Haghpanah (haghpanah@monius.net)
 * Copyright (C) moniüs, 2013.
 * All rights reserved.
 */

package monius.core.base;

public class Exception extends Throwable
{
	//region OpCode
	private int opCode;
	
	public int getOpCode()
	{
		return opCode;
	}
	
	protected void setOpCode(int value)
	{
		opCode = value;
	}
	//endregion
}