package cn.qssq666.robot.plugin.sdk.interfaces;

/**
 * Created by qssq on 2018/5/17 qssq666@foxmail.com
 未来的版本 查询群的配置会传递这个参数进来。
 */
public interface IGroupConfig {

    /**
     * 比如要查询 群是否允许回复， 传递一个 type==多少则返回一个boolean类型的值
     * @param type
     * @return
     */
    boolean universalQueryBoolean(int type,Object... args);
    String universalQueryString(int type,Object... args);
    boolean universalSaveInfo();

}
