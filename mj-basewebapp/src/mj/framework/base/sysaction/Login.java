package mj.framework.base.sysaction;

import org.apache.log4j.Logger;

import mj.framework.web.action.ActionExecute;
import mj.framework.web.action.BaseAction;

public class Login extends BaseAction{
	
	private static Logger logger = Logger.getLogger(Login.class.getName());

	@Override
	public void beforeExecute() {
		logger.error("-->>beforeExecute");
	}

	@Override
	public void execute() {
		logger.error("-->>execute");
	}

	@Override
	public void afterExecute() {
		logger.error("-->>afterExecute");
	}

}
