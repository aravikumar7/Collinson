# QA Engineer - Tech Test

Install latest stable version of maven from https://maven.apache.org/download.cgi
Download the project from https://github.com/aravikumar7/Sensyne.git
Navigate to the project folder(Sensyne) in command prompt/terminal
Run the command mvn test -Dcucumber.options="--tags @GetProduct" to get the detail of product '1' 
Run the command mvn test -Dcucumber.options="--tags @GetProducts" to get the detail of all products 
Run the command mvn test -Dcucumber.options="--tags @CreateProduct" to create product "51", name "V Neck T-Shirt" and price "5.60"
Run the command mvn test -Dcucumber.options="--tags @DeleteProduct" to delete product '3'
Run the command mvn test -Dcucumber.options="--tags @UpdateProduct" to update detail of product "2" with name as "U Neck T-Shirt" and price as "5.66"


After running any of the above command, open the test report from  the the porject folder by following the path --> Sensyne/target/cucumber-htmlreport/index.html