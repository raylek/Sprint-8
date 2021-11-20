package ru.sberschool.hystrix

class FallbackSlowlyApi : SlowlyApi {
    override fun getSomething() = SimpleResponse("time out")
}


