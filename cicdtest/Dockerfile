From openjdk:18-jdk-slim

# sources.list 교체 후 적용
RUN apt-get update
RUN apt-get upgrade -y

# container에 git 설치
RUN apt-get install git -y
 
# app 디렉토리 선정
RUN mkdir /app
RUN git clone https://github.com/cicdman/mygit.git /app

# app 디렉토리 선정
ENTRYPOINT ["java", "-jar", "/app/cicdtest/app.jar"]
