package cn.qssq666.robot.plugin.sdk.interfaces;

/**
 * Created by qssq on 2018/5/17 qssq666@foxmail.com
 *
 * 用户要写插件的时候可以继承这个类，这样的花，这个成员变量就不需要每次在写了
 */
public abstract class SimplePluginInterfaceWrapper implements PluginInterface{
    public PluginControlInterface getControlApi() {
        return controlApi;
    }

    private PluginControlInterface controlApi;
    private RobotConfigInterface configApi;

    @Override
    public void onReceiveControlApi(PluginControlInterface instance) {
        controlApi=instance;
    }

    @Override
    public void onReceiveRobotConfig(RobotConfigInterface robotConfigInterface) {
        configApi=robotConfigInterface;
    }
}
