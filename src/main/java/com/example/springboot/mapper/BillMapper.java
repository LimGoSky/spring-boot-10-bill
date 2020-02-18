package com.example.springboot.mapper;

import com.example.springboot.entities.Bill;
import com.example.springboot.entities.BillProvider;

import java.util.List;

/**
 * @Auther: 梦学谷
 */
//@Mapper 或 @MapperScan("com.example.springboot.mapper")
public interface BillMapper {

    List<BillProvider> getBills(Bill bill);

    BillProvider getBillByBid(Integer bid);

    int addBill(Bill bill);

    int updateBill(Bill bill);

    int deteleBillByBid(Integer bid);

}
