/**
 * @author Ehsan Haghpanah (haghpanah@monius.net)
 * Copyright (C) moniüs, 2013.
 * All rights reserved.
 */

package monius.core.common;

public class CommonValidationException extends monius.core.base.Exception
{
	public CommonValidationException()
	{
		setOpCode(0x0003);
	}
}