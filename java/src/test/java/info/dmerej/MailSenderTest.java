package info.dmerej;

import org.junit.jupiter.api.Test;

public class MailSenderTest {
    @Test
    void should_make_a_valid_http_request() {
        // TODO: write a test to demonstrate the bug in MailSender.sendV1()

        //Given
        EmailHttpClient emailHttpClient = new EmailHttpClient();

        MailSender mailSender = new MailSender(emailHttpClient);
        User user = new User("Zyad", "Zyad@mail.com");


        //When
        mailSender.sendV1(user,"Hi");

        //Then
        assertEquals(200, emailHttpClient.getMailResponse().code());
    }

    @Test
    void should_retry_when_getting_a_503_error() {
        // TODO: write a test to demonstrate the bug in MailSender.sendV2()

        //Given
        EmailHttpClient emailHttpClient = new EmailHttpClient();

        MailSender mailSender = new MailSender(emailHttpClient);
        User user = new User("Zyad", "Zyad@mail.com");

        //When
        mailSender.sendV2(user,"");

        //Then
        assertEquals(200, emailHttpClient.getMailResponse().code());
    }
}
