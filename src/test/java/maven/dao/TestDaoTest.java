package maven.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class TestDaoTest {

    @org.junit.Test
    public void sayHello() {
        ApplicationContext as = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao dao = (TestDao) as.getBean("test");
        dao.sayHello();
    }
}