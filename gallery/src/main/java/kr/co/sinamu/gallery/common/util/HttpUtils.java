package kr.co.sinamu.gallery.common.util;

import jakarta.servlet.http.HttpServletRequest;

public class HttpUtils {

    // 세선 입력
    public static void setSession(HttpServletRequest req, String key, Object value) {
        req.getSession().setAttribute(key, value);
    }

    // 세선 값 조회
    public static Object getSession(HttpServletRequest req, String key) {
        return req.getSession().getAttribute(key);
    }

    // 세션 삭제
    public static void removeSession(HttpServletRequest req, String key) {
        req.getSession().removeAttribute(key);
    }
}
