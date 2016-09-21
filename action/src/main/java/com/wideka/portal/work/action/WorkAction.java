package com.wideka.portal.work.action;

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
public class WorkAction extends BaseAction {

	private static final long serialVersionUID = 8880463224142949166L;

	/**
	 * 
	 * @return
	 */
	public String index() {
		return SUCCESS;
	}

}
