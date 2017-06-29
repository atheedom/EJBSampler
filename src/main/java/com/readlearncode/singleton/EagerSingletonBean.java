package com.readlearncode.singleton;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Startup
@Singleton
public class EagerSingletonBean {

    public static boolean instantiated = false;

    @PostConstruct
    public void setInstantiated(){
        instantiated = true;
    }

}