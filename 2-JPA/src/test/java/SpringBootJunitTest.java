import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.IUserService;

import javax.annotation.Resource;
import java.util.List;

/*
SpringBoot整合Junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class) //属性：用于指定引导类
public class SpringBootJunitTest {

    @Autowired
    private IUserService userService;

    @Test
    public void testFindAll(){
        List list = userService.findAllUser();
    }

    @Resource
    private Environment env;

    @Test
    public void testReadSpringBootConfig(){
        System.out.println(env.getProperty("spring.jpa.database"));
    }
}
