package com.readlearncode.singleton;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Singleton
public class LazySingletonBeanFirstUse {

    private static boolean instantiated = false;

    @PostConstruct
    public void init(){
        System.out.println("************************ postconstruct");
        instantiated = true;
    }

    boolean getInstantiatedState(){
        System.out.println("************************ getInstantiatedState");
        return instantiated;
    }
}