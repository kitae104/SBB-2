# SBB-2
SBB part2  - DB 설정
- DB 설정 

### 자동 설정 
1. Settings --> Build, Execution, Deployment --> Compiler --> Annotation Processors --> Enable annotation processing
2. Settings --> Build, Execution, Deployment --> Compiler --> Build project automatically
3. Settings --> Advanced Settings --> Allow auto-make to start even if developed application is currently running
4. Edit Configurations --> Modify options --> On Update action --> Update classes and resources
5. Edit Configurations --> Modify options --> On frame deactivation --> Update classes and resources
6. Edit Configurations --> Modify options --> Add VM options --> -Dspring.devtools.restart.enabled=true
7. <script src="http://localhost:35729/livereload.js?snipver=1"></script> HTML 파일에 추가 
8. application.yml 파일에 아래 내용 추가 --> spring.devtools.livereload.enabled=true


