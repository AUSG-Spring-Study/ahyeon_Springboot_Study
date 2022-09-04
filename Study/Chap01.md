## 🔥트러블 슈팅🔥

#### SpringBoot build.gradle 설정 오류
최신 gradle 버전에서는 compile() testCompile() 대신 implementation() testImplementation() 메소드를 쓴다
=>
implementation('org.springframework.boot:spring-boot-starter-web')<br>
testImplementation('org.springframework.boot:spring-boot-starter-test')
