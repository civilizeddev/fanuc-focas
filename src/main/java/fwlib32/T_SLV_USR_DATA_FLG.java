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
public class T_SLV_USR_DATA_FLG extends Structure {
	public byte slave_user_data_len;
	public byte slave_user_data;
	public T_SLV_USR_DATA_FLG() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("slave_user_data_len", "slave_user_data");
	}
	public T_SLV_USR_DATA_FLG(byte slave_user_data_len, byte slave_user_data) {
		super();
		this.slave_user_data_len = slave_user_data_len;
		this.slave_user_data = slave_user_data;
	}
	public T_SLV_USR_DATA_FLG(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends T_SLV_USR_DATA_FLG implements Structure.ByReference {
		
	};
	public static class ByValue extends T_SLV_USR_DATA_FLG implements Structure.ByValue {
		
	};
}
