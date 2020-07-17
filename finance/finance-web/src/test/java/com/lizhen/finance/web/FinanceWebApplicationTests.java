package com.lizhen.finance.web;

import lombok.ToString;
import org.assertj.core.util.Lists;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.sql.SQLOutput;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootTest
class FinanceWebApplicationTests {

    @Resource
    private RestTemplate restTemplate;

    @Test
    void contextLoads() {

        List<Person> listPerson=new ArrayList<>();
        listPerson.add(new Person(1));
        listPerson.add(new Person(2));
        listPerson.add(new Person(3));
        listPerson.add(new Person(4));
        List<Integer> list = Lists.newArrayList(1);


        List<Person> differenceSet1 = listPerson.stream().
                filter(item -> !list.contains(item.getId())).collect(Collectors.toList());
        System.out.println(differenceSet1);
    }


    class Person{
        private Integer id;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
        public Person(Integer id ){
            this.id=id;
        }
        @Override
        public String toString(){
            return id.toString();
        }
    }


    @Test
    void test() {
        Map map=new HashMap();
        map.put("contId",3);

        String json= restTemplate.postForObject("http://localhost:8066/lizhi/coupon/updateStatusByContId",map,String.class);

        System.out.println(json);

    }

}
