package kr.co.sinamu.gallery.order.controller;


import jakarta.servlet.http.HttpServletRequest;
import kr.co.sinamu.gallery.account.helper.AccountHelper;
import kr.co.sinamu.gallery.order.dto.OrderRead;
import kr.co.sinamu.gallery.order.dto.OrderRequest;
import kr.co.sinamu.gallery.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class OrderController {

    private final AccountHelper accountHelper;
    private final OrderService orderService;

    @GetMapping("/api/orders")
    public ResponseEntity<?> readAll(HttpServletRequest req) {
        // 로그인 회원 아이디
        Integer memberId = accountHelper.getMemberId(req);

        // 주문 목록
        List<OrderRead> orders = orderService.findAll(memberId);

        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping("/api/orders/{id}")
    public ResponseEntity<?> read(HttpServletRequest req, @PathVariable Integer id) {
        // 로그인 회원 아이디
        Integer memberId = accountHelper.getMemberId(req);

        // 주문 조회
        OrderRead order = orderService.find(id, memberId);

        // 주문 데이터가 없는 경우
        if (order == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @PostMapping("/api/orders")
    public ResponseEntity<?> add(HttpServletRequest req, @RequestBody OrderRequest orderReq) {

        // 로그인 회원 아이디
        Integer memberId = accountHelper.getMemberId(req);

        // 주문 입력
        orderService.order(orderReq, memberId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
