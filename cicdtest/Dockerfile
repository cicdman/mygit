From openjdk:18-jdk-slim
#From hello-world
EXPOSE 8081

#USER root 
# sources.list 교체 후 적용
#RUN apt-get update
#RUN apt-get upgrade -y


# app 디렉토리 선정
RUN mkdir -p /app
COPY ./app.jar /app/app.jar
#CMD java -jar /app/app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
