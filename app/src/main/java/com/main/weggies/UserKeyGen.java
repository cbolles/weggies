package com.main.weggies;

import java.lang.reflect.Array;

/**
 * Uses user input to create a keygen similar to ProdcutKeyGen
 *
 */
public class UserKeyGen {
    private Array userPref;

    public UserKeyGen(){
        boolean[] userPref = {SetPreferences.isMsgFree(),};
    }
}
