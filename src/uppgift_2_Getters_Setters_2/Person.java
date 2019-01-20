package uppgift_2_Getters_Setters_2;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    //private String name;

    /*
    public void fullName(String firstName, String lastName){
        setName(firstName, lastName);
        return;
    }
    */

    //Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        //Checking age parameter if between 0 and 100
        if(age<0 || age>100){
            age = 20;
        }
        this.age = age;
    }

    //Getters & Setters
    public String setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        return firstName +" "+lastName;
    }

    public String setName(String firstName) {
        this.firstName = firstName;
        return firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

        return "First name: " + firstName + "\n"
                +"Last name: " + lastName + "\n"
                +"Age: " + age + "\n"
                /*+"Test: " + setName("Peter","Strand") + "\n"*/;
    }
}
