package cn.qssq666.robot.plugin.sdk.interfaces;

import cn.qssq666.robot.bean.MsgItem;

/**
 * Created by qssq on 2018/1/21 qssq666@foxmail.com -encoding utf-8 -charset
 * utf-8
 */

public interface PluginControlInterface {
	public void sendGroupMsg(MsgItem item);

	public void sendQQMsg(MsgItem item);

	/**
	 * 发送任意消息,类型自己控制,根据{@link MsgItem#setCode(int)}
	 * 进行配置.暂时不提供具体说明,总之此api一样可以实现禁言踢人. 发送卡卡片消息
	 *
	 * @param item
	 *            x
	 */
	public void sendMsg(MsgItem item);

	/**
	 *
	 * @param item
	 *            item 不可为空，建议直接把回调的item再返回过来
	 * @param gagduration
	 *            禁言时间 秒 ，当小于60的时候会自动解除禁言，最多不能超过30天否则设置无效
	 */
	public void sendGagMsg(MsgItem item, long gagduration);

	/**
	 *
	 * @param item
	 *            item 不可为空，建议直接把回调的item再返回过来
	 * @param group
	 * @param qq
	 * @param gagduration
	 *            禁言时间
	 */
	public void sendGagMsg(MsgItem item, String group, String qq, long gagduration);

	/**
	 * 发送艾特消息，但是昵称要自己在{@link MsgItem#setMessage(String)}} 里面设置好 。否则会出现一些毛病
	 *
	 * @param item
	 *            item 不可为空，建议直接把回调的item再返回过来
	 * @param group
	 *            所在群
	 * @param qq
	 *            艾特的qq
	 */
	public void sendAtMsg(MsgItem item, String group, String qq);

	/**
	 * 发送踢人命令
	 *
	 * @param item
	 *            item 不可为空，建议直接把回调的item再返回过来
	 * @param forverKick
	 *            是否永久踢出
	 */
	public void sendKickMsg(MsgItem item, boolean forverKick);
	/**
	 *
	 * @param item tem 不可为空，建议直接把回调的item再返回过来
	 * @param group 所在群
	 * @param qq  qq
	 * @param xmlMsg  xml结构体 可实现点歌机器人
	 */
	public void sendMsgCardMsg(MsgItem item, String group, String qq, String xmlMsg);

	/**
	 * 发送踢人命令
	 *
	 * @param item
	 *            不可为空，建议直接把回调的item再返回过来
	 * @param group
	 *            群号
	 * @param qq
	 *            qq
	 * @param forverKick
	 *            是否永久踢出
	 */
	public void sendKickMsg(MsgItem item, String group, String qq, boolean forverKick);

	/**
	 * 是否是群消息(包含群讨论组,等消息)
	 *
	 * @param item
	 *            不传递参数是没法判断而且会崩溃，这个参数从
	 *            {@link PluginInterface#onReceiveMsgIsNeedIntercept(MsgItem)}
	 *            }里面回调过来的，也就是说这玩意肯定也是在那个方法流程里面走逻辑的。
	 * @return
	 */
	boolean isGroupMsg(MsgItem item);

	/**
	 * 是否是私聊消息 也有可能是陌生人，群私聊等消息. 其他api暂时不提供!你也完全可以自己根据
	 * {@link MsgItem#getIstroop()} 和{@link MsgItem#getType()} 来进行判断
	 *
	 * @param item
	 * @return
	 */
	boolean isPrivateMsg(MsgItem item);

	/**
	 * 是否是图片消息 暂时不太准确.
	 *
	 * @param item
	 * @return
	 */
	boolean isPicMsg(MsgItem item);

}
