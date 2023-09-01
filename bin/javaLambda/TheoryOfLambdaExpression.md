#Optional type deceleration
							 In java 8 if we do not declare the variable with type in lambda expression, compiler will pick the data type from the value of the parameter. for Example please see the OptionalDecleration class.

#Following are the important characteristics of a lambda expression.

# 1) Optional type declaration 
         No need to declare the type of a parameter. The compiler can inference the same from the value of the parameter.

# 2)  Optional parenthesis around parameter 
		No need to declare a single parameter in parenthesis. For multiple parameters, parentheses are required.

# 3) Optional curly braces 
			No need to use curly braces in expression body if the body contains a single statement.
						
# 4)  Optional return keyword
		The compiler automatically returns the value if the body has a single expression to return the value. Curly braces are required to indicate that expression returns a value.

						
#Method Reference  
    Method references help to point to methods by their names. A method reference is described using "::" symbol. A method 
    
    reference can be used to point the following types of methods:

## 1) Static methods 
	     e.g check MethodReference Class

##2)  Instance methods 
	1) e.g check MethodReference class, i put comments on it
    2) reference to non static method
##3)  Constructors using new operator (TreeSet::new) 
     1) e.g check MethodReference class, i put comments on it
     2) reference to constructor


#Note:
	 if you trying to define two methods in single interface and both methods are abstract it will show you an error and 
	it will not complete the lambda expression rules. if you want to achieve you need to define different interfaces.
	for testing uncomment the line 27 in MethodReference.java class and check the error.
	
	
	 
        