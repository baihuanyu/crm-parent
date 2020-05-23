import org.example.crm.domain.Department;
import org.example.crm.service.IDepartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/5/21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestService {
    @Autowired
    private IDepartmentService deptService;
    @Test
    public void test() throws Exception{
        for (Department department : deptService.selectAll()) {
            System.out.println(department);
        }
    }
}
