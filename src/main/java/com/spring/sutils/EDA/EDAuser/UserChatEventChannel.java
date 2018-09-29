package com.spring.sutils.EDA.EDAuser;

import com.spring.sutils.EDA.AsyncChannel;
import com.spring.sutils.EDA.Event;

/**
 * @Auther :huiqiang
 * @Description :
 * @Date: Create in 15:52 2018/9/29 2018
 * @Modify:
 */
public class UserChatEventChannel extends AsyncChannel {


    @Override
    protected void handle(Event msg) {
        UserChatEvent userOnLineEvent = (UserChatEvent)msg;
        System.out.println("the user"+((UserOnLineEvent) msg).getUser().getUsername()+"is online"+"  say "+userOnLineEvent.getMessage());
    }
}
