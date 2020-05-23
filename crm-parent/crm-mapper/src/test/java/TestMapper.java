import org.example.crm.domain.Department;
import org.example.crm.mapper.DepartmentMapper;
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
@ContextConfiguration("classpath:spring-mapper.xml")
public class TestMapper {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Test
    public void test() throws Exception{
        for (Department dept : departmentMapper.selectAll()) {
            System.out.println(dept);
        }
    }

}
