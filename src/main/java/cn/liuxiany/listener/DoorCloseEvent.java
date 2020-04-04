package cn.liuxiany.listener;

import java.util.EventObject;

/**
 * 房门关闭事件
 *
 * @author liuxiany
 * @date 2020/01/14
 */
public class DoorCloseEvent extends EventObject {

    public DoorCloseEvent(Door source) {
        super(source);
    }

    public Door getDoor() {
        return (Door) super.getSource();
    }
}
