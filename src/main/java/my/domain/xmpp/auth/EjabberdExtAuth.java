package my.domain.xmpp.auth;

import ae.teletronics.ExternalAuth;

public class EjabberdExtAuth extends ExternalAuth {

	@Override
    public boolean authenticate(String user, String server, String password) {
        return true;
    }

	@Override
    public boolean exists(String user, String server) {
        return true;
    }

    @Override
    public boolean setPassword(String user, String server, String password) {
        return true;
    }

    @Override
    public boolean register(String user, String server, String password) {
        return true;
    }

    @Override
    public boolean remove(String user, String server) {
        return true;
    }

    @Override
    public boolean removeSafely(String user, String server, String password) {
        return true;
    }
}