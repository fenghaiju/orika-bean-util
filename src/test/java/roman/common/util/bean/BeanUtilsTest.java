package roman.common.util.bean;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.junit.Test;
import roman.common.util.bean.orika.BeanUtils;

public class BeanUtilsTest {

    @Test
    public void mapTest(){
        User user = new User();
        user.setId(111L);
        user.setName("张三");

        UserA userA = BeanUtils.map(user, UserA.class);
        System.out.println(userA.toString());
//        UserOther userOther = new UserOther();
//        userOther.setId(111L);
//        userOther.setName("张三");
//        UserA userOtherA = BeanUtils.map(userOther, UserA.class);
//        System.out.println(userOtherA.toString());
    }
}
