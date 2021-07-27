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
public class odbomhis extends Structure {
	/** operator message number */
	public short om_no;
	/** year */
	public short year;
	/** month */
	public short month;
	/** day */
	public short day;
	/** hour */
	public short hour;
	/** mimute */
	public short minute;
	/** second */
	public short second;
	/** operator message */
	public byte[] om_msg = new byte[256];
	public odbomhis() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("om_no", "year", "month", "day", "hour", "minute", "second", "om_msg");
	}
	public odbomhis(short om_no, short year, short month, short day, short hour, short minute, short second, byte om_msg[]) {
		super();
		this.om_no = om_no;
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		if ((om_msg.length != this.om_msg.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.om_msg = om_msg;
	}
	public odbomhis(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbomhis implements Structure.ByReference {
		
	};
	public static class ByValue extends odbomhis implements Structure.ByValue {
		
	};
}