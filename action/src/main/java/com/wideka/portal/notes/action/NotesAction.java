package com.wideka.portal.notes.action;

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
public class NotesAction extends BaseAction {

	private static final long serialVersionUID = 6234431241610748908L;

	public String index() {
		return SUCCESS;
	}

}
