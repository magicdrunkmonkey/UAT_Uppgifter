package uppgift_2_Getters_Setters_3;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int personCount;


    //Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        //Checking age parameter if between 0 and 100
        if(age<0 || age>100){
            age = 20;
        }
        this.age = age;
        this.personCount++;
    }

    //Getters & Setters
    public int getPersonCount() {
        return personCount;
    }

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
        personCount++;
        return "Person: " + getPersonCount() + "\n"
                +"First name: " + firstName + "\n"
                +"Last name: " + lastName + "\n"
                +"Age: " + age + "\n";
    }
}
