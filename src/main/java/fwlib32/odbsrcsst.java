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
public class odbsrcsst extends Structure {
	public short acc_element;
	public short err_general;
	public short err_id_no;
	public short err_attr;
	public short err_op_data;
	public odbsrcsst() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("acc_element", "err_general", "err_id_no", "err_attr", "err_op_data");
	}
	public odbsrcsst(short acc_element, short err_general, short err_id_no, short err_attr, short err_op_data) {
		super();
		this.acc_element = acc_element;
		this.err_general = err_general;
		this.err_id_no = err_id_no;
		this.err_attr = err_attr;
		this.err_op_data = err_op_data;
	}
	public odbsrcsst(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbsrcsst implements Structure.ByReference {
		
	};
	public static class ByValue extends odbsrcsst implements Structure.ByValue {
		
	};
}
