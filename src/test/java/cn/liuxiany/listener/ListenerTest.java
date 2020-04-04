package cn.liuxiany.listener;

/**
 * 监听器测试类
 *
 * @author liuxiany
 * @date 2020/01/14
 */
public class ListenerTest {

    public static void main(String[] args) {
        Door door = new Door();

        System.out.println("当前房门的状态：" + door.getState());

        AirConditioner airConditioner = new AirConditioner();
        Light light = new Light();

        //增加房门开启事件监听器
        door.addDoorOpenObserver(airConditioner);
        door.addDoorOpenObserver(light);

        //增加房门关闭事件监听器
        door.addDoorCloseObserver(airConditioner);
        door.addDoorCloseObserver(light);

        door.openDoor();

        System.out.println("当前房门的状态：" + door.getState());
        System.out.println("当前空调的状态：" + airConditioner.getState());
        System.out.println("当前灯的状态：" + light.getState());

        door.closeDoor();

        System.out.println("当前房门的状态：" + door.getState());
        System.out.println("当前空调的状态：" + airConditioner.getState());
        System.out.println("当前灯的状态：" + light.getState());
    }
}