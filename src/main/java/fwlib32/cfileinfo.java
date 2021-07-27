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
public class cfileinfo extends Structure {
	/** file name */
	public byte[] fname = new byte[12];
	/** file size (bytes) */
	public NativeLong file_size;
	/** attribute */
	public NativeLong file_attr;
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
	public cfileinfo() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("fname", "file_size", "file_attr", "year", "month", "day", "hour", "minute", "second");
	}
	public cfileinfo(byte fname[], NativeLong file_size, NativeLong file_attr, short year, short month, short day, short hour, short minute, short second) {
		super();
		if ((fname.length != this.fname.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.fname = fname;
		this.file_size = file_size;
		this.file_attr = file_attr;
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public cfileinfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends cfileinfo implements Structure.ByReference {
		
	};
	public static class ByValue extends cfileinfo implements Structure.ByValue {
		
	};
}
