package com.plantplus.plantplusecommerce.dto;

import com.plantplus.plantplusecommerce.entity.Address;
import com.plantplus.plantplusecommerce.entity.Customer;
import com.plantplus.plantplusecommerce.entity.Order;
import com.plantplus.plantplusecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
