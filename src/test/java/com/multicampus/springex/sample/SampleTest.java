package com.multicampus.springex.sample;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;

@Log4j2
@ExtendWith(SpringExtension.class)  //spring-test를 이용하기 위한 설정 (Junit5버전용 =ExtendWith)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class SampleTest {
  @Autowired      //스프링에서 사용하는 의존성 주입 어노테이션(SampleService
    // 타입의 빈이 존재한다면 여기에 주입)
    private SampleService sampleService;

    @Autowired
    private DataSource dataSource;

   /* @Autowired
    private SampleDAOImpl sampleDAO; //field injection 방식(필드 주입)
*/
 @Test
    public void testService() {
        log.info(sampleService);
        Assertions.assertNotNull(sampleService);}

   /* @Test
    public void testSampleDAO(){
        log.info(sampleDAO);
        Assertions.assertNotNull(sampleDAO);
    }*/
    @Test
    public void testConnection() throws Exception{
        Connection con = dataSource.getConnection();
                log.info(con);
                Assertions.assertNotNull(con);
                con.close();
    }

}

