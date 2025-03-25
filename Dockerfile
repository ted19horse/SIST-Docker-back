# Dockerfile 작성

# 기본 이미지 설정
FROM gradle:7.2.0-jdk as builder
# 작업 디렉토리 설정
WORKDIR /app
# 프로젝트 파일 복사
COPY . .
# 프로젝트 빌드
RUN ./gradle clean build --no-daemon

# 빌드된 JAR 파일을 실행할 이미지 설정
FROM openjdk:17-jdk-slim
# 작업 디렉토리 설정
WORKDIR /app
# 애플리케이션 JAR 파일 복사 (프로젝트에서 빌드된 JAR 파일 경로에 맞게 수정)
COPY ./build/libs/docker0320spring-0.0.1-SNAPSHOT.jar app.jar
# 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "app.jar"]
# 컨테이너 내부 포트 노출
# EXPOSE 8080