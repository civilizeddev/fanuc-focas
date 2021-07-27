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
public class T_SLAVE_SUB_PARA_FLG extends Structure {
	public T_SLAVE_IND_PARA_FLG slv_ind_para;
	public byte slv_enable;
	public byte slt_num;
	public T_SLAVE_SUB_PARA_FLG() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("slv_ind_para", "slv_enable", "slt_num");
	}
	public T_SLAVE_SUB_PARA_FLG(T_SLAVE_IND_PARA_FLG slv_ind_para, byte slv_enable, byte slt_num) {
		super();
		this.slv_ind_para = slv_ind_para;
		this.slv_enable = slv_enable;
		this.slt_num = slt_num;
	}
	public T_SLAVE_SUB_PARA_FLG(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends T_SLAVE_SUB_PARA_FLG implements Structure.ByReference {
		
	};
	public static class ByValue extends T_SLAVE_SUB_PARA_FLG implements Structure.ByValue {
		
	};
}