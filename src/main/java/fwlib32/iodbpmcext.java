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
public class iodbpmcext extends Structure {
	/** PMC address type */
	public short type_a;
	/** PMC data type */
	public short type_d;
	/** start PMC address */
	public short datano_s;
	/** end PMC address */
	public short datano_e;
	/** error code */
	public short err_code;
	/** reserved */
	public short reserved;
	/** pointer to buffer */
	public Pointer data;
	public iodbpmcext() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("type_a", "type_d", "datano_s", "datano_e", "err_code", "reserved", "data");
	}
	public iodbpmcext(short type_a, short type_d, short datano_s, short datano_e, short err_code, short reserved, Pointer data) {
		super();
		this.type_a = type_a;
		this.type_d = type_d;
		this.datano_s = datano_s;
		this.datano_e = datano_e;
		this.err_code = err_code;
		this.reserved = reserved;
		this.data = data;
	}
	public iodbpmcext(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbpmcext implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbpmcext implements Structure.ByValue {
		
	};
}
