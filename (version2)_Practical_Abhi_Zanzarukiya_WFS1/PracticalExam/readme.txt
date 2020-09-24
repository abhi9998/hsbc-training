Layer-File-Description

DataAccessLayer- ProductDAOHashMapImpl.java - implements the ProductDAO interface

Entity- Product.java - SuperClass of other three entities 

Entity- FoodItems - Represents FoodItems

Entity- Electronics - Represents Electronics

Entity- Apparel - Represents Apparel

ServiceLayer- ProductService.java - Calls the methods of the dao implementations and is called by main

Interface- ProductDAO.java - Provide the protocol to be defined

Exception -DuplicateProductException - Provide Custom Exception

Exception -NoProductExistsException- Provide Custom Exception

Interactionlayer- MainApp.java - provides main method and user input from this 