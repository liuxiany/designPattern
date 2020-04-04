package cn.liuxiany.listener;

import java.util.ArrayList;
import java.util.List;

/**
 * 事件源
 * 房门类
 *
 * @author liuxiany
 * @date 2020/01/14
 */
public class Door {

    //房门状态，默认是关闭的
    private String state = "closed";

    //房门开启和关闭事件的监听者
    private List<DoorOpenEventListener> doorOpenEventListenerList;
    private List<DoorCloseEventListener> doorCloseEventListenerList;

    public Door() {
        doorOpenEventListenerList = new ArrayList<DoorOpenEventListener>();
        doorCloseEventListenerList = new ArrayList<DoorCloseEventListener>();
    }

    /**
     * 开启房门
     */
    public void openDoor() {

        state = "opened";

        //触发房门开启事件监听者
        DoorOpenEvent doorOpenEvent = new DoorOpenEvent(this);

        for (DoorOpenEventListener doorOpenEventListener : doorOpenEventListenerList) {
            doorOpenEventListener.open(doorOpenEvent, this.state);
        }
    }

    /**
     * 关闭房门
     */
    public void closeDoor() {

        state = "closed";

        //触发房门关闭事件监听者
        DoorCloseEvent doorCloseEvent = new DoorCloseEvent(this);

        for (DoorCloseEventListener doorCloseEventListener : doorCloseEventListenerList) {
            doorCloseEventListener.close(doorCloseEvent, this.state);
        }
    }

    /**
     * 增加房门开启监听者
     *
     * @param doorOpenEventListener
     */
    public void addDoorOpenObserver(DoorOpenEventListener doorOpenEventListener) {
        this.doorOpenEventListenerList.add(doorOpenEventListener);
    }

    /**
     * 增加房门关闭监听者
     *
     * @param doorCloseEventListener
     */
    public void addDoorCloseObserver(DoorCloseEventListener doorCloseEventListener) {
        this.doorCloseEventListenerList.add(doorCloseEventListener);
    }

    /**
     * 移除房门开启监听者
     *
     * @param doorOpenEventListener
     */
    public void removeDoorOpenObserver(DoorOpenEventListener doorOpenEventListener) {
        this.doorOpenEventListenerList.remove(doorOpenEventListener);
    }

    /**
     * 移除房门关闭监听者
     *
     * @param doorCloseEventListener
     */
    public void removeDoorCloseObserver(DoorCloseEventListener doorCloseEventListener) {
        this.doorCloseEventListenerList.remove(doorCloseEventListener);
    }

    public String getState() {
        return state;
    }
}