
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM alpine:latest

CMD ["/bin/sh"]
# Sử dụng Maven để build ứng dụng
FROM maven:3.8.6-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package

# Sử dụng JDK nhẹ để chạy ứng dụng
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy file .war từ bước build trước
COPY --from=build /app/target/MyWebApp-1.0-SNAPSHOT.war /app/MyWebApp.war

# Lệnh chạy ứng dụng
CMD ["java", "-jar", "/app/MyWebApp.war"]
