public class TestPattern {
    public static void main(String[] args) {

        System.out.println("\n");

        // Create Publisher & Subscriber objects
        MySubscriber sub1 = new MySubscriber();
        MySubscriber sub2 = new MySubscriber();
        MySubscriber sub3 = new MySubscriber();
        MyPublisher aPublisher = new MyPublisher(3);

        // Register a Subscriber
        aPublisher.register(sub1);
        aPublisher.register(sub2);
        aPublisher.register(sub3);

        // Increment Publisher object to cause state changes
        aPublisher.increment();
        aPublisher.increment();
        aPublisher.increment();
        aPublisher.increment();

        System.out.println("\n");
    }
}