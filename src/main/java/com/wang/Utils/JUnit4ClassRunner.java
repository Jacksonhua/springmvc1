/**
 * @program: springmvc
 * @description: JUnit和spring整合后log4j总报错，Junit+spring+log4j整合之所以麻烦，是因为spring与log4j的整合，是放在web.xml里的，随tomcat启动后，spring才会加载log4j，而用junit测试是不需要tomcat启动的，所以Junit与log4j的整合才比较费劲。Junit使用spring时，若spring没加载到log4j就会报以下警告！
 * ---------------------
 * @author: Mr.Wang
 * @create: 2018-10-25 15:41
 * @UpdateDate:
 * @UpdateRemark: 更新说明
 * @Version: V1.0
 **/
package com.wang.Utils;

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.TestContextManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

import java.io.FileNotFoundException;

public class JUnit4ClassRunner extends SpringJUnit4ClassRunner {
    static {
        try {
            Log4jConfigurer.initLogging("classpath:resource/log4j.properties");
        } catch (FileNotFoundException ex) {
            System.err.println("Cannot Initialize log4j");
        }
    }

    /**
     * Construct a new {@code SpringJUnit4ClassRunner} and initialize a
     * {@link TestContextManager} to provide Spring testing functionality to
     * standard JUnit tests.
     *
     * @param clazz the test class to be run
     * @see #createTestContextManager(Class)
     */
    public JUnit4ClassRunner(Class<?> clazz) throws InitializationError {
        super(clazz);
    }
}
