package kim.jun0.ch06.late_initialized_properties_1

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import kotlin.test.fail

class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    private lateinit var myService: MyService

    @Before
    fun setUp() {
        myService = MyService()
    }

    @Test
    fun testAction() {
        Assert.assertEquals("foo", myService.performAction())
        fail()
    }
}