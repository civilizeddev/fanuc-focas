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
public class T_MAS_USR extends Structure {
	public short master_user_data_len;
	public byte[] master_user_data = new byte[62];
	public T_MAS_USR() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("master_user_data_len", "master_user_data");
	}
	public T_MAS_USR(short master_user_data_len, byte master_user_data[]) {
		super();
		this.master_user_data_len = master_user_data_len;
		if ((master_user_data.length != this.master_user_data.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.master_user_data = master_user_data;
	}
	public T_MAS_USR(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends T_MAS_USR implements Structure.ByReference {
		
	};
	public static class ByValue extends T_MAS_USR implements Structure.ByValue {
		
	};
}
