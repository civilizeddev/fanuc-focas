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
public class tagODBIFSBPLSMDL extends Structure {
	/** Slave Number */
	public short slave_num;
	/** PM Name */
	public byte[] name = new byte[8];
	/** PM Type */
	public byte[] type = new byte[8];
	/** PM PCBID */
	public short pcb_id;
	/** PM Information */
	public byte[] info = new byte[24];
	public tagODBIFSBPLSMDL() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("slave_num", "name", "type", "pcb_id", "info");
	}
	public tagODBIFSBPLSMDL(short slave_num, byte name[], byte type[], short pcb_id, byte info[]) {
		super();
		this.slave_num = slave_num;
		if ((name.length != this.name.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.name = name;
		if ((type.length != this.type.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.type = type;
		this.pcb_id = pcb_id;
		if ((info.length != this.info.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.info = info;
	}
	public tagODBIFSBPLSMDL(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagODBIFSBPLSMDL implements Structure.ByReference {
		
	};
	public static class ByValue extends tagODBIFSBPLSMDL implements Structure.ByValue {
		
	};
}
