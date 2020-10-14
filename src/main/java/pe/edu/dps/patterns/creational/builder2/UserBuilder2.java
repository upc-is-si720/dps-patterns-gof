package pe.edu.dps.patterns.creational.builder2;

public class UserBuilder2 {
    private User user;

    public UserBuilder2() {
        user = new User();
    }
    public UserBuilder2 nick(String nick) {
        this.user.setNick(nick);
        return this;
    }
    public UserBuilder2 name(String name) {
        this.user.setName(name);
        return this;
    }
    public User build() {
        return this.user;
    }
}
