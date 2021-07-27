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
public class odbpwofst extends Structure {
	public NativeLong pwratio;
	public NativeLong rfvolt;
	public short year;
	public short month;
	public short day;
	public short hour;
	public short minute;
	public short second;
	public odbpwofst() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("pwratio", "rfvolt", "year", "month", "day", "hour", "minute", "second");
	}
	public odbpwofst(NativeLong pwratio, NativeLong rfvolt, short year, short month, short day, short hour, short minute, short second) {
		super();
		this.pwratio = pwratio;
		this.rfvolt = rfvolt;
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public odbpwofst(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbpwofst implements Structure.ByReference {
		
	};
	public static class ByValue extends odbpwofst implements Structure.ByValue {
		
	};
}
