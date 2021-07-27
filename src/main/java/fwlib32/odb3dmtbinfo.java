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
public class odb3dmtbinfo extends Structure {
	public prginf prginf;
	public NativeLong[] mcode = new NativeLong[3];
	public NativeLong bcode;
	public toolinf tlinf;
	public NativeLong hisorder;
	public NativeLong[] dummy = new NativeLong[3];
	public odb3dmtbinfo() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("prginf", "mcode", "bcode", "tlinf", "hisorder", "dummy");
	}
	public odb3dmtbinfo(prginf prginf, NativeLong mcode[], NativeLong bcode, toolinf tlinf, NativeLong hisorder, NativeLong dummy[]) {
		super();
		this.prginf = prginf;
		if ((mcode.length != this.mcode.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.mcode = mcode;
		this.bcode = bcode;
		this.tlinf = tlinf;
		this.hisorder = hisorder;
		if ((dummy.length != this.dummy.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.dummy = dummy;
	}
	public odb3dmtbinfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odb3dmtbinfo implements Structure.ByReference {
		
	};
	public static class ByValue extends odb3dmtbinfo implements Structure.ByValue {
		
	};
}
