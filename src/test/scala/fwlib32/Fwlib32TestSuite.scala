package fwlib32

import com.sun.jna.NativeLong

import java.nio.ShortBuffer

@munit.IgnoreSuite
class Fwlib32TestSuite extends munit.FunSuite {
  test("connect") {
    val fwlib32 = Fwlib32.INSTANCE
    val handle  = ShortBuffer.allocate(1)
    val result1 = fwlib32.cnc_allclibhndl3("127.0.0.1", 8193, new NativeLong(10L), handle)
    assertEquals(result1, Fwlib32.EW_OK)
    println(handle.get(0))
    val result2 = fwlib32.cnc_freelibhndl(handle.get(0))
    assertEquals(result2, Fwlib32.EW_OK)
  }
}
