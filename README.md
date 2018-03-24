## 기본
### 알고리즘 성능
- 자료 대비 연산 횟수 그것도 최악의 경우 
- 표기 : 빅오
- 많이 사용되는 빅오 표기법
  - O(log n) : 로그 시간(이진탐색)
  - O(n) : 선형 시간(단순탐색)
  - O(n * log n) : 퀵 정렬
  - O(n^2) : 선택 정렬(추천하지않음)
  - O(n!) : 추천하지않음
  
### 메모리 == 서랍장
- 하나에 하나만 담을 수 있는 서랍장, 여러개를 담으려면 자료구조 사용하기
  
## 알고리즘
### 정렬
- 선택정렬 : 루프를 돌면서 상대적으로 작은 것을 찾아 하나씩 앞에 바꿔가는 정렬 방법

### 검색
- 바이너리 서치 : 반치기 반치기, 반반해서 범위를 좁혀가면서 찾음

### 자료구조
- 사용하는 곳에 따라 각각 다른 자료구조 사용하면 됨 : 배열에 연결리스트 저장할 수도

### 배열
- 한 번에 고정된 크기의 공간을 할당받고, 값을 저장함
- 인덱스로 찾을 수 있음 : 검색에는 좋음
- 데이터 수정(삭제, 이동)이 빈번하다면 사용하지않는 것을 추천 : 데이터 개수가 늘수록 빠진 자리 채우는게 연산 횟수가 늘어남

### 링크드리스트
- 객체를 연결해놓은 형태 : 앞 뒤로 연결된 객체의 정보만 알고 있음
- 한 번에 고정된 크기가 아니라 여러군데에 필요한 만큼씩 할당받고 데이터 저장
- 상대적으로 검색은 느림
- 데이터 수정이 빈번하다면 앞 뒤 연결만 끊고 연결만 수정해주면됨

 