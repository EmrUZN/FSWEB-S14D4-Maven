package org.example.rpc;

import org.example.rpc.UTİLS.Constant;

public interface Poisonable {
    default double poison(){
        return Constant.POISON_PERCENTAGE;
    }
}
