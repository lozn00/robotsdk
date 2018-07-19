package cn.qssq666.robot.plugin.sdk.interfaces;

/**
 * Created by qssq on 2018/1/21 qssq666@foxmail.com -encoding utf-8 -charset
 * utf-8
 */

public interface PluginControlInterface {
	public void sendGroupMsg(IMsgModel item);

	public void sendQQMsg(IMsgModel item);

	/**
	 * 执行万能操作  比如执行 type=0 arg= sql语句，那么表示控制宿主执行sql的更新操作,以后插件是否篡改吧 ，通过这里授权也可以走这个逻辑呢。
	 * @param type
	 * @param arg
	 */
	public void executeAction(int type,Object... arg);

	/**
	 * 执行sql语句 更新某些操作。
	 * @param sql
	 */
	public void executeSql(String sql);

	/**
	 * executeShell()实际上走的逻辑还是executeAction得逻辑
	 * @param shell
	 */
	public void executeShell(String shell);

	/**
	 * 这里的操作实际上内部还是走的是executeAction的逻辑
	 * @param key
	 * @param value
	 */
	public void executeWriteConfig(String key,String value);

	/**
	 * 发送任意消息,类型自己控制,根据{@link IMsgModel#setCode(int)}
	 * 进行配置.暂时不提供具体说明,总之此api一样可以实现禁言踢人. 发送卡卡片消息
	 *
	 * @param item
	 *            x
	 */
	public void sendMsg(IMsgModel item);

	/**
	 *
	 * @param item
	 *            item 不可为空，建议直接把回调的item再返回过来
	 * @param gagduration
	 *            禁言时间 秒 ，当小于60的时候会自动解除禁言，最多不能超过30天否则设置无效
	 */
	public void sendGagMsg(IMsgModel item, long gagduration);

	/**
	 *
	 * @param item
	 *            item 不可为空，建议直接把回调的item再返回过来
	 * @param group
	 * @param qq
	 * @param gagduration
	 *            禁言时间
	 */
	public void sendGagMsg(IMsgModel item, String group, String qq, long gagduration);

	/**
	 * 发送艾特消息，但是昵称要自己在{@link IMsgModel#setMessage(String)}} 里面设置好 。否则会出现一些毛病
	 *
	 * @param item
	 *            item 不可为空，建议直接把回调的item再返回过来
	 * @param group
	 *            所在群
	 * @param qq
	 *            艾特的qq
	 */
	public void sendAtMsg(IMsgModel item, String group, String qq);

	/**
	 * 发送踢人命令
	 *
	 * @param item
	 *            item 不可为空，建议直接把回调的item再返回过来
	 * @param forverKick
	 *            是否永久踢出
	 */
	public void sendKickMsg(IMsgModel item, boolean forverKick);
	/**
	 *
	 * @param item tem 不可为空，建议直接把回调的item再返回过来
	 * @param group 所在群
	 * @param qq  qq
	 * @param xmlMsg  xml结构体 可实现点歌机器人 接口字符串不正确会引发崩溃，请慎重使用，不要写错哦！xmlMsg 顾名思义，意思是这个内容是<xml这样的格式，直接写字符串会崩溃的。
	 */
	public void sendMsgCardMsg(IMsgModel item, String group, String qq, String xmlMsg);

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
	public void sendKickMsg(IMsgModel item, String group, String qq, boolean forverKick);

	/**
	 * 是否是群消息(包含群讨论组,等消息)
	 *
	 * @param item
	 *            不传递参数是没法判断而且会崩溃，这个参数从
	 *            {@link PluginInterface#onReceiveMsgIsNeedIntercept(IMsgModel)}
	 *            }里面回调过来的，也就是说这玩意肯定也是在那个方法流程里面走逻辑的。
	 * @return
	 */
	boolean isGroupMsg(IMsgModel item);

	/**
	 * 是否是私聊消息 也有可能是陌生人，群私聊等消息. 其他api暂时不提供!你也完全可以自己根据
	 * {@link IMsgModel#getIstroop()} 和{@link IMsgModel#getType()} 来进行判断
	 *
	 * @param item
	 * @return
	 */
	boolean isPrivateMsg(IMsgModel item);

	/**
	 * 是否是图片消息 暂时不太准确.
	 *
	 * @param item
	 * @return
	 */
	boolean isPicMsg(IMsgModel item);


	/**
	 * 发送图片消息 如果是私聊消息,group将被忽略,是否是私聊消息会根据item里面的type取。
	 * @param item
	 * @param group 群号
	 * @param qq qq
	 * @param picPath 图片路径
	 */
	public void sendPicMsg(IMsgModel item, String group, String qq,String picPath);

	/**
	 * 发送万能消息 通过这个方法也可以实现禁言,踢人.
	 * @param item
	 * @param extra
	 * @param type
	 */
	public void sendUniversalMsg(IMsgModel item,String extra,int type);

}
