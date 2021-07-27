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
public class odbprsm extends Structure {
	/** dummy */
	public short datano;
	/** dummy */
	public short type;
	/** data setting information */
	public short[] data_info = new short[5];
	/** block counter */
	public NativeLong rstr_bc;
	/** M code value */
	public NativeLong[] rstr_m = new NativeLong[35];
	/** T code value */
	public NativeLong[] rstr_t = new NativeLong[2];
	/** S code value */
	public NativeLong rstr_s;
	/** B code value */
	public NativeLong rstr_b;
	/** program re-start position */
	public NativeLong[] dest = new NativeLong[32];
	/** program re-start distance */
	public NativeLong[] dist = new NativeLong[32];
	public odbprsm() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("datano", "type", "data_info", "rstr_bc", "rstr_m", "rstr_t", "rstr_s", "rstr_b", "dest", "dist");
	}
	public odbprsm(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbprsm implements Structure.ByReference {
		
	};
	public static class ByValue extends odbprsm implements Structure.ByValue {
		
	};
}
