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
public class toolinf extends Structure {
	public NativeLong tcode;
	public NativeLong magazin;
	public NativeLong pot;
	public toolinf() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("tcode", "magazin", "pot");
	}
	public toolinf(NativeLong tcode, NativeLong magazin, NativeLong pot) {
		super();
		this.tcode = tcode;
		this.magazin = magazin;
		this.pot = pot;
	}
	public toolinf(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends toolinf implements Structure.ByReference {
		
	};
	public static class ByValue extends toolinf implements Structure.ByValue {
		
	};
}
