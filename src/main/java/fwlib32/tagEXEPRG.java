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
public class tagEXEPRG extends Structure {
	/** read data length */
	public short length;
	/** prepared block number */
	public short prep_blk;
	/** actual block number */
	public short act_blk;
	/** dummy */
	public short dummy;
	/** execute program */
	public byte[] data = new byte[512];
	public tagEXEPRG() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("length", "prep_blk", "act_blk", "dummy", "data");
	}
	public tagEXEPRG(short length, short prep_blk, short act_blk, short dummy, byte data[]) {
		super();
		this.length = length;
		this.prep_blk = prep_blk;
		this.act_blk = act_blk;
		this.dummy = dummy;
		if ((data.length != this.data.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.data = data;
	}
	public tagEXEPRG(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagEXEPRG implements Structure.ByReference {
		
	};
	public static class ByValue extends tagEXEPRG implements Structure.ByValue {
		
	};
}
