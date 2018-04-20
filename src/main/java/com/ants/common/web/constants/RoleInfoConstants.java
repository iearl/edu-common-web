package com.ants.common.web.constants;
/**
 * 
* @ClassName: RoleInfoConstants  
* @Description: TODO(角色信息)  
* @author 马高伟
* @date 2018年3月25日  
*
*/
public interface RoleInfoConstants {
	//三种角色信息(求职会员， 公司会员， 管理员)
	public static final String jobhunter = "0";//求职会员
	public static final String company = "1";//公司会员
	public static final String manager = "2";//管理员
	
	//两种不同状态(正常， 冻结)
	public static final String normal = "0";
	public static final String freeze = "9";
	
	//根据不同的角色，返回不同的页面
	public static final String jobhunterView = "jobhunter/index";//求职会员的主页面
	public static final String companyView = "company/index";//公司会员的主页面
	public static final String managerView = "manager/index";//管理员的主页面
	
}
