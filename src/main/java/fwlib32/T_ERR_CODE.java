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
public class T_ERR_CODE extends Structure {
	public short[] param_err_code = new short[4];
	public short[] inter_err_code = new short[4];
	public T_ERR_CODE() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("param_err_code", "inter_err_code");
	}
	public T_ERR_CODE(short param_err_code[], short inter_err_code[]) {
		super();
		if ((param_err_code.length != this.param_err_code.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.param_err_code = param_err_code;
		if ((inter_err_code.length != this.inter_err_code.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.inter_err_code = inter_err_code;
	}
	public T_ERR_CODE(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends T_ERR_CODE implements Structure.ByReference {
		
	};
	public static class ByValue extends T_ERR_CODE implements Structure.ByValue {
		
	};
}
