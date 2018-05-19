package cn.qssq666.robot.plugin.sdk.interfaces;

/**
 * Created by qssq on 2018/1/21 qssq666@foxmail.com
 */

public interface RobotConfigInterface {
	/**
	 * 是否禁用了群消息处理
	 *
	 * @return
	 */
	boolean isEnableGroupMsg();

	/**
	 * 回复的时候是否艾特用户
	  @param  config 通过配置信息来查询的，不让
	 * @return
	 */
	boolean isReplyAiteUser(IGroupConfig config);

	/**
	 *  判断是否回复需要艾特用户
	 * @param group 群号
	 * @return true表示需要
	 */
	boolean isReplyAiteUser(String group);

	/**
	 * 是否需要艾特才能回复
	 *
	 * @return true表示需要艾特才能回复
	 */
	boolean isNeedAiteReply(IGroupConfig config);

	/**
	 *   是否需要艾特才触发回复
	 * @param group 群号
	 * @return true表示需要艾特才能回复
	 */
	boolean isNeedAiteReply(String group);

	/**
	 * 是否允许了私聊功能
	 *
	 * @return true表示 允许处理私聊消息，
	 */

	boolean isEnablePrivateReply();

	/**
	 * 获取群配置信息的接口配置类
	 * @return 返回的对象 可以查询群配置信息。
	 */
	IGroupConfig queryGroupConfig(String group);


	/**
	 * 是否开启了群白名单 这个固定值，为true
	 *
	 * @return 返回true表示 启用了摆明的
	 */
	boolean isEnableGroupWhilteName();

	/**
	 * 机器人是否会处理此消息 这个，，这个没用，我也不知道为毛写这个。
	 *
	 * @return  返回true 表示 这个群 应该是可以处理 回复的，
	 */
	boolean currentGroupRobotIsShouldReply();

	/**
	 * 对于暂时没有提供的方法，可使用此方法进行查询
	 *
	 * @param typeConfig
	 * @return
	 */
	boolean generalQuery(int typeConfig);

	/**
	 * 方便根据消息来查询某些配置，扩展 适配更便捷
	 *
	 * @param type  查询的类型
	 * @param item  传递刚刚收到的消息
	 * @return  返回一个结果给机器人，比如  传递 type=1代表 是否root，返回 true 那么这个手机 root了，然后你可以执行删除系统文件命令，哈哈 开玩笑的。突然感觉 插件搞起来很可怕搞不好就手机报废了 。。
	 */
	boolean generalQueryItem(int type, IMsgModel item);

	/**
	 * 判断是否在群白名单
	 *
	 * @param item
	 * @return true 表示 在 群白名单，不在群白名单的东西通常不推荐处理消息因为人家本来就不需要管理它，你特么还。
	 */
	boolean isAtGroupWhiteNames(IMsgModel item);

	/**
	 * 查询机器人版本 用于适配和忽略调用某些api,比如使用的是高版本的sdk开发的插件，但是机器人是低版本的，那么调用查询会引发崩溃。
	 *
	 * @return 返回的是机器人的versionCode
	 */
	int getRobotVersion();
}
