package fwlib32

import com.sun.jna.Library
import com.sun.jna.Native
import com.sun.jna.NativeLibrary

object Fwlibe1 {
  val JNA_LIBRARY_NAME              = "Fwlibe1"
  val JNA_NATIVE_LIB: NativeLibrary = NativeLibrary.getInstance(Fwlib32.JNA_LIBRARY_NAME)
  val INSTANCE: Library             = Native.load(Fwlib32.JNA_LIBRARY_NAME, classOf[Library])
}
