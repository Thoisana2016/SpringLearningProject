Sending an eMail
=================


client => EmailService -> DataSource(MySQL_DataSource or PostgreSQL_DataSource) for not hard code 
            sendEmailMethod() ->for email service  

----------------------------------------
1. Create the interfaces and classes as needed 
2. Prefer using constructor injector to inject the dependecies 
3. Use annotation base configuration 
4. Make PostgreSQL_DataSource as Primary using @Primary annotation 
5. Create ApplicationContex (Spring IoC Container), relative EmailService bean, call sendEmail() method and print email List using system.out.println
