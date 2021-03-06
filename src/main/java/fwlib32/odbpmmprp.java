package fwlib32;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class odbpmmprp extends Structure {
	/** data */
	public NativeLong data;
	/** number */
	public short number;
	/** axis attribute */
	public byte axis;
	/** data type */
	public byte type;
	public odbpmmprp() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("data", "number", "axis", "type");
	}
	public odbpmmprp(NativeLong data, short number, byte axis, byte type) {
		super();
		this.data = data;
		this.number = number;
		this.axis = axis;
		this.type = type;
	}
	public odbpmmprp(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbpmmprp implements Structure.ByReference {
		
	};
	public static class ByValue extends odbpmmprp implements Structure.ByValue {
		
	};
}
