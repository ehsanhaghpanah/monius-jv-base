/**
 * @author Ehsan Haghpanah (haghpanah@monius.net)
 * Copyright (C) moniüs, 2018.
 * All rights reserved.
 */

package renegade.test;

import junit.framework.TestCase;

public final class Wapp extends TestCase
{
	public Wapp()
	{
	}

	public void test()
	{
		try
		{
			throw new monius.core.common.CommonValidationException();
		}
		catch (monius.core.base.Exception p)
		{
			System.out.println(p.getOpCode());
		}
		catch (Throwable t)
		{
			System.out.println(t.toString());
		}
	}
}