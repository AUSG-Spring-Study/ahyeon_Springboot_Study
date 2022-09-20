## Chapter03. 스프링 부트에서 JPA로 데이터베이스 다뤄보자


### 3.1 JPA 소개
참고) JPA(자바 표준 ORM: Object Relational Mapping)란? <br>
>객체를 관계형 데이터베이스에서 관리하는 것<br>
✅ JPA 사용하였을 때 장점
1. CRUD 쿼리 직접 작성할 필요가 없음
2. 부모-자식 관계 표현, 1:N 관계 표현, 상태와 행위를 한 곳에서 관리하는 등 객체지향 프로그래밍을 쉽게 할 수 있다.
<br>
### 3.2 프로젝트에서 Spring Data JPA 적용하기
- @spring-boot-starter-data-jpa : JPA 관련 라이브러리들의 버전을 관리해준다.
- @h2 : 인메모리 관계형 데이터베이스
- @Entity :테이블과 링크될 클래스임을 나타낸다.
- @NoArgsConstructor: 기본 생성자 자동추가
<br>
### 3.3 Spring Data JPA 테스트 코드 작성하기
- postsRepository.save : 테이블 posts에 insert/update 쿼리를 실행한다.
- postsRepository.findAll() : 테이블 posts에 있는 모든 데이터 조회해오는 메소드이다.

<br>
### 3.4 등록/수정/조회 API 만들기
<details>
<summary>기본적인 등록/수정/조회 기능을 만들고 테스트</summary>
<div markdown="1">
  <img width="1160" alt="스크린샷 2022-09-21 오전 2 33 31" src="https://user-images.githubusercontent.com/80513699/191325611-16c12f09-f50d-42da-b656-4fcafcbab87c.png">
  Post 등록 API 테스트 결과
  <img width="480" alt="스크린샷 2022-09-21 오전 2 10 42" src="https://user-images.githubusercontent.com/80513699/191325765-ebcbfd14-71d1-435c-9294-c368b336ead8.png">
  http://localhost:8080/h2-console 접속 *H2데이터베이스 연결을 위해 JDBC URL을 확인한다. 처음에 “jdbc:h2:~/test” 라고 적혀있는데, 이를 강의 자료에 있는 것처럼 “jdbc:h2:mem:testdb”로 바꿔주어야 정상적으로 연결됨.
  <img width="1512" alt="스크린샷 2022-09-21 오전 2 12 29" src="https://user-images.githubusercontent.com/80513699/191326259-383970c7-0fef-444c-bd50-0ca0d1f2ab72.png">
  간단한 쿼리 실행
  > SELECT * FROM posts; 
  <img width="1512" alt="스크린샷 2022-09-21 오전 2 13 17" src="https://user-images.githubusercontent.com/80513699/191326389-841d6d32-544e-4fc8-873f-f5ebfde65375.png">
  insert 쿼리 실행
  <img width="519" alt="스크린샷 2022-09-21 오전 2 14 10" src="https://user-images.githubusercontent.com/80513699/191326552-058f2ffc-3904-4bbc-b693-1ff368d7ff61.png">
  브라우저로 API 조회


</div>
</details>

### 3.5 JPA Auditing으로 생성시간/수정시간 자동화하기
<details>
<summary>데이터 생성 시간 자동화하기  </summary>
<div markdown="1">
  <img width="270" alt="스크린샷 2022-09-21 오전 2 42 14" src="https://user-images.githubusercontent.com/80513699/191327192-823887ba-9bba-4f91-85ac-0e57e725e4fc.png">
  domain 패키지에 BaseTimeEntity 클래스 생성
  <img width="720" alt="스크린샷 2022-09-21 오전 2 41 46" src="https://user-images.githubusercontent.com/80513699/191327096-0dd02909-8267-4a45-b82e-29990259e046.png">
  JPA Auditing 테스트 코드 수행 결과
</div>
</details>
  
  
