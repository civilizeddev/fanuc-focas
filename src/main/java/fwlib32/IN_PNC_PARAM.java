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
public class IN_PNC_PARAM extends Structure {
	public PNC_PARAM_FLG flg;
	public PNC_PARAM_W prm;
	public IN_PNC_PARAM() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("flg", "prm");
	}
	public IN_PNC_PARAM(PNC_PARAM_FLG flg, PNC_PARAM_W prm) {
		super();
		this.flg = flg;
		this.prm = prm;
	}
	public IN_PNC_PARAM(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends IN_PNC_PARAM implements Structure.ByReference {
		
	};
	public static class ByValue extends IN_PNC_PARAM implements Structure.ByValue {
		
	};
}