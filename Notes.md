Vibe Coding Vs Traditional Coding : 

Traditional Coding : 
    we have to write the each line manually. If there is prblm then we have to manually verify the code and we have to find it.

    Disadvantage : 
        -- Time -- Boiler plate code is going eat most of the time.
        -- If a developer encounters a prblm then again we have to understand everything manually and need to figure out the problem. (stack overflow)
        -- Boiler plate -- reviewing -- solving

Vibe Coding : 
    We will write the code with the help of LLMs (AI tools). The prblms has removed by the help of AI.

        Disadv : 
            -- LLM they are all trained with limited amount of data.
            -- It can't catch up with the latest trends 
================================================================================
Think : 
    -- AI is not always right.
    -- We should not let the AI do all the task.
    -- We have to review the changes/ modifications that the AI has done in the code.
================================================================================
LLM work : 
    -- Every LLM is a statically driven agent which will predict what it has to do.
    -- Dataset (collection of data) --> trains on multiple datasets in different fields.
    -- AI -- It can't think logically. 
    -- AI will predict the answer and will provide the prediction.
    -- Work based on tokens. 
        ex : 
            I want to do a business in hyderabad

            [I] [want] [to] [do] [a] [business] [in] [hyderabad]
    -- Any LLM will not admit they don't know about the topic. 
    -- Memory : 
        -- It will store the data related to us. i.e job role, project, location. 
    -- Context Window : 
        -- It is a short term memory. 
================================================================================
To use LLM Effectively we have to use correct prompt. 
    -- Prompt is the data which we are providing.
    -- Based on the prompt we will have the response from the AI tool.
Prompt Engineering : 
    -- If we are providing generic prompts then we are wasting some time with the guessing game.
    -- with the help of prompt engineering we can reduce the guessing time.
    -- AI will also do the sentiment analysis. 
        -- prompt : I got a job --> sentiment : user is excited 
        -- prompt : I lost my job --> sentiment : negative
    -- We have to effectively write a prompt.
        1. Chain of Thoughts :
            -- We will provide a question and AI will provide a response --> refine it and asks another question.
        2. Functional or role based prompts : 
            --we will provide the AI a role. 
            -- Response the AI will provide is basically from the POV of the role.
        3. Dynamic : 
            -- combine the Chain of thoughts with the role based
        4. RTCC Framework : 
            -- Role Task Context Constraint
=================================================================================

UI --> API --> java --> database --> java --> response --> API --> UI

to access API we will use JS in UI.

--> js can't access json. 
--> JSON --> Js Object
====================================================================================
javascript : 
    -- we are having 2 types of collections 
        1. Array
            -- collection of heterogenous data. 
            -- To access data we will use index values.
        2. Object
            -- collection of data but the difference is we will use a key (name) to identify the data.
=====================================================================================================
1. variable : 
    -- Store the data.
    -- To create variables we have use declarations. 
    -- Variable can store one value at a time.
    -- dynamically typed language.
        -- Data Types : 
            -- the types of data which we can store in javascript.
                1. number -- 0 - 9
                2. string -- alphabets and spcl characters. strings should always keep them in quotes : '', "", ``
                3. boolean -- true or false
            -- For an example lets say I have created a variable with name "Sample"
                -- initially I assigned a value '23'. Here the type is number. --> sample -- 23 (number)
                -- After sometime I reassigned with another value which is "Xyz". The type is string. --> sample -- "xyz" (String)
    -- Declarations : 
        1. var -- initial declaration which is used to define a variable. Allows user to change the value of a variable.
        2. let -- Allows user to change the value of a variable. Is was introduced in ES6 version to replace the var.
        3. const -- It will restrict the user from change the value inside a variable and we have to assign a value at the time of declaration. Is was introduced in ES6 version to replace the var.
=================================================================================================
To Link Js with HTML : 
    -- we will use 'script' tag. 
        syntax ; 
            <script src=""></script>
        1. src : where user will provide the js file path.
            -- in servers will not have any specific drives
            -- 2 types of path.
                1. absolute path : 
                    -- we will provide the entire path of the file from the source (drive).
                2. relative path : 
                    -- we will only focus on the project folder.
                    -- we use '.', '/'
                        ./ -- refers to the current directory
                        ../ -- will exit from the current directory.

                        project
                            |
                            --- scripts
                            |    |
                            |    -- index.js
                            |
                            -- index.html
                        
                        path : ./scripts/index.js 

                        project
                            |
                            --- scripts
                            |    |
                            |    -- index.js
                            |
                            -- templates 
                                |
                                -- index.html
                        
                        path : ../scripts/index.js
=======================================================================================
1. operators : 
    -- operator is a tools which is used to perform an operation (Task).
        -- Assignment Op : 
            -- (=) is used to assign values to variable.
                syntax :
                    variableName = value/data
        -- Arth Op : 
            -- +, -, *, /, %, **
            -- BODMAS 
            -- (2 + 3) * 4

            -- 5/2 = 2.5
                2)5(2.5
                  4
                -----
                  10
                  10
                  --
                   0
            -- 5%2 = 1

                2)5(2
                  4
                -----
                  1
            -- 2^4 
                2 ** 4
        -- comp op : 
            -- >, <, >=, <=, ==, !=, ===, !==
            -- result will be in boolean (true or false)
        -- logical op : 
            -- &&, ||, !
            -- will combine the two boolean values and generate one boolean value. 
            -- && 
                -- will accept two boolean values and generate one boolean value
                    boolean1 && boolean2
        -- uniary operator : 
            -- these operators are used to update a value by 1.
            -- increment (++)
            -- decrement (--)

                -- pre : 
                    -- First we will update the value --> utilize it. 
                    syntax : 
                        symbol variable
                -- post
                    -- First we will use the value --> update it.
                    syntax : 
                        variable symbol
        -- conditional operator : 
            -- it will execute the code based on the condition.
            syntax : 
                (condition)? true-block : false-block
            -- The draw back is it can only evaluate one statement.
=====================================================================================
Conditional Statements : 
    -- We will execute set of statements with the help of condition similar to conditional operator.
    -- if : 
        -- it will execute only when the condition is true. if condition is false then it will skip.
        syntax : 
            if(condition){
                block of statements
            }
    -- if else
        -- it will execute only when the condition is true or it will execute the else block.
        syntax : 
            if(condition){

            }else{

            }
    -- if else if 
        -- will evalute the multiple conditions.
        syntax : 
            if(condition){

            }else if(condition){

            }else if(condition){

            }
            .
            .
            .
            else{

            }
    -- switch
        -- we are going to have cases.
        -- case will have a value. inside switch we will pass a value and the value which we are passing needs to be matched with the case value.
        -- it will execute the case only when the value is matching with the given value. 
        -- to end the execution of a case we will use the break statement.
        syntax : 
            switch(input){
                case value : 
                    block of statement
                    break;
                .
                .
                .
                default : 
                    block of statement
                    break;
            }
==========================================================================
