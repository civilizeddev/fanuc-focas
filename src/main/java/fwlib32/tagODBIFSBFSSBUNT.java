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
public class tagODBIFSBFSSBUNT extends Structure {
	/** \ufffdX\ufffd\ufffd?\ufffdu\ufffd\ufffd\ufffdj\ufffdb\ufffdg\ufffd\u050d\ufffd */
	public short slv_unt_num;
	/** FSSB\ufffd\ufffd\ufffdj\ufffdb\ufffdg\ufffd\u050d\ufffd */
	public short fssb_unt_num;
	/** \ufffd\ufffd\ufffd\ufffd */
	public byte[] name = new byte[4];
	public tagODBIFSBFSSBUNT() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("slv_unt_num", "fssb_unt_num", "name");
	}
	public tagODBIFSBFSSBUNT(short slv_unt_num, short fssb_unt_num, byte name[]) {
		super();
		this.slv_unt_num = slv_unt_num;
		this.fssb_unt_num = fssb_unt_num;
		if ((name.length != this.name.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.name = name;
	}
	public tagODBIFSBFSSBUNT(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagODBIFSBFSSBUNT implements Structure.ByReference {
		
	};
	public static class ByValue extends tagODBIFSBFSSBUNT implements Structure.ByValue {
		
	};
}
