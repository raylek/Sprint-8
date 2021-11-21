package com.example.retailer.adapter

import com.example.retailer.api.distributor.OrderInfo
import com.example.retailer.service.OrderService
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component("distributorConsumer")
class Consumer {

    @Autowired
    private lateinit var orderService: OrderService
    private val mapper = jacksonObjectMapper()

    @RabbitListener(queues = ["retailer_queue"])
    fun getUpdate(incomingMsg: String) {
        val orderInfo = mapper.readValue<OrderInfo>(incomingMsg)
        orderService.updateOrderInfo(orderInfo)
    }
}