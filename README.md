# spring-boot-data-auditing-with-mongoDB



Spring-Boot-MongoDB using with Data Auditing

## Installation
Data Auditing is a structure that provides information about who and when any transaction we make with our DB or Services is done.

----        
   
### So How Is Auditing Defined?
  
- First we define our Config class and add the necessary Annotations
---
 @Configuration : Used to indicate that the class is a configuration class.

--- 
@EnableMongoAuditing: We have stated that the changes made must be on MongoDB.

---  ​
AuditorAware is the class we define to pass the Update and Creation to the service by whom.
​

---
​We define our Audit Model and pass the Audit variables that we will pull into it.
- @CreatedDate: Gives information about the creation time.

​- @LastModifiedDate: Gives information about the last edit time.

​- @LastModifiedByUser: Provides information about the last edited person.

​- @CreatedByUser: Provides information about the creator.

We add the Auditing Class to our Model


---
## Using Technologies

- Spring Boot 
- Lombok
- Data Auditing
- MongoDB
- Spring Boot Validation



## Owner
[Muharrem Koç](https://github.com/muharremkoc)
