package cn.qssq666.robot.plugin.sdk.interfaces;

public interface RobotGlobaInfo {
	public int sdk_version = 5;

	/**
	 * 这个累吗暂时不能修改 这是入口类，机器人宿主调用的类，这个类必须实现 {PluginInterface}
	 */
	public String IMPL_ClASS_NAME ="cn.qssq666.robot.plugin.sdk.control.PluginMainImpl";
	public String updateTIme = "2018-1-28 21:06:54";
	//
	public String updateInfo = "增加更多群配置的读取,如查询某个群是否在白名单列表的读取判断检测，2018-05-16 23:21:18\n打算设计ui界面，方便用户管理数据。需要的机器人版本versionCode>41,否则调用某些功能会出现崩溃";
}
