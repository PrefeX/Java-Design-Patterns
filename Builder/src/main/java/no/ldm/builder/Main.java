package no.ldm.builder;

/**
 * Main class, showing a few examples of how to create and use objects created
 * by the builder.
 *
 * You should always starts by creating a new instance of the builder,and
 * putting in the parameters (if required).
 *
 * You should always end by building the completed object.
 *
 * All values in between, are optional, and the order don't matter. If the same
 * methods are used several times, the earlier entries will be overwritten.
 *
 * @author PrefeX
 */
public class Main {

    public static void main(String[] args) {

        // The bare minimum (parameters set in the constructor)
        Account example1 = new Account.Builder("First Name", "Last Name").build();

        // Adding all the optional values. 
        Account example2 = new Account.Builder("First Name", "Last Name").address("Address").email("Email").phone(12345678).build();

        // Phone is used several times, and the earlier entry is overwritten by the next one.
        Account example3 = new Account.Builder("First Name", "Last Name").phone(123).phone(456).build();
    }
}
