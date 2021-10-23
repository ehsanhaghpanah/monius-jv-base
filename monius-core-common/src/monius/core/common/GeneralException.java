/**
 * @author Ehsan Haghpanah (haghpanah@monius.net)
 * Copyright (C) moniüs, 2013.
 * All rights reserved.
 */

package monius.core.common;

public class GeneralException extends monius.core.base.Exception
{
	public GeneralException()
	{
		setOpCode(0x0001);
		setShouldLogged(true);
	}

	//region ShouldLogged
	private boolean shouldLogged;

	public boolean isShouldLogged()
	{
		return shouldLogged;
	}

	public void setShouldLogged(boolean value)
	{
		shouldLogged = value;
	}
	//endregion
}