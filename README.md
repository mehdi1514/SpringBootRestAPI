# Spring Boot Rest API
A basic Rest API made with Spring Boot that performs CRUD operations.

## Run the server
To run the server run it as a Spring boot App. The server will run at port 7000. You can change the port by modifying `server.port` in `application.properties` file present inside `src/main/resources`.

## Routes
1. **GET** `localhost:7000/getProducts` - Retrieve all products.

2. **GET** `localhost:7000/getProduct/<id>` - Retrieve a product with its id.

3. **GET** `localhost:7000/getProductByName/<name>` - Retrieve a product with its name.

4. **POST** `localhost:7000/addProduct` - Create a product.

5. **POST** `localhost:7000/addProducts` - Create multiple products passed in an Array.

6. **PUT** `localhost:7000/update` - Update a product. Pass the product along with its new values in the body of the request.

7. **DELETE** `localhost:7000/delete/<id>` - Delete a product with its id.

