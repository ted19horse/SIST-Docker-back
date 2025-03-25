# Dockerfile 작성

# 기본 이미지 설정
FROM gradle:7.2.0-jdk as builder
# 작업 디렉토리 설정
WORKDIR /app
# Gradle 캐시 디렉토리를 볼륨으로 설정
VOLUME /root/.gradle
# 의존성 캐싱을 위해 build.gradle 과 settings.gradle 먼저 복사
COPY build.gradle settings.gradle ./
COPY gradle ./gradle
# 의존성 먼저 해결 (소스 코드 변경시에도 이 계층은 재사용됨)
RUN gradle dependencies --refresh-dependencies
# 프로젝트 파일 복사
COPY . .
# gradlew 파일 실행 권한 설정
RUN chmod +x ./gradlew
# 프로젝트 빌드
RUN ./gradlew clean build

# 빌드된 JAR 파일을 실행할 이미지 설정
FROM openjdk:17-jdk-slim
# 작업 디렉토리 설정
WORKDIR /app
# 빌드된 JAR 파일 복사
ARG JAR_FILE=build/libs/docker0320spring-0.0.1-SNAPSHOT.jar
# 애플리케이션 JAR 파일 복사 (프로젝트에서 빌드된 JAR 파일 경로에 맞게 수정)
COPY ${JAR_FILE} app.jar
# 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "app.jar"]
# 컨테이너 내부 포트 노출
# EXPOSE 8080