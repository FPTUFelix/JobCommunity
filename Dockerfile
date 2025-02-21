
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM alpine:latest

CMD ["/bin/sh"]
# Sử dụng Tomcat 9 (hỗ trợ Servlet)
FROM tomcat:9.0

# Thiết lập thư mục làm việc
WORKDIR /usr/local/tomcat/webapps/

# Copy file .war vào thư mục webapps của Tomcat
COPY target/MyWebApp-1.0-SNAPSHOT.war MyWebApp.war

# Mở cổng mặc định của Tomcat
EXPOSE 8080

# Chạy Tomcat khi container khởi động
CMD ["catalina.sh", "run"]

