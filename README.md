
# Getting Started with NoSQL



#### Link to Register https://astra.dev/34mW1IA


![App Screenshot](https://github.com/navinreddy20/AstraJavaDemo/blob/master/images/astra_reg.png)




## Documentation

[DataStax Astra docs](https://docs.datastax.com/en/landing_page/doc/landing_page/current.html)



## Steps
### Create Database
![App Screenshot](https://github.com/navinreddy20/AstraJavaDemo/blob/master/images/create_first_database.png)

### KeySpace and Region

![App Screenshot](https://github.com/navinreddy20/AstraJavaDemo/blob/master/images/create_first_database.png)

### CQL Console 

![App Screenshot](https://github.com/navinreddy20/AstraJavaDemo/blob/master/images/create_first_database.png)

### CQL Queries

#### Creating table

* use nosqldemo;

* create table aliens (aname text, tech text, exp int, id int, primary key(id));

* desc aliens;

* select * from aliens;

* insert into aliens (id, aname, tech, exp) values (1, 'Navin', 'Blockchain', 4);
* insert into aliens (id, aname, tech, exp) values (2, 'Kiran', 'Android', 7);

#### Updating values in the table


* update aliens set tech='IOS' where id=2;  

* select * from aliens

#### UPSERT

* update aliens set tech='IOS' where id=3; 

* insert int aliens (id, aname, tech, exp) values (1, 'Pravin', 'Web3', 4);

#### Data Types in CQL

* Datatypes:

    Text, Int, BigInt, SmallInt, 
    Float, Double,
    Boolean, 
    Date, Time, TimeStamp, Duration
    UUID, TIMEUUID 

    Collection types : 
    List, Set and Map







