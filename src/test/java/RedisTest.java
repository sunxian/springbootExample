import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import sun.server;

import java.io.Serializable;
import java.util.*;

/**
 * @auther: SUNXIAN
 * @date: 2018-12-21
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = server.class)
@WebAppConfiguration
public class RedisTest {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    public  void setRedisTemplate(){


       // stringRedisTemplate.opsForValue().set("first","helloworld");
        //stringRedisTemplate.opsForValue().set("2","helloworld2");
     String s= stringRedisTemplate.opsForValue().get("2");
     System.out.println(s);
        Collection<Object> list=new ArrayList<Object>();
     stringRedisTemplate.opsForHash().put("1","sun","25");
        stringRedisTemplate.opsForHash().put("1","sun1","2567");
       s= stringRedisTemplate.opsForHash().get("1","sun").toString();
       Map map=new HashMap<String,Object>(

       );
       map.put("sss","w");
       map.put("s","erw");
       map.put("s23","s");

       stringRedisTemplate.opsForHash().putAll("hello",map);
        Collection<Object> l=new ArrayList<Object>();
        l.add("s");
       l=stringRedisTemplate.opsForHash().multiGet("hello",l);
        Map<Object, Object> entries= stringRedisTemplate.opsForHash().entries("hello");
       // list=stringRedisTemplate.opsForHash().multiGet("1",list);
       System.out.println(l.toString());
Person a=new Person("wang","46");
//存对象
redisTemplate.opsForValue().set("4",a);
      Person person=  (Person) redisTemplate.opsForValue().get("4");
        System.out.println(person.toString());
        // stringRedisTemplate.opsForHash().put("3","sun1","256");
       // stringRedisTemplate.opsForHash().get()
        //stringRedisTemplate.opsForList().
    }



}
