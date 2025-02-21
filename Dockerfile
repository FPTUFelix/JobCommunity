
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM alpine:latest

CMD ["/bin/sh"]
# Sử dụng Maven mới nhất + JDK 17
FROM maven:latest AS build
WORKDIR /app
COPY . .
RUN mvn clean package

# Sử dụng OpenJDK nhẹ để chạy ứng dụng
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy file .war từ giai đoạn build
COPY --from=build /app/target/MyWebApp-1.0-SNAPSHOT.war /app/MyWebApp.war

# Chạy ứng dụng
CMD ["java", "-jar", "/app/MyWebApp.war"]
