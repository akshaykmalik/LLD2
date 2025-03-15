package BEHAVIOUR_DP.CHAIN_OF_RESPONSIBILITY;

public class Request {

    String ip, username, password;

    Request(String ip, String username, String password) {
        this.ip = ip;
        this.username = username;
        this.password = password;
    }
}
