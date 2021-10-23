/**
 * @author Ehsan Haghpanah (haghpanah@monius.net)
 * Copyright (C) moniüs, 2013.
 * All rights reserved.
 */

package monius.core.common;

public class ConfigurationMissingException extends monius.core.base.Exception
{
	public ConfigurationMissingException()
	{
		setOpCode(0x0002);
	}
}