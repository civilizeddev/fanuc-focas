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
public class odbbtlinf extends Structure {
	/** memory type */
	public short ofs_type;
	/** sum of b-axis offset */
	public short use_no;
	/** sub function number of offset cancel */
	public short sub_no;
	public odbbtlinf() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ofs_type", "use_no", "sub_no");
	}
	public odbbtlinf(short ofs_type, short use_no, short sub_no) {
		super();
		this.ofs_type = ofs_type;
		this.use_no = use_no;
		this.sub_no = sub_no;
	}
	public odbbtlinf(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbbtlinf implements Structure.ByReference {
		
	};
	public static class ByValue extends odbbtlinf implements Structure.ByValue {
		
	};
}
