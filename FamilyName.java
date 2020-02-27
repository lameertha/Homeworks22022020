public class FamilyName {
    public static void main(String[] args) {//mai method
        FamilyName lamee = new FamilyName() ;//object creation

        lamee.setFirstName(""); // calling firstName method with empty string
        lamee.setLastName(""); // calling lastName method with empty string
        lamee.setAge(10);//calling  instance method with onr parameter
        System.out.println("fullName= " + lamee.getFullName());//printing statement
        System.out.println("teen= " + lamee.isTeen());//printing statement
        lamee.setFirstName("John"); // printing statement with given name john
        lamee.setAge(18);//calling instance method with one parameter
        System.out.println("fullName= " + lamee.getFullName());//printing statement
        System.out.println("teen= " + lamee.isTeen());//printing statement
        lamee.setLastName("Smith"); //printing statement with lastname given as smith
        System.out.println("fullName= " + lamee.getFullName());//printing statement
    }

    // Local variables
    public String firstName;
    public String lastName;
    public int age;

    public String getFirstName() {//instance method
        return firstName;
    }

    public String getLastName() {//instance method
        return lastName;
    }

    public int getAge() {//instance method
        return age;
    }

    public void setFirstName(String firstName) {//instance method with one parameter
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {//instance method with one parameter
        this.lastName = lastName;
    }

    public void setAge(int newAge) {// instance method with one parameter
        if (newAge < 0 || newAge > 100) {
            this.age = 0;
        } else {
            this.age = newAge;
        }
    }

    public boolean isTeen() {//instance method
        return age > 12 && age < 20;
    }

    public String getFullName() {////instance method
        if (lastName.isEmpty()) {//lastname string is empty
            this.lastName = firstName;
            return this.lastName;
        } else if (firstName.isEmpty()) {//lastname string is empty
            this.firstName = lastName;
            return this.firstName;
        } else {
            return firstName + " " + lastName;
        }


    }
}
