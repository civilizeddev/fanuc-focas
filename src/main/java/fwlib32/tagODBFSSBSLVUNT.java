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
public class tagODBFSSBSLVUNT extends Structure {
	/** Slave unit number */
	public short slv_unt_num;
	/** Slave kind */
	public byte kind;
	/** Slave attribute */
	public byte attrb;
	public tagODBFSSBSLVUNT() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("slv_unt_num", "kind", "attrb");
	}
	public tagODBFSSBSLVUNT(short slv_unt_num, byte kind, byte attrb) {
		super();
		this.slv_unt_num = slv_unt_num;
		this.kind = kind;
		this.attrb = attrb;
	}
	public tagODBFSSBSLVUNT(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagODBFSSBSLVUNT implements Structure.ByReference {
		
	};
	public static class ByValue extends tagODBFSSBSLVUNT implements Structure.ByValue {
		
	};
}
