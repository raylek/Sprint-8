package ru.sberschool.hystrix

import feign.RequestLine

interface SlowlyApi {
    @RequestLine("GET /ability/1")
    fun getSomething(): SimpleResponse
}


