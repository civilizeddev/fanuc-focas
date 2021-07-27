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
public class odbmsrhstinf extends Structure {
	public short year;
	public byte month;
	public byte day;
	public byte hour;
	public byte minute;
	public byte second;
	public byte msu_num;
	public byte path_num;
	public byte pmc_num;
	public short nonsave;
	public byte save_trigger;
	public byte[] reserve = new byte[3];
	public odbmsrhstinf() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("year", "month", "day", "hour", "minute", "second", "msu_num", "path_num", "pmc_num", "nonsave", "save_trigger", "reserve");
	}
	public odbmsrhstinf(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbmsrhstinf implements Structure.ByReference {
		
	};
	public static class ByValue extends odbmsrhstinf implements Structure.ByValue {
		
	};
}
