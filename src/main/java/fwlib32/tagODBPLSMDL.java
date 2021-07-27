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
public class tagODBPLSMDL extends Structure {
	/** line number */
	public short ln_num;
	/** slave number */
	public short slave_num;
	/** pulse module name */
	public byte[] name = new byte[8];
	/** pulse module type name */
	public byte[] type = new byte[8];
	/** pulse module hard ID */
	public byte[] pcb_id = new byte[8];
	/** pulse module function */
	public byte[] function = new byte[32];
	public tagODBPLSMDL() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("ln_num", "slave_num", "name", "type", "pcb_id", "function");
	}
	public tagODBPLSMDL(short ln_num, short slave_num, byte name[], byte type[], byte pcb_id[], byte function[]) {
		super();
		this.ln_num = ln_num;
		this.slave_num = slave_num;
		if ((name.length != this.name.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.name = name;
		if ((type.length != this.type.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.type = type;
		if ((pcb_id.length != this.pcb_id.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.pcb_id = pcb_id;
		if ((function.length != this.function.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.function = function;
	}
	public tagODBPLSMDL(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagODBPLSMDL implements Structure.ByReference {
		
	};
	public static class ByValue extends tagODBPLSMDL implements Structure.ByValue {
		
	};
}
