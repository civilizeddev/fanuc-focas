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
public class tlmsinf extends Structure {
	/** t data */
	public NativeLong t;
	/** m data */
	public NativeLong m;
	/** hm data */
	public NativeLong hm;
	/** hm_dp */
	public NativeLong hm_dp;
	/** offset num */
	public NativeLong tlofs_no;
	public tlmsinf() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("t", "m", "hm", "hm_dp", "tlofs_no");
	}
	public tlmsinf(NativeLong t, NativeLong m, NativeLong hm, NativeLong hm_dp, NativeLong tlofs_no) {
		super();
		this.t = t;
		this.m = m;
		this.hm = hm;
		this.hm_dp = hm_dp;
		this.tlofs_no = tlofs_no;
	}
	public tlmsinf(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tlmsinf implements Structure.ByReference {
		
	};
	public static class ByValue extends tlmsinf implements Structure.ByValue {
		
	};
}
