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
public class OUT_PBSSTATUS extends Structure {
	public byte config_sts;
	public byte param_sts;
	public byte watchdog_sts;
	public byte pad;
	public short ident_no;
	public OUT_PBSSTATUS() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("config_sts", "param_sts", "watchdog_sts", "pad", "ident_no");
	}
	public OUT_PBSSTATUS(byte config_sts, byte param_sts, byte watchdog_sts, byte pad, short ident_no) {
		super();
		this.config_sts = config_sts;
		this.param_sts = param_sts;
		this.watchdog_sts = watchdog_sts;
		this.pad = pad;
		this.ident_no = ident_no;
	}
	public OUT_PBSSTATUS(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OUT_PBSSTATUS implements Structure.ByReference {
		
	};
	public static class ByValue extends OUT_PBSSTATUS implements Structure.ByValue {
		
	};
}
