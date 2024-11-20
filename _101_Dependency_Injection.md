DEPENDENCY 
===========
An object unsually requires objects of other classes to perform its operations. We call these objects dependencies.

INJECTION
===========
The process of providing the required dependencies to an object. 



DEPENDENCY INJECTION 
=====================
1. Dependency Injection is a design pattern on which dependency of the object is injected by the framework rather than creating by the Object itself. It is called **IoC**(Inversion of Control)
2. Dependency Injection reduces coupling between multiple objectes as its dynamically injected by the framework.
3. Spring IoC Container uses DI to inject one object into another object
4. There are mainly three types of Dependency Injection: 
  a. Constructor Injection
  b. Setter Injection
  c. Field Injection  


TYPES OF DEPENDENCY INJECTION
==============================
1. CONSTRUCTION INJECTION:
   -----------------------
    Constructor injection uses the constructor to inject dependecy on any Spring-managed bean.
   Before Spring 4.3, we had to add an @Autowired annotation to the constructor. With newer versions, this is optional if the class has only one constructor.
   When we have a class with multiple constructors, we need to explicitly add the @Autowired annotation to any one of the constructors so that Spring knows which constructor to use to inject dependencies.
   
3. SETTER INJECTION :
   ------------------
   Setter Injection use setter method to inject the dependency of any spring manage bean.
   We have to set the setter method with @Autowired annotation.
   Spring will find the @Autowired annotation and called the setter to inject the depandency 

5. FIELD INJECTION :
   -----------------



   When to use Constructor Base and Setter Base DI in Spring:
   ==========================================================
   1. Use constructor-base DI for madatory dependencies so that our bean is ready to use when it is first time called.
   2. Use setter-base DI only when optional dependencies
   3. Use setter-base Di to avoid circular dependecies
