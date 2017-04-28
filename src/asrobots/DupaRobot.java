package asrobots;

import robocode.Robot;

/**
 * Created by adrian on 4/28/17.
 */
public class DupaRobot extends Robot {

    @Override
    public void run() {

        while (true) {

            ahead(150);
            turnGunLeft(15);
            back(100);
            fire(3);
            turnGunRight(40);
        }


    }
}
