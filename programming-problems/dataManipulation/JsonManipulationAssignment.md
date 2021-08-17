# *JSON Manipulation*

If you have never encountered JSON data exchange formats, here you can find more about it: https://javaee.github.io/tutorial/jsonp001.html , it is quite simple.
In testing you will encounter this structure quite often, e.g. in API testing most web services return or receive data in json format, there are
some exceptions that work with XMLs but it is rare and here we won't cover it in detail (Anyway when you understand libraries for JSON manipulation
you will easily find dependencies for XML manipulation if needed and utilize them)

There are several major objectives when working with various data exchange formats:
1. Serialization - Converting Java object into JSON String
2. Deserialization - Converting JSON String to Java object
3. Convenient way of mapping JSON structures in java classes

For achieving these goals we will use help of two libraries - gson and jackson.\
See documentation:
1. gson ( https://github.com/google/gson )
2. jackson ( https://www.baeldung.com/jackson-object-mapper-tutorial , https://www.baeldung.com/jackson-annotations )

So as these are 3rd party Java libraries, we want to add them to our pom.xml file:
1. For jackson we need three artifacts from <groupId>com.fasterxml.jackson.core</groupId> :
< artifactId >jackson-core< /artifactId >\
< artifactId >jackson-annotations< /artifactId >\
< artifactId >jackson-databind< /artifactId >

Find them and insert in pom.xml file.

2. For gson you can find it at https://github.com/google/gson


## *1.*
Create new DataProvider.class and implement method with signature: private static <T> HashMap<String, T> initMap(String path, Class<T> clazz)
That will have .json file path as path parameter and clazz as type of object you want to serialize from this json. For this method implementation
you should use gson library methods. You can use products.json file that you can find in relative path: data/products.json .
Observe that this file contains list of various objects, you should create so called data transfer object - dto that you will call Product.class,
add all relevant fields (from products.json) as class variables and implement getters and setters. So your initMap method will work for now
only with call: initMap("data/products.json", Product.class).


## *2.*
Refactor your DataProvider.class by creating convenient mechanism for getting desired data from it - e.g. you want to get all your products
by calling DataProvider in the following way from your client class: DataProvider.products;
So your DataProvider will only export static variables, constructor will be private, initialise maps in static block, put path variables as constants


## *3.*
Now that you have "architecture" of your data provider in place, expand its functionality so it can work with promos.json also.


## *4.*
Create new DataConverters.class and implement following methods:\

String createJsonFromObject(Object object); - It should convert provided object do JSON string and return it\
<T> T convertJsonStringToObject(String jsonString, Class<T> clazz); - It should convert JSON string to object of type clazz and return it\

For these two methods implementation you should use jackson library methods, precisely ObjectMapper() object.
Also you need to create new data transfer objects by using jackson annotations (You will work with .json files mentioned in tasks 1 and 3)
in these data transfer object classes you should use following jackson annotation above class fields - @JsonProperty - Read documentation.

You can test your methods by instantiating new data transfer object and set its values using setters and pass it to createJsonFromObject(Object object) - Print it on console
to verify it is correctly formatted. Then pass string you got from createJsonFromObject(Object object) to convertJsonStringToObject and verify that correct object is generated
by asserting field values.

*You may have noticed how boring it is to implement getters and setters of your data transfer object classes, there is convenient library called Lombok - https://projectlombok.org/features/all
It can implement all setters, getters and toString methods with only one line of code, try it.*


