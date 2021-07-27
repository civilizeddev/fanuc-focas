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
public class PNC_PARAM extends Structure {
	public PNC_COMMON_PARAM Common;
	public PNC_PING_PARAM Ping;
	public PNC_SETTING_PARAM Setting;
	public PNC_PARAM() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("Common", "Ping", "Setting");
	}
	public PNC_PARAM(PNC_COMMON_PARAM Common, PNC_PING_PARAM Ping, PNC_SETTING_PARAM Setting) {
		super();
		this.Common = Common;
		this.Ping = Ping;
		this.Setting = Setting;
	}
	public PNC_PARAM(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PNC_PARAM implements Structure.ByReference {
		
	};
	public static class ByValue extends PNC_PARAM implements Structure.ByValue {
		
	};
}
