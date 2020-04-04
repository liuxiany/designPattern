package cn.liuxiany.listener;

/**
 * 具体的监听类，实现监听接口
 *
 * @author liuxiany
 * @date 2020/01/14
 */
public class AirConditioner implements DoorOpenEventListener, DoorCloseEventListener {

    //空调状态，默认关闭
    private String state = "closed";

    public void open(DoorOpenEvent event, Object arg) {
        state = (String) arg;

        System.out.println("房门已经" + arg);
        System.out.println("空调" + state);
    }

    public void close(DoorCloseEvent event, Object arg) {
        state = (String) arg;

        System.out.println("房门已经" + arg);
        System.out.println("空调" + state);
    }

    public String getState() {
        return state;
    }
}
