Java Programming Language : 
    -- java is oop language and js is functional programming language. 
    -- OOP 
        1. class : 
            -- we will write the code inside it. It acts like a block.
            -- blue print of an object.
            syntax : 
                class className{
                    properties of a class.
                }

                -- properties
                    1. variables, objects and enum
                        -- variables : 
                            -- is a storage location to store the value.
                            -- it is statically typed language.
                            -- we have to define what type of data we will store inside the variable.
                            -- DataTypes : 
                                -- number (0 - 9) : 
                                    byte 
                                    short
                                    int --> default -- 2^31
                                    long
                                -- float (0.0 - 9.9) : 
                                    -- float 
                                    -- double --> default
                                -- character 
                                    -- char --> ''
                                -- boolean :    
                                    -- true or false
                                -- string : 
                                    -- collection of characters --> ""
                        -- objects : 
                            -- These are reference to the another class.
                        -- Enum : 
                            -- will provide a certain default values for us.
                            -- Example : 
                                -- consider we are having a swiping machine.
                                -- we will have only two states -> IN, OUT.
                                -- we will create ENUM with name status and inside it we will write down the IN, OUT
                                -- ENUM.IN (or) ENUM.OUT
                    2. constructors 
                        -- it will allocate memory to the object.
                            1. default constructor :
                                -- we will not provide any  constructor to a class and so that JVM will provide the class a constructor.
                            2. user defined constructor
                                -- user will provide the constructor so that the jvm will not provide the constructor for us.
                        syntax : 
                            public className(parameters,...(optional)){

                            }

                        example : 
                            class A{
                                //variables
                                name;
                                age;
                                //constructor
                                public A(name, age){
                                    
                                }
                            }

                            A obj = new A("Robert", 35);
                    3. Methods
                        -- we will write code inside the methods. 
                        -- Methods are block of reusable code.
                        syntax :
                            public returnType methodName(parameters,... (optional)){
                                block of statements...
                                return value; (optional)
                            }
                        -- if we want to use a method we have to use the object to access the method.

        2. object
            -- an instance of a class.
            syntax : 
                className objectName = new className();

                className objectName = new className(value1, value2,...);

                -- className() - is a constructor. Constructor will allocate memory for us inside the memory.
        
        Example : 
            -- construct a house
                -- engineer will create a blue print.
                    -- we will have detailed information about what needs to be have in a certain location.
                -- can we live inside the blue print paper.
                -- with the help of construction workers we have to construct a house using the blue print as reference.
                -- blue print --> class 
                -- house --> object
        3. inheritance 
        4. abstraction
        5. encapsulation
        6. polymorphism 
    -- we use this in the backend language.