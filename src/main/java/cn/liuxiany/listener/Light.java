package cn.liuxiany.listener;

/**
 * 具体的事件监听类，实现监听接口
 *
 * @author liuxiany
 * @date 2020/01/14
 */
public class Light implements DoorOpenEventListener, DoorCloseEventListener {

    //灯状态，默认关闭
    private String state = "closed";

    public void open(DoorOpenEvent event, Object arg) {
        state = (String) arg;

        System.out.println("房门已经" + arg);
        System.out.println("灯" + arg);
    }

    public void close(DoorCloseEvent event, Object arg) {
        state = (String) arg;

        System.out.println("房门已经" + arg);
        System.out.println("灯" + arg);
    }

    public String getState() {
        return state;
    }
}