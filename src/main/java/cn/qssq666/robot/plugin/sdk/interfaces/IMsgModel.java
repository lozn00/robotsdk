package cn.qssq666.robot.plugin.sdk.interfaces;

/**
 * Created by qssq on 2018/5/17 qssq666@foxmail.com
 */
public interface IMsgModel {
        /**
         * 查询你猜
         * @return
         */

        public String getNickname();

        /**
         * 设置你猜
         * @param nickname
         */
        public void setNickname(String nickname);

        /**
         * ==1通常为群消息，==0 通常为 普通消息等于1000 为群私聊消息，
         * @return
         */

        public int getIstroop();

        public IMsgModel setIstroop(int istroop);

        /**
         * ==1000的时候 是群号，==0 或者等于1的时候是 QQ，
         * @return
         */

        public String getSenderuin();

        /**
         *
         * @param senderuin 发消息人的qq
         * @return
         */

        public IMsgModel setSenderuin(String senderuin);

        /**
         *  发消息人的qq/或者群号，如果 ==1000的时候为QQ,istroop=1的时候为群号， istroop=0的时候 和 senderuin一样。
         * @return
         */

        public String getFrienduin();

        public IMsgModel setFrienduin(String frienduin);

        public String getMessage();

        public IMsgModel setMessage(String message);

        public int getType();

        public IMsgModel setType(int type);


        public String getExtrajson();

        /**
         * 不要去修改，
         * @param extrajson
         */
        public void setExtrajson(String extrajson);

        /**
         * 附加参数 不要修改。
         * @return
         */
        public String getExtstr();
        public void setExtstr(String extstr);

        /**
         * 机器人自己的qq号码
         * @return
         */
        public String getSelfuin();

        public void setSelfuin(String selfuin);


        public String getVersion() ;

        public void setVersion(String version);


        public String getApptype();

        public void setApptype(String apptype);

        /**
         * 收到消息的时间，
         * @return
         */

        public long getTime();

        /**
         * 不要去修改
         * @param time
         * @return
         */

        public IMsgModel setTime(long time);

        public int getCode();
        IMsgModel clone();

        /**
         * 不要修改，这是判断会调结果的，不等于0 就不处理 请求。
         * @param code
         * @return
         */
        public IMsgModel setCode(int code);

        /**
         * 万能的action操作。
         * @param type
         * @param obj
         */
        public void setUniversalAction(int type,Object obj);

        /**
         * 通过类型 获取值。
         * @param type
         * @return
         */
        public Object getUniversalAction(int type);

    }
