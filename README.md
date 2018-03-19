# App1
building a test applicaiton 1 with spring mvc and mysql

Requires Maven 3.x and above, JDK 1.8, Eclipse IDE and rest client

1. Build the project using maven.
2. Afert build is succesful, the target folder will generate a *.jar file.
3. execute the jar with command java -jar *.jar to start the application.

After the applicaiton has started the logs on the console will look something like this
C:\Users\ss6788\git\App1\target>java -jar app-0.0.1-SNAPSHOT.jar

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.0.RELEASE)

2018-03-14 16:04:45.162  INFO 16428 --- [           main] git_hub_sumair_app1.app.Application      : Starting Application v0.0.1-SNAPSHOT on txcdtl353bg8281 with PID 16428 (C:\Users\ss6788\git\App1\target\app-0.0.1-SNAPSHOT.jar started by ss6788 in C:\Users\ss6788\git\App1\target
)
2018-03-14 16:04:45.166  INFO 16428 --- [           main] git_hub_sumair_app1.app.Application      : No active profile set, falling back to default profiles: default
2018-03-14 16:04:45.244  INFO 16428 --- [           main] ConfigServletWebServerApplicationContext : Refreshing org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@77afea7d: startup date [Wed Mar 14 16:04:45 CDT 2018]; root of context h
ierarchy
2018-03-14 16:04:46.979  INFO 16428 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2018-03-14 16:04:47.028  INFO 16428 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2018-03-14 16:04:47.028  INFO 16428 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.28
2018-03-14 16:04:47.058  INFO 16428 --- [ost-startStop-1] o.a.catalina.core.AprLifecycleListener   : The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: [C:\jdk1.8.0_111\bin;C:\Windows\Sun\
Java\bin;C:\Windows\system32;C:\Windows;C:\Program Files\Common Files\Microsoft Shared\Microsoft Online Services;C:\Program Files (x86)\Common Files\Microsoft Shared\Microsoft Online Services;C:\jdk1.8.0_111\bin;C:\Program Files (x86)\RSA SecurID Token Common;C:\oracle\product\11
.2.0\bin;C:\ProgramData\Oracle\Java\javapath;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Program Files (x86)\NVIDIA Corporation\PhysX\Common;C:\Program Files\1E\NomadBranch\;C:\
Program Files\TortoiseGit\bin;C:\jdk1.8.0_111\bin;C:\Program Files\Git\cmd;C:\jdk1.8.0_111\bin;C:\apache-maven-3.2.3\bin;c:\apache-ant-1.9.7\bin;C:\Voltage\lib;C:\Program Files (x86)\Enterprise Vault\EVClient\;C:\apache-ant-1.9.5\bin;C:\Windows\System32\WindowsPowerShell\v1.0\;C:
\Program Files\nodejs\;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Users\ss6788\AppData\Roaming\npm;C:\Users\ss6788\AppData\Local\GitHubDesktop\bin;.]
2018-03-14 16:04:47.246  INFO 16428 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2018-03-14 16:04:47.247  INFO 16428 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 2005 ms
2018-03-14 16:04:48.132  INFO 16428 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Servlet dispatcherServlet mapped to [/]
2018-03-14 16:04:48.138  INFO 16428 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
2018-03-14 16:04:48.138  INFO 16428 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
2018-03-14 16:04:48.139  INFO 16428 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
2018-03-14 16:04:48.145  INFO 16428 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
2018-03-14 16:04:48.146  INFO 16428 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpTraceFilter' to: [/*]
2018-03-14 16:04:48.149  INFO 16428 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'webMvcMetricsFilter' to: [/*]
2018-03-14 16:04:48.845  INFO 16428 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@77afea7d: startup date [Wed Mar 14 16:04:45 CDT 2018
]; root of context hierarchy
2018-03-14 16:04:48.917  INFO 16428 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/]}" onto public java.lang.String git_hub_sumair_app1.controller.WebController.index()
2018-03-14 16:04:48.918  INFO 16428 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[],methods=[POST]}" onto public git_hub_sumair_app1.beans.WelcomeBean git_hub_sumair_app1.controller.WebController.postGreetings(java.util.Map<java.lang.String, java.lang
.Object>)
2018-03-14 16:04:48.922  INFO 16428 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/welcome]}" onto public git_hub_sumair_app1.beans.WelcomeBean git_hub_sumair_app1.controller.WebController.greeting(java.lang.String)
2018-03-14 16:04:48.927  INFO 16428 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.servlet.error
.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2018-03-14 16:04:48.929  INFO 16428 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.err
orHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
2018-03-14 16:04:48.969  INFO 16428 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-03-14 16:04:48.969  INFO 16428 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-03-14 16:04:49.010  INFO 16428 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-03-14 16:04:49.243  INFO 16428 --- [           main] s.b.a.e.w.s.WebMvcEndpointHandlerMapping : Mapped "{[/actuator/health],methods=[GET],produces=[application/vnd.spring-boot.actuator.v2+json || application/json]}" onto public java.lang.Object org.springframework.boot.actua
te.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping$OperationHandler.handle(javax.servlet.http.HttpServletRequest,java.util.Map<java.lang.String, java.lang.String>)
2018-03-14 16:04:49.244  INFO 16428 --- [           main] s.b.a.e.w.s.WebMvcEndpointHandlerMapping : Mapped "{[/actuator/info],methods=[GET],produces=[application/vnd.spring-boot.actuator.v2+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate
.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping$OperationHandler.handle(javax.servlet.http.HttpServletRequest,java.util.Map<java.lang.String, java.lang.String>)
2018-03-14 16:04:49.245  INFO 16428 --- [           main] s.b.a.e.w.s.WebMvcEndpointHandlerMapping : Mapped "{[/actuator],methods=[GET],produces=[application/vnd.spring-boot.actuator.v2+json || application/json]}" onto protected java.util.Map<java.lang.String, java.util.Map<java.
lang.String, org.springframework.boot.actuate.endpoint.web.Link>> org.springframework.boot.actuate.endpoint.web.servlet.WebMvcEndpointHandlerMapping.links(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
2018-03-14 16:04:49.324  INFO 16428 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-03-14 16:04:49.390  INFO 16428 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2018-03-14 16:04:49.395  INFO 16428 --- [           main] git_hub_sumair_app1.app.Application      : Started Application in 5.165 seconds (JVM running for 5.698)
2018-03-14 16:05:08.238  INFO 16428 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring FrameworkServlet 'dispatcherServlet'
2018-03-14 16:05:08.239  INFO 16428 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization started
2018-03-14 16:05:08.264  INFO 16428 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization completed in 24 ms



Below Rest calls can be tested

Get Calls
---------
http://localhost:8080/
http://locahhost:8080/welcome

Post Calls
----------
http://locahhost:8080/postWelcome
JsonBody : {"name" :"Syed Sumair Ahmed"}

Database Details(Queries to execute for the app1 to work)
---------------------------------------------------------

create database app1db;

use database app1db;

--Create table
CREATE TABLE user (
    id int primary key,
    name varchar(255),
    email varchar(255),
    countrycode varchar(255),
    phonenumber varchar(10) 
);


INSERT INTO user
VALUES (1, 'Name1', 'email1@abc.com','1','1111111111');
INSERT INTO user
VALUES (2, 'Name2', 'email2@abc.com','2','2222222222');
INSERT INTO user
VALUES (3, 'Name3', 'email3@abc.com','3','3333333333');
INSERT INTO user
VALUES (4, 'Name4', 'email4@abc.com','4','4444444444');
INSERT INTO user
VALUES (5, 'Name5', 'email5@abc.com','5','5555555555');