package info.dmerej;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;


public class DiscountApplierTest {
  @Test
  void should_notify_twice_when_applying_discount_for_two_users_v1() {
    // TODO: write a test to demonstrate the bug in DiscountApplier.applyV1()

    //Given 
    ArrayList<String> notifications = new ArrayList<>();
    List<User> users = new ArrayList<>();
    User user1 = new User("Zyad","zyad@mail.com");
    User user2 = new User("Julien","julien@mail.com");

    users.add(user1);
    users.add(user2);

    Notifier notifier = (user, message) -> notifications.add(user.name()+": "+message);
    DiscountApplier discountApplier = new DiscountApplier(notifier);

    //When
    discountApplier.applyV1(5,users);


    //Then
    assertEquals(2,notifications.size());
  }

  @Test
  void should_notify_twice_when_applying_discount_for_two_users_v2() {
    // TODO: write a test to demonstrate the bug in DiscountApplier.applyV2()
  }

}
