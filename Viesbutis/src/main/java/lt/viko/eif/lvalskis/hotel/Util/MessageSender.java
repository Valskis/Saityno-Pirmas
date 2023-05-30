package lt.viko.eif.lvalskis.hotel.Util;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Represents a MessageSender object that sends a message to the queue.
 */
public class MessageSender {
    private static final String QUEUE_NAME = "MY_QUEUE";

    public static void main(String... args) throws JMSException {
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
                ActiveMQConnectionFactory.DEFAULT_BROKER_URL);
        Connection connection = connectionFactory.createConnection();
        connection.start();

        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Destination destination = session.createQueue(QUEUE_NAME);

        MessageProducer producer = session.createProducer(destination);
        TextMessage message = session.createTextMessage("Hello ActiveMQ!");

        producer.send(message);
        System.out.println("Sending the message" + message.getText() + "to the" + QUEUE_NAME);

        connection.close();
    }
}
