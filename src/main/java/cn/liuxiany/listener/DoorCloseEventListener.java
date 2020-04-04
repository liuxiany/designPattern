package cn.liuxiany.listener;

import java.util.EventListener;

/**
 * 房门关闭事件监听器
 *
 * @author liuxiany
 * @date 2020/01/14
 */
public interface DoorCloseEventListener extends EventListener {

    void close(DoorCloseEvent event, Object arg);
}