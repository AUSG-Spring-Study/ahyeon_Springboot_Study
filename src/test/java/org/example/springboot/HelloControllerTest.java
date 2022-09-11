package org.example.springboot;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.example.springboot.web.HelloController;


import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


//테스트를 진행할 때 Spring Runner 스프링 실행자를 사용하여 스프링부트 테스트와 Junit 사이에 연결자 역할을 한다.
//@RunWith(SpringRunner.class) -> Junit4까지 지원
//스프링 테스트 중 Web(Spring MVC)에 집중할 수 있는 어노테이션
// 컨트롤러만 사용하기 때문에 사용
@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class)

public class HelloControllerTest {

    //스프링이 관리하는 빈을 주입 받는다.
    @Autowired
    // 웹 MVC 테스트할 때 사용한다.
    // 스프링 MVC 테스트의 시작점, get post 등에 대한 API 테스트를 할 수 있다.
    private MockMvc mvc;

    @Test
    public void hello가_리턴된다() throws Exception{
        String hello = "hello";
        // /hello 주소로 HTTP GET 요청을 한다.
        mvc.perform(get("/hello"))
                // 200, 404 상태 검증
                // OK, 즉 200인지 아닌지 검증
                .andExpect(status().isOk())
                // 응답 본문의 내용 검증 "hello" 리턴 값이 맞는지 검증한다.
                .andExpect(content().string(hello));
    }
    @Test
    public void helloDto가_리턴된다() throws Exception{
        String name = "hello";
        int amount = 1000;
        // /hello 주소로 HTTP GET 요청을 한다.
        mvc.perform(
                //param은 String만 허용하므로 문자열로 변경해야 이용이 가능하다.
                get("/hello/dto").param("name",name).param("amount",String.valueOf(amount))
                //jsonPath $를 기준으로 필드명을 명시한다.
        ).andExpect(status().isOk()).andExpect(jsonPath("$.name",is(name))).andExpect(jsonPath("$.amount",is(amount)));

    }

}