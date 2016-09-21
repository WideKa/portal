package com.wideka.portal.portal.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.wideka.portal.framework.action.BaseAction;

/**
 * 
 * @author JiakunXu
 * 
 */
@Controller
@Scope("request")
public class PortalAction extends BaseAction {

	private static final long serialVersionUID = 2191525146456353749L;

	/**
	 * 首页.
	 * 
	 * @return
	 */
	public String index() {
		return SUCCESS;
	}

}
