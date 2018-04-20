package com.ants.common.web.constants;

/**
 * 
* @ClassName: SessionConstant  
* @Description: TODO(会话键)  
* @author 马高伟
* @date 2018年3月25日  
*
 */
public interface SessionConstant {

	/**
	 * 登录用户的session键名.
	 */
	public static final String USER_SESSION_KEY = "userKey";
	
	/**
	 * 用户密码连续输错次数限制(默认3).
	 */
	public static int WEB_PWD_INPUT_ERROR_LIMIT = 3;

}
