package designpatterns.example.practice;

import java.time.LocalDate;
import java.time.Period;

/** example of using the builder design methodology.
 Builder is great for complex constructors or when an object takes multiple steps to build. great for DTOs.
 possible issues:
 - slightly more complex classes
 - could potentially allow for partially initialized class.
 */
public class User {
    private String name;
    private String age;
    private String email;
    private String phone;


    private void setName(String name) {
        this.name = name;
    }

    private void setAge(String age) {
        this.age = age;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private void setPhone(String phone) {
        this.phone = phone;
    }

    public static UserBuilder getBuilder(){return new UserBuilder();}

    public static class UserBuilder{

        private String firstName;
        private String lastName;
        private String age;
        private String email;
        private User user;


        public User build(){
                this.user = new User();
                user.setName(firstName + " " + lastName);
                user.setAge(age);
                user.setEmail(email);
                return this.user;
        }

        public User getUser(){
            return this.user;
        }

        public UserBuilder withFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public UserBuilder withLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public UserBuilder withEmail(String email){
            this.email = email;
            return this;
        }

        public UserBuilder withBirthday(LocalDate date){
            age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
            return this;
        }



    }
}
