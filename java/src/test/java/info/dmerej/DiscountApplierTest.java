package info.dmerej;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DiscountApplierTest {

  class DiscountApplierNotifier implements Notifier{

    private final HashMap<User,String> notificationMap;

    DiscountApplierNotifier(){
      this.notificationMap = new HashMap<>();
    }

    public HashMap<User, String> getNotificationMap() {
      return notificationMap;
    }

    @Override
    public void notify(User user, String message) {
      notificationMap.put(user,message);
    }


  }

  @Test
  void should_notify_twice_when_applying_discount_for_two_users_v1() {
    // TODO: write a test to demonstrate the bug in DiscountApplier.applyV1()

    //Given
    DiscountApplierNotifier discountApplierNotifier =new DiscountApplierNotifier();
    List<User> users = new ArrayList<>();
    User user1 = new User("Zyad","zyad@mail.com");
    User user2 = new User("Julien","julien@mail.com");

    users.add(user1);
    users.add(user2);

    DiscountApplier discountApplier = new DiscountApplier(discountApplierNotifier);

    //When
    discountApplier.applyV1(5,users);


    //Then
    assertEquals(2,discountApplierNotifier.getNotificationMap().size());
  }

  @Test
  void should_notify_twice_when_applying_discount_for_two_users_v2() {
    // TODO: write a test to demonstrate the bug in DiscountApplier.applyV2()
    //Given
    DiscountApplierNotifier discountApplierNotifier =new DiscountApplierNotifier();
    List<User> users = new ArrayList<>();
    User user1 = new User("Zyad","zyad@mail.com");
    User user2 = new User("Julien","julien@mail.com");

    users.add(user1);
    users.add(user2);

    DiscountApplier discountApplier = new DiscountApplier(discountApplierNotifier);

    //When
    discountApplier.applyV1(5,users);


    //Then
    assertEquals(2,discountApplierNotifier.getNotificationMap().size());
  }

}
