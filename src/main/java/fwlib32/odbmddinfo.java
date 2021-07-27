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
public class odbmddinfo extends Structure {
	/** Modification detection status */
	public short status;
	/** Data protection status */
	public short prot;
	/** Registered year */
	public short year;
	/** month */
	public short month;
	/** day */
	public short day;
	/** hour */
	public short hour;
	/** minute */
	public short min;
	/** second */
	public short sec;
	/** Check code - registered */
	public NativeLong reg_code;
	/** Check code - current */
	public NativeLong cur_code;
	/** C-EXE code modulation status */
	public short modulate;
	public odbmddinfo() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("status", "prot", "year", "month", "day", "hour", "min", "sec", "reg_code", "cur_code", "modulate");
	}
	public odbmddinfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbmddinfo implements Structure.ByReference {
		
	};
	public static class ByValue extends odbmddinfo implements Structure.ByValue {
		
	};
}
