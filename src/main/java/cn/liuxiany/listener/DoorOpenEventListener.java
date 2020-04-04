package cn.liuxiany.listener;

import java.util.EventListener;

/**
 * 房门开启事件监听器
 *
 * @author liuxiany
 * @date 2020/01/14
 */
public interface DoorOpenEventListener extends EventListener {

    void open(DoorOpenEvent event, Object arg);
}
