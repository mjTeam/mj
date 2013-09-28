package mj.framework.base.sysmanage;

import java.sql.Types;

import mj.framework.web.action.BaseAction;

public class UserManage extends BaseAction {

	@Override
	public void beforeExecute() {
		// TODO Auto-generated method stub

	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		String user_id = this.request.getParameter("USER_ID");
		String user_pwd = this.request.getParameter("USER_PWD");
		String user_nick = this.request.getParameter("USER_NICKNAME");
		String id_card = this.request.getParameter("ID_CARD_NO");
		dbHelper.update("insert into sys_user (user_sys_id,user_id,user_pwd,user_nickname,id_card_no) values (idx_user.nextval,?,?,?,?)", new String[]{user_id,user_pwd,user_nick,id_card}, new int[]{Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR});
	}

	@Override
	public void afterExecute() {
		// TODO Auto-generated method stub

	}

}
