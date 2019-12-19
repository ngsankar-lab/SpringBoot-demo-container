# SpringBoot-demo-container
SpringBoot app - Container examples using singleton and prototype design patterns

What is it?
-----------
Spring Boot demo app - Object creation through the spring container.
Used Singleton and Prototype design patterns to create objects.

Take away?
----------
Below statement creates/Initialize the spring container
ConfigurableApplicationContext context=SpringApplication.run(SpringBootDemoContaierApplication.class, args)

Declare the bean with below annotations, so that Spring container will creates an object for you
@Container

Below is the process of creating/getting ojbect of the bean
Person p1=context.getBean(Person.class);
p1.show();

Singleton:
----------
Singleton is the default, Objects will be created and made available for the users even without initalization.
Object creation happens only once even you are using it from different places of the program.

Prototype:
Prototype scope defines like below to the bean class
@Scope(Value="prototype")

Objects will be created based on the request.



