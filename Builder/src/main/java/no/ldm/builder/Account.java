package no.ldm.builder;

/**
 * A simple demo, showing an example of how to implement a really simple
 * builder-pattern.
 *
 * @author PrefeX
 */
public class Account {

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private int phone;

    // The constructor is set as private to prevent creation outside the builder.
    private Account(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.address = builder.address;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    // Getters and setters are optional. Omitted in this example.
    
    /**
     * The subclass that provides the actual builder.
     */
    public static class Builder {

        private String firstName;
        private String lastName;
        private String address;
        private String email;
        private int phone;

        // Constructor for the builder
        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(int phone) {
            this.phone = phone;
            return this;
        }

        // The builder constructs, and then returns the new account-object
        public Account build() {
            Account account = new Account(this);
            validate();
            return account;
        }

        // If needed, add validation checks to make sure the new object is valid, and dont break anything
        private void validate() {
        }

    }
}
