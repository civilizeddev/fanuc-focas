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
public class iodbrct_cstmname extends Structure {
	/** grp number */
	public short grp_num;
	/** dummy */
	public short dummy;
	/** group name */
	public byte[] grp_name = new byte[16];
	/** pattern name */
	public byte[] ptn_name = new byte[((3) * (16))];
	public iodbrct_cstmname() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("grp_num", "dummy", "grp_name", "ptn_name");
	}
	public iodbrct_cstmname(short grp_num, short dummy, byte grp_name[], byte ptn_name[]) {
		super();
		this.grp_num = grp_num;
		this.dummy = dummy;
		if ((grp_name.length != this.grp_name.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.grp_name = grp_name;
		if ((ptn_name.length != this.ptn_name.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ptn_name = ptn_name;
	}
	public iodbrct_cstmname(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbrct_cstmname implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbrct_cstmname implements Structure.ByValue {
		
	};
}
