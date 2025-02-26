# Android Multi-Module Sample

## Purpose

멀티 모듈 샘플 앱을 만들고 그 특징을 공부한다.

## 구조
<img width="636" alt="Image" src="https://github.com/user-attachments/assets/af24d44e-10cd-4519-9254-badf3a1979fd" />

### 설명

계층과 기능별로 모듈을 나눠주고 클린 아키텍처의 원칙에 입각해서 의존관계를 설정한다. 
빌드하여 계층 간의 결합도가 낮아진 것을 확인한다.

### 결과

- :domain 모듈을 수정할 경우 domain에 의존하는 :ui:feed, :ui:home, :data 세 모듈 다 영향을 받는다
- :ui:feed, :ui:home, :data 모듈을 하나씩 수정하고 수정할때마다 빌드해보면 수정된 모듈 외에는 영향받지 않는다.
- :data 모듈을 수정하더라도 :domain 모듈이 직접적으로 :data 모듈에게 의존하지 않고 Hilt를 통해 주입받기 때문에 영향받지 않는다.

### 정리

- 각 레이어, 기능 별로 나뉜 모듈 간의 결합도를 낮추기 위해서는 클린 아키텍처의 원칙에 입각하여 멀티 모듈 구조를 짜는 것을 권장한다.
- 위와 같은 구조를 선택함으로서 증분 컴파일을 통해 빌드 시간을 단축할 수 있다는 멀티 모듈의 장점을 취할 수 있다.

### 블로그
[공부 내용 정리 블로그](https://velog.io/@gylee0311/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EB%A9%80%ED%8B%B0-%EB%AA%A8%EB%93%88)
