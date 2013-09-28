package mj.framework.web.common;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mj.framework.db.DBHelper;
import mj.framework.web.action.ActionUtil;
import mj.framework.web.page.PageUtil;

import org.apache.log4j.Logger;

public class InitSystem extends HttpServlet {
	
	private static Logger logger = Logger.getLogger(InitSystem.class.getName());

	public InitSystem() {
		super();
	}
	
	/**
	 * 初始化系统所需要数据
	 */
	public void init() throws ServletException {
		/**
		 * 1、初始化数据库连接池
		 */
		logger.info("【系统初始化】【1】初始化数据库连接池...");
		DBHelper dbHelper = new DBHelper();
		dbHelper = null;
		
		/**
		 * 2、加载所有系统Action
		 */
		logger.info("【系统初始化】【2】加载所有系统Action...");
		ActionUtil.doNothing();

		/**
		 * 3、加载所有系统Page
		 */
		logger.info("【系统初始化】【3】加载所有系统Page...");
		PageUtil.doNothing();
	}

	public void destroy() {
		super.destroy(); 
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}


}
