package fwlib32;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class OUT_USBLOG1SHOT extends Structure {
	public short Type;
	public short MsgId;
	public byte Year;
	public byte Month;
	public byte Day;
	public byte Hour;
	public byte Minute;
	public byte Second;
	public byte[] reserve = new byte[2];
	public byte[] Text = new byte[84];
	public OUT_USBLOG1SHOT() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("Type", "MsgId", "Year", "Month", "Day", "Hour", "Minute", "Second", "reserve", "Text");
	}
	public OUT_USBLOG1SHOT(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OUT_USBLOG1SHOT implements Structure.ByReference {
		
	};
	public static class ByValue extends OUT_USBLOG1SHOT implements Structure.ByValue {
		
	};
}
