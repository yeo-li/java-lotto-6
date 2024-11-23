# 미션 - 로또

***

# 1. 미션 소개

이번 미션은 로또 게임 프로그램 입니다. 우선 금액을 입력하여 금액에 해당 되는 만큼 다시 로또를 발행합니다.
그 뒤 1~45 사이의 중복되지 않는 숫자 6개와 보너스 번호를 입력 받은 뒤,
발행된 로또와 비교하여 그 결과와 수익률을 출력합니다.

***

# 2. 패키지 목록

```
lotto
 ├───constant
 ├───controller
 ├───model
 ├───service
 ├───util
 ├───validator
 └───view
```

***

# 3. 기능 목록

- ### 입력 기능
    - [x] 구입 금액 입력 기능
    - [x] 당첨 번호 입력 기능
    - [x] 보너스 번호 입력 기능


- ### 출력 기능
    - [x] 구입 금액 입력 안내 메세지 출력 기능
    - [x] 발행 로또 개수 및 번호 출력 기능
    - [x] 당첨 번호 입력 안내 메세지 출력 기능
    - [x] 보너스 번호 입력 안내 메세지 출력 기능
    - [x] 당첨 통계 출력 기능


- ### 로또 게임 기능
    - [x] 로또 발행 기능
    - [x] 당첨 등수 계산 기능
    - [x] 수익률 계산 기능


- ### 유효성 검증 기능
    - [x] 구입 금액 유효성 검증 기능
    - [] 당첨 번호 유효성 검증 기능
    - [ ] 보너스 번호 유효성 검증 기능


- ### 유틸
    - [x] 문자열 구분자로 분리 후 List 변환 기능

***

# 예외 목록(`IllegalArgumentExcption 발생`)

- 구입 금액이 1000단위가 아닌 상황
- 구입 금액이 `int`의 범위를 넘어서는 상황
- 로또의 번호가 오름차순 정렬이 되어 있지 않은 상황
- 당첨 번호의 입력값이 1~45 사이의 값이 아닌 상황
- 당첨 번호의 입력값이 중복 되는 상황
- 보너스 번호의 입력값이 1~45 사이의 값이 아닌 상황
- 보너스 번호가 당첨 번호와 중복되는 상황

***

# 5. 실행 결과 예시

```
구입금액을 입력해 주세요.
8000

8개를 구매했습니다.
[8, 21, 23, 41, 42, 43] 
[3, 5, 11, 16, 32, 38] 
[7, 11, 16, 35, 36, 44] 
[1, 8, 11, 31, 41, 42] 
[13, 14, 16, 38, 42, 45] 
[7, 11, 30, 40, 42, 43] 
[2, 13, 22, 32, 38, 45] 
[1, 3, 5, 14, 22, 45]

당첨 번호를 입력해 주세요.
1,2,3,4,5,6

보너스 번호를 입력해 주세요.
7

당첨 통계
---
3개 일치 (5,000원) - 1개
4개 일치 (50,000원) - 0개
5개 일치 (1,500,000원) - 0개
5개 일치, 보너스 볼 일치 (30,000,000원) - 0개
6개 일치 (2,000,000,000원) - 0개
총 수익률은 62.5%입니다.
```