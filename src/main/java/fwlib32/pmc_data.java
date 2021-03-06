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
public class pmc_data extends Structure {
	public short unittype;
	public byte adr;
	public byte bit;
	public short no;
	public pmc_data() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("unittype", "adr", "bit", "no");
	}
	public pmc_data(short unittype, byte adr, byte bit, short no) {
		super();
		this.unittype = unittype;
		this.adr = adr;
		this.bit = bit;
		this.no = no;
	}
	public pmc_data(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends pmc_data implements Structure.ByReference {
		
	};
	public static class ByValue extends pmc_data implements Structure.ByValue {
		
	};
}
