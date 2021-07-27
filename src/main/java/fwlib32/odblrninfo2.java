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
public class odblrninfo2 extends Structure {
	/** program name */
	public byte[] name = new byte[33];
	public byte[] dummy1 = new byte[3];
	/** No.1-No.20 Learning axis name */
	public byte[] axis = new byte[((20) * (4))];
	/** update(year) */
	public short year;
	/** update(month) */
	public short month;
	/** update(day) */
	public short day;
	/** update(hour) */
	public short hour;
	/** update(minute) */
	public short minute;
	/** update(second) */
	public short second;
	/** comment */
	public byte[] comment = new byte[33];
	public byte[] dummy2 = new byte[3];
	public odblrninfo2() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("name", "dummy1", "axis", "year", "month", "day", "hour", "minute", "second", "comment", "dummy2");
	}
	public odblrninfo2(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odblrninfo2 implements Structure.ByReference {
		
	};
	public static class ByValue extends odblrninfo2 implements Structure.ByValue {
		
	};
}
