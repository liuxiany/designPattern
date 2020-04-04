package cn.liuxiany.listener;

import java.util.EventObject;

/**
 * 房门开启事件
 *
 * @author liuxiany
 * @date 2020/01/14
 */
public class DoorOpenEvent extends EventObject {

    public DoorOpenEvent(Door source) {
        super(source);
    }

    public Door getDoor() {
        return (Door) super.getSource();
    }
}
