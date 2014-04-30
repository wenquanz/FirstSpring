//http://www.tutorialspoint.com/spring/spring_overview.htm
//this is the abstract, start.....

//overview
using POJOs, servlet container, no EJB container
using ORM, logging, JEE, Quartz and JDK timers
easy testing, use dependency injection for injecting test data
well-designed web MVC framework
translate technology-specified exceptions(JDBC, Hibernate...) into consistent, unchecked exceptions
IoC container
consistent transaction management
dependency injection (one of IoC)
Aspect Oriented Programming(AOP)
	cross-cutting concerns,
	aspects:logging,declarative transaction,security, caching
	OOP vs AOP
	DI vs AOP
	
//architecture
modular, about 20 modules, can choose what module you want
! 	core container:
		core(IoC,DI), 
		Bean(BeanFactory), 
		Context(definition and configuration like ApplicationContext), 
		Expression Language(querying and manipulating an object graph at runtime
	data access/integration:
		JDBC(JDBC-abstraction layer), 
		ORM(integration layers for popular ORM APIs,including JPA,JDO,Hibernate and iBatis), 
		OXM(abstraction layer support Object/XML mapping implementations for JAXB,Castor,XMLBeans,JiBX and XStream),
		JMS(JAVA Messaging Service producing and consuming messages),
		Transaction(transaction management for POJOs and other classes)
	web:
		Web(web-oriented integration features such as multipart file-upload and initialization of the IoC container 
			using servlet listeners and a web-oriented application context),
		Web-Servlet(Spring's MVC implementation),
		Web-Struts(the support classes for integrationg a classic Struts web tier within a Spring application),
		Web-Portlet(MVC implementation for portlet enviroment and mirrors the functionality of Web-Servlet module)
	miscellaneous(others):
		AOP(define method-interceptors and pointcuts to decouple)
		Aspects(integration with AspectJ)
		Instrumentation()
		Test(testing of Spring components with JUnit or TestNg)	
		
//IoC containers
POJO
configuration meatdata:XML, JAVA annotation, or JAVA code
two distinct containers: BeanFactory, ApplicationContext
	BeanFactory used when data volume and speed is significant
	ApplicationContext includes all functionality of BeanFactory
	

//Bean
?	a bean is an object that is instantiaged, assembled by Spring IoC container
Bean definition: configuration metadata
	create, lifecycle, dependency
!	configuration properties:class,name,scope,constructor-arg,properties...
			
//Bean Scopes
singleton, prototype, request, session, global-session

//Bean lifecycle
initiate: 
	XML based: set init-method ;
	Java based:
	public class ExampleBean implements InitializingBean {
   		public void afterPropertiesSet() {
      		// do some initialization work
   		}
	}
activity, 
destroy: 
	XML based: destroy-method
	Java based:
	public class ExampleBean implements DisposableBean {
   		public void destroy() {
     	 // do some destruction work
   		}
	}
!	 in a rich client desktop environment; you register a shutdown hook with the JVM(with singleton bean)
!	set default-init-method and default-destroy-method

//Bean post processor
BeanPostProcessor defines callback methods that you can implement to provide
	your own instantiation logic, dependency-resolution logic
? 	Ordered interface
ApplicationContext automatically detects BeanPostProcessor bean,	

//Bean definition inheritance
child bean add a property parent=another_bean to inherit properties from another_bean, and overrides or adds.
!	create a bean template(set abstract="true", no class property) 
	and inherit from it

//Dependency injection
consturctor-based dependency injection
	constructor with arguments
setter-based dependency injection
	after invoking a no-argument constructor or no-argument static factory method to instantiate a bean
		
//injecting Inner Bean
<bean id="outerBean" class="...">
      <property name="target">
         <bean id="innerBean" class="..."/>
      </property>
</bean>
Inner bean can be defined in <property/> and <constructor-arg/>

//injecting collection
List, Set, Map, Properties
inject bean reference in collection
		<list>
           <ref bean="address1"/>
           <ref bean="address2"/>
           <value>Pakistan</value>
        </list>
inject empty and null string
	empty: <property name="email" value=""/>       
	null: <property name="email"><null/></property>

//Spring Beans Auto-wiring
autowire relationships between collaborating beans, reduce the XML configuration
! 	modes: no, byName, byType, constructor, autodetect

//annotation based config
! 	turn on annotation
<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context-3.0.xsd">

   <context:annotation-config/>
   <!-- bean definitions go here -->

</beans>	
!	using annotation: wire values into properties, methods, and constructors
!	@Required, @AutoWired, @Qualifier, JSR-250 annotations     

//spring web framework
web.xml
servletName-servlet.xml
   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		