@Bean annotation 
===================

@Bean annotation indicates that a method produces a bean to be managed by the Spring Container. The @Bean annotation is unsually declared in Configuration class to create Spring Bean definitions.
By default, the bean name is same as method name. We can specify bean name using @Bean(name ="beanName").
@Bean annotation provides initMethod and destroyMethod attributes to perform certain actions after bean initialization or before bean destruction by a container.
