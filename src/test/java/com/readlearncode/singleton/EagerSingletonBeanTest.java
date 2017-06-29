package com.readlearncode.singleton;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@RunWith(Arquillian.class)
public class EagerSingletonBeanTest {

    @Test
    public void givenEagerSingletonBean_shouldInstantiateEagerly_whenApplicationStartsUp(){

        Assert.assertEquals(true, EagerSingletonBean.instantiated);

    }


    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(EagerSingletonBean.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
