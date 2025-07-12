public class SwapRequest {
    private User fromUser;
    private User toUser;
    private boolean isAccepted;

    public SwapRequest(User fromUser, User toUser) {
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.isAccepted = false;
    }

    public void accept() {
        this.isAccepted = true;
    }

    public void reject() {
        this.isAccepted = false;
    }

    @Override
    public String toString() {
        return "Request from " + fromUser.getName() + " to " + toUser.getName() + 
               " | Status: " + (isAccepted ? "Accepted" : "Pending");
    }
}
