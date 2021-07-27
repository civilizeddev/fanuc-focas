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
public class dcsmca extends Structure {
	public NativeLong mgrp_no;
	public fwlib32.dcsmcc.ByReference mcc_test_inf;
	public dcsmca() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("mgrp_no", "mcc_test_inf");
	}
	public dcsmca(NativeLong mgrp_no, fwlib32.dcsmcc.ByReference mcc_test_inf) {
		super();
		this.mgrp_no = mgrp_no;
		this.mcc_test_inf = mcc_test_inf;
	}
	public dcsmca(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends dcsmca implements Structure.ByReference {
		
	};
	public static class ByValue extends dcsmca implements Structure.ByValue {
		
	};
}