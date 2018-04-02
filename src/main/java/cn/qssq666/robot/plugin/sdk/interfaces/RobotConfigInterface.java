package cn.qssq666.robot.plugin.sdk.interfaces;

import cn.qssq666.robot.bean.MsgItem;

/**
 * Created by qssq on 2018/1/21 qssq666@foxmail.com
 */

public interface RobotConfigInterface {
	/**
	 * 是否禁用了网络消息
	 *
	 * @return
	 */
	boolean isEnableGroupMsg();

	/**
	 * 回复的时候是否艾特用户
	 *
	 * @return
	 */
	boolean isReplyAiteUser();

	/**
	 * 是否需要艾特才能回复
	 *
	 * @return
	 */
	boolean isNeedAtteReply();

	/**
	 * 是否禁用了私聊功能
	 *
	 * @return
	 */
	boolean isEnablePrivateReply();

	/**
	 * 是否开启了群白名单
	 *
	 * @return
	 */
	boolean isEnableGroupWhilteName();

	/**
	 * 机器人是否会处理此消息
	 *
	 * @return
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
	 * @param type
	 * @param item
	 * @return
	 */
	boolean generalQueryItem(int type, MsgItem item);

	/**
	 * 判断是否在群白名单
	 *
	 * @param item
	 * @return
	 */
	boolean isAtGroupWhiteNames(MsgItem item);

	/**
	 * 查询机器人版本 用于适配和忽略调用某些api
	 *
	 * @return
	 */
	int getRobotVersion();
}
