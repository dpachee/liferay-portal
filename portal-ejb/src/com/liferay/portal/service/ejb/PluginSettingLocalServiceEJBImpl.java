/**
 * Copyright (c) 2000-2007 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portal.service.ejb;

import com.liferay.portal.service.PluginSettingLocalService;
import com.liferay.portal.service.PluginSettingLocalServiceFactory;

import javax.ejb.CreateException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

/**
 * <a href="PluginSettingLocalServiceEJBImpl.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class PluginSettingLocalServiceEJBImpl
	implements PluginSettingLocalService, SessionBean {
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.DynamicQueryInitializer queryInitializer)
		throws com.liferay.portal.SystemException {
		return PluginSettingLocalServiceFactory.getTxImpl().dynamicQuery(queryInitializer);
	}

	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.DynamicQueryInitializer queryInitializer,
		int begin, int end) throws com.liferay.portal.SystemException {
		return PluginSettingLocalServiceFactory.getTxImpl().dynamicQuery(queryInitializer,
			begin, end);
	}

	public void checkPermission(java.lang.String userId,
		java.lang.String pluginId, java.lang.String pluginType)
		throws com.liferay.portal.PortalException {
		PluginSettingLocalServiceFactory.getTxImpl().checkPermission(userId,
			pluginId, pluginType);
	}

	public com.liferay.portal.model.PluginSetting getDefaultPluginSetting() {
		return PluginSettingLocalServiceFactory.getTxImpl()
											   .getDefaultPluginSetting();
	}

	public com.liferay.portal.model.PluginSetting getSettingOrDefault(
		java.lang.String companyId, java.lang.String pluginId,
		java.lang.String pluginType)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		return PluginSettingLocalServiceFactory.getTxImpl().getSettingOrDefault(companyId,
			pluginId, pluginType);
	}

	public com.liferay.portal.model.PluginSetting getByC_I_T(
		java.lang.String companyId, java.lang.String pluginId,
		java.lang.String pluginType) throws com.liferay.portal.SystemException {
		return PluginSettingLocalServiceFactory.getTxImpl().getByC_I_T(companyId,
			pluginId, pluginType);
	}

	public boolean hasPermission(java.lang.String userId,
		java.lang.String pluginId, java.lang.String pluginType) {
		return PluginSettingLocalServiceFactory.getTxImpl().hasPermission(userId,
			pluginId, pluginType);
	}

	public com.liferay.portal.model.PluginSetting updatePluginSetting(
		java.lang.String companyId, java.lang.String pluginId,
		java.lang.String pluginType, java.lang.String roles, boolean active)
		throws com.liferay.portal.PortalException, 
			com.liferay.portal.SystemException {
		return PluginSettingLocalServiceFactory.getTxImpl().updatePluginSetting(companyId,
			pluginId, pluginType, roles, active);
	}

	public void ejbCreate() throws CreateException {
	}

	public void ejbRemove() {
	}

	public void ejbActivate() {
	}

	public void ejbPassivate() {
	}

	public SessionContext getSessionContext() {
		return _sc;
	}

	public void setSessionContext(SessionContext sc) {
		_sc = sc;
	}

	private SessionContext _sc;
}