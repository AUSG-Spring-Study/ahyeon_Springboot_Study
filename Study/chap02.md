## Chapter02. 스프링부트에서 테스트 코드 작성하자

TDD (Test-Driven-Development) 란? 
테스트 주도 개발이라고 한다. 기존 프로세스와 다르게 테스트 코드를 작성한 후 실제 코드를 개발하여 리펙토링하는 절차를 따른다.
![스크린샷 2022-09-09 오후 4.02.13.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e88b1417-8e33-4eca-9e6f-5de1d7d6b005/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2022-09-09_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_4.02.13.png)
![스크린샷 2022-09-09 오후 4.02.39.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/01d0bc8d-5c1e-4890-b1f0-fdbede9906c0/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2022-09-09_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_4.02.39.png)

<br><br>
|   | TDD | 단위 테스트 |
|:-------------:|:---------:|:--------:|
| 의미 |테스트가 주도하는 개발, 테스트 코드를 먼저 작성 <br> RED (실패하는 테스트 먼저 작성) → GREEN ( 프로덕션 코드 작성) → REFACTOR(프로덕션 코드 리팩토링) |TDD의 기능 단위 테스트 코드를 작성하는 것<br>테스트 코드를 꼭 먼저 작성할 필요X, 리팩토링 X<br> → 순수하게 테스트 코드만 작성하는 것|
<br><br>

✅ 단위 테스트 코드 작성 이점
1. 개발 단계 초기에 문제 발견
2. 코드를 리팩토링하거나 라이브러리 업그레이드 등에서 기존기능이 올바르게 작동하는지 확인
3. 기능에 대란 불확실성 감소
4. 실제 문서 제공 → 단위테스트 자체가 문서로 사용이 가능

✅ 롬복(Lombik) : 자바 개발자들의 필수 라이브러리

- 자바 개발할 때 자주 사용하는 코드를 어노테이션으로 자동 생성해준다.
- 플러그인으로 쉽게 설정이 가능


### 🔥트러블슈팅🔥
<details>
<summary>2.2 Hello Controller 테스트 코드 작성하기 - No tests found for given includes: Test코드 실행 에러</summary>
<div markdown="1">
  ![스크린샷 2022-09-11 오후 3.31.19.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/810b3601-4b06-462a-8845-3e12757e28e9/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2022-09-11_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_3.31.19.png)
  ![스크린샷 2022-09-11 오후 4.27.40.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/03381518-f0a5-4b0d-9153-bda81948588a/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2022-09-11_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_4.27.40.png)
</div>
</details>


<details>
<summary>2.4 Hello Controller 코드를 롬복으로 전환하기 - 그레들 버전 다운그레이드 </summary>
<div markdown="1">
  ![스크린샷 2022-09-11 오후 7.47.28.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f3b55beb-42f3-4820-bb2e-2a60453c22e9/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2022-09-11_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_7.47.28.png)
</div>
</details>
  
  
