package org.learn.statePattern;

/**
 * @author: yxk
 * @date: 2019-04-17 17:26
 */
public class SpeedUpState implements RunState{

    public void run(Hero hero) {
        System.out.println("--------------加速跑动---------------");
        try {
            Thread.sleep(4000);//假设加速持续4秒
        } catch (InterruptedException e) {}
        hero.setState(Hero.COMMON);
        System.out.println("------加速状态结束，变为正常状态------");
    }

}
