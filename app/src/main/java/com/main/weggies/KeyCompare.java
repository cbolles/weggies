package com.main.weggies;

import java.lang.reflect.Array;

public class KeyCompare {

    public boolean KeyCheck(boolean[] user, boolean[] recipe){
        for (int i = 0; i < 9; i++) {
            if (user[i] & !recipe[i]){
                return false;
            }
        }
        return true;
    }

}
