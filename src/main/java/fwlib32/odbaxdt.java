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
public class odbaxdt extends Structure {
	/** axis name */
	public byte[] name = new byte[4];
	/** position data */
	public NativeLong data;
	/** decimal position */
	public short dec;
	/** data unit */
	public short unit;
	/** flags */
	public short flag;
	/** reserve */
	public short reserve;
	public odbaxdt() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("name", "data", "dec", "unit", "flag", "reserve");
	}
	public odbaxdt(byte name[], NativeLong data, short dec, short unit, short flag, short reserve) {
		super();
		if ((name.length != this.name.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.name = name;
		this.data = data;
		this.dec = dec;
		this.unit = unit;
		this.flag = flag;
		this.reserve = reserve;
	}
	public odbaxdt(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbaxdt implements Structure.ByReference {
		
	};
	public static class ByValue extends odbaxdt implements Structure.ByValue {
		
	};
}
