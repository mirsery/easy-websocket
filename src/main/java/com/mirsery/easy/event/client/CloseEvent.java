package com.mirsery.easy.event.client;

import org.springframework.context.ApplicationEvent;

/**
 * 关闭连接事件
 **/
public class CloseEvent extends ApplicationEvent {


    public CloseEvent(Object source) {
        super(source);
    }


}
