
FROM openjdk:8-jre-alpine

ENV APPLICATION_USER ktor
RUN adduser -D -g '' $APPLICATION_USER

RUN mkdir /app
RUN chown -R $APPLICATION_USER /app

USER $APPLICATION_USER

COPY ./build/libs/emoji-converter.jar /app/emoji-converter.jar
WORKDIR /app

CMD ["java", "-server", "-jar", "emoji-converter.jar"]