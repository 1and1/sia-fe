/*
 * 
 * Copyright (c) 2016 1&1 Internet SE.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 *        
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package com.oneandone.relesia.webclient;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.oneandone.relesia.webclient.model.AbstractWebClientEntity;
import com.oneandone.relesia.webclient.model.SCM;

@ManagedBean(name = "scmListController", eager = true)
@ViewScoped
public class SCMListController extends AbstractEntityListController implements Serializable {

	private static final long serialVersionUID = 884991962565996416L;

	private String name;
	private String type;
	private String url;
	private boolean supportsAuth;

	@Override
	protected String getBackendEndpoint() {
		return getRootBackendEndpoint() + "/scms";
	}

	@Override
	protected Class<? extends AbstractWebClientEntity> getTargetClass() {
		return SCM.class;
	}

	@Override
	protected AbstractWebClientEntity createNewEntity() {
		return new SCM();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isSupportsAuth() {
		return supportsAuth;
	}

	public void setSupportsAuth(boolean supportsAuth) {
		this.supportsAuth = supportsAuth;
	}
}
