FROM amazoncorretto
LABEL maintainer="Uday"

COPY /build/libs/memory-consumer-0.0.1-SNAPSHOT.jar /

EXPOSE 8081

ENV JAVA_OPTIONS ""
CMD ["sh", "-c", "java ${JAVA_OPTIONS} -jar /memory-consumer-0.0.1-SNAPSHOT.jar"]