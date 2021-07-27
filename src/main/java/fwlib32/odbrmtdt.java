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
public class odbrmtdt extends Structure {
	public short channel;
	public short kind;
	public byte year;
	public byte month;
	public byte day;
	public byte hour;
	public byte minute;
	public byte second;
	public short t_intrvl;
	public short trg_data;
	public NativeLong ins_ptr;
	public short t_delta;
	public short[] data = new short[1917];
	public odbrmtdt() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("channel", "kind", "year", "month", "day", "hour", "minute", "second", "t_intrvl", "trg_data", "ins_ptr", "t_delta", "data");
	}
	public odbrmtdt(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbrmtdt implements Structure.ByReference {
		
	};
	public static class ByValue extends odbrmtdt implements Structure.ByValue {
		
	};
}