package lv.javaguru.springboot.customermanager3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerManager3Application {

	public static void main(String[] args) {
		SpringApplication.run(CustomerManager3Application.class, args);
	}
}


//		16:37:28.958 [main] DEBUG org.springframework.boot.devtools.settings.DevToolsSettings - Included patterns for restart : []
//		16:37:28.961 [main] DEBUG org.springframework.boot.devtools.settings.DevToolsSettings - Excluded patterns for restart : [/spring-boot-starter/target/classes/, /spring-boot-autoconfigure/target/classes/, /spring-boot-starter-[\w-]+/, /spring-boot/target/classes/, /spring-boot-actuator/target/classes/, /spring-boot-devtools/target/classes/]
//		16:37:28.962 [main] DEBUG org.springframework.boot.devtools.restart.ChangeableUrls - Matching URLs for reloading : [file:/C:/Users/Oleg/IdeaProjects/CustomerManager3/target/classes/]
//
//		.   ____          _            __ _ _
//		/\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
//		( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
//		\\/  ___)| |_)| | | | | || (_| |  ) ) ) )
//		'  |____| .__|_| |_|_| |_\__, | / / / /
//		=========|_|==============|___/=/_/_/_/
//		:: Spring Boot ::        (v1.5.9.RELEASE)
//
//		2017-12-10 16:37:29.365  INFO 11240 --- [  restartedMain] l.j.s.c.CustomerManager3Application      : Starting CustomerManager3Application on LinuxSRV with PID 11240 (C:\Users\Oleg\IdeaProjects\CustomerManager3\target\classes started by Oleg in C:\Users\Oleg\IdeaProjects\CustomerManager3)
//		2017-12-10 16:37:29.366  INFO 11240 --- [  restartedMain] l.j.s.c.CustomerManager3Application      : No active profile set, falling back to default profiles: default
//2017-12-10 16:37:29.774  INFO 11240 --- [  restartedMain] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@50e5c521: startup date [Sun Dec 10 16:37:29 EET 2017]; root of context hierarchy
//		2017-12-10 16:37:32.041  INFO 11240 --- [  restartedMain] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8080 (http)
//		2017-12-10 16:37:32.054  INFO 11240 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
//		2017-12-10 16:37:32.055  INFO 11240 --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.23
//		2017-12-10 16:37:32.163  INFO 11240 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
//		2017-12-10 16:37:32.163  INFO 11240 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 2394 ms
//		2017-12-10 16:37:32.338  INFO 11240 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Mapping servlet: 'dispatcherServlet' to [/]
//		2017-12-10 16:37:32.343  INFO 11240 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
//2017-12-10 16:37:32.344  INFO 11240 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
//2017-12-10 16:37:32.344  INFO 11240 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
//2017-12-10 16:37:32.344  INFO 11240 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
//Sun Dec 10 16:37:32 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Sun Dec 10 16:37:32 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Sun Dec 10 16:37:32 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Sun Dec 10 16:37:32 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Sun Dec 10 16:37:32 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Sun Dec 10 16:37:32 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Sun Dec 10 16:37:32 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Sun Dec 10 16:37:32 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Sun Dec 10 16:37:32 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//Sun Dec 10 16:37:32 EET 2017 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//2017-12-10 16:37:32.973  INFO 11240 --- [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Building JPA container EntityManagerFactory for persistence unit 'default'
//2017-12-10 16:37:32.988  INFO 11240 --- [  restartedMain] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [
//	name: default
//	...]
//2017-12-10 16:37:33.070  INFO 11240 --- [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate Core {5.0.12.Final}
//2017-12-10 16:37:33.072  INFO 11240 --- [  restartedMain] org.hibernate.cfg.Environment            : HHH000206: hibernate.properties not found
//2017-12-10 16:37:33.073  INFO 11240 --- [  restartedMain] org.hibernate.cfg.Environment            : HHH000021: Bytecode provider name : javassist
//2017-12-10 16:37:33.126  INFO 11240 --- [  restartedMain] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.0.1.Final}
//2017-12-10 16:37:33.251  INFO 11240 --- [  restartedMain] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.MySQLDialect
//2017-12-10 16:37:33.803  INFO 11240 --- [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
//2017-12-10 16:37:34.401  INFO 11240 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@50e5c521: startup date [Sun Dec 10 16:37:29 EET 2017]; root of context hierarchy
//2017-12-10 16:37:34.488  INFO 11240 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/],methods=[GET]}" onto public java.lang.String lv.javaguru.springboot.customermanager3.controller.CustomerController.initializeCustomer(org.springframework.ui.Model)
//2017-12-10 16:37:34.490  INFO 11240 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/customers],methods=[GET]}" onto public java.lang.String lv.javaguru.springboot.customermanager3.controller.CustomerController.listCustomers(org.springframework.ui.Model)
//2017-12-10 16:37:34.490  INFO 11240 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/customer/add],methods=[POST]}" onto public java.lang.String lv.javaguru.springboot.customermanager3.controller.CustomerController.addCustomer(lv.javaguru.springboot.customermanager3.model.Customer)
//2017-12-10 16:37:34.490  INFO 11240 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/remove/{id}]}" onto public java.lang.String lv.javaguru.springboot.customermanager3.controller.CustomerController.removeCustomer(int)
//2017-12-10 16:37:34.490  INFO 11240 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/edit/{id}]}" onto public java.lang.String lv.javaguru.springboot.customermanager3.controller.CustomerController.editCustomer(int,org.springframework.ui.Model)
//2017-12-10 16:37:34.490  INFO 11240 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/customerdata/{id}]}" onto public java.lang.String lv.javaguru.springboot.customermanager3.controller.CustomerController.customerData(int,org.springframework.ui.Model)
//2017-12-10 16:37:34.494  INFO 11240 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
//2017-12-10 16:37:34.495  INFO 11240 --- [  restartedMain] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
//2017-12-10 16:37:34.534  INFO 11240 --- [  restartedMain] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
//2017-12-10 16:37:34.534  INFO 11240 --- [  restartedMain] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
//2017-12-10 16:37:34.582  INFO 11240 --- [  restartedMain] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
//		2017-12-10 16:37:35.172  INFO 11240 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
//		2017-12-10 16:37:35.240  INFO 11240 --- [  restartedMain] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
//		2017-12-10 16:37:35.321  INFO 11240 --- [  restartedMain] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080 (http)
//		2017-12-10 16:37:35.329  INFO 11240 --- [  restartedMain] l.j.s.c.CustomerManager3Application      : Started CustomerManager3Application in 6.346 seconds (JVM running for 7.261)
//		2017-12-10 16:37:46.187  INFO 11240 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring FrameworkServlet 'dispatcherServlet'
//		2017-12-10 16:37:46.188  INFO 11240 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization started
//		2017-12-10 16:37:46.212  INFO 11240 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization completed in 24 ms
//		2017-12-10 16:37:48.158  INFO 11240 --- [nio-8080-exec-2] o.h.h.i.QueryTranslatorFactoryInitiator  : HHH000397: Using ASTQueryTranslatorFactory
//		2017-12-10 16:37:48.256 DEBUG 11240 --- [nio-8080-exec-2] org.hibernate.SQL                        :
//		select
//		customer0_.id as id1_0_,
//		customer0_.address as address2_0_,
//		customer0_.email as email3_0_,
//		customer0_.name as name4_0_,
//		customer0_.reg_nr as reg_nr5_0_
//		from
//		customer customer0_
//		2017-12-10 16:37:48.289  INFO 11240 --- [nio-8080-exec-2] l.j.s.c.service.CustomerServiceImpl      : Customer list: Customer{id=1, regNr='11111111111', name='Name11111111111111111111', address=Address1, email=EMail7}
//		2017-12-10 16:37:48.289  INFO 11240 --- [nio-8080-exec-2] l.j.s.c.service.CustomerServiceImpl      : Customer list: Customer{id=2, regNr='2222222222', name='Name2Edit', address=Address2, email=EMail2}
//		2017-12-10 16:37:48.289  INFO 11240 --- [nio-8080-exec-2] l.j.s.c.service.CustomerServiceImpl      : Customer list: Customer{id=16, regNr='44444___', name='Name4DoubleNew', address=Address4, email=EMail4}
//		2017-12-10 16:37:52.304 DEBUG 11240 --- [nio-8080-exec-4] org.hibernate.SQL                        :
//		select
//		customer0_.id as id1_0_0_,
//		customer0_.address as address2_0_0_,
//		customer0_.email as email3_0_0_,
//		customer0_.name as name4_0_0_,
//		customer0_.reg_nr as reg_nr5_0_0_
//		from
//		customer customer0_
//		where
//		customer0_.id=?
//		2017-12-10 16:37:52.309 TRACE 11240 --- [nio-8080-exec-4] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [INTEGER] - [16]
//		2017-12-10 16:37:52.319  INFO 11240 --- [nio-8080-exec-4] l.j.s.c.service.CustomerServiceImpl      : Customer{id=16, regNr='44444___', name='Name4DoubleNew', address=Address4, email=EMail4}
//		2017-12-10 16:37:52.321 DEBUG 11240 --- [nio-8080-exec-4] org.hibernate.SQL                        :
//		select
//		customer0_.id as id1_0_,
//		customer0_.address as address2_0_,
//		customer0_.email as email3_0_,
//		customer0_.name as name4_0_,
//		customer0_.reg_nr as reg_nr5_0_
//		from
//		customer customer0_
//		2017-12-10 16:37:52.323  INFO 11240 --- [nio-8080-exec-4] l.j.s.c.service.CustomerServiceImpl      : Customer list: Customer{id=1, regNr='11111111111', name='Name11111111111111111111', address=Address1, email=EMail7}
//		2017-12-10 16:37:52.323  INFO 11240 --- [nio-8080-exec-4] l.j.s.c.service.CustomerServiceImpl      : Customer list: Customer{id=2, regNr='2222222222', name='Name2Edit', address=Address2, email=EMail2}
//		2017-12-10 16:37:52.323  INFO 11240 --- [nio-8080-exec-4] l.j.s.c.service.CustomerServiceImpl      : Customer list: Customer{id=16, regNr='44444___', name='Name4DoubleNew', address=Address4, email=EMail4}
//		2017-12-10 16:37:59.600 DEBUG 11240 --- [nio-8080-exec-7] org.hibernate.SQL                        :
//		select
//		customer0_.id as id1_0_0_,
//		customer0_.address as address2_0_0_,
//		customer0_.email as email3_0_0_,
//		customer0_.name as name4_0_0_,
//		customer0_.reg_nr as reg_nr5_0_0_
//		from
//		customer customer0_
//		where
//		customer0_.id=?
//		2017-12-10 16:37:59.600 TRACE 11240 --- [nio-8080-exec-7] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [INTEGER] - [16]
//		2017-12-10 16:37:59.602  INFO 11240 --- [nio-8080-exec-7] l.j.s.c.service.CustomerServiceImpl      : Customer successfully update. Customer details: Customer{id=16, regNr='4444444', name='Name4DoubleNew', address=Address4, email=EMail4}
//		2017-12-10 16:37:59.617 DEBUG 11240 --- [nio-8080-exec-7] org.hibernate.SQL                        :
//		update
//		customer
//		set
//		address=?,
//		email=?,
//		name=?,
//		reg_nr=?
//		where
//		id=?
//		2017-12-10 16:37:59.618 TRACE 11240 --- [nio-8080-exec-7] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [VARCHAR] - [Address4]
//		2017-12-10 16:37:59.619 TRACE 11240 --- [nio-8080-exec-7] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [VARCHAR] - [EMail4]
//		2017-12-10 16:37:59.619 TRACE 11240 --- [nio-8080-exec-7] o.h.type.descriptor.sql.BasicBinder      : binding parameter [3] as [VARCHAR] - [Name4DoubleNew]
//		2017-12-10 16:37:59.620 TRACE 11240 --- [nio-8080-exec-7] o.h.type.descriptor.sql.BasicBinder      : binding parameter [4] as [VARCHAR] - [4444444]
//		2017-12-10 16:37:59.620 TRACE 11240 --- [nio-8080-exec-7] o.h.type.descriptor.sql.BasicBinder      : binding parameter [5] as [INTEGER] - [16]
//		2017-12-10 16:37:59.637 DEBUG 11240 --- [nio-8080-exec-8] org.hibernate.SQL                        :
//		select
//		customer0_.id as id1_0_,
//		customer0_.address as address2_0_,
//		customer0_.email as email3_0_,
//		customer0_.name as name4_0_,
//		customer0_.reg_nr as reg_nr5_0_
//		from
//		customer customer0_
//		2017-12-10 16:37:59.638  INFO 11240 --- [nio-8080-exec-8] l.j.s.c.service.CustomerServiceImpl      : Customer list: Customer{id=1, regNr='11111111111', name='Name11111111111111111111', address=Address1, email=EMail7}
//		2017-12-10 16:37:59.639  INFO 11240 --- [nio-8080-exec-8] l.j.s.c.service.CustomerServiceImpl      : Customer list: Customer{id=2, regNr='2222222222', name='Name2Edit', address=Address2, email=EMail2}
//		2017-12-10 16:37:59.639  INFO 11240 --- [nio-8080-exec-8] l.j.s.c.service.CustomerServiceImpl      : Customer list: Customer{id=16, regNr='4444444', name='Name4DoubleNew', address=Address4, email=EMail4}
//		2017-12-10 16:38:30.468 DEBUG 11240 --- [io-8080-exec-10] org.hibernate.SQL                        :
//		insert
//		into
//		customer
//		(address, email, name, reg_nr)
//		values
//		(?, ?, ?, ?)
//		2017-12-10 16:38:30.469 TRACE 11240 --- [io-8080-exec-10] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [VARCHAR] - [Address7]
//		2017-12-10 16:38:30.469 TRACE 11240 --- [io-8080-exec-10] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [VARCHAR] - [EMail7]
//		2017-12-10 16:38:30.469 TRACE 11240 --- [io-8080-exec-10] o.h.type.descriptor.sql.BasicBinder      : binding parameter [3] as [VARCHAR] - [Name7]
//		2017-12-10 16:38:30.469 TRACE 11240 --- [io-8080-exec-10] o.h.type.descriptor.sql.BasicBinder      : binding parameter [4] as [VARCHAR] - [77777777]
//		2017-12-10 16:38:30.475  INFO 11240 --- [io-8080-exec-10] l.j.s.c.service.CustomerServiceImpl      : Customer successfully saved. Customer details: Customer{id=21, regNr='77777777', name='Name7', address=Address7, email=EMail7}
//		2017-12-10 16:38:30.489 DEBUG 11240 --- [nio-8080-exec-1] org.hibernate.SQL                        :
//		select
//		customer0_.id as id1_0_,
//		customer0_.address as address2_0_,
//		customer0_.email as email3_0_,
//		customer0_.name as name4_0_,
//		customer0_.reg_nr as reg_nr5_0_
//		from
//		customer customer0_
//		2017-12-10 16:38:30.492  INFO 11240 --- [nio-8080-exec-1] l.j.s.c.service.CustomerServiceImpl      : Customer list: Customer{id=1, regNr='11111111111', name='Name11111111111111111111', address=Address1, email=EMail7}
//		2017-12-10 16:38:30.492  INFO 11240 --- [nio-8080-exec-1] l.j.s.c.service.CustomerServiceImpl      : Customer list: Customer{id=2, regNr='2222222222', name='Name2Edit', address=Address2, email=EMail2}
//		2017-12-10 16:38:30.492  INFO 11240 --- [nio-8080-exec-1] l.j.s.c.service.CustomerServiceImpl      : Customer list: Customer{id=16, regNr='4444444', name='Name4DoubleNew', address=Address4, email=EMail4}
//		2017-12-10 16:38:30.492  INFO 11240 --- [nio-8080-exec-1] l.j.s.c.service.CustomerServiceImpl      : Customer list: Customer{id=21, regNr='77777777', name='Name7', address=Address7, email=EMail7}
//		2017-12-10 16:38:36.187 DEBUG 11240 --- [nio-8080-exec-2] org.hibernate.SQL                        :
//		select
//		customer0_.id as id1_0_0_,
//		customer0_.address as address2_0_0_,
//		customer0_.email as email3_0_0_,
//		customer0_.name as name4_0_0_,
//		customer0_.reg_nr as reg_nr5_0_0_
//		from
//		customer customer0_
//		where
//		customer0_.id=?
//		2017-12-10 16:38:36.187 TRACE 11240 --- [nio-8080-exec-2] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [INTEGER] - [21]
//		2017-12-10 16:38:36.189  INFO 11240 --- [nio-8080-exec-2] l.j.s.c.service.CustomerServiceImpl      : Customer{id=21, regNr='77777777', name='Name7', address=Address7, email=EMail7}
//
//		Process finished with exit code 1
