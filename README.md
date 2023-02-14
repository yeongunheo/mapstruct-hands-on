## 에러 상황

MapStruct가 is 접두사를 가진 boolean 필드를 매핑하지 못하는 문제가 발생했다.

## 문제 원인

필드명이 isDefaultSearchTag라면 getter도 똑같이 isDefaultSearchTag로 만들어지기 때문에, MapStruct에서는 필드명을 defaultSearchTag로 인식하기 때문에 발생하는 문제이다.

## 해결 방법

1. 매퍼에서 수동으로 필드명을 지정해준다. 
- 장점 : 간단한다.
- 단점 : 해당 필드를 이용하는 모든 매퍼에다 지정해야하기 때문에 번거롭고 중복코드가 발생한다.

```java
    @Mapping(target = "isDefault", source = "default")
    Car toModel(CarEntity entity);
```

2. MapStruct SPI를 이용하면 프로젝트 전역적으로 매핑 전략을 설정한다.

- 1번 방법의 단점을 보완하기 위해 사용하는 방법이다.
- MapStruct에서 제공하는 SPI(Service Provider Interface)를 이용해 is 접두사를 사용하는 모든 boolean 필드 네이밍 전략을 수정한다. 

이 예제에서는 2번 방법을 실습할 예정이다.