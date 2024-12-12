**화면 이동 프로세스**
MainActivity -> ReaderActivity 이동 -> MainActivity 복귀

**규칙**
- id값, 변수명 변경할 때는 무조건 `shift + F6` (rename) 단축키로 id 바꿀것
- 보기 좋은 소스여야 함 `커맨드+옵션+L` 키가 코드 자동정렬 단축키임으로 적극 활용 할것
- 노션에 [커밋 메시지 규칙](https://young-topaz-c57.notion.site/15062cf81940809cbf21ef0900136f4a?v=5415ed03b47740818441e96a40c6d18d)을 적어뒀음 이에 맞게 커밋 메시지를 작성할 것
- TODO, hint 참고하기

# 2024/12/09 과제

## 로직(kotlin) 과제
1. `ReaderActivity`에 사람의 신상을 return 해주는 `PersonProvider`를 연결
2. 타입에 맞는(A/B) 메서드를 연결합니다.
3. 신상 정보와 종료 유형(RESULT_OK 등등)을 들고 `MainActivity`에 복귀
4.  `MainActivity` "결과값 텍스트"에 복귀할때 들고 온 값을 set 합니다.
5. 작동 완료 텍스트는 정상적으로 값을 가져왔을 때 만 보여야(visibility)합니다. (초기값은 숨김으로 처리해둠)

## UI(xml) 과제
1. 결과값 텍스트, 작동완료 텍스트를 부모 영역의 정중앙에 둘 것
2. `activity_main`의 버튼 2개를 가로로 정렬하고 버튼 사이 12dp간격을 둘 것
3. `activity_main`의 버튼 2개는 부모 영역의 맨 밑에 두고 하단에 24dp의 공백을 둘 것
4. 모든 xml 요소의 id가 기준없이 임의대로 작성되어있기 때문에 카멜 혹은 스네이크 표기법으로 통일되도록 바꿀 것(변수명 작성도 동일)
5. `ReaderActivity`연결이 안되어 있음, 어디에 추가 해야 화면 이동이 되는지 찾아볼 것


