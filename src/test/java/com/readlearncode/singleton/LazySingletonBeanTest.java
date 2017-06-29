package com.readlearncode.singleton;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@RunWith(Arquillian.class)
public class LazySingletonBeanTest {

    @EJB
    private LazySingletonBeanClient lazySingletonBeanClient;


    @Test
    public void givenDefaultSingletonBean_shouldInstantiate_whenFirstUsed(){
        Assert.assertEquals(true, lazySingletonBeanClient.getState());
    }


    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(LazySingletonBeanClient.class)
                .addClass(LazySingletonBeanFirstUse.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
