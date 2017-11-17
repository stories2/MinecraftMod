# 마인크래프트 모드 제작 실습

그저 한번쯤 해보고 싶었던 마인크래프트 모드를 직접 제작해본다

## 시작하기 앞서

모드 제작 [강의](https://www.youtube.com/watch?v=sXA5qZT8SYo)가 존재한다.
작업 환경은 `MacOS High Sierra` 이며 작업 툴은 `Eclipse OXYGEN`을 사용중이다.
테스트 하는 마인크래프트 버전은 `1.11.2` 이다.

### 작업환경 셋팅

일단 작업환경을 셋팅하려면 기본 소스코드를 [다운](https://files.minecraftforge.net)받아야한다.
그 다음 압축을 풀어주고 셋팅 해주는 실행 파일에 대한 권한을 줘야한다. 

```
chmod +x gradlew
```

그리고 처음 셋팅을 진행하게 된다.

```
./gradlew setupDecompWorkspace eclipse
```

다음 eclipse 폴더를 eclipse 툴로 열어주면 된다. 

## Testing

- 커스텀 블록 소환 방법

게임 내부로 진입 후 명령어 입력
```
/give <player name> <MOD_ID>:<ITEM NAME>
```

예제
```
/give player567 sm:ItemObsidianingot
```

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE) file for details
