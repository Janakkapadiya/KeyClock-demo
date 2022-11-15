FROM openjdk:17-oracle
ADD target/KeyclockDemo-0.0.1-SNAPSHOT.jar key-clock-demo.jar
ENTRYPOINT ["java","-jar","key-clock-demo.jar"]