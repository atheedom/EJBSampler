package com.readlearncode.singleton;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Stateless
public class LazySingletonBeanClient {

    @EJB
    public LazySingletonBeanFirstUse lazySingletonBeanFirstUse;

    boolean getState(){
        return lazySingletonBeanFirstUse.getInstantiatedState();
    }

}