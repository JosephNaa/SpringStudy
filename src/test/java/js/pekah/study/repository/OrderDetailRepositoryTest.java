package js.pekah.study.repository;

import js.pekah.study.model.entity.OrderDetail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void create() {
        OrderDetail orderDetail = new OrderDetail();

//        orderDetail.setUserId(1L);

//        orderDetail.setItemId(1L);

//        orderDetail.setOrderAt(LocalDateTime.now());

        OrderDetail newOrderDetail = orderDetailRepository .save(orderDetail);
        Assertions.assertNotNull(newOrderDetail);
    }
}
