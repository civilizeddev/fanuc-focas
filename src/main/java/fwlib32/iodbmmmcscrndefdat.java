package fwlib32;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class iodbmmmcscrndefdat extends Structure {
	public odbmmscrninf scrninf;
	public NativeLong icn_id;
	public NativeLong msg_id;
	public iodbmmmcscrndefdat() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("scrninf", "icn_id", "msg_id");
	}
	public iodbmmmcscrndefdat(odbmmscrninf scrninf, NativeLong icn_id, NativeLong msg_id) {
		super();
		this.scrninf = scrninf;
		this.icn_id = icn_id;
		this.msg_id = msg_id;
	}
	public iodbmmmcscrndefdat(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbmmmcscrndefdat implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbmmmcscrndefdat implements Structure.ByValue {
		
	};
}
