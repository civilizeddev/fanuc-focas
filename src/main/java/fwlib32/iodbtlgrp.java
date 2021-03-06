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
public class iodbtlgrp extends Structure {
	/** number of all tool */
	public NativeLong ntool;
	/** number of free tool */
	public NativeLong nfree;
	/** tool life */
	public NativeLong life;
	/** tool life counter */
	public NativeLong count;
	/** using tool number */
	public NativeLong use_tool;
	/** optional group number */
	public NativeLong opt_grpno;
	/** tool life rest count */
	public NativeLong life_rest;
	/** tool life rest signal */
	public short rest_sig;
	/** tool life counter type */
	public short count_type;
	public iodbtlgrp() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ntool", "nfree", "life", "count", "use_tool", "opt_grpno", "life_rest", "rest_sig", "count_type");
	}
	public iodbtlgrp(NativeLong ntool, NativeLong nfree, NativeLong life, NativeLong count, NativeLong use_tool, NativeLong opt_grpno, NativeLong life_rest, short rest_sig, short count_type) {
		super();
		this.ntool = ntool;
		this.nfree = nfree;
		this.life = life;
		this.count = count;
		this.use_tool = use_tool;
		this.opt_grpno = opt_grpno;
		this.life_rest = life_rest;
		this.rest_sig = rest_sig;
		this.count_type = count_type;
	}
	public iodbtlgrp(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbtlgrp implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbtlgrp implements Structure.ByValue {
		
	};
}
