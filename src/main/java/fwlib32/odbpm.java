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
public class odbpm extends Structure {
	/** variable number */
	public NativeLong datano;
	/** dummy */
	public short dummy;
	/** macro variable */
	public NativeLong mcr_val;
	/** decimal point */
	public short dec_val;
	public odbpm() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("datano", "dummy", "mcr_val", "dec_val");
	}
	public odbpm(NativeLong datano, short dummy, NativeLong mcr_val, short dec_val) {
		super();
		this.datano = datano;
		this.dummy = dummy;
		this.mcr_val = mcr_val;
		this.dec_val = dec_val;
	}
	public odbpm(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbpm implements Structure.ByReference {
		
	};
	public static class ByValue extends odbpm implements Structure.ByValue {
		
	};
}
