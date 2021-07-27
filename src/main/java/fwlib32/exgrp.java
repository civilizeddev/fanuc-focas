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
public class exgrp extends Structure {
	/** group number */
	public NativeLong grp_no;
	/** optional group number */
	public NativeLong opt_grpno;
	public exgrp() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("grp_no", "opt_grpno");
	}
	public exgrp(NativeLong grp_no, NativeLong opt_grpno) {
		super();
		this.grp_no = grp_no;
		this.opt_grpno = opt_grpno;
	}
	public exgrp(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends exgrp implements Structure.ByReference {
		
	};
	public static class ByValue extends exgrp implements Structure.ByValue {
		
	};
}