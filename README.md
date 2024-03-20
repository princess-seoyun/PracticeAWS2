## AWS build 

![image](https://github.com/princess-seoyun/PracticeEC2-2/assets/107830173/c4723999-5420-4e83-879f-fbc874b06254)

강사님이 제공해주신 인프라스트럭처 설계 사진


## 소개

이 저장소는 WEB 배포를 위해 생성한 레포지토리입니다.

 유튜버 **서타몽** 님의 유튜브 강의를 통해 정리한 내용을 블로그에 간단한 필기와 정리했습니다.

풀스택 공부 및 AWS 의 개인 프로젝트를 위해 간단한 게시한 웹사이트 구현 진행 중입니다.


## 블로그 내용

서타몽님 영상 참고
- [블로그 포스트 1](https://thisiswatchworld.tistory.com/15): 가상 네트워크 구축하기(VPC, 서브넷, 인터넷 게이트웨이, 보안 그룹 생성)
- [블로그 포스트 1](https://thisiswatchworld.tistory.com/16): EC2 & RDS 생성
- [블로그 포스트 1](https://thisiswatchworld.tistory.com/17): 빌드 환경 구축
- [블로그 포스트 1](https://thisiswatchworld.tistory.com/18): React 프로젝트 설정 변경 및 Spring boot pm2 로 배포)
- [블로그 포스트 1](https://thisiswatchworld.tistory.com/19): React EC2 에 빌드 및 배포



## 실습 자료

여기에는 AWS를 사용한 실습을 위한 추가 자료가 포함될 예정입니다. 해당 내용은 주기적으로 업데이트될 것입니다.

참고로 배포 공부를 먼저 하기 위해 정말 기본 동작만 구현해둔 상태입니다.

pm2 로 무중단 배포까지 완료

![image](https://github.com/princess-seoyun/PracticeEC2-2/assets/107830173/37716d11-e110-4e40-995d-790a7c017c79)

![image](https://github.com/princess-seoyun/PracticeEC2-2/assets/107830173/9b9a986f-822f-4e7a-a54f-f11525378319)


**프론트(React.js) : PublicIPs: 13.124.136.66 에서 3000 포트로 들어가기 성공**

![image](https://github.com/princess-seoyun/PracticeEC2-2/assets/107830173/f1961162-2b10-41e7-9427-f4a996e857da)


**백엔드(Spring) : PublicIPs: 54.180.163.81 에서 8082 포트로 들어가기 성공**

![image](https://github.com/princess-seoyun/PracticeEC2-2/assets/107830173/30ffeecf-a282-4648-a240-854848e45ac6)

**작성한 제목과 내용이 DB(MySQL) 에 저장되는 것까지 확인 완료**


