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
public class T_SLOT_IND_PARA_FLG extends Structure {
	public byte slv_no;
	public byte slt_no;
	public T_SLOT_IND_PARA_FLG() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("slv_no", "slt_no");
	}
	public T_SLOT_IND_PARA_FLG(byte slv_no, byte slt_no) {
		super();
		this.slv_no = slv_no;
		this.slt_no = slt_no;
	}
	public T_SLOT_IND_PARA_FLG(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends T_SLOT_IND_PARA_FLG implements Structure.ByReference {
		
	};
	public static class ByValue extends T_SLOT_IND_PARA_FLG implements Structure.ByValue {
		
	};
}
