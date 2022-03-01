FROM openjdk:11-jdk-slim

RUN mkdir /app

WORKDIR /app

COPY build/libs/challenge.develop.elo7*-fat.jar /app/challenge.develop.elo7.jar

EXPOSE 8080
ENV JAVA_TOOL_OPTIONS -Dfile.encoding=UTF8 -Duser.country=BR -Duser.language=pt -Duser.timezone=America/Sao_Paulo
CMD ["java", "-jar", "-Xmx256M", "-Xms256M","-XX:MaxMetaspaceSize=256m", "challenge.develop.elo7.jar"]
