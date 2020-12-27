package kim.jun0.ch06.late_initialized_properties

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    private var myService: MyService? = null

    @Before
    fun setUp() {
        myService = MyService()
    }

    @Test
    fun testAction() {
        Assert.assertEquals("foo", myService!!.performAction())
    }
}