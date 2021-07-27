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
public class loadelm extends Structure {
	/** load meter */
	public NativeLong data;
	/** decimal position */
	public short dec;
	/** unit */
	public short unit;
	/** name of data */
	public byte name;
	/** suffix */
	public byte suff1;
	/** suffix */
	public byte suff2;
	/** reserve */
	public byte reserve;
	public loadelm() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("data", "dec", "unit", "name", "suff1", "suff2", "reserve");
	}
	public loadelm(NativeLong data, short dec, short unit, byte name, byte suff1, byte suff2, byte reserve) {
		super();
		this.data = data;
		this.dec = dec;
		this.unit = unit;
		this.name = name;
		this.suff1 = suff1;
		this.suff2 = suff2;
		this.reserve = reserve;
	}
	public loadelm(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends loadelm implements Structure.ByReference {
		
	};
	public static class ByValue extends loadelm implements Structure.ByValue {
		
	};
}