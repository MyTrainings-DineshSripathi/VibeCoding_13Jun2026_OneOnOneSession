class Student{
    String name;
    int age;

    // default constructor
    public Student(){
        System.out.println("Object created for student class");
    }

    // parameterized constructor
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Student(int age, String name){
        
    }

    public void registration(){
        System.out.println("Registration Method Here");
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println("Registration successful");
    }

    public int registration(String name, int age){
        System.out.println("this is parameterized method");

        int result = 89;

        return result;
    }

    public String login(String username, String password){
        boolean isUserPresent = true;
        boolean isVaildUser = true;

        String token = "";
        if(isVaildUser){
            token = "ey6873daslf9asdf0lkjsdf83df334234";
        }else{
            System.out.println("invalid username or password");
        }

        return token;
    }
    
}