package UTs;
import static org.assertj.core.api.Assertions.assertThat;
//import junit.framework.TestCase;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Collection;
import java.util.stream.Collectors;


public class ContactManagerTest {
    ContactManager contactManager;
    //Before
    //After
    //Test
    //positve
    //negative

    @Before
    public void setup(){
        contactManager = new ContactManager();
    }

    @After
    public void teardown(){
        contactManager = null;
    }

    @Test
    public void shouldCreateContact(){
        //given
        //when
        contactManager.addContact("manoj","m","0234567890");
        Collection<Contact> contacts= contactManager.getAllContacts();
        //then
        assertThat(contacts.stream().filter(e-> e.getFirstName().equals("manoj") &&
                e.getLastName().equals("m") &&
                e.getPhoneNumber().equals("0234567890")).collect(Collectors.toList()).size()).isEqualTo(1);
    }

    @Test
    public void shouldCreateContact_1(){
        //give

        //when
        String actualData = contactManager.addContact("manoj","m","0234567890");
        //then
        assertThat(actualData).isEqualTo("Done Adding");

    }
}