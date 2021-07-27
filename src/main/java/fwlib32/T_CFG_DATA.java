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
public class T_CFG_DATA extends Structure {
	public short cfg_data_len;
	public byte[] cfg_data = new byte[128];
	public T_CFG_DATA() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("cfg_data_len", "cfg_data");
	}
	public T_CFG_DATA(short cfg_data_len, byte cfg_data[]) {
		super();
		this.cfg_data_len = cfg_data_len;
		if ((cfg_data.length != this.cfg_data.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.cfg_data = cfg_data;
	}
	public T_CFG_DATA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends T_CFG_DATA implements Structure.ByReference {
		
	};
	public static class ByValue extends T_CFG_DATA implements Structure.ByValue {
		
	};
}
