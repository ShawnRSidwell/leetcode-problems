package designpatterns.example.statedesignpattern.example1refined;

// State interface
interface MessengerState {
    void enterState();
    void exitState();
    void sendMessage(String message);
    void receiveMessage(String message);
}

// Online state
class OnlineState implements MessengerState {
    @Override
    public void enterState() {
        System.out.println("You are online and ready to chat.");
    }

    @Override
    public void exitState() {
        System.out.println("You have gone offline.");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending: " + message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Received: " + message);
    }
}

// Offline state
class OfflineState implements MessengerState {
    @Override
    public void enterState() {
        System.out.println("You are offline. Messages will be queued.");
    }

    @Override
    public void exitState() {
        System.out.println("You are back online.");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Message queued: " + message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("No new messages while offline.");
    }
}

// Typing state
class TypingState implements MessengerState {
    @Override
    public void enterState() {
        System.out.println("You are typing a message.");
    }

    @Override
    public void exitState() {
        System.out.println("You have stopped typing.");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending: " + message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Received: " + message);
    }
}

// Messenger context
class Messenger {
    private MessengerState currentState;

    public void setState(MessengerState state) {
        if (currentState != null) {
            currentState.exitState();
        }

        currentState = state;
        currentState.enterState();
    }

    public void sendMessage(String message) {
        currentState.sendMessage(message);
    }

    public void receiveMessage(String message) {
        currentState.receiveMessage(message);
    }
}

public class StateDesignExampleRefined {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();

        // Initial state: Online
        messenger.setState(new OnlineState());

        // Sending and receiving messages
        messenger.sendMessage("Hello, how are you?");
        messenger.receiveMessage("I'm doing well, thanks!");

        // Switching to Typing state
        messenger.setState(new TypingState());
        messenger.sendMessage("I'm typing a message...");

        // Back to Online state
        messenger.setState(new OnlineState());
        messenger.sendMessage("I'm back online!");

        // Switching to Offline state
        messenger.setState(new OfflineState());
        messenger.sendMessage("I'm going offline for now.");

        // Receiving messages while offline
        messenger.receiveMessage("You have 3 new messages.");

        // Back to Online state
        messenger.setState(new OnlineState());
        messenger.sendMessage("I'm online again!");

        // Exiting the application
        messenger.setState(new OfflineState());
    }
}
