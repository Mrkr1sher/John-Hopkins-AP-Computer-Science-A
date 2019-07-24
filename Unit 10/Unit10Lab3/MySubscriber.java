public class MySubscriber extends Subscriber {
    static int counts;
    int subscriberNum;

    public MySubscriber() {
        counts++;
        subscriberNum = counts;
    }

    @Override
    public void update() {
        System.out.println("Subscriber " + subscriberNum + " has been notified.");
    }

}