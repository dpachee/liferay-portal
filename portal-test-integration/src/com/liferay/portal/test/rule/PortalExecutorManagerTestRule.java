/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.test.rule;

import com.liferay.portal.kernel.test.rule.BaseTestRule;
import com.liferay.portal.test.rule.callback.PortalExecutorManagerTestCallback;

/**
 * @author     Michael C. Han
 * @deprecated As of Judson, with no direct replacement
 */
@Deprecated
public class PortalExecutorManagerTestRule
	extends BaseTestRule<Object, Object> {

	public static final PortalExecutorManagerTestRule INSTANCE =
		new PortalExecutorManagerTestRule();

	private PortalExecutorManagerTestRule() {
		super(PortalExecutorManagerTestCallback.INSTANCE);
	}

}