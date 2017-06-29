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
public class LazySingletonBean {

    static boolean instantiated = false;

    @PostConstruct
    public void init(){
        instantiated = true;
    }

}