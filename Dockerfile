FROM openjdk:11
ADD target/*.jar dockerizacion.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /dockerizacion.jar" ]