package kr.co.sinamu.gallery.account.helper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.sinamu.gallery.account.dto.AccountJoinRequest;
import kr.co.sinamu.gallery.account.dto.AccountLoginRequest;

public class TokenAccountHelper implements AccountHelper {

    @Override
    public void join(AccountJoinRequest joinReq) {

    }

    @Override
    public String login(AccountLoginRequest loginReq, HttpServletRequest req, HttpServletResponse res) {
        return "";
    }

    @Override
    public Integer getMemberId(HttpServletRequest req) {
        return 0;
    }

    @Override
    public boolean isLoggedIn(HttpServletRequest req) {
        return false;
    }

    @Override
    public void logout(HttpServletRequest req, HttpServletResponse res) {

    }
}
